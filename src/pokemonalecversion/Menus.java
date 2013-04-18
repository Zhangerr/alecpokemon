package pokemonalecversion;

import java.awt.*;
import java.util.Random;

public class Menus {

    private PokemonAlecVersion game;
    private Font pokefont = new Font("pokesl1", Font.PLAIN, 18);
    private Random r = new Random();
    public boolean inMain = false;
    public boolean inPokeDex = false;
    public boolean inPokedexInfo = false;
    public boolean inPokemon = false;
    public boolean inBag = false;
    public boolean inNO = false;
    public boolean inBagOptions = false;
    public boolean inPokeGear = false;
    public boolean inTrainerCard = false;
    public boolean inSave = false;
    public boolean inOption = false;
    public boolean inExit = false;
    public boolean BagtoPokemon = false;
    public boolean Gave = false;
    public boolean inPokeMap = false;
    public boolean inPhone = false;
    public boolean inMap = false;
    public boolean inIpod = false;
    public String curSong = "PEWDIEPIE";
    public String[] Songs = {"Aural Psynapse", "Starry Eyed",
        "PEWDIEPIE", "Some Chords", "Doomsday",
        "I Remember", "Strobe", "Raise Your Weapon"};
    public byte curSongNum = 0;
    public short pokedexSelect = 1;
    public short pokedexSelection = 1;
    public byte currentSelectionMain;
    public byte currentSelectionItemX;
    public byte currentSelectionItemY;
    public byte currentSelectionPokeGear;
    public byte currentSelectionSave;
    public byte currentSelectionOption;
    public byte currentSelectionBag;
    public byte BagOptionSelection;
    public byte SwitchingPokemon;
    public byte curentBagPocket;
    public byte adjust = 0;
    public byte count;
    public Items tmp = new Items(0);
    public Items tmpOne = new Items(0);
    public Items tmpTwo = new Items(0);
    public Items tmpThree = new Items(0);
    public Items tmpFour = new Items(0);
    public Items tmpFive = new Items(0);
    public Pokemon tmpPokemon = new Pokemon();
    public byte length = 0;
    public byte PokemonSelection;
    public boolean inPokeOption;
    public boolean inFly;
    public boolean inSwitch;
    public boolean inStatus;
    public boolean inItem;
    public boolean visible;
    public byte PokeOptionSelection;
    public byte CurrentPokemonForStats;
    public byte StatusSelection;
    public Pokemon SelectedPokemon = new Pokemon();
    public Items SelectedItem = new Items(0);
    public byte b1 = 0;
    public byte b2 = 0;
    public byte b3 = 0;
    public byte b4 = 0;
    public byte b5 = 0;
    public byte b6 = 0;
    public byte b1modifier = 0;
    public byte b2modifier = 0;
    public byte b3modifier = 0;
    public byte b4modifier = 0;
    public byte b5modifier = 0;
    public byte b6modifier = 0;
    public byte count1 = 0;
    public byte count2 = 0;
    public byte count3 = 0;
    public byte count4 = 0;
    public byte count5 = 0;
    public byte count6 = 0;
    String Title;
    public boolean cancelbutton = false;
    private Image FAPic = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Badge7.png"));
    private Image arrow = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Arrow.png"));
    private Image mainMenu = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Menu.png"));
    private Image map = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/map.png"));
    private Image pokedex = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/pokedexbg.png"));
    private Image PokeDexSelect = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/PokeDexSelect.png"));
    private Image pokemon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/pokeselbg.png"));
    private Image bag = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/BagScreen.png"));
    private Image Bag = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Bag.png"));
    private Image pokegear = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Pokegearback.png"));
    private Image trainercard = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/TrainerCard.png"));
    private Image save = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Save.png"));
    private Image option = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Option.png"));
    private Image PokeOption = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/PokeOption.png"));
    private Image PokeOptionFly = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/PokeOptionFly.png"));
    private Image BoxFirst = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/BoxFirst.png"));
    private Image BoxFirstSelected = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/BoxFirstSelected.png"));
    private Image BoxNormal = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/BoxNormal.png"));
    private Image BoxNormalSelected = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/BoxSelected.png"));
    private Image Cancel = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/pokeselcancel.png"));
    private Image CancelSelected = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/pokeselcancelsel.png"));
    private Image Ball = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Ball.png"));
    private Image BallOpen = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/BallOpen.png"));
    private Image HealthBar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/HealthBar.png"));
    private Image StatusBG = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/StatusBG.png"));
    private Image StatusMoves = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/StatusMoves.png"));
    private Image Status = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Status.png"));
    private Image SecondPage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/SecondPage.png"));
    private Image ThirdPage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/ThirdPage.png"));
    private Image entryMap = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/MapEntry.png"));
    private Image entryRadio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/RadioEntry.png"));
    private Image entryPhone = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/PhoneEntry.png"));
    private Image entryExit = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/ExitEntry.png"));
    private Image NOscreen = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/NOscreen.png"));
    private Image BagOptions = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/BagOptions.png"));
    private Image Badge1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Badge1.png"));
    private Image Badge2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Badge2.png"));
    private Image Badge3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Badge3.png"));
    private Image Badge4 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Badge4.png"));
    private Image Badge5 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Badge5.png"));
    private Image Badge6 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Badge6.png"));
    private Image Badge7 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Badge7.png"));
    private Image Badge8 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Badge8.png"));
    private Image PokedexWindow = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/PokedexWindow.png"));

    public Menus(PokemonAlecVersion pkmn) {
        game = pkmn;
        Start();
    }

    public void Start() {
        currentSelectionMain = 2;
        currentSelectionItemX = 0;
        currentSelectionItemY = 0;
        currentSelectionPokeGear = 0;
        currentSelectionSave = 0;
        inMain = true;
    }

    public static void wait(double n) {
        long t0, t1;
        t0 = System.currentTimeMillis();
        do {
            t1 = System.currentTimeMillis();
        } while ((t1 - t0) < (n * 1000));
    }

    public void PokeDex() {
        inMain = false;
        inPokeDex = true;
    }

    public void Pokemon() {
        inMain = false;
        inPokemon = true;
        PokemonSelection = 1;
        System.out.println("Pokemon");
    }

    public void Bag() {
        inMain = false;
        inBag = true;
        System.out.println("Bag");
    }

    public void PokeGear() {
        inMain = false;
        inPokeGear = true;
        System.out.println("PokeGear");
    }

    public void TrainerCard() {
        inMain = false;
        inTrainerCard = true;
        System.out.println("Trainer Card");
    }

    public void Save() {
        inMain = false;
        inSave = true;
        System.out.println("Save");
    }

    public void Option() {
        inMain = false;
        inOption = true;
        System.out.println("Option");
    }

    public void Exit() {
        currentSelectionMain = 2;
        currentSelectionItemX = 0;
        currentSelectionItemY = 0;
        currentSelectionSave = 0;
        inMain = false;
        game.inMenu = false;
        System.out.println("Exit");
    }

    public void loadImages(Graphics g) {
        Image[] apple = {
            arrow,
            mainMenu,
            map,
            pokedex,
            PokeDexSelect,
            pokemon,
            bag,
            Bag,
            pokegear,
            trainercard,
            save,
            option,
            PokeOption,
            PokeOptionFly,
            BoxFirst,
            BoxFirstSelected,
            BoxNormal,
            BoxNormalSelected,
            Cancel,
            CancelSelected,
            Ball,
            BallOpen,
            HealthBar,
            StatusBG,
            StatusMoves,
            Status,
            SecondPage,
            ThirdPage,
            entryMap,
            entryRadio,
            entryPhone,
            entryExit,
            NOscreen,
            BagOptions,
            Badge1,
            Badge2,
            Badge3,
            Badge4,
            Badge5,
            Badge6,
            Badge7,
            Badge8,
            PokedexWindow,};
        for (int i = 0; i < apple.length;) {
            g.drawImage(apple[i], 500, 500, null);
            i++;
        }
    }

    public void paint(Graphics g) {
        g.setFont(pokefont);
        g.setColor(Color.DARK_GRAY);
        if (inMain == true) {
            g.drawImage(mainMenu, 0, 0, null);
            if (currentSelectionMain == 0) {
                //Pokedex
                g.drawImage(arrow, 335, 20, null);
            } else if (currentSelectionMain == 1) {
                //Pokemon
                g.drawImage(arrow, 335, 52, null);
            } else if (currentSelectionMain == 2) {
                //Bag
                g.drawImage(arrow, 335, 84, null);
            } else if (currentSelectionMain == 3) {
                //Pokegear
                g.drawImage(arrow, 335, 116, null);
            } else if (currentSelectionMain == 4) {
                //Alec
                g.drawImage(arrow, 335, 148, null);
            } else if (currentSelectionMain == 5) {
                //Save
                g.drawImage(arrow, 335, 180, null);
            } else if (currentSelectionMain == 6) {
                //Option
                g.drawImage(arrow, 335, 212, null);
            } else if (currentSelectionMain == 7) {
                //Exit
                g.drawImage(arrow, 335, 244, null);
            }
        }
        if (inPokedexInfo) {
            if (!inPokeMap) {
                g.drawImage(PokedexWindow, 0, 0, null);
                g.drawImage(game.pokedex[(pokedexSelection + (pokedexSelect - 1))].getFrontSprite(), 17, 30, null);
                g.drawString("" + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].getName(), 30, 190);
                g.drawString("Type: " + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].getType(), 40, 210);
                if (game.pokedex[(pokedexSelection + (pokedexSelect - 1))].evolveform == game.pokedex[(pokedexSelection + (pokedexSelect - 1))].getNumber()) {
                    g.drawString("Doesn't Evolve", 170, 53);
                } else if (game.pokedex[(pokedexSelection + (pokedexSelect - 1))].evolvelevel >= 999) {
                    g.drawString("Requires an item to Evolve", 170, 53);
                } else {
                    tmpPokemon.create(game.pokedex[(pokedexSelection + (pokedexSelect - 1))].evolveform, 1);
                    g.drawString("Evolves into " + tmpPokemon.getName() + " at Lv" + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].evolvelevel, 170, 53);
                }
                g.drawString("Base Stats:", 180, 77);
                g.drawString("HP:", 170, 100);
                g.drawString("" + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].hp, 265, 100);
                g.drawString("Attack:", 170, 130);
                g.drawString("" + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].attack, 265, 130);
                g.drawString("Defense:", 170, 160);
                g.drawString("" + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].def, 265, 160);
                g.drawString("Speed:", 340, 100);
                g.drawString("" + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].spd, 435, 100);
                g.drawString("Sp.Atk:", 340, 130);
                g.drawString("" + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].spAttack, 435, 130);
                g.drawString("Sp.Def:", 340, 160);
                g.drawString("" + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].spDef, 435, 160);
                g.drawString("Attacks:", 180, 190);
                g.drawString("Move 1:            " + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].move1, 180, 210);
                g.drawString("Move 2:            " + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].move2, 180, 230);
                g.drawString("Move 3:            " + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].move3, 180, 250);
                g.drawString("Move 4:            " + game.pokedex[(pokedexSelection + (pokedexSelect - 1))].move4, 180, 270);
            } else {
                g.drawImage(map, 0, 0, null);
                count++;
                if (count < 10) {
                    visible = true;
                } else {
                    visible = false;
                }
                if (count >= 20) {
                    count = 0;
                }
                if (visible) {
                    /*
                     * for (int i = 0; i > 13;) { if
                     * (game.Area[i].checkPokemon(game.pokedex[(pokedexSelection
                     * + (pokedexSelect - 1))])) {
                     * g.drawImage(game.pokedex[(pokedexSelection +
                     * (pokedexSelect - 1))].getIcon(), game.Area[i].getX,
                     * game.Area[i].getY, null); } i++; }
                     */
                }
            }

        } else if (inPokeDex) {
            g.drawImage(pokedex, 0, 0, null);
            if (pokedexSelect == 1) {
                g.drawImage(PokeDexSelect, 195, 30, null);
                g.drawImage(game.pokedex[pokedexSelection].getFrontSprite(), 20, 20, null);
                g.setColor(Color.darkGray);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection].getNumber()][1] + " /", 31, 221);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection].getNumber()][0], 31, 241);
                g.setColor(Color.white);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection].getNumber()][1] + " /", 30, 220);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection].getNumber()][0], 30, 240);
            } else if (pokedexSelect == 2) {
                g.drawImage(PokeDexSelect, 195, 60, null);
                g.drawImage(game.pokedex[pokedexSelection + 1].getFrontSprite(), 20, 20, null);
                g.setColor(Color.darkGray);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 1].getNumber()][1] + " /", 31, 221);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 1].getNumber()][0], 31, 241);
                g.setColor(Color.white);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 1].getNumber()][1] + " /", 30, 220);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 1].getNumber()][0], 30, 240);
            } else if (pokedexSelect == 3) {
                g.drawImage(PokeDexSelect, 195, 90, null);
                g.drawImage(game.pokedex[pokedexSelection + 2].getFrontSprite(), 20, 20, null);
                g.setColor(Color.darkGray);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 2].getNumber()][1] + " /", 31, 221);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 2].getNumber()][0], 31, 241);
                g.setColor(Color.white);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 2].getNumber()][1] + " /", 30, 220);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 2].getNumber()][0], 30, 240);
            } else if (pokedexSelect == 4) {
                g.drawImage(PokeDexSelect, 195, 120, null);
                g.drawImage(game.pokedex[pokedexSelection + 3].getFrontSprite(), 20, 20, null);
                g.setColor(Color.darkGray);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 3].getNumber()][1] + " /", 31, 221);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 3].getNumber()][0], 31, 241);
                g.setColor(Color.white);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 3].getNumber()][1] + " /", 30, 220);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 3].getNumber()][0], 30, 240);
            } else if (pokedexSelect == 5) {
                g.drawImage(PokeDexSelect, 195, 150, null);
                g.drawImage(game.pokedex[pokedexSelection + 4].getFrontSprite(), 20, 20, null);
                g.setColor(Color.darkGray);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 4].getNumber()][1] + " /", 31, 221);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 4].getNumber()][0], 31, 241);
                g.setColor(Color.white);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 4].getNumber()][1] + " /", 30, 220);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 4].getNumber()][0], 30, 240);
            } else if (pokedexSelect == 6) {
                g.drawImage(PokeDexSelect, 195, 180, null);
                g.drawImage(game.pokedex[pokedexSelection + 5].getFrontSprite(), 20, 20, null);
                g.setColor(Color.darkGray);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 5].getNumber()][1] + " /", 31, 221);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 5].getNumber()][0], 31, 241);
                g.setColor(Color.white);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 5].getNumber()][1] + " /", 30, 220);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 5].getNumber()][0], 30, 240);
            } else if (pokedexSelect == 7) {
                g.drawImage(PokeDexSelect, 195, 210, null);
                g.drawImage(game.pokedex[pokedexSelection + 6].getFrontSprite(), 20, 20, null);
                g.setColor(Color.darkGray);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 6].getNumber()][1] + " /", 31, 221);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 6].getNumber()][0], 31, 241);
                g.setColor(Color.white);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 6].getNumber()][1] + " /", 30, 220);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 6].getNumber()][0], 30, 240);
            } else if (pokedexSelect == 8) {
                g.drawImage(PokeDexSelect, 195, 240, null);
                g.drawImage(game.pokedex[pokedexSelection + 7].getFrontSprite(), 20, 20, null);
                g.setColor(Color.darkGray);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 7].getNumber()][1] + " /", 31, 221);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 7].getNumber()][0], 31, 241);
                g.setColor(Color.white);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 7].getNumber()][1] + " /", 30, 220);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 7].getNumber()][0], 30, 240);
            } else if (pokedexSelect == 9) {
                g.drawImage(PokeDexSelect, 195, 270, null);
                g.drawImage(game.pokedex[pokedexSelection + 8].getFrontSprite(), 20, 20, null);
                g.setColor(Color.darkGray);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 8].getNumber()][1] + " /", 31, 221);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 8].getNumber()][0], 31, 241);
                g.setColor(Color.white);
                g.drawString("Own:  " + game.PokedexIndex[game.pokedex[pokedexSelection + 8].getNumber()][1] + " /", 30, 220);
                g.drawString("   Seen: " + game.PokedexIndex[game.pokedex[pokedexSelection + 8].getNumber()][0], 30, 240);
            }
            g.setColor(Color.darkGray);
            if (pokedexSelection < 10) {
                g.drawString("No.00" + pokedexSelection + "     " + game.pokedex[pokedexSelection].getName(), 200, 50);
            } else if (pokedexSelection < 100) {
                g.drawString("No.0" + pokedexSelection + "     " + game.pokedex[pokedexSelection].getName(), 200, 50);
            } else {
                g.drawString("No." + pokedexSelection + "     " + game.pokedex[pokedexSelection].getName(), 200, 50);
            }
            if (game.PokedexIndex[game.pokedex[pokedexSelection].getNumber()][1] > 0) {
                g.drawImage(Ball, 175, 35, 18, 18, null);
            }
            if ((pokedexSelection + 1) < 10) {
                g.drawString("No.00" + (pokedexSelection + 1) + "     " + game.pokedex[pokedexSelection + 1].getName(), 200, 80);
            } else if ((pokedexSelection + 1) < 100) {
                g.drawString("No.0" + (pokedexSelection + 1) + "     " + game.pokedex[pokedexSelection + 1].getName(), 200, 80);
            } else {
                g.drawString("No." + (pokedexSelection + 1) + "     " + game.pokedex[pokedexSelection + 1].getName(), 200, 80);
            }
            if (game.PokedexIndex[game.pokedex[pokedexSelection + 1].getNumber()][1] > 0) {
                g.drawImage(Ball, 175, 65, 18, 18, null);
            }
            if ((pokedexSelection + 2) < 10) {
                g.drawString("No.00" + (pokedexSelection + 2) + "     " + game.pokedex[pokedexSelection + 2].getName(), 200, 110);
            } else if ((pokedexSelection + 2) < 100) {
                g.drawString("No.0" + (pokedexSelection + 2) + "     " + game.pokedex[pokedexSelection + 2].getName(), 200, 110);
            } else {
                g.drawString("No." + (pokedexSelection + 2) + "     " + game.pokedex[pokedexSelection + 2].getName(), 200, 110);
            }
            if (game.PokedexIndex[game.pokedex[pokedexSelection + 2].getNumber()][1] > 0) {
                g.drawImage(Ball, 175, 95, 18, 18, null);
            }
            if ((pokedexSelection + 3) < 10) {
                g.drawString("No.00" + (pokedexSelection + 3) + "     " + game.pokedex[pokedexSelection + 3].getName(), 200, 140);
            } else if ((pokedexSelection + 3) < 100) {
                g.drawString("No.0" + (pokedexSelection + 3) + "     " + game.pokedex[pokedexSelection + 3].getName(), 200, 140);
            } else {
                g.drawString("No." + (pokedexSelection + 3) + "     " + game.pokedex[pokedexSelection + 3].getName(), 200, 140);
            }
            if (game.PokedexIndex[game.pokedex[pokedexSelection + 3].getNumber()][1] > 0) {
                g.drawImage(Ball, 175, 125, 18, 18, null);
            }
            if ((pokedexSelection + 4) < 10) {
                g.drawString("No.00" + (pokedexSelection + 4) + "     " + game.pokedex[pokedexSelection + 4].getName(), 200, 170);
            } else if ((pokedexSelection + 4) < 100) {
                g.drawString("No.0" + (pokedexSelection + 4) + "     " + game.pokedex[pokedexSelection + 4].getName(), 200, 170);
            } else {
                g.drawString("No." + (pokedexSelection + 4) + "     " + game.pokedex[pokedexSelection + 4].getName(), 200, 170);
            }
            if (game.PokedexIndex[game.pokedex[pokedexSelection + 4].getNumber()][1] > 0) {
                g.drawImage(Ball, 175, 155, 18, 18, null);
            }
            if ((pokedexSelection + 5) < 10) {
                g.drawString("No.00" + (pokedexSelection + 5) + "     " + game.pokedex[pokedexSelection + 5].getName(), 200, 200);
            } else if ((pokedexSelection + 5) < 100) {
                g.drawString("No.0" + (pokedexSelection + 5) + "     " + game.pokedex[pokedexSelection + 5].getName(), 200, 200);
            } else {
                g.drawString("No." + (pokedexSelection + 5) + "     " + game.pokedex[pokedexSelection + 5].getName(), 200, 200);
            }
            if (game.PokedexIndex[game.pokedex[pokedexSelection + 5].getNumber()][1] > 0) {
                g.drawImage(Ball, 175, 185, 18, 18, null);
            }
            if ((pokedexSelection + 6) < 10) {
                g.drawString("No.00" + (pokedexSelection + 6) + "     " + game.pokedex[pokedexSelection + 6].getName(), 200, 230);
            } else if ((pokedexSelection + 6) < 100) {
                g.drawString("No.0" + (pokedexSelection + 6) + "     " + game.pokedex[pokedexSelection + 6].getName(), 200, 230);
            } else {
                g.drawString("No." + (pokedexSelection + 6) + "     " + game.pokedex[pokedexSelection + 6].getName(), 200, 230);
            }
            if (game.PokedexIndex[game.pokedex[pokedexSelection + 6].getNumber()][1] > 0) {
                g.drawImage(Ball, 175, 215, 18, 18, null);
            }
            if ((pokedexSelection + 7) < 10) {
                g.drawString("No.00" + (pokedexSelection + 7) + "     " + game.pokedex[pokedexSelection + 7].getName(), 200, 260);
            } else if ((pokedexSelection + 7) < 100) {
                g.drawString("No.0" + (pokedexSelection + 7) + "     " + game.pokedex[pokedexSelection + 7].getName(), 200, 260);
            } else {
                g.drawString("No." + (pokedexSelection + 7) + "     " + game.pokedex[pokedexSelection + 7].getName(), 200, 260);
            }
            if (game.PokedexIndex[game.pokedex[pokedexSelection + 7].getNumber()][1] > 0) {
                g.drawImage(Ball, 175, 245, 18, 18, null);
            }
            if ((pokedexSelection + 8) < 10) {
                g.drawString("No.00" + (pokedexSelection + 8) + "     " + game.pokedex[pokedexSelection + 8].getName(), 200, 290);
            } else if ((pokedexSelection + 8) < 100) {
                g.drawString("No.0" + (pokedexSelection + 8) + "     " + game.pokedex[pokedexSelection + 8].getName(), 200, 290);
            } else {
                g.drawString("No." + (pokedexSelection + 8) + "     " + game.pokedex[pokedexSelection + 8].getName(), 200, 290);
            }
            if (game.PokedexIndex[game.pokedex[pokedexSelection + 8].getNumber()][1] > 0) {
                g.drawImage(Ball, 175, 275, 18, 18, null);
            }
        }
        if (inStatus) {
            if (CurrentPokemonForStats == 1) {
                g.drawImage(StatusBG, 0, 0, null);
                g.drawImage(game.first.getFrontSprite(), 20, 60, null);
                g.setColor(Color.black);
                if (game.first.getNumber() < 10) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.00" + game.first.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.00" + game.first.getNumber(), 30, 50);
                } else if (game.first.getNumber() < 100) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.0" + game.first.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.0" + game.first.getNumber(), 30, 50);
                } else {
                    g.setColor(Color.darkGray);
                    g.drawString("No." + game.first.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No." + game.first.getNumber(), 30, 50);
                }
                g.setColor(Color.darkGray);
                g.drawString(game.first.getName(), 30 + 1, 220 + 1);
                g.drawString("/" + game.first.getName(), 30 + 1, 240 + 1);
                g.setColor(Color.white);
                g.drawString(game.first.getName(), 30, 220);
                g.drawString("/" + game.first.getName(), 30, 240);
                if (game.first.HoldItem > 0) {
                    tmp.create(game.first.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 20, 250, null);
                }
                g.setColor(Color.darkGray);
                g.drawString("Lv" + game.first.getLevel(), 80 + 1, 280 + 1);
                g.setColor(Color.white);
                g.drawString("Lv" + game.first.getLevel(), 80, 280);
                if (StatusSelection == 0) {
                    g.setColor(Color.darkGray);
                    g.drawString("Caught by " + game.alec.getName(), 170 + 1, 90 + 1);
                    g.drawString("Wrecks Pokemon like no other", 170 + 1, 170 + 1);
                    g.drawString("Sexual Orientation: Gay", 170 + 1, 250 + 1);
                    g.setColor(Color.black);
                } else if (StatusSelection == 1) {
                    g.drawImage(SecondPage, 208, 0, 96, 32, null);
                    g.drawImage(Status, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString(game.first.getHoldItem(), 180 + 1, 85 + 1);
                    g.drawString("NONE", 370 + 1, 85 + 1);
                    g.drawString("   HP:            " + game.first.getHP() + " / " + game.first.getHealth(), 170 + 1, 130 + 1);
                    g.drawString(" ATTACK:         " + game.first.getAttack(), 170 + 1, 160 + 1);
                    g.drawString("DEFENSE:       " + game.first.getDeffense(), 170 + 1, 190 + 1);
                    g.drawString(" SPEED:   " + game.first.getSpeed(), 360 + 1, 130 + 1);
                    g.drawString("SP.ATK:   " + game.first.getSpAttack(), 360 + 1, 160 + 1);
                    g.drawString("SP.DEF:   " + game.first.getSpDeffense(), 360 + 1, 190 + 1);
                    g.drawString("EXP. POINTS", 170 + 1, 250 + 1);
                    g.drawString("NEXT LEVEL", 170 + 1, 280 + 1);
                    g.drawString("" + game.first.getEXP(), 350 + 1, 250 + 1);
                    g.drawString("" + game.first.getLevelEXP(), 350 + 1, 280 + 1);
                    g.setColor(Color.white);
                    g.drawString("   HP:", 170, 130);
                    g.drawString(" ATTACK:", 170, 160);
                    g.drawString("DEFENSE:", 170, 190);
                    g.drawString(" SPEED:", 360, 130);
                    g.drawString("SP.ATK:", 360, 160);
                    g.drawString("SP.DEF:", 360, 190);
                    g.drawString("EXP. POINTS", 170, 250);
                    g.drawString("NEXT LEVEL", 170, 280);
                    g.setColor(Color.cyan);
                    g.drawRect(336, 292, (127 * (game.first.getEXP() / game.first.getLevelEXP())), 6);
                    g.fillRect(336, 292, (127 * (game.first.getHP() / game.first.getHealth())), 6);
                    g.setColor(Color.black);

                } else if (StatusSelection == 2) {
                    g.drawImage(ThirdPage, 208, 0, 96, 32, null);
                    g.drawImage(StatusMoves, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString("Move 1:   " + game.first.move1, 170 + 1, 80 + 1);
                    g.drawString("Move 2:   " + game.first.move2, 170 + 1, 110 + 1);
                    g.drawString("Move 3:   " + game.first.move3, 170 + 1, 140 + 1);
                    g.drawString("Move 4:   " + game.first.move4, 170 + 1, 170 + 1);
                    g.drawString("" + new Attacks(game.first.move1).getDamage(), 400 + 1, 80 + 1);
                    g.drawString("" + new Attacks(game.first.move2).getDamage(), 400 + 1, 110 + 1);
                    g.drawString("" + new Attacks(game.first.move3).getDamage(), 400 + 1, 140 + 1);
                    g.drawString("" + new Attacks(game.first.move4).getDamage(), 400 + 1, 170 + 1);
                    g.drawString("dgaf...", 170, 260);
                    g.setColor(Color.black);
                }
            } else if (CurrentPokemonForStats == 2) {
                g.drawImage(StatusBG, 0, 0, null);
                g.drawImage(game.second.getFrontSprite(), 20, 60, null);
                g.setColor(Color.black);
                if (game.second.getNumber() < 10) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.00" + game.second.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.00" + game.second.getNumber(), 30, 50);
                } else if (game.second.getNumber() < 100) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.0" + game.second.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.0" + game.second.getNumber(), 30, 50);
                } else {
                    g.setColor(Color.darkGray);
                    g.drawString("No." + game.second.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No." + game.second.getNumber(), 30, 50);
                }
                g.setColor(Color.darkGray);
                g.drawString(game.second.getName(), 30 + 1, 220 + 1);
                g.drawString("/" + game.second.getName(), 30 + 1, 240 + 1);
                g.setColor(Color.white);
                g.drawString(game.second.getName(), 30, 220);
                g.drawString("/" + game.second.getName(), 30, 240);
                if (game.second.HoldItem > 0) {
                    tmp.create(game.second.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 20, 250, null);
                }
                g.setColor(Color.darkGray);
                g.drawString("Lv" + game.second.getLevel(), 80 + 1, 280 + 1);
                g.setColor(Color.white);
                g.drawString("Lv" + game.second.getLevel(), 80, 280);
                if (StatusSelection == 0) {
                    g.setColor(Color.darkGray);
                    g.drawString("Caught by " + game.alec.getName(), 170 + 1, 90 + 1);
                    g.drawString("Wrecks Pokemon like no other", 170 + 1, 170 + 1);
                    g.drawString("Sexual Orientation: Gay", 170 + 1, 250 + 1);
                    g.setColor(Color.black);
                } else if (StatusSelection == 1) {
                    g.drawImage(SecondPage, 208, 0, 96, 32, null);
                    g.drawImage(Status, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString(game.second.getHoldItem(), 180 + 1, 85 + 1);
                    g.drawString("NONE", 370 + 1, 85 + 1);
                    g.drawString("   HP:            " + game.second.getHP() + " / " + game.second.getHealth(), 170 + 1, 130 + 1);
                    g.drawString(" ATTACK:         " + game.second.getAttack(), 170 + 1, 160 + 1);
                    g.drawString("DEFENSE:       " + game.second.getDeffense(), 170 + 1, 190 + 1);
                    g.drawString(" SPEED:   " + game.second.getSpeed(), 360 + 1, 130 + 1);
                    g.drawString("SP.ATK:   " + game.second.getSpAttack(), 360 + 1, 160 + 1);
                    g.drawString("SP.DEF:   " + game.second.getSpDeffense(), 360 + 1, 190 + 1);
                    g.drawString("EXP. POINTS", 170 + 1, 250 + 1);
                    g.drawString("NEXT LEVEL", 170 + 1, 280 + 1);
                    g.drawString("" + game.second.getEXP(), 350 + 1, 250 + 1);
                    g.drawString("" + game.second.getLevelEXP(), 350 + 1, 280 + 1);
                    g.setColor(Color.white);
                    g.drawString("   HP:", 170, 130);
                    g.drawString(" ATTACK:", 170, 160);
                    g.drawString("DEFENSE:", 170, 190);
                    g.drawString(" SPEED:", 360, 130);
                    g.drawString("SP.ATK:", 360, 160);
                    g.drawString("SP.DEF:", 360, 190);
                    g.drawString("EXP. POINTS", 170, 250);
                    g.drawString("NEXT LEVEL", 170, 280);
                    g.setColor(Color.cyan);
                    g.drawRect(336, 292, (127 * (game.second.getEXP() / game.second.getLevelEXP())), 6);
                    g.fillRect(336, 292, (127 * (game.second.getHP() / game.second.getHealth())), 6);
                    g.setColor(Color.black);

                } else if (StatusSelection == 2) {
                    g.drawImage(ThirdPage, 208, 0, 96, 32, null);
                    g.drawImage(StatusMoves, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString("Move 1:   " + game.second.move1, 170 + 1, 80 + 1);
                    g.drawString("Move 2:   " + game.second.move2, 170 + 1, 110 + 1);
                    g.drawString("Move 3:   " + game.second.move3, 170 + 1, 140 + 1);
                    g.drawString("Move 4:   " + game.second.move4, 170 + 1, 170 + 1);
                    g.drawString("" + new Attacks(game.second.move1).getDamage(), 400 + 1, 80 + 1);
                    g.drawString("" + new Attacks(game.second.move2).getDamage(), 400 + 1, 110 + 1);
                    g.drawString("" + new Attacks(game.second.move3).getDamage(), 400 + 1, 140 + 1);
                    g.drawString("" + new Attacks(game.second.move4).getDamage(), 400 + 1, 170 + 1);
                    g.drawString("dgaf...", 170, 260);
                    g.setColor(Color.black);
                }
            } else if (CurrentPokemonForStats == 3) {
                g.drawImage(StatusBG, 0, 0, null);
                g.drawImage(game.third.getFrontSprite(), 20, 60, null);
                g.setColor(Color.black);
                if (game.third.getNumber() < 10) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.00" + game.third.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.00" + game.third.getNumber(), 30, 50);
                } else if (game.third.getNumber() < 100) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.0" + game.third.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.0" + game.third.getNumber(), 30, 50);
                } else {
                    g.setColor(Color.darkGray);
                    g.drawString("No." + game.third.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No." + game.third.getNumber(), 30, 50);
                }
                g.setColor(Color.darkGray);
                g.drawString(game.third.getName(), 30 + 1, 220 + 1);
                g.drawString("/" + game.third.getName(), 30 + 1, 240 + 1);
                g.setColor(Color.white);
                g.drawString(game.third.getName(), 30, 220);
                g.drawString("/" + game.third.getName(), 30, 240);
                if (game.third.HoldItem > 0) {
                    tmp.create(game.third.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 20, 250, null);
                }
                g.setColor(Color.darkGray);
                g.drawString("Lv" + game.third.getLevel(), 80 + 1, 280 + 1);
                g.setColor(Color.white);
                g.drawString("Lv" + game.third.getLevel(), 80, 280);
                if (StatusSelection == 0) {
                    g.setColor(Color.darkGray);
                    g.drawString("Caught by " + game.alec.getName(), 170 + 1, 90 + 1);
                    g.drawString("Wrecks Pokemon like no other", 170 + 1, 170 + 1);
                    g.drawString("Sexual Orientation: Gay", 170 + 1, 250 + 1);
                    g.setColor(Color.black);
                } else if (StatusSelection == 1) {
                    g.drawImage(SecondPage, 208, 0, 96, 32, null);
                    g.drawImage(Status, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString(game.third.getHoldItem(), 180 + 1, 85 + 1);
                    g.drawString("NONE", 370 + 1, 85 + 1);
                    g.drawString("   HP:            " + game.third.getHP() + " / " + game.third.getHealth(), 170 + 1, 130 + 1);
                    g.drawString(" ATTACK:         " + game.third.getAttack(), 170 + 1, 160 + 1);
                    g.drawString("DEFENSE:       " + game.third.getDeffense(), 170 + 1, 190 + 1);
                    g.drawString(" SPEED:   " + game.third.getSpeed(), 360 + 1, 130 + 1);
                    g.drawString("SP.ATK:   " + game.third.getSpAttack(), 360 + 1, 160 + 1);
                    g.drawString("SP.DEF:   " + game.third.getSpDeffense(), 360 + 1, 190 + 1);
                    g.drawString("EXP. POINTS", 170 + 1, 250 + 1);
                    g.drawString("NEXT LEVEL", 170 + 1, 280 + 1);
                    g.drawString("" + game.third.getEXP(), 350 + 1, 250 + 1);
                    g.drawString("" + game.third.getLevelEXP(), 350 + 1, 280 + 1);
                    g.setColor(Color.white);;
                    g.drawString("   HP:", 170, 130);
                    g.drawString(" ATTACK:", 170, 160);
                    g.drawString("DEFENSE:", 170, 190);
                    g.drawString(" SPEED:", 360, 130);
                    g.drawString("SP.ATK:", 360, 160);
                    g.drawString("SP.DEF:", 360, 190);
                    g.drawString("EXP. POINTS", 170, 250);
                    g.drawString("NEXT LEVEL", 170, 280);
                    g.setColor(Color.cyan);
                    g.drawRect(336, 292, (127 * (game.third.getEXP() / game.third.getLevelEXP())), 6);
                    g.fillRect(336, 292, (127 * (game.third.getHP() / game.third.getHealth())), 6);
                    g.setColor(Color.black);

                } else if (StatusSelection == 2) {
                    g.drawImage(ThirdPage, 208, 0, 96, 32, null);
                    g.drawImage(StatusMoves, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString("Move 1:   " + game.third.move1, 170 + 1, 80 + 1);
                    g.drawString("Move 2:   " + game.third.move2, 170 + 1, 110 + 1);
                    g.drawString("Move 3:   " + game.third.move3, 170 + 1, 140 + 1);
                    g.drawString("Move 4:   " + game.third.move4, 170 + 1, 170 + 1);
                    g.drawString("" + new Attacks(game.third.move1).getDamage(), 400 + 1, 80 + 1);
                    g.drawString("" + new Attacks(game.third.move2).getDamage(), 400 + 1, 110 + 1);
                    g.drawString("" + new Attacks(game.third.move3).getDamage(), 400 + 1, 140 + 1);
                    g.drawString("" + new Attacks(game.third.move4).getDamage(), 400 + 1, 170 + 1);
                    g.drawString("dgaf...", 170, 260);
                    g.setColor(Color.black);
                }
            } else if (CurrentPokemonForStats == 4) {
                g.drawImage(StatusBG, 0, 0, null);
                g.drawImage(game.fourth.getFrontSprite(), 20, 60, null);
                g.setColor(Color.black);
                if (game.fourth.getNumber() < 10) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.00" + game.fourth.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.00" + game.fourth.getNumber(), 30, 50);
                } else if (game.fourth.getNumber() < 100) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.0" + game.fourth.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.0" + game.fourth.getNumber(), 30, 50);
                } else {
                    g.setColor(Color.darkGray);
                    g.drawString("No." + game.fourth.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No." + game.fourth.getNumber(), 30, 50);
                }
                g.setColor(Color.darkGray);
                g.drawString(game.fourth.getName(), 30 + 1, 220 + 1);
                g.drawString("/" + game.fourth.getName(), 30 + 1, 240 + 1);
                g.setColor(Color.white);
                g.drawString(game.fourth.getName(), 30, 220);
                g.drawString("/" + game.fourth.getName(), 30, 240);
                if (game.fourth.HoldItem > 0) {
                    tmp.create(game.fourth.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 20, 250, null);
                }
                g.setColor(Color.darkGray);
                g.drawString("Lv" + game.fourth.getLevel(), 80 + 1, 280 + 1);
                g.setColor(Color.white);
                g.drawString("Lv" + game.fourth.getLevel(), 80, 280);
                if (StatusSelection == 0) {
                    g.setColor(Color.darkGray);
                    g.drawString("Caught by " + game.alec.getName(), 170 + 1, 90 + 1);
                    g.drawString("Wrecks Pokemon like no other", 170 + 1, 170 + 1);
                    g.drawString("Sexual Orientation: Gay", 170 + 1, 250 + 1);
                    g.setColor(Color.black);
                } else if (StatusSelection == 1) {
                    g.drawImage(SecondPage, 208, 0, 96, 32, null);
                    g.drawImage(Status, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString(game.fourth.getHoldItem(), 180 + 1, 85 + 1);
                    g.drawString("NONE", 370 + 1, 85 + 1);
                    g.drawString("   HP:            " + game.fourth.getHP() + " / " + game.fourth.getHealth(), 170 + 1, 130 + 1);
                    g.drawString(" ATTACK:         " + game.fourth.getAttack(), 170 + 1, 160 + 1);
                    g.drawString("DEFENSE:       " + game.fourth.getDeffense(), 170 + 1, 190 + 1);
                    g.drawString(" SPEED:   " + game.fourth.getSpeed(), 360 + 1, 130 + 1);
                    g.drawString("SP.ATK:   " + game.fourth.getSpAttack(), 360 + 1, 160 + 1);
                    g.drawString("SP.DEF:   " + game.fourth.getSpDeffense(), 360 + 1, 190 + 1);
                    g.drawString("EXP. POINTS", 170 + 1, 250 + 1);
                    g.drawString("NEXT LEVEL", 170 + 1, 280 + 1);
                    g.drawString("" + game.fourth.getEXP(), 350 + 1, 250 + 1);
                    g.drawString("" + game.fourth.getLevelEXP(), 350 + 1, 280 + 1);
                    g.setColor(Color.white);
                    g.drawString("   HP:", 170, 130);
                    g.drawString(" ATTACK:", 170, 160);
                    g.drawString("DEFENSE:", 170, 190);
                    g.drawString(" SPEED:", 360, 130);
                    g.drawString("SP.ATK:", 360, 160);
                    g.drawString("SP.DEF:", 360, 190);
                    g.drawString("EXP. POINTS", 170, 250);
                    g.drawString("NEXT LEVEL", 170, 280);
                    g.setColor(Color.cyan);
                    g.drawRect(336, 292, (127 * (game.fourth.getEXP() / game.fourth.getLevelEXP())), 6);
                    g.fillRect(336, 292, (127 * (game.fourth.getHP() / game.fourth.getHealth())), 6);
                    g.setColor(Color.black);

                } else if (StatusSelection == 2) {
                    g.drawImage(ThirdPage, 208, 0, 96, 32, null);
                    g.drawImage(StatusMoves, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString("Move 1:   " + game.fourth.move1, 170 + 1, 80 + 1);
                    g.drawString("Move 2:   " + game.fourth.move2, 170 + 1, 110 + 1);
                    g.drawString("Move 3:   " + game.fourth.move3, 170 + 1, 140 + 1);
                    g.drawString("Move 4:   " + game.fourth.move4, 170 + 1, 170 + 1);
                    g.drawString("" + new Attacks(game.fourth.move1).getDamage(), 400 + 1, 80 + 1);
                    g.drawString("" + new Attacks(game.fourth.move2).getDamage(), 400 + 1, 110 + 1);
                    g.drawString("" + new Attacks(game.fourth.move3).getDamage(), 400 + 1, 140 + 1);
                    g.drawString("" + new Attacks(game.fourth.move4).getDamage(), 400 + 1, 170 + 1);
                    g.drawString("dgaf...", 170, 260);
                    g.setColor(Color.black);
                }
            } else if (CurrentPokemonForStats == 5) {
                g.drawImage(StatusBG, 0, 0, null);
                g.drawImage(game.fifth.getFrontSprite(), 20, 60, null);
                g.setColor(Color.black);
                if (game.fifth.getNumber() < 10) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.00" + game.fifth.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.00" + game.fifth.getNumber(), 30, 50);
                } else if (game.fifth.getNumber() < 100) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.0" + game.fifth.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.0" + game.fifth.getNumber(), 30, 50);
                } else {
                    g.setColor(Color.darkGray);
                    g.drawString("No." + game.fifth.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No." + game.fifth.getNumber(), 30, 50);
                }
                g.setColor(Color.darkGray);
                g.drawString(game.fifth.getName(), 30 + 1, 220 + 1);
                g.drawString("/" + game.fifth.getName(), 30 + 1, 240 + 1);
                g.setColor(Color.white);
                g.drawString(game.fifth.getName(), 30, 220);
                g.drawString("/" + game.fifth.getName(), 30, 240);
                if (game.fifth.HoldItem > 0) {
                    tmp.create(game.fifth.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 20, 250, null);
                }
                g.setColor(Color.darkGray);
                g.drawString("Lv" + game.fifth.getLevel(), 80 + 1, 280 + 1);
                g.setColor(Color.white);
                g.drawString("Lv" + game.fifth.getLevel(), 80, 280);
                if (StatusSelection == 0) {
                    g.setColor(Color.darkGray);
                    g.drawString("Caught by " + game.alec.getName(), 170 + 1, 90 + 1);
                    g.drawString("Wrecks Pokemon like no other", 170 + 1, 170 + 1);
                    g.drawString("Sexual Orientation: Gay", 170 + 1, 250 + 1);
                    g.setColor(Color.black);
                } else if (StatusSelection == 1) {
                    g.drawImage(SecondPage, 208, 0, 96, 32, null);
                    g.drawImage(Status, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString(game.fifth.getHoldItem(), 180 + 1, 85 + 1);
                    g.drawString("NONE", 370 + 1, 85 + 1);
                    g.drawString("   HP:            " + game.fifth.getHP() + " / " + game.fifth.getHealth(), 170 + 1, 130 + 1);
                    g.drawString(" ATTACK:         " + game.fifth.getAttack(), 170 + 1, 160 + 1);
                    g.drawString("DEFENSE:       " + game.fifth.getDeffense(), 170 + 1, 190 + 1);
                    g.drawString(" SPEED:   " + game.fifth.getSpeed(), 360 + 1, 130 + 1);
                    g.drawString("SP.ATK:   " + game.fifth.getSpAttack(), 360 + 1, 160 + 1);
                    g.drawString("SP.DEF:   " + game.fifth.getSpDeffense(), 360 + 1, 190 + 1);
                    g.drawString("EXP. POINTS", 170 + 1, 250 + 1);
                    g.drawString("NEXT LEVEL", 170 + 1, 280 + 1);
                    g.drawString("" + game.fifth.getEXP(), 350 + 1, 250 + 1);
                    g.drawString("" + game.fifth.getLevelEXP(), 350 + 1, 280 + 1);
                    g.setColor(Color.white);
                    g.drawString("   HP:", 170, 130);
                    g.drawString(" ATTACK:", 170, 160);
                    g.drawString("DEFENSE:", 170, 190);
                    g.drawString(" SPEED:", 360, 130);
                    g.drawString("SP.ATK:", 360, 160);
                    g.drawString("SP.DEF:", 360, 190);
                    g.drawString("EXP. POINTS", 170, 250);
                    g.drawString("NEXT LEVEL", 170, 280);
                    g.setColor(Color.cyan);
                    g.drawRect(336, 292, (127 * (game.fifth.getEXP() / game.fifth.getLevelEXP())), 6);
                    g.fillRect(336, 292, (127 * (game.fifth.getHP() / game.fifth.getHealth())), 6);
                    g.setColor(Color.black);

                } else if (StatusSelection == 2) {
                    g.drawImage(ThirdPage, 208, 0, 96, 32, null);
                    g.drawImage(StatusMoves, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString("Move 1:   " + game.fifth.move1, 170 + 1, 80 + 1);
                    g.drawString("Move 2:   " + game.fifth.move2, 170 + 1, 110 + 1);
                    g.drawString("Move 3:   " + game.fifth.move3, 170 + 1, 140 + 1);
                    g.drawString("Move 4:   " + game.fifth.move4, 170 + 1, 170 + 1);
                    g.drawString("" + new Attacks(game.fifth.move1).getDamage(), 400 + 1, 80 + 1);
                    g.drawString("" + new Attacks(game.fifth.move2).getDamage(), 400 + 1, 110 + 1);
                    g.drawString("" + new Attacks(game.fifth.move3).getDamage(), 400 + 1, 140 + 1);
                    g.drawString("" + new Attacks(game.fifth.move4).getDamage(), 400 + 1, 170 + 1);
                    g.drawString("dgaf...", 170, 260);
                    g.setColor(Color.black);
                }
            } else if (CurrentPokemonForStats == 6) {
                g.drawImage(StatusBG, 0, 0, null);
                g.drawImage(game.sixth.getFrontSprite(), 20, 60, null);
                g.setColor(Color.black);
                if (game.sixth.getNumber() < 10) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.00" + game.sixth.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.00" + game.sixth.getNumber(), 30, 50);
                } else if (game.sixth.getNumber() < 100) {
                    g.setColor(Color.darkGray);
                    g.drawString("No.0" + game.sixth.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No.0" + game.sixth.getNumber(), 30, 50);
                } else {
                    g.setColor(Color.darkGray);
                    g.drawString("No." + game.sixth.getNumber(), 30 + 1, 50 + 1);
                    g.setColor(Color.white);
                    g.drawString("No." + game.sixth.getNumber(), 30, 50);
                }
                g.setColor(Color.darkGray);
                g.drawString(game.sixth.getName(), 30 + 1, 220 + 1);
                g.drawString("/" + game.sixth.getName(), 30 + 1, 240 + 1);
                g.setColor(Color.white);
                g.drawString(game.sixth.getName(), 30, 220);
                g.drawString("/" + game.sixth.getName(), 30, 240);
                if (game.sixth.HoldItem > 0) {
                    tmp.create(game.sixth.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 20, 250, null);
                }
                g.setColor(Color.darkGray);
                g.drawString("Lv" + game.sixth.getLevel(), 80 + 1, 280 + 1);
                g.setColor(Color.white);
                g.drawString("Lv" + game.sixth.getLevel(), 80, 280);
                if (StatusSelection == 0) {
                    g.setColor(Color.darkGray);
                    g.drawString("Caught by " + game.alec.getName(), 170 + 1, 90 + 1);
                    g.drawString("Wrecks Pokemon like no other", 170 + 1, 170 + 1);
                    g.drawString("Sexual Orientation: Gay", 170 + 1, 250 + 1);
                    g.setColor(Color.black);
                } else if (StatusSelection == 1) {
                    g.drawImage(SecondPage, 208, 0, 96, 32, null);
                    g.drawImage(Status, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString(game.sixth.getHoldItem(), 180 + 1, 85 + 1);
                    g.drawString("NONE", 370 + 1, 85 + 1);
                    g.drawString("   HP:            " + game.sixth.getHP() + " / " + game.sixth.getHealth(), 170 + 1, 130 + 1);
                    g.drawString(" ATTACK:         " + game.sixth.getAttack(), 170 + 1, 160 + 1);
                    g.drawString("DEFENSE:       " + game.sixth.getDeffense(), 170 + 1, 190 + 1);
                    g.drawString(" SPEED:   " + game.sixth.getSpeed(), 360 + 1, 130 + 1);
                    g.drawString("SP.ATK:   " + game.sixth.getSpAttack(), 360 + 1, 160 + 1);
                    g.drawString("SP.DEF:   " + game.sixth.getSpDeffense(), 360 + 1, 190 + 1);
                    g.drawString("EXP. POINTS", 170 + 1, 250 + 1);
                    g.drawString("NEXT LEVEL", 170 + 1, 280 + 1);
                    g.drawString("" + game.sixth.getEXP(), 350 + 1, 250 + 1);
                    g.drawString("" + game.sixth.getLevelEXP(), 350 + 1, 280 + 1);
                    g.setColor(Color.white);
                    g.drawString("   HP:", 170, 130);
                    g.drawString(" ATTACK:", 170, 160);
                    g.drawString("DEFENSE:", 170, 190);
                    g.drawString(" SPEED:", 360, 130);
                    g.drawString("SP.ATK:", 360, 160);
                    g.drawString("SP.DEF:", 360, 190);
                    g.drawString("EXP. POINTS", 170, 250);
                    g.drawString("NEXT LEVEL", 170, 280);
                    g.setColor(Color.cyan);
                    g.drawRect(336, 292, (127 * (game.sixth.getEXP() / game.sixth.getLevelEXP())), 6);
                    g.fillRect(336, 292, (127 * (game.sixth.getHP() / game.sixth.getHealth())), 6);
                    g.setColor(Color.black);

                } else if (StatusSelection == 2) {
                    g.drawImage(ThirdPage, 208, 0, 96, 32, null);
                    g.drawImage(StatusMoves, 160, 42, null);
                    g.setColor(Color.darkGray);
                    g.drawString("Move 1:   " + game.sixth.move1, 170 + 1, 80 + 1);
                    g.drawString("Move 2:   " + game.sixth.move2, 170 + 1, 110 + 1);
                    g.drawString("Move 3:   " + game.sixth.move3, 170 + 1, 140 + 1);
                    g.drawString("Move 4:   " + game.sixth.move4, 170 + 1, 170 + 1);
                    g.drawString("" + new Attacks(game.sixth.move1).getDamage(), 400 + 1, 80 + 1);
                    g.drawString("" + new Attacks(game.sixth.move2).getDamage(), 400 + 1, 110 + 1);
                    g.drawString("" + new Attacks(game.sixth.move3).getDamage(), 400 + 1, 140 + 1);
                    g.drawString("" + new Attacks(game.sixth.move4).getDamage(), 400 + 1, 170 + 1);
                    g.drawString("dgaf...", 170, 260);
                    g.setColor(Color.black);
                }
            }
        } else if (inFly) {
        } else if (inPokemon) {

            if (PokemonSelection == 1) {
                if (game.first.getHP() <= (game.first.getHealth() / 4)) {
                    b1modifier = 22;
                } else if (game.first.getHP() <= (game.first.getHealth() / 2)) {
                    b1modifier = 16;
                } else {
                    b1modifier = 10;
                }
            } else {
                if (game.first.getHP() <= (game.first.getHealth() / 4)) {
                    b1modifier = 28;
                } else if (game.first.getHP() <= (game.first.getHealth() / 2)) {
                    b1modifier = 22;
                } else {
                    b1modifier = 16;
                }
            }

            if (PokemonSelection == 2) {
                if (game.second.getHP() <= (game.second.getHealth() / 4)) {
                    b2modifier = 22;
                } else if (game.second.getHP() <= (game.second.getHealth() / 2)) {
                    b2modifier = 16;
                } else {
                    b2modifier = 10;
                }
            } else {
                if (game.second.getHP() <= (game.second.getHealth() / 4)) {
                    b2modifier = 28;
                } else if (game.second.getHP() <= (game.second.getHealth() / 2)) {
                    b2modifier = 22;
                } else {
                    b2modifier = 16;
                }
            }

            if (PokemonSelection == 3) {
                if (game.third.getHP() <= (game.third.getHealth() / 4)) {
                    b3modifier = 22;
                } else if (game.third.getHP() <= (game.third.getHealth() / 2)) {
                    b3modifier = 16;
                } else {
                    b3modifier = 10;
                }
            } else {
                if (game.third.getHP() <= (game.third.getHealth() / 4)) {
                    b3modifier = 28;
                } else if (game.third.getHP() <= (game.third.getHealth() / 2)) {
                    b3modifier = 22;
                } else {
                    b3modifier = 16;
                }
            }

            if (PokemonSelection == 4) {
                if (game.fourth.getHP() <= (game.fourth.getHealth() / 4)) {
                    b4modifier = 22;
                } else if (game.fourth.getHP() <= (game.fourth.getHealth() / 2)) {
                    b4modifier = 16;
                } else {
                    b4modifier = 10;
                }
            } else {
                if (game.fourth.getHP() <= (game.fourth.getHealth() / 4)) {
                    b4modifier = 28;
                } else if (game.fourth.getHP() <= (game.fourth.getHealth() / 2)) {
                    b4modifier = 22;
                } else {
                    b4modifier = 16;
                }
            }

            if (PokemonSelection == 5) {
                if (game.fifth.getHP() <= (game.fifth.getHealth() / 4)) {
                    b4modifier = 22;
                } else if (game.fifth.getHP() <= (game.fifth.getHealth() / 2)) {
                    b5modifier = 16;
                } else {
                    b5modifier = 10;
                }
            } else {
                if (game.fifth.getHP() <= (game.fifth.getHealth() / 4)) {
                    b4modifier = 28;
                } else if (game.fifth.getHP() <= (game.fifth.getHealth() / 2)) {
                    b5modifier = 22;
                } else {
                    b5modifier = 16;
                }
            }

            if (PokemonSelection == 6) {
                if (game.sixth.getHP() <= (game.sixth.getHealth() / 4)) {
                    b6modifier = 22;
                } else if (game.sixth.getHP() <= (game.sixth.getHealth() / 2)) {
                    b6modifier = 16;
                } else {
                    b6modifier = 10;
                }
            } else {
                if (game.sixth.getHP() <= (game.sixth.getHealth() / 4)) {
                    b6modifier = 28;
                } else if (game.sixth.getHP() <= (game.sixth.getHealth() / 2)) {
                    b6modifier = 22;
                } else {
                    b6modifier = 16;
                }
            }
            count1++;
            if (count1 < (b1modifier / 2)) {
                b1 = 0;
            } else {
                b1 = 10;
            }
            if (count1 >= b1modifier) {
                count1 = 0;
            }
            count2++;
            if (count2 < (b2modifier / 2)) {
                b2 = 0;
            } else {
                b2 = 10;
            }
            if (count2 >= b2modifier) {
                count2 = 0;
            }
            count3++;
            if (count3 < (b3modifier / 2)) {
                b3 = 0;
            } else {
                b3 = 10;
            }
            if (count3 >= b3modifier) {
                count3 = 0;
            }
            count4++;
            if (count4 < (b4modifier / 2)) {
                b4 = 0;
            } else {
                b4 = 10;
            }
            if (count4 >= b4modifier) {
                count4 = 0;
            }
            count5++;
            if (count5 < (b5modifier / 2)) {
                b5 = 0;
            } else {
                b5 = 10;
            }
            if (count5 >= b5modifier) {
                count5 = 0;
            }
            count6++;
            if (count6 >= b6modifier) {
                count6 = 0;
            }
            if (count6 < (b6modifier / 2)) {
                b6 = 0;
            } else {
                b6 = 10;
            }
            g.drawImage(pokemon, 0, 0, null);
            if (game.first.getNumber() != 0) {
                //Box and such
                if (PokemonSelection == 1 || SwitchingPokemon == 1) {
                    g.drawImage(BoxFirstSelected, (38), (20 - 2), null);
                    g.drawImage(BallOpen, 30, 10, 40, 40, null);
                } else {
                    g.drawImage(BoxFirst, (38 + 6), 20, null);
                    g.drawImage(Ball, 30, 10, 40, 40, null);
                }
                g.drawImage(game.first.getIcon(), 30, (10 - b1), 50, 50, null);
                if (game.first.HoldItem > 0) {
                    tmp.create(game.first.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 50, 50, null);
                }

                //Name and Level
                g.setColor(Color.DARK_GRAY);
                g.drawString(game.first.getName(), 80, 50);
                g.drawString("Lv" + game.first.getLevel(), 100, 65);
                g.setColor(Color.white);
                g.drawString(game.first.getName(), (80 - 1), (50 - 1));
                g.drawString("Lv" + game.first.getLevel(), (100 - 1), (65 - 1));

                //health nums
                if (game.first.getHealth() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.first.getHealth(), (150 - 11), 105);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.first.getHealth(), (150 - 12), (105 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.first.getHealth(), 150, 105);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.first.getHealth(), (150 - 1), (105 - 1));
                }
                if (game.first.getHP() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.first.getHealth(), (120 - 11), 105);
                    g.setColor(Color.white);
                    g.drawString("" + game.first.getHealth(), (120 - 12), (105 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.first.getHealth(), 120, 105);
                    g.setColor(Color.white);
                    g.drawString("" + game.first.getHealth(), (120 - 1), (105 - 1));
                }

                //Health Bar
                g.drawImage(HealthBar, 52, 80, null);
                g.setColor(Color.green);
                if (game.first.getHP() <= (game.first.getHealth() / 2)) {
                    g.setColor(Color.yellow);
                } else if (game.first.getHP() <= (game.first.getHealth() / 4)) {
                    g.setColor(Color.red);
                }
                g.drawRect((52 + 24), 80 + 2, (100 * (game.first.getHP() / game.first.getHealth())), 3);
                g.fillRect((52 + 24), 80 + 2, (100 * (game.first.getHP() / game.first.getHealth())), 3);
                g.setColor(Color.DARK_GRAY);

                length = 1;
            }
            if (game.second.getNumber() != 0) {

                //Box and such
                if (PokemonSelection == 2 || SwitchingPokemon == 2) {
                    g.drawImage(BoxNormalSelected, (210 - 2), (20 - 2), null);
                    g.drawImage(BallOpen, 190, (20 + 1), 40, 40, null);
                } else {
                    g.drawImage(BoxNormal, 210, 20, null);
                    g.drawImage(Ball, 190, (20 + 1), 40, 40, null);
                }
                g.drawImage(game.second.getIcon(), 190, (22 - b2), 50, 50, null);
                tmp.create(game.second.HoldItem, 1);
                g.drawImage(tmp.getIcon(), 220, 42, null);

                //Name and Level
                g.setColor(Color.DARK_GRAY);
                g.drawString(game.second.getName(), 240, 40);
                g.drawString("Lv" + game.second.getLevel(), 260, 60);
                g.setColor(Color.white);
                g.drawString(game.second.getName(), (240 - 1), (40 - 1));
                g.drawString("Lv" + game.second.getLevel(), (260 - 1), (60 - 1));

                //health nums
                if (game.second.getHealth() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.second.getHealth(), (437 - 11), 60);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.second.getHealth(), (437 - 12), (60 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.second.getHealth(), 437, 60);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.second.getHealth(), (437 - 1), (60 - 1));
                }
                if (game.second.getHP() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.second.getHealth(), (407 - 11), 60);
                    g.setColor(Color.white);
                    g.drawString("" + game.second.getHealth(), (407 - 12), (60 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.second.getHealth(), 407, 60);
                    g.setColor(Color.white);
                    g.drawString("" + game.second.getHealth(), (407 - 1), (60 - 1));
                }

                //Health Bar
                g.drawImage(HealthBar, 340, 30, null);
                g.setColor(Color.green);
                if (game.second.getHP() <= (game.second.getHealth() / 2)) {
                    g.setColor(Color.yellow);
                } else if (game.second.getHP() <= (game.second.getHealth() / 4)) {
                    g.setColor(Color.red);
                }
                g.drawRect((340 + 24), 30 + 2, (100 * (game.second.getHP() / game.second.getHealth())), 3);
                g.fillRect((340 + 24), 30 + 2, (100 * (game.second.getHP() / game.second.getHealth())), 3);
                g.setColor(Color.DARK_GRAY);
                length = 2;
            }
            if (game.third.getNumber() != 0) {
                //Box and such
                if (PokemonSelection == 3 || SwitchingPokemon == 3) {
                    g.drawImage(BoxNormalSelected, (210 - 2), (70 - 2), null);
                    g.drawImage(BallOpen, 190, (70 + 1), 40, 40, null);
                } else {
                    g.drawImage(BoxNormal, 210, 70, null);
                    g.drawImage(Ball, 190, (70 + 1), 40, 40, null);
                }
                g.drawImage(game.third.getIcon(), 190, (72 - b3), 50, 50, null);
                if (game.third.HoldItem > 0) {
                    tmp.create(game.third.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 220, 92, null);
                }

                //Name and Level
                g.setColor(Color.DARK_GRAY);
                g.drawString(game.third.getName(), 240, 90);
                g.drawString("Lv" + game.third.getLevel(), 260, 110);
                g.setColor(Color.white);
                g.drawString(game.third.getName(), (240 - 1), (90 - 1));
                g.drawString("Lv" + game.third.getLevel(), (260 - 1), (110 - 1));

                //health nums
                if (game.third.getHealth() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.third.getHealth(), (437 - 11), 110);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.third.getHealth(), (437 - 12), (110 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.third.getHealth(), 437, 110);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.third.getHealth(), (437 - 1), (110 - 1));
                }
                if (game.third.getHP() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.third.getHealth(), (407 - 11), 110);
                    g.setColor(Color.white);
                    g.drawString("" + game.third.getHealth(), (407 - 12), (110 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.third.getHealth(), 407, 110);
                    g.setColor(Color.white);
                    g.drawString("" + game.third.getHealth(), (407 - 1), (110 - 1));
                }

                //Health Bar
                g.drawImage(HealthBar, 340, 80, null);
                g.setColor(Color.green);
                if (game.third.getHP() <= (game.third.getHealth() / 2)) {
                    g.setColor(Color.yellow);
                } else if (game.third.getHP() <= (game.third.getHealth() / 4)) {
                    g.setColor(Color.red);
                }
                g.drawRect((340 + 24), 80 + 2, (100 * (game.third.getHP() / game.third.getHealth())), 3);
                g.fillRect((340 + 24), 80 + 2, (100 * (game.third.getHP() / game.third.getHealth())), 3);
                g.setColor(Color.DARK_GRAY);
                length = 3;
            }
            if (game.fourth.getNumber() != 0) {
                //Box and such
                if (PokemonSelection == 4 || SwitchingPokemon == 4) {
                    g.drawImage(BoxNormalSelected, (210 - 2), (120 - 2), null);
                    g.drawImage(BallOpen, 190, (120 + 1), 40, 40, null);
                } else {
                    g.drawImage(BoxNormal, 210, 120, null);
                    g.drawImage(Ball, 190, (120 + 1), 40, 40, null);
                }
                g.drawImage(game.fourth.getIcon(), 190, (122 - b4), 50, 50, null);
                if (game.fourth.HoldItem > 0) {
                    tmp.create(game.fourth.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 220, 142, null);
                }

                //Name and Level
                g.setColor(Color.DARK_GRAY);
                g.drawString(game.fourth.getName(), 240, 140);
                g.drawString("Lv" + game.fourth.getLevel(), 260, 160);
                g.setColor(Color.white);
                g.drawString(game.fourth.getName(), (240 - 1), (140 - 1));
                g.drawString("Lv" + game.fourth.getLevel(), (260 - 1), (160 - 1));

                //health nums
                if (game.fourth.getHealth() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.fourth.getHealth(), (437 - 11), 160);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.fourth.getHealth(), (437 - 12), (160 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.fourth.getHealth(), 437, 160);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.fourth.getHealth(), (437 - 1), (160 - 1));
                }
                if (game.fourth.getHP() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.fourth.getHealth(), (407 - 11), 160);
                    g.setColor(Color.white);
                    g.drawString("" + game.fourth.getHealth(), (407 - 12), (160 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.fourth.getHealth(), 407, 160);
                    g.setColor(Color.white);
                    g.drawString("" + game.fourth.getHealth(), (407 - 1), (160 - 1));
                }

                //Health Bar
                g.drawImage(HealthBar, 340, 130, null);
                g.setColor(Color.green);
                if (game.fourth.getHP() <= (game.fourth.getHealth() / 2)) {
                    g.setColor(Color.yellow);
                } else if (game.fourth.getHP() <= (game.fourth.getHealth() / 4)) {
                    g.setColor(Color.red);
                }
                g.drawRect((340 + 24), 130 + 2, (100 * (game.fourth.getHP() / game.fourth.getHealth())), 3);
                g.fillRect((340 + 24), 130 + 2, (100 * (game.fourth.getHP() / game.fourth.getHealth())), 3);
                g.setColor(Color.DARK_GRAY);
                length = 4;
            }
            if (game.fifth.getNumber() != 0) {
                //Box and such
                if (PokemonSelection == 5 || SwitchingPokemon == 5) {
                    g.drawImage(BoxNormalSelected, (210 - 2), (170 - 2), null);
                    g.drawImage(BallOpen, 190, (170 + 1), 40, 40, null);
                } else {
                    g.drawImage(BoxNormal, 210, 170, null);
                    g.drawImage(Ball, 190, (170 + 1), 40, 40, null);
                }
                g.drawImage(game.fifth.getIcon(), 190, (172 - b5), 50, 50, null);
                if (game.fifth.HoldItem > 0) {
                    tmp.create(game.fifth.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 220, 192, null);
                }

                //Name and Level
                g.setColor(Color.DARK_GRAY);
                g.drawString(game.fifth.getName(), 240, 190);
                g.drawString("Lv" + game.fifth.getLevel(), 260, 210);
                g.setColor(Color.white);
                g.drawString(game.fifth.getName(), (240 - 1), (190 - 1));
                g.drawString("Lv" + game.fifth.getLevel(), (260 - 1), (210 - 1));

                //health nums
                if (game.fifth.getHealth() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.fifth.getHealth(), (437 - 11), 210);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.fifth.getHealth(), (437 - 12), (210 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.fifth.getHealth(), 437, 210);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.fifth.getHealth(), (437 - 1), (210 - 1));
                }
                if (game.fifth.getHP() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.fifth.getHealth(), (407 - 11), 210);
                    g.setColor(Color.white);
                    g.drawString("" + game.fifth.getHealth(), (407 - 12), (210 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.fifth.getHealth(), 407, 210);
                    g.setColor(Color.white);
                    g.drawString("" + game.fifth.getHealth(), (407 - 1), (210 - 1));
                }

                //Health Bar
                g.drawImage(HealthBar, 340, 180, null);
                g.setColor(Color.green);
                if (game.fifth.getHP() <= (game.fifth.getHealth() / 2)) {
                    g.setColor(Color.yellow);
                } else if (game.fifth.getHP() <= (game.fifth.getHealth() / 4)) {
                    g.setColor(Color.red);
                }
                g.drawRect((340 + 24), 180 + 2, (100 * (game.fifth.getHP() / game.fifth.getHealth())), 3);
                g.fillRect((340 + 24), 180 + 2, (100 * (game.fifth.getHP() / game.fifth.getHealth())), 3);
                g.setColor(Color.DARK_GRAY);
                length = 5;
            }
            if (game.sixth.getNumber() != 0) {
                //Box and such
                if (PokemonSelection == 6 || SwitchingPokemon == 6) {
                    g.drawImage(BoxNormalSelected, (210 - 2), (220 - 2), null);
                    g.drawImage(BallOpen, 190, (220 + 1), 40, 40, null);
                } else {
                    g.drawImage(BoxNormal, 210, 220, null);
                    g.drawImage(Ball, 190, (220 + 1), 40, 40, null);
                }
                g.drawImage(game.sixth.getIcon(), 190, (222 - b6), 50, 50, null);
                if (game.sixth.HoldItem > 0) {
                    tmp.create(game.sixth.HoldItem, 1);
                    g.drawImage(tmp.getIcon(), 220, 242, null);
                }

                //Name and Level
                g.setColor(Color.DARK_GRAY);
                g.drawString(game.sixth.getName(), 240, 240);
                g.drawString("Lv" + game.sixth.getLevel(), 260, 260);
                g.setColor(Color.white);
                g.drawString(game.sixth.getName(), (240 - 1), (240 - 1));
                g.drawString("Lv" + game.sixth.getLevel(), (260 - 1), (260 - 1));

                //health nums
                if (game.sixth.getHealth() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.sixth.getHealth(), (437 - 11), 260);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.sixth.getHealth(), (437 - 12), (260 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("/ " + game.sixth.getHealth(), 437, 260);
                    g.setColor(Color.white);
                    g.drawString("/ " + game.sixth.getHealth(), (437 - 1), (260 - 1));
                }
                if (game.sixth.getHP() >= 100) {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.sixth.getHealth(), (407 - 11), 260);
                    g.setColor(Color.white);
                    g.drawString("" + game.sixth.getHealth(), (407 - 12), (260 - 1));
                } else {
                    g.setColor(Color.DARK_GRAY);
                    g.drawString("" + game.sixth.getHealth(), 407, 260);
                    g.setColor(Color.white);
                    g.drawString("" + game.sixth.getHealth(), (407 - 1), (260 - 1));
                }

                //Health Bar
                g.drawImage(HealthBar, 340, 230, null);
                g.setColor(Color.green);
                if (game.sixth.getHP() <= (game.sixth.getHealth() / 2)) {
                    g.setColor(Color.yellow);
                } else if (game.sixth.getHP() <= (game.sixth.getHealth() / 4)) {
                    g.setColor(Color.red);
                }
                g.drawRect((340 + 24), 230 + 2, (100 * (game.sixth.getHP() / game.sixth.getHealth())), 3);
                g.fillRect((340 + 24), 230 + 2, (100 * (game.sixth.getHP() / game.sixth.getHealth())), 3);
                g.setColor(Color.DARK_GRAY);
                length = 6;
            }
            if (PokemonSelection == 0) {
                g.drawImage(CancelSelected, 370, 280, null);
                g.drawImage(BallOpen, 366, 276, 40, 40, null);
            } else {
                g.drawImage(Cancel, 370, 280, null);
                g.drawImage(Ball, 366, 276, 40, 40, null);
            }
            g.setColor(Color.DARK_GRAY);
            g.drawString("Cancel", 400, 303);
            g.setColor(Color.white);
            g.drawString("Cancel", (400 - 1), (303 - 1));

            if (inPokeOption) {
                g.drawImage(PokeOption, 0, 150, null);
                if (SelectedPokemon.getFlyable()) {
                    g.drawImage(PokeOptionFly, 0, 121, null);
                }
                if (PokeOptionSelection == 5) {
                    g.drawImage(arrow, 25, 135, null);
                } else if (PokeOptionSelection == 4) {
                    g.drawImage(arrow, 25, 168, null);
                } else if (PokeOptionSelection == 3) {
                    g.drawImage(arrow, 25, 200, null);
                } else if (PokeOptionSelection == 2) {
                    g.drawImage(arrow, 25, 232, null);
                } else if (PokeOptionSelection == 1) {
                    g.drawImage(arrow, 25, 264, null);
                }
            }
            b1modifier = 0;
            b2modifier = 0;
            b3modifier = 0;
            b4modifier = 0;
            b5modifier = 0;
            b6modifier = 0;
        } else {
            b1 = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
            b5 = 0;
            b6 = 0;
            b1modifier = 0;
            b2modifier = 0;
            b3modifier = 0;
            b4modifier = 0;
            b5modifier = 0;
            b6modifier = 0;
            count1 = 0;
            count2 = 0;
            count3 = 0;
            count4 = 0;
            count5 = 0;
            count6 = 0;
        }
        if (inBag == true) {
            g.drawImage(bag, 0, 0, null);
            g.drawImage(Bag, 20, 70, null);
            if (curentBagPocket == 0) {
                Title = "Status Potions";
                if (currentSelectionBag < 5) {
                    adjust = 1;
                } else if (currentSelectionBag == 5) {
                    adjust = 2;
                } else if (currentSelectionBag == 6) {
                    adjust = 3;
                } else if (currentSelectionBag == 7) {
                    adjust = 4;
                } else if (currentSelectionBag == 8) {
                    adjust = 5;
                } else if (currentSelectionBag == 9) {
                    adjust = 6;
                } else if (currentSelectionBag == 10) {
                    adjust = 7;
                } else if (currentSelectionBag == 11) {
                    adjust = 8;
                } else if (currentSelectionBag == 12) {
                    adjust = 9;
                } else if (currentSelectionBag == 13) {
                    adjust = 10;
                } else if (currentSelectionBag == 14) {
                    adjust = 11;
                } else if (currentSelectionBag == 15) {
                    adjust = 12;
                } else if (currentSelectionBag == 16) {
                    adjust = 13;
                } else if (currentSelectionBag == 17) {
                    adjust = 14;
                } else if (currentSelectionBag == 18) {
                    adjust = 15;
                } else if (currentSelectionBag == 19) {
                    adjust = 16;
                }
                tmpOne.create(game.Potions[adjust].getItemNum(), game.Potions[adjust].getAmount());
                tmpTwo.create(game.Potions[adjust + 1].getItemNum(), game.Potions[adjust + 1].getAmount());
                tmpThree.create(game.Potions[adjust + 2].getItemNum(), game.Potions[adjust + 2].getAmount());
                tmpFour.create(game.Potions[adjust + 3].getItemNum(), game.Potions[adjust + 3].getAmount());
                tmpFive.create(game.Potions[adjust + 4].getItemNum(), game.Potions[adjust + 4].getAmount());
            } else if (curentBagPocket == 1) {
                Title = "Hold Items";
                if (currentSelectionBag < 5) {
                    adjust = 0;
                } else if (currentSelectionBag == 5) {
                    adjust = 1;
                } else if (currentSelectionBag == 6) {
                    adjust = 2;
                } else if (currentSelectionBag == 7) {
                    adjust = 3;
                } else if (currentSelectionBag == 8) {
                    adjust = 4;
                } else if (currentSelectionBag == 9) {
                    adjust = 5;
                } else if (currentSelectionBag == 10) {
                    adjust = 6;
                } else if (currentSelectionBag == 11) {
                    adjust = 7;
                }
                tmpOne.create(game.Holdables[adjust].getItemNum(), game.Holdables[adjust].getAmount());
                tmpTwo.create(game.Holdables[adjust + 1].getItemNum(), game.Holdables[adjust + 1].getAmount());
                tmpThree.create(game.Holdables[adjust + 2].getItemNum(), game.Holdables[adjust + 2].getAmount());
                tmpFour.create(game.Holdables[adjust + 3].getItemNum(), game.Holdables[adjust + 3].getAmount());
                tmpFive.create(game.Holdables[adjust + 4].getItemNum(), game.Holdables[adjust + 4].getAmount());
            } else if (curentBagPocket == 2) {
                Title = "Balls";
                adjust = 0;
                tmpOne.create(game.Balls[adjust].getItemNum(), game.Balls[adjust].getAmount());
                tmpTwo.create(game.Balls[adjust + 1].getItemNum(), game.Balls[adjust + 1].getAmount());
                tmpThree.create(game.Balls[adjust + 2].getItemNum(), game.Balls[adjust + 2].getAmount());
                tmpFour.create(game.Balls[adjust + 3].getItemNum(), game.Balls[adjust + 3].getAmount());
                tmpFive.create(0, 0);
            } else if (curentBagPocket == 3) {
                Title = "Tools";
                if (currentSelectionBag < 5) {
                    adjust = 0;
                } else if (currentSelectionBag == 5) {
                    adjust = 1;
                } else if (currentSelectionBag == 6) {
                    adjust = 2;
                } else if (currentSelectionBag == 7) {
                    adjust = 3;
                }
                tmpOne.create(game.Tools[adjust].getItemNum(), game.Tools[adjust].getAmount());
                tmpTwo.create(game.Tools[adjust + 1].getItemNum(), game.Tools[adjust + 1].getAmount());
                tmpThree.create(game.Tools[adjust + 2].getItemNum(), game.Tools[adjust + 2].getAmount());
                tmpFour.create(game.Tools[adjust + 3].getItemNum(), game.Tools[adjust + 3].getAmount());
                tmpFive.create(game.Tools[adjust + 4].getItemNum(), game.Tools[adjust + 4].getAmount());
            }
            if (currentSelectionBag == 0) {
                g.drawImage(arrow, 180, 23, null);
                g.setColor(Color.DARK_GRAY);
                g.drawString(tmpOne.getItemDescription(), 80, 270);
                g.setColor(Color.white);
                g.drawString(tmpOne.getItemDescription(), 79, 269);
                g.drawImage(tmpOne.getIcon(), 15, 250, 48, 48, null);
            } else if (currentSelectionBag == 1) {
                g.drawImage(arrow, 180, 55, null);
                g.setColor(Color.DARK_GRAY);
                g.drawString(tmpTwo.getItemDescription(), 80, 270);
                g.setColor(Color.white);
                g.drawString(tmpTwo.getItemDescription(), 79, 269);
                g.drawImage(tmpTwo.getIcon(), 15, 250, 48, 48, null);
            } else if (currentSelectionBag == 2) {
                g.drawImage(arrow, 180, 90, null);
                g.setColor(Color.DARK_GRAY);
                g.drawString(tmpThree.getItemDescription(), 80, 270);
                g.setColor(Color.white);
                g.drawString(tmpThree.getItemDescription(), 79, 269);
                g.drawImage(tmpThree.getIcon(), 15, 250, 48, 48, null);
            } else if (currentSelectionBag == 3) {
                g.drawImage(arrow, 180, 120, null);
                g.setColor(Color.DARK_GRAY);
                g.drawString(tmpFour.getItemDescription(), 80, 270);
                g.setColor(Color.white);
                g.drawString(tmpFour.getItemDescription(), 79, 269);
                g.drawImage(tmpFour.getIcon(), 15, 250, 48, 48, null);
            } else if (currentSelectionBag >= 4) {
                g.drawImage(arrow, 180, 150, null);
                g.setColor(Color.DARK_GRAY);
                g.drawString(tmpFive.getItemDescription(), 80, 270);
                g.setColor(Color.white);
                g.drawString(tmpFive.getItemDescription(), 79, 269);
                g.drawImage(tmpFive.getIcon(), 15, 250, 48, 48, null);
            }
            g.setColor(Color.black);
            //Items
            if (tmpTwo.getAmount() > 0) {
                g.drawString("" + tmpOne.getItemName(), 200, 38);
            }
            if (tmpTwo.getAmount() > 0) {
                g.drawString("" + tmpTwo.getItemName(), 200, 70);
            }
            if (tmpThree.getAmount() > 0) {
                g.drawString("" + tmpThree.getItemName(), 200, 105);
            }
            if (tmpFour.getAmount() > 0) {
                g.drawString("" + tmpFour.getItemName(), 200, 135);
            }
            if (tmpFive.getAmount() > 0) {
                g.drawString("" + tmpFive.getItemName(), 200, 165);
            }
            //Amounts
            if (tmpOne.getAmount() > 1) {
                g.drawString("x" + tmpOne.getAmount(), 400, 38);
            }
            if (tmpTwo.getAmount() > 1) {
                g.drawString("x" + tmpTwo.getAmount(), 400, 70);
            }
            if (tmpThree.getAmount() > 1) {
                g.drawString("x" + tmpThree.getAmount(), 400, 105);
            }
            if (tmpFour.getAmount() > 1) {
                g.drawString("x" + tmpFour.getAmount(), 400, 135);
            }
            if (tmpFive.getAmount() > 1) {
                g.drawString("x" + tmpFive.getAmount(), 400, 165);
            }
            //Title
            g.drawString("" + Title, 30, 30);
            if (inBagOptions) {
                g.drawImage(BagOptions, 388, 220, game);
                g.drawString("Cancel", 410, 295);
                g.drawString("Toss", 410, 270);
                if (curentBagPocket == 0) {
                    g.drawString("Use", 410, 245);
                } else if (curentBagPocket == 1) {
                    g.drawString("Give", 410, 245);
                } else if (curentBagPocket == 2) {
                    g.drawString("Use", 410, 245);
                } else if (curentBagPocket == 3) {
                    g.drawString("Use", 410, 245);
                }
                if (BagOptionSelection == 0) {
                    g.drawImage(arrow, 395, 225, null);
                } else if (BagOptionSelection == 1) {
                    g.drawImage(arrow, 395, 250, null);
                } else if (BagOptionSelection == 2) {
                    g.drawImage(arrow, 395, 275, null);
                }
            }
            if (inNO) {
                g.drawImage(NOscreen, 75, 240, null);
                if (BagOptionSelection == 0) {
                    g.setColor(Color.darkGray);
                    g.drawString("Nothing to use that on", 81, 271);
                    g.setColor(Color.white);
                    g.drawString("Nothing to use that on", 80, 270);
                } else if (BagOptionSelection == 1) {
                    g.setColor(Color.darkGray);
                    g.drawString("Your going to need that!", 81, 271);
                    g.setColor(Color.white);
                    g.drawString("Your going to need that!", 80, 270);
                }
            }
        }
        if (inPokeGear == true) {
            if (currentSelectionPokeGear == 0) {
                g.drawImage(entryMap, 0, 0, null);
                g.drawImage(map, 120, 50, 240, 160, null);
            } else if (currentSelectionPokeGear == 1) {
                g.drawImage(entryRadio, 0, 0, null);
                g.drawString("PEWDIEPIE!!!!!", 150, 150);
                if (game.radio) {
                    g.drawString("ON", 300, 170);
                } else {
                    g.drawString("OFF", 295, 170);
                }
            } else if (currentSelectionPokeGear == 2) {
                g.drawImage(entryPhone, 0, 0, null);
                if (inPhone) {
                    g.drawImage(FAPic, 200, 150, null);
                    g.drawString("You just tried to call someone in a videogame...", 150, 250);
                }
            } else if (currentSelectionPokeGear == 3) {
                g.drawImage(entryExit, 0, 0, null);
            }
        }
        if (inTrainerCard == true) {
            g.drawImage(trainercard, 0, 0, null);
            g.drawImage(game.cardSprite, 320, 100, null);
            g.drawString("ID:     " + game.alec.getID(), 295, 54);
            g.drawString("Name:     " + game.alec.getName(), 64, 93);
            g.drawString("Money:                 $" + game.money, 64, 150);
            g.drawString("Pokedex:                      " + game.alec.getPokemonOwned(), 64, 183);
            if (game.seconds < 10) {
                g.drawString("Time:              0" + game.hours + ": 0" + game.minutes + ": 0" + game.seconds, 64, 213);
            } else {
                g.drawString("Time:              0" + game.hours + ": 0" + game.minutes + ": " + game.seconds, 64, 213);
            }
            if (game.Badge1) {
                g.drawImage(Badge1, 70, 260, null);
            }
            if (game.Badge2) {
                g.drawImage(Badge2, 118, 260, null);
            }
            if (game.Badge3) {
                g.drawImage(Badge3, 166, 260, null);
            }
            if (game.Badge4) {
                g.drawImage(Badge4, 214, 260, null);
            }
            if (game.Badge5) {
                g.drawImage(Badge5, 262, 260, null);
            }
            if (game.Badge6) {
                g.drawImage(Badge6, 310, 260, null);
            }
            if (game.Badge7) {
                g.drawImage(Badge7, 358, 260, null);
            }
            if (game.Badge8) {
                g.drawImage(Badge8, 406, 260, null);
            }
        }
        if (inSave == true) {
            g.drawImage(save, 0, 0, null);
            g.drawString("" + game.alec.getName(), 100, 68);
            g.drawString("" + game.badges, 100, 101);
            g.drawString("1", 110, 134);
            g.drawString("0" + (int) game.hours + ": 0" + (int) game.minutes + ": " + (int) game.seconds, 76, 166);
            if (currentSelectionSave == 0) {
                g.drawImage(arrow, 394, 148, null);
            } else if (currentSelectionSave == 1) {
                g.drawImage(arrow, 394, 180, null);
            }
        }
        if (inOption == true) {
            g.drawImage(option, 0, 0, null);
            if (currentSelectionOption == 0) {
                g.drawImage(arrow, 22, 85, null);
            } else if (currentSelectionOption == 1) {
                g.drawImage(arrow, 22, 117, null);
            } else if (currentSelectionOption == 2) {
                g.drawImage(arrow, 22, 149, null);
            } else if (currentSelectionOption == 3) {
                g.drawImage(arrow, 22, 181, null);
            } else if (currentSelectionOption == 4) {
                g.drawImage(arrow, 22, 213, null);
            } else if (currentSelectionOption == 5) {
                g.drawImage(arrow, 22, 245, null);
            }
        }
        if (inExit == true) {
            inMain = false;
        }
        if (Gave) {
            g.setColor(Color.darkGray);
            g.drawString("Gave " + SelectedItem.getItemName() + " to " + SelectedPokemon.getName(), 61, 301);
            g.setColor(Color.white);
            g.drawString("Gave " + SelectedItem.getItemName() + " to " + SelectedPokemon.getName(), 60, 300);
            g.setColor(Color.black);
        }
    }
}