package pokemonalecversion;

import java.awt.*;
import java.util.Random;

public class Battle {

    private PokemonAlecVersion game;
    private Font pokefont = new Font("pokesl1", Font.PLAIN, 18);
    private Random r = new Random();
    public boolean playerTurn;
    public short enemyturn;
    public short yourturn;
    public short elapsedTurns;
    public boolean wild;
    public boolean inMain = true;
    public boolean inFight = false;
    public boolean inItem = false;
    public boolean inPokemon = false;
    public boolean inRun = false;
    public boolean playerWon = false;
    public boolean pokemonfainted = false;
    public boolean confirmBattleEnd = false;
    public byte currentSelectionMainX;
    public byte currentSelectionMainY;
    public byte currentSelectionFightX;
    public byte currentSelectionFightY;
    public Pokemon playerPokemon;
    public Pokemon enemyPokemon;
    public Pokemon[] PlayerParty;
    public Pokemon[] EnemyParty;
    public Image TrainerPic;
    private Image BG = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/BG.png"));
    private Image battleMainBG = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Battle.png"));
    private Image battleFightBG = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Battle2.png"));
    private Image arrow = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Arrow.png"));
    private Image statusPAR = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/StatusPAR.png"));
    private Image statusBRN = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/StatusBRN.png"));
    private Image statusPSN = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/StatusPSN.png"));
    private Image statusSLP = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/StatusSLP.png"));
    private Image statusFRZ = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/StatusFRZ.png"));

    public Battle(PokemonAlecVersion pkmn, Pokemon[] playerparty, Pokemon[] enemyparty, Image Trainer, Boolean w) {
        wild = w;
        game = pkmn;
        TrainerPic = Trainer;
        PlayerParty = playerparty;
        EnemyParty = enemyparty;
        playerPokemon = playerparty[0];
        enemyPokemon = enemyparty[0];
        playerTurn = true;
        //game.SE.loadClip("Audio/SE/Damage.wav", "Damage", 1);
        Start();
    }

    public void Start() {
        System.out.println("Player's Pokemon: " + playerPokemon.getName()
                + " Level: " + playerPokemon.getLevel()
                + " HP: " + playerPokemon.getHealth()
                + " / " + playerPokemon.getHP());
        System.out.println("Wild Pokemon: " + enemyPokemon.getName()
                + " Level: " + enemyPokemon.getLevel()
                + " HP: " + enemyPokemon.getHealth()
                + " / " + enemyPokemon.getHP());
        currentSelectionMainX = 0;
        currentSelectionFightX = 0;
        currentSelectionMainY = 0;
        currentSelectionFightY = 0;
        inMain = true;
    }

    public void Fight() {
        inMain = false;
        inFight = true;
        System.out.println("Fight");
    }

    public void Item() {
        inMain = false;
        inItem = true;
        System.out.println("Item");
    }

    public void Pokemon() {
        inMain = false;
        inPokemon = true;
        System.out.println("Pokemon");
    }

    public void playerSwitchPokemon(int nxtpokemon) {
        playerPokemon = PlayerParty[nxtpokemon];
    }

    public void enemySwitchPokemon(int nxtpokemon) {
        enemyPokemon = EnemyParty[nxtpokemon];
    }

    public void Run() {
        inMain = false;
        inRun = true;
        enemyPokemon.statusEffect = 0;
        game.currentBGM.stop();
        game.currentBGM = game.lastBGM;
        game.currentBGM.start();
        game.inBattle = false;
        System.out.println("Got away safely!");
    }

    public void Win() {
        inMain = false;
        inRun = true;
        enemyPokemon.statusEffect = 0;
        game.currentBGM.stop();
        game.currentBGM = game.lastBGM;
        game.currentBGM.start();
        game.inBattle = false;
    }

    public void Lose() {
        inMain = false;
        inRun = true;
        enemyPokemon.statusEffect = 0;
        game.currentBGM.stop();
        game.currentBGM = game.lastBGM;
        game.currentBGM.start();
        game.inBattle = false;
    }

    public void whiteOut() {
        pokemonfainted = true;
        Lose();
    }

    public void enemyTurn() {
    }

    public void loadImages(Graphics g) {
        Image[] apple = {arrow,
            statusPAR,
            statusBRN,
            statusPSN,
            statusSLP,
            statusFRZ,};
        for (int i = 0; i < apple.length; i++) {
            g.drawImage(apple[i], 500, 500, null);
        }
    }

    public void paint(Graphics g) {
        g.setFont(pokefont);
        g.setColor(Color.BLACK);
        g.drawImage(BG, 0, 0, null);
        //HUD
        g.drawString(playerPokemon.getName(), 316, 174);
        g.drawString("" + playerPokemon.getLevel(), 401, 174);
        g.drawString("" + playerPokemon.getHealth(), 361, 207);
        g.drawString("" + playerPokemon.getHP(), 403, 207);
        g.drawImage(playerPokemon.getBackSprite(), 30, 113, null);
        g.drawString(enemyPokemon.getName(), 24, 26);
        g.drawString("" + enemyPokemon.getLevel(), 144, 26);
        g.drawString("" + enemyPokemon.getHealth(), 70, 45);
        g.drawString("" + enemyPokemon.getHP(), 112, 45);
        g.drawImage(enemyPokemon.getFrontSprite(), 300, 25, null);
        //Status Effect Icons
        if (playerPokemon.statusEffect == 1) {
            g.drawImage(statusPAR, 415, 140, null);
        } else if (playerPokemon.statusEffect == 2) {
            g.drawImage(statusBRN, 415, 140, null);
        } else if (playerPokemon.statusEffect == 3) {
            g.drawImage(statusPSN, 415, 140, null);
        } else if (playerPokemon.statusEffect == 4) {
            g.drawImage(statusSLP, 415, 140, null);
        } else if (playerPokemon.statusEffect == 5) {
            g.drawImage(statusFRZ, 415, 140, null);
        }
        if (enemyPokemon.statusEffect == 1) {
            g.drawImage(statusPAR, 18, 60, null);
        } else if (enemyPokemon.statusEffect == 2) {
            g.drawImage(statusBRN, 18, 60, null);
        } else if (enemyPokemon.statusEffect == 3) {
            g.drawImage(statusPSN, 18, 60, null);
        } else if (enemyPokemon.statusEffect == 4) {
            g.drawImage(statusSLP, 18, 60, null);
        } else if (enemyPokemon.statusEffect == 5) {
            g.drawImage(statusFRZ, 18, 60, null);
        }
        //Battle Main Interface
        if (inMain == true) {
            g.drawImage(battleMainBG, 0, 0, null);
            if (wild) {
                g.drawString("Wild " + enemyPokemon.getName() + " Appeared!", 30, 260);
            } else {
                g.drawString(game.TrainerName + " would like to Battle!", 30, 260);
            }
            g.drawString("FIGHT", 290, 260);
            g.drawString("PKMN", 400, 260);
            g.drawString("ITEM", 290, 290);
            g.drawString("RUN", 400, 290);
            if (currentSelectionMainX == 0 && currentSelectionMainY == 0) {
                g.drawImage(arrow, 274, 240, null);
            } else if (currentSelectionMainX == 0 && currentSelectionMainY == 1) {
                g.drawImage(arrow, 274, 270, null);
            } else if (currentSelectionMainX == 1 && currentSelectionMainY == 0) {
                g.drawImage(arrow, 384, 240, null);
            } else if (currentSelectionMainX == 1 && currentSelectionMainY == 1) {
                g.drawImage(arrow, 384, 270, null);
            }
        }
        //Battle Fight Interface
        if (inFight == true) {
            g.drawImage(battleFightBG, 0, 0, null);
            g.drawString("Select a Move", 30, 260);
            g.drawString(playerPokemon.move1, 200, 260);
            g.drawString(playerPokemon.move2, 345, 260);
            g.drawString(playerPokemon.move3, 200, 290);
            g.drawString(playerPokemon.move4, 345, 290);
            if (currentSelectionFightX == 0 && currentSelectionFightY == 0) {
                g.drawImage(arrow, 184, 240, null);
            } else if (currentSelectionFightX == 0 && currentSelectionFightY == 1) {
                g.drawImage(arrow, 184, 270, null);
            } else if (currentSelectionFightX == 1 && currentSelectionFightY == 0) {
                g.drawImage(arrow, 329, 240, null);
            } else if (currentSelectionFightX == 1 && currentSelectionFightY == 1) {
                g.drawImage(arrow, 329, 270, null);
            }
        }
        if (inPokemon == true) {
            g.drawImage(battleFightBG, 0, 0, null);
            g.drawString("Select a Move", 30, 260);
            g.drawString(playerPokemon.move1, 200, 260);
            g.drawString(playerPokemon.move2, 345, 260);
            g.drawString(playerPokemon.move3, 200, 290);
            g.drawString(playerPokemon.move4, 345, 290);
            if (currentSelectionFightX == 0 && currentSelectionFightY == 0) {
                g.drawImage(arrow, 184, 240, null);
            } else if (currentSelectionFightX == 0 && currentSelectionFightY == 1) {
                g.drawImage(arrow, 184, 270, null);
            } else if (currentSelectionFightX == 1 && currentSelectionFightY == 0) {
                g.drawImage(arrow, 329, 240, null);
            } else if (currentSelectionFightX == 1 && currentSelectionFightY == 1) {
                g.drawImage(arrow, 329, 270, null);
            }
        }
        if (inItem == true) {
            g.drawImage(battleFightBG, 0, 0, null);
            g.drawString("Select a Move", 30, 260);
            g.drawString(playerPokemon.move1, 200, 260);
            g.drawString(playerPokemon.move2, 345, 260);
            g.drawString(playerPokemon.move3, 200, 290);
            g.drawString(playerPokemon.move4, 345, 290);
            if (currentSelectionFightX == 0 && currentSelectionFightY == 0) {
                g.drawImage(arrow, 184, 240, null);
            } else if (currentSelectionFightX == 0 && currentSelectionFightY == 1) {
                g.drawImage(arrow, 184, 270, null);
            } else if (currentSelectionFightX == 1 && currentSelectionFightY == 0) {
                g.drawImage(arrow, 329, 240, null);
            } else if (currentSelectionFightX == 1 && currentSelectionFightY == 1) {
                g.drawImage(arrow, 329, 270, null);
            }
        }
        if (inRun == true) {
            g.drawString("Got away successfully!", 30, 260);
        }
    }
}