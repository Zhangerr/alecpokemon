package pokemonalecversion;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Pokemon {

    public String name;
    public int level, number, hp, attack, def, spAttack, spDef, spd;
    public int curHP, curattack, curdef, curspAttack, curspDef, curspd;
    public int exp, cur_exp;
    public short evolvelevel;
    public short evolveform;
    private boolean ResetMoves = false;
    private Image back_sprite, front_sprite, back_sprite_s, front_sprite_s, party_icon;
    public int health;
    private int hpbump;
    public int turnmodifier;
    private int speedbump;
    private int deffensebump;
    private int attackbump;
    private int spattackbump;
    private int spdeffensebump;
    private int TMPspeedbump;
    private int TMPdeffensebump;
    private int TMPattackbump;
    private int TMPspattackbump;
    private int TMPspdeffensebump;
    public int TMPaccuracybump = 0;
    private int TMP_HPbump;
    private String condition;
    private byte normal = 0;
    private byte fire = 1;
    private byte water = 2;
    private byte grass = 3;
    private byte electric = 4;
    private byte fighting = 6;
    private byte poison = 7;
    private byte ground = 8;
    private byte flying = 9;
    private byte psychic = 10;
    private byte bug = 11;
    private byte rock = 12;
    private byte ghost = 13;
    private byte dragon = 14;
    private byte ice = 15;
    public Attacks move;
    public String move1 = "";
    public String move2 = "";
    public String move3 = "";
    public String move4 = "";
    private String tmpMove1;
    private String tmpMove2;
    private String tmpMove3;
    private String tmpMove4;
    public int attack_damage;
    public byte statusEffect = 0;
    public byte type;
    private boolean shiny = false;
    private String[] MoveTree = new String[105];
    private Items tmp;
    public boolean inEvolve;
    public boolean inLearnMoveE;
    public boolean inLearnMoveH;
    public boolean inNewLevelStats;
    public boolean next1;
    public boolean next2;
    public boolean next3;
    public boolean next4;
    public boolean Evolved;
    public String selected;
    private String EvoName;
    private Image EvoImage;
    private int count;
    private int modifier = 100;
    public int HoldItem;
    private Image YesNoImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/PokeOption.png"));
    private Image Message = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/Message_Sign.png"));
    private Image moves = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/PokeOption.png"));
    private Image EvolveBG = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Pictures/evobg.png"));

    public int getTypeInt() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getHPBump() {
        return hpbump;
    }

    public int getSpeedBump() {
        return speedbump;
    }

    public int getDeffenseBump() {
        return deffensebump;
    }

    public void resetHealth() {
        health = curHP;
        updateStats();
    }
    
    public void Heal(){
        health = curHP;
    }

    public int getAttack() {
        return curattack;
    }

    public int getDeffense() {
        return curdef;
    }

    public int getSpAttack() {
        return curspAttack;
    }

    public int getSpeed() {
        return curspd;
    }

    public int getSpDeffense() {
        return curspDef;
    }

    public int getAttackBump() {
        return attackbump;
    }

    public int getSpecialAttackBump() {
        return spattackbump;
    }

    public int getSpecialDeffenseBump() {
        return spdeffensebump;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String Condition) {
        condition = Condition;
    }

    public void giveStatusPotion(int itemnumber) {
        if (itemnumber == 1) {
            if (curHP > 0) {
                curHP += 20;
            }
        } else if (itemnumber == 2) {
            if (curHP > 0) {
                curHP += 50;
            }
        } else if (itemnumber == 3) {
            if (curHP > 0) {
                curHP += 200;
            }
        } else if (itemnumber == 4) {
            curHP = health;
        } else if (itemnumber == 5) {
            curHP = (health / 2);
        } else if (itemnumber == 6) {
            curHP = health;
        } else if (itemnumber == 7) {
            if (statusEffect == 5) {
                statusEffect = 0;
            }
        } else if (itemnumber == 8) {
            if (statusEffect == 2) {
                statusEffect = 0;
            }
        } else if (itemnumber == 9) {
            if (statusEffect == 4) {
                statusEffect = 0;
            }
        } else if (itemnumber == 10) {
            if (statusEffect == 3) {
                statusEffect = 0;
            }
        } else if (itemnumber == 11) {
            if (statusEffect == 1) {
                statusEffect = 0;
            }
        } else if (itemnumber == 12) {
            statusEffect = 0;
        } else if (itemnumber == 13) {
            statusEffect = 0;
            if (curHP > 0) {
                curHP = health;
            }
        } else if (itemnumber == 14) {
            speedbump += 10;
        } else if (itemnumber == 15) {
            deffensebump += 10;
        } else if (itemnumber == 16) {
            attackbump += 10;
        } else if (itemnumber == 17) {
            spattackbump += 10;
        } else if (itemnumber == 18) {
            spdeffensebump += 10;
        } else if (itemnumber == 19) {
            health += 10;
        } else if (itemnumber == 20) {
            level++;
        }
        if (curHP > health) {
            curHP = health;
        }
        updateStats();
    }

    public void ChangeHealth(int change) {
        curHP -= change;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public int getLevel() {
        return level;
    }

    public void updateStats() {
        curattack = (level * 5) + (attack + TMPattackbump + attackbump);
        curdef = (level * 5) + (def + TMPdeffensebump + deffensebump);
        curspAttack = (level * 5) + (spAttack + TMPspattackbump + spattackbump);
        curspDef = (level * 5) + (spDef + TMPspattackbump + spdeffensebump);
        curspd = (level * 5) + (spd + TMPspeedbump + speedbump);
    }

    public int getHP() {
        return curHP;
    }

    public Image getFrontSprite() {
        if (shiny == true) {
            return front_sprite_s;
        } else {
            return front_sprite;
        }
    }

    public Image getBackSprite() {
        if (shiny == true) {
            return back_sprite_s;
        } else {
            return back_sprite;
        }
    }

    public Image getIcon() {
        return party_icon;
    }

    public int getEXP() {
        return cur_exp;
    }

    public void addExp(int enemylvl) {
        cur_exp += (int) Math.sqrt(enemylvl);
        if (cur_exp >= (int) Math.pow(level, 3)) {
            cur_exp -= (int) Math.pow(level, 3);
            level++;
            inNewLevelStats = true;
        }
        if (level == evolvelevel) {
            inEvolve = true;
        }
        if (MoveTree[level] != null) {
            LearnMove(null);
        }
    }

    public void LearnMove(String TM) {
        String tmpMove;
        if (TM == null) {
            tmpMove = MoveTree[level];
        } else {
            tmpMove = TM;
        }
        inLearnMoveE = true;
        if (move2 != null) {
            move2 = tmpMove;
        } else if (move3 != null) {
            move3 = tmpMove;
        } else if (move4 != null) {
            move4 = tmpMove;
        } else {
            inLearnMoveH = true;
        }
    }

    public int EvolveForm() {
        return evolveform;
    }

    public int getLevelEXP() {
        exp = (int) Math.pow(level, 3);
        return exp;
    }

    public int getNumber() {
        return number;
    }

    public void setHold(int newHold) {
        HoldItem = newHold;
        TMPspeedbump = 0;
        TMPdeffensebump = 0;
        TMPattackbump = 0;
        TMPspattackbump = 0;
        TMPspdeffensebump = 0;
        TMPaccuracybump = 0;

        if (HoldItem == 21) {
            if (number == 29 || number == 30 || number == 32 || number == 33 || number == 35 || number == 39) {
                if (number == 29) {
                    evolveform = 31;
                } else if (number == 32) {
                    evolveform = 34;
                }
                inEvolve = true;
            }
        } else if (HoldItem == 22) {
            if (type == fire) {
                TMPspattackbump = 10;
            }
            if (number == 37 || number == 58) {
                inEvolve = true;
            }
            if (number == 133) {
                evolveform = 136;
                inEvolve = true;
            }
        } else if (HoldItem == 23) {
            if (type == electric) {
                TMPspattackbump = 10;
            }
            if (number == 25) {
                inEvolve = true;
            }
            if (number == 133) {
                evolveform = 135;
                inEvolve = true;
            }
        } else if (HoldItem == 24) {
            if (type == grass) {
                TMPspattackbump = 10;
            }
            if (number == 44 || number == 70 || number == 102) {
                inEvolve = true;
            } else if (number == 43) {
                inEvolve = true;
                evolveform = 45;
            }
        } else if (HoldItem == 25) {
            if (type == water) {
                TMPspattackbump = 10;
            }
            if (number == 61 || number == 120) {
                inEvolve = true;
            }
            if (number == 133) {
                evolveform = 134;
                inEvolve = true;
            }
        } else if (HoldItem == 26) {
        } else if (HoldItem == 27) {
            TMP_HPbump = 10;
        } else if (HoldItem == 28) {
            TMPaccuracybump = 10;
        } else if (HoldItem == 29) {
            TMPspeedbump = 10;
        } else if (HoldItem == 30) {
            TMPattackbump = 10;
        } else if (HoldItem == 31) {
            TMPdeffensebump = 10;
        } else if (HoldItem == 32) {
            TMPspattackbump = 10;
        }
        updateStats();
    }

    public String getHoldItem() {
        if (HoldItem == 0) {
            return "    NONE";
        } else {
            tmp = new Items(HoldItem);
            return tmp.getItemName();
        }
    }

    public String getType() {
        if (type == normal) {
            return "Normal";
        } else if (type == fire) {
            return "Fire";
        } else if (type == water) {
            return "Water";
        } else if (type == grass) {
            return "Grass";
        } else if (type == electric) {
            return "Electric";
        } else if (type == fighting) {
            return "Fighting";
        } else if (type == poison) {
            return "Poison";
        } else if (type == ground) {
            return "Ground";
        } else if (type == flying) {
            return "Flying";
        } else if (type == psychic) {
            return "Psychic";
        } else if (type == bug) {
            return "Bug";
        } else if (type == rock) {
            return "Rock";
        } else if (type == ghost) {
            return "Ghost";
        } else if (type == dragon) {
            return "Dragon";
        } else if (type == ice) {
            return "Ice";
        } else {
            return "none";
        }
    }

    public boolean getFlyable() {
        if (type == flying) {
            return true;
        } else {
            return false;
        }
    }

    public void create(int n, int lvl) {
        for (int i = 0; i <= 100;) {
            MoveTree[i] = "  --";
            i++;
        }
        level = lvl;
        number = n;
        exp = (int) Math.pow(level, 3);
        if (n == 1) {
            name = "Bulbasaur";
            evolvelevel = 16;
            evolveform = 2;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/001b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/001.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/001sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/001s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon001.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Growl";
            MoveTree[7] = "Leech Seed";
            MoveTree[13] = "Vine Whip";
            MoveTree[20] = "Poison Powder";
            MoveTree[27] = "Razor Leaf";
            MoveTree[34] = "Growth";
            MoveTree[41] = "Sleep Powder";
            MoveTree[48] = "Solarbeam";
            type = grass;
        } else if (n == 2) {
            name = "Ivysaur";
            evolvelevel = 32;
            evolveform = 3;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/002b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/002.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/002sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/002s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon002.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Growl";
            MoveTree[7] = "Leech Seed";
            MoveTree[13] = "Vine Whip";
            MoveTree[22] = "Poison Powder";
            MoveTree[30] = "Razor Leaf";
            MoveTree[38] = "Growth";
            MoveTree[46] = "Sleep Powder";
            MoveTree[54] = "Solarbeam";
            type = grass;
        } else if (n == 3) {
            name = "Venusaur";
            evolvelevel = 999;
            evolveform = 3;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/003b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/003.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/003sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/003s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon003.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Growl";
            MoveTree[7] = "Leech Seed";
            MoveTree[13] = "Vine Whip";
            MoveTree[20] = "Poison Powder";
            MoveTree[27] = "Razor Leaf";
            MoveTree[43] = "Growth";
            MoveTree[55] = "Sleep Powder";
            MoveTree[65] = "Solarbeam";
            type = grass;

        } else if (n == 4) {
            name = "Charmander";
            evolvelevel = 16;
            evolveform = 5;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/004b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/004.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/004sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/004s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon004.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[2] = "Growl";
            MoveTree[9] = "Ember";
            MoveTree[15] = "Leer";
            MoveTree[22] = "Rage";
            MoveTree[30] = "Slash";
            MoveTree[38] = "Flamethrower";
            MoveTree[46] = "Fire Spin";
            type = fire;

        } else if (n == 5) {
            name = "Charmeleon";
            evolvelevel = 36;
            evolveform = 6;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/005b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/005.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/005sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/005s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon005.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[2] = "Growl";
            MoveTree[9] = "Ember";
            MoveTree[15] = "Leer";
            MoveTree[24] = "Rage";
            MoveTree[33] = "Slash";
            MoveTree[42] = "Flamethrower";
            MoveTree[56] = "Fire Spin";
            type = fire;

        } else if (n == 6) {
            name = "Charizard";
            evolvelevel = 999;
            evolveform = 6;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/006b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/006.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/006sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/006s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon006.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[2] = "Growl";
            MoveTree[9] = "Ember";
            MoveTree[15] = "Leer";
            MoveTree[22] = "Rage";
            MoveTree[36] = "Slash";
            MoveTree[42] = "Flamethrower";
            MoveTree[56] = "Fire Spin";
            type = fire;

        } else if (n == 7) {
            name = "Squirtle";
            evolvelevel = 16;
            evolveform = 8;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/007b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/007.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/007sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/007s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon007.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Tail Whip";
            MoveTree[8] = "Bubble";
            MoveTree[15] = "Water Gun";
            MoveTree[22] = "Bite";
            MoveTree[28] = "Withdraw";
            MoveTree[35] = "Skull Bash";
            MoveTree[42] = "Hydro Pump";
            type = water;

        } else if (n == 8) {
            name = "Wartortle";
            evolvelevel = 36;
            evolveform = 9;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/008b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/008.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/008sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/008s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon008.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Tail Whip";
            MoveTree[8] = "Bubble";
            MoveTree[15] = "Water Gun";
            MoveTree[24] = "Bite";
            MoveTree[31] = "Withdraw";
            MoveTree[39] = "Skull Bash";
            MoveTree[47] = "Hydro Pump";
            type = water;

        } else if (n == 9) {
            name = "Blastoise";
            evolvelevel = 999;
            evolveform = 9;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/009b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/009.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/009sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/009s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon009.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Tail Whip";
            MoveTree[8] = "Bubble";
            MoveTree[15] = "Water Gun";
            MoveTree[24] = "Bite";
            MoveTree[31] = "Withdraw";
            MoveTree[42] = "Skull Bash";
            MoveTree[52] = "Hydro Pump";
            type = water;

        } else if (n == 10) {
            name = "Caterpie";
            evolvelevel = 7;
            evolveform = 11;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/010b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/010.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/010sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/010s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon010.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "String Shot";
            type = bug;

        } else if (n == 11) {
            name = "Metapod";
            evolvelevel = 10;
            evolveform = 12;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/011b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/011.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/011sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/011s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon011.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Harden";
            ResetMoves = true;
            type = bug;

        } else if (n == 12) {
            name = "Butterfree";
            evolvelevel = 999;
            evolveform = 12;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/012b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/012.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/012sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/012s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon012.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[10] = "Confusion";
            MoveTree[15] = "Poison Powder";
            MoveTree[16] = "Stun Spore";
            MoveTree[17] = "Sleep Powder";
            MoveTree[21] = "Supersonic";
            MoveTree[26] = "Whirlwind";
            MoveTree[32] = "Psybeam";
            type = bug;

        } else if (n == 13) {
            name = "Weedle";
            evolvelevel = 7;
            evolveform = 14;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/013b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/013.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/013sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/013s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon013.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Poison Sting";
            MoveTree[2] = "String Shot";
            type = bug;

        } else if (n == 14) {
            name = "Kakuna";
            evolvelevel = 10;
            evolveform = 15;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/014b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/014.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/014sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/014s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon014.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[10] = "";
            ResetMoves = true;
            type = bug;

        } else if (n == 15) {
            name = "Beedrill";
            evolvelevel = 999;
            evolveform = 15;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/015b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/015.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/015sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/015s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon015.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[10] = "Fury Attack";
            MoveTree[16] = "Focus Energy";
            MoveTree[20] = "Twineedle";
            MoveTree[25] = "Rage";
            MoveTree[30] = "Pin Missile";
            MoveTree[35] = "Agility";
            type = bug;

        } else if (n == 16) {
            name = "Pidgey";
            evolvelevel = 18;
            evolveform = 17;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/016b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/016.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/016sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/016s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon016.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Gust";
            MoveTree[5] = "Sand Attack";
            MoveTree[12] = "Quick Attack";
            MoveTree[19] = "Whirlwind";
            MoveTree[28] = "Wing Attack";
            MoveTree[36] = "Agility";
            MoveTree[44] = "Mirror Move";
            type = flying;

        } else if (n == 17) {
            name = "Pidgeotto";
            evolvelevel = 36;
            evolveform = 18;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/017b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/017.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/017sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/017s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon017.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Gust";
            MoveTree[5] = "Sand Attack";
            MoveTree[12] = "Quick Attack";
            MoveTree[21] = "Whirlwind";
            MoveTree[31] = "Wing Attack";
            MoveTree[40] = "Agility";
            MoveTree[49] = "Mirror Move";
            type = flying;

        } else if (n == 18) {
            name = "Pidgeot";
            evolvelevel = 999;
            evolveform = 18;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/018b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/018.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/018sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/018s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon018.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Gust";
            MoveTree[5] = "Sand Attack";
            MoveTree[12] = "Quick Attack";
            MoveTree[19] = "Whirlwind";
            MoveTree[28] = "Wing Attack";
            MoveTree[44] = "Agility";
            MoveTree[54] = "Mirror Move";
            type = flying;

        } else if (n == 19) {
            name = "Rattata";
            evolvelevel = 20;
            evolveform = 20;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/019b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/019.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/019sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/019s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon019.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Tail Whip";
            MoveTree[7] = "Quick Attack";
            MoveTree[14] = "Hyper Fang";
            MoveTree[23] = "Focus Energy";
            MoveTree[34] = "Super Fang";
            type = normal;

        } else if (n == 20) {
            name = "Raticate";
            evolvelevel = 999;
            evolveform = 20;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/020b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/020.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/020sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/020s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon020.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Tail Whip";
            MoveTree[7] = "Quick Attack";
            MoveTree[14] = "Hyper Fang";
            MoveTree[27] = "Focus Energy";
            MoveTree[41] = "Super Fang";
            type = normal;

        } else if (n == 21) {
            name = "Spearow";
            evolvelevel = 20;
            evolveform = 22;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/021b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/021.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/021sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/021s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon021.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Peck";
            MoveTree[2] = "Growl";
            MoveTree[9] = "Leer";
            MoveTree[15] = "Fury Attack";
            MoveTree[22] = "Mirror Move";
            MoveTree[29] = "Drill Peck";
            MoveTree[36] = "Agility";
            type = flying;

        } else if (n == 22) {
            name = "Fearow";
            evolvelevel = 999;
            evolveform = 22;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/022b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/022.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/022sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/022s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon022.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Peck";
            MoveTree[2] = "Growl";
            MoveTree[9] = "Leer";
            MoveTree[15] = "Fury Attack";
            MoveTree[25] = "Mirror Move";
            MoveTree[34] = "Drill Peck";
            MoveTree[43] = "Agility";
            type = flying;

        } else if (n == 23) {
            name = "Ekans";
            evolvelevel = 22;
            evolveform = 24;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/023b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/023.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/023sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/023s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon023.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Wrap";
            MoveTree[2] = "Leer";
            MoveTree[10] = "Poison Sting";
            MoveTree[17] = "Bite";
            MoveTree[24] = "Glare";
            MoveTree[31] = "Screech";
            MoveTree[38] = "Acid";
            type = poison;

        } else if (n == 24) {
            name = "Arbok";
            evolvelevel = 999;
            evolveform = 24;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/024b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/024.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/024sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/024s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon024.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Wrap";
            MoveTree[2] = "Leer";
            MoveTree[10] = "Poison Sting";
            MoveTree[17] = "Bite";
            MoveTree[27] = "Glare";
            MoveTree[36] = "Screech";
            MoveTree[47] = "Acid";
            type = poison;

        } else if (n == 25) {
            name = "Pikachu";
            evolvelevel = 999;
            evolveform = 26;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/025b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/025.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/025sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/025s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon025.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Thundershock";
            MoveTree[2] = "Growl";
            MoveTree[9] = "Thunderwave";
            MoveTree[16] = "Quick Attack";
            MoveTree[26] = "Swift";
            MoveTree[33] = "Agility";
            MoveTree[43] = "Thunder";
            type = electric;

        } else if (n == 26) {
            name = "Raichu";
            evolvelevel = 999;
            evolveform = 26;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/026b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/026.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/026sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/026s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon026.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Thundershock";
            MoveTree[2] = "Growl";
            MoveTree[3] = "Thunderwave";
            type = electric;

        } else if (n == 27) {
            name = "Sandshrew";
            evolvelevel = 22;
            evolveform = 28;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/027b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/027.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/027sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/027s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon027.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[10] = "Sand Attack";
            MoveTree[17] = "Slash";
            MoveTree[24] = "Poison Sting";
            MoveTree[31] = "Swift";
            MoveTree[38] = "Fury Swipes";
            type = ground;

        } else if (n == 28) {
            name = "SandSlash";
            evolvelevel = 999;
            evolveform = 28;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/028b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/028.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/028sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/028s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon028.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[10] = "Sand Attack";
            MoveTree[17] = "Slash";
            MoveTree[27] = "Poison Sting";
            MoveTree[36] = "Swift";
            MoveTree[47] = "Fury Swipes";
            type = ground;

        } else if (n == 29) {
            name = "Nidoran";
            evolvelevel = 16;
            evolveform = 30;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/029b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/029.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/029sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/029s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon029.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Growl";
            MoveTree[2] = "Tackle";
            MoveTree[8] = "Scratch";
            MoveTree[14] = "Poison Sting";
            MoveTree[21] = "Tail Whip";
            MoveTree[29] = "Bite";
            MoveTree[36] = "Fury Swipes";
            MoveTree[43] = "Double Kick";
            type = poison;

        } else if (n == 30) {
            name = "Nidorina";
            evolvelevel = 999;
            evolveform = 31;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/030b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/030.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/030sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/030s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon030.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Growl";
            MoveTree[2] = "Tackle";
            MoveTree[8] = "Scratch";
            MoveTree[14] = "Poison Sting";
            MoveTree[23] = "Tail Whip";
            MoveTree[32] = "Bite";
            MoveTree[41] = "Fury Swipes";
            MoveTree[50] = "Double Kick";
            type = poison;

        } else if (n == 31) {
            name = "Nidoqueen";
            evolvelevel = 999;
            evolveform = 31;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/031b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/031.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/031sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/031s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon031.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Scratch";
            MoveTree[3] = "Tail Whip";
            MoveTree[14] = "Poison Sting";
            MoveTree[23] = "Body";
            type = poison;

        } else if (n == 32) {
            name = "Nidoran";
            evolvelevel = 16;
            evolveform = 33;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/032b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/032.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/032sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/032s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon032.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Growl";
            MoveTree[2] = "Tackle";
            MoveTree[8] = "Horn Attack";
            MoveTree[14] = "Poison Sting";
            MoveTree[21] = "Focus Energy";
            MoveTree[29] = "Fury Attack";
            MoveTree[36] = "Horn Drill";
            MoveTree[43] = "Double Kick";
            type = poison;

        } else if (n == 33) {
            name = "Nidorino";
            evolvelevel = 99;
            evolveform = 34;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/033b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/033.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/033sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/033s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon033.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Growl";
            MoveTree[2] = "Tackle";
            MoveTree[8] = "Horn Attack";
            MoveTree[14] = "Poison Sting";
            MoveTree[23] = "Focus Energy";
            MoveTree[32] = "Fury Attack";
            MoveTree[41] = "Horn Drill";
            MoveTree[50] = "Double Kick";
            type = poison;

        } else if (n == 34) {
            name = "Nidoking";
            evolvelevel = 999;
            evolveform = 34;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/034b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/034.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/034sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/034s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon034.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Horn Attack";
            MoveTree[3] = "Poison Sting";
            MoveTree[23] = "Thrash";

        } else if (n == 35) {
            name = "Clefairy";
            evolvelevel = 999;
            evolveform = 36;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/035b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/035.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/035sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/035s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon035.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Pound";
            MoveTree[2] = "Growl";
            MoveTree[13] = "Sing";
            MoveTree[18] = "Double Slap";
            MoveTree[24] = "Minimize";
            MoveTree[31] = "Metronome";
            MoveTree[39] = "Defense Curl";
            MoveTree[43] = "Light Screen";
            type = normal;

        } else if (n == 36) {
            name = "Clefable";
            evolvelevel = 999;
            evolveform = 36;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/036b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/036.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/036sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/036s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon036.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Sing";
            MoveTree[2] = "Double Slap";
            MoveTree[3] = "Minimize";
            MoveTree[4] = "Metronome";
            type = normal;

        } else if (n == 37) {
            name = "Vulpix";
            evolvelevel = 999;
            evolveform = 38;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/037b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/037.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/037sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/037s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon037.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Ember";
            MoveTree[2] = "Tail Whip";
            MoveTree[16] = "Quick Attack";
            MoveTree[21] = "Roar";
            MoveTree[28] = "Confuse Ray";
            MoveTree[35] = "Flamethrower";
            MoveTree[42] = "Fire Spin";
            type = fire;

        } else if (n == 38) {
            name = "Ninetales";
            evolvelevel = 999;
            evolveform = 38;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/038b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/038.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/038sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/038s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon038.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Ember";
            MoveTree[2] = "Tail Whip";
            MoveTree[3] = "Quick Attack";
            MoveTree[4] = "Roar";
            type = fire;

        } else if (n == 39) {
            name = "Jigglypuff";
            evolvelevel = 999;
            evolveform = 40;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/039b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/039.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/039sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/039s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon039.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Sing";
            MoveTree[9] = "Pound";
            MoveTree[14] = "Disable";
            MoveTree[19] = "Defense Curl";
            MoveTree[24] = "Double Slap";
            MoveTree[29] = "Rest";
            MoveTree[34] = "Body Slam";
            MoveTree[39] = "Double Edge";
            type = normal;

        } else if (n == 40) {
            name = "Wigglytuff";
            evolvelevel = 999;
            evolveform = 40;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/040b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/040.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/040sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/040s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon040.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Sing";
            MoveTree[2] = "Disable";
            MoveTree[3] = "Defense Curl";
            MoveTree[4] = "Double Slap";
            type = normal;

        } else if (n == 41) {
            name = "Zubat";
            evolvelevel = 22;
            evolveform = 42;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/041b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/041.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/041sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/041s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon041.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Leech Life";
            MoveTree[10] = "Supersonic";
            MoveTree[15] = "Bite";
            MoveTree[21] = "Confuse Ray";
            MoveTree[28] = "Wing Attack";
            MoveTree[36] = "Haze";
            type = flying;

        } else if (n == 42) {
            name = "Golbat";
            evolvelevel = 999;
            evolveform = 42;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/042b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/042.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/042sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/042s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon042.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Leech Life";
            MoveTree[10] = "Supersonic";
            MoveTree[15] = "Bite";
            MoveTree[21] = "Confuse Ray";
            MoveTree[28] = "Wing Attack";
            MoveTree[36] = "Haze";
            type = flying;

        } else if (n == 43) {
            name = "Oddish";
            evolvelevel = 21;
            evolveform = 44;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/043b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/043.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/043sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/043s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon043.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Absorb";
            MoveTree[15] = "Poison Powder";
            MoveTree[17] = "Stun Spore";
            MoveTree[19] = "Sleep Powder";
            MoveTree[24] = "Acid";
            MoveTree[33] = "Petal Dance";
            MoveTree[46] = "Solarbeam";
            type = grass;

        } else if (n == 44) {
            name = "Gloom";
            evolvelevel = 999;
            evolveform = 45;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/044b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/044.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/044sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/044s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon044.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Absorb";
            MoveTree[15] = "Poison Powder";
            MoveTree[17] = "Stun Spore";
            MoveTree[19] = "Sleep Powder";
            MoveTree[28] = "Acid";
            MoveTree[38] = "Petal Dance";
            MoveTree[52] = "Solarbeam";
            type = grass;

        } else if (n == 45) {
            name = "Vileplume";
            evolvelevel = 999;
            evolveform = 45;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/045b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/045.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/045sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/045s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon045.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[15] = "Poison Powder";
            MoveTree[17] = "Stun Spore";
            MoveTree[19] = "Sleep Powder";
            type = grass;

        } else if (n == 46) {
            name = "Paras";
            evolvelevel = 24;
            evolveform = 47;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/046b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/046.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/046sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/046s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon046.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[13] = "Stun Spore";
            MoveTree[20] = "Leech Life";
            MoveTree[27] = "Spore";
            MoveTree[34] = "Slash";
            MoveTree[41] = "Growth";
            type = bug;

        } else if (n == 47) {
            name = "Parasect";
            evolvelevel = 999;
            evolveform = 47;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/047b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/047.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/047sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/047s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon047.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[2] = "Stun Spore";
            MoveTree[3] = "Leech Life";
            MoveTree[30] = "Spore";
            MoveTree[39] = "Slash";
            MoveTree[48] = "Growth";
            type = bug;

        } else if (n == 48) {
            name = "Venonat";
            evolvelevel = 31;
            evolveform = 49;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/048b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/048.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/048sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/048s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon048.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Disable";
            MoveTree[24] = "Poison Powder";
            MoveTree[27] = "Leech Life";
            MoveTree[30] = "Stun Spore";
            MoveTree[35] = "Psybeam";
            MoveTree[38] = "Sleep Powder";
            MoveTree[41] = "Psychic";
            type = bug;

        } else if (n == 49) {
            name = "Venomoth";
            evolvelevel = 999;
            evolveform = 49;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/049b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/049.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/049sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/049s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon049.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Disable";
            MoveTree[24] = "Poison Powder";
            MoveTree[27] = "Leech Life";
            MoveTree[30] = "Stun Spore";
            MoveTree[38] = "Psybeam";
            MoveTree[43] = "Sleep Powder";
            MoveTree[50] = "Psychic";
            type = bug;

        } else if (n == 50) {
            name = "Diglett";
            evolvelevel = 26;
            evolveform = 51;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/050b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/050.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/050sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/050s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon050.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[15] = "Growl";
            MoveTree[19] = "Dig";
            MoveTree[24] = "Sand Attack";
            MoveTree[31] = "Slash";
            MoveTree[40] = "Earthquake";
            type = ground;

        } else if (n == 51) {
            name = "Dugtrio";
            evolvelevel = 999;
            evolveform = 51;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/051b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/051.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/051sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/051s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon051.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[15] = "Growl";
            MoveTree[19] = "Dig";
            MoveTree[24] = "Sand Attack";
            MoveTree[35] = "Slash";
            MoveTree[47] = "Earthquake";
            type = ground;

        } else if (n == 52) {
            name = "Meowth";
            evolvelevel = 28;
            evolveform = 53;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/052b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/052.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/052sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/052s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon052.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[2] = "Growl";
            MoveTree[12] = "Bite";
            MoveTree[17] = "Payday";
            MoveTree[24] = "Screech";
            MoveTree[33] = "Fury Swipes";
            MoveTree[44] = "Slash";
            type = normal;

        } else if (n == 53) {
            name = "Persian";
            evolvelevel = 999;
            evolveform = 53;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/053b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/053.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/053sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/053s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon053.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[2] = "Growl";
            MoveTree[12] = "Bite";
            MoveTree[17] = "Payday";
            MoveTree[24] = "Screech";
            MoveTree[37] = "Fury Swipes";
            MoveTree[51] = "Slash";
            type = normal;

        } else if (n == 54) {
            name = "Psyduck";
            evolvelevel = 33;
            evolveform = 55;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/054b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/054.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/054sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/054s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon054.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[28] = "Tail Whip";
            MoveTree[31] = "Disable";
            MoveTree[36] = "Confusion";
            MoveTree[43] = "Fury Swipes";
            MoveTree[52] = "Hydro Pump";
            type = water;

        } else if (n == 55) {
            name = "Golduck";
            evolvelevel = 999;
            evolveform = 55;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/055b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/055.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/055sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/055s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon055.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[28] = "Tail Whip";
            MoveTree[31] = "Disable";
            MoveTree[39] = "Confusion";
            MoveTree[48] = "Fury Swipes";
            MoveTree[59] = "Hydro Pump";
            type = water;

        } else if (n == 56) {
            name = "Mankey";
            evolvelevel = 28;
            evolveform = 57;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/056b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/056.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/056sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/056s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon056.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[2] = "Leer";
            MoveTree[15] = "Karate Chop";
            MoveTree[21] = "Fury Swipes";
            MoveTree[27] = "Focus Energy";
            MoveTree[33] = "Seismic Toss";
            MoveTree[39] = "Thrash";
            type = fighting;

        } else if (n == 57) {
            name = "Primape";
            evolvelevel = 999;
            evolveform = 57;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/057b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/057.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/057sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/057s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon057.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[2] = "Leer";
            MoveTree[15] = "Karate Chop";
            MoveTree[21] = "Fury Swipes";
            MoveTree[27] = "Focus Energy";
            MoveTree[37] = "Seismic Toss";
            MoveTree[46] = "Thrash";
            type = fighting;

        } else if (n == 58) {
            name = "Growlithe";
            evolvelevel = 999;
            evolveform = 59;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/058b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/058.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/058sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/058s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon058.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Bite";
            MoveTree[2] = "Roar";
            MoveTree[18] = "Ember";
            MoveTree[23] = "Leer";
            MoveTree[30] = "Take Down";
            MoveTree[39] = "Agility";
            MoveTree[50] = "Flamethrower";
            type = fire;

        } else if (n == 59) {
            name = "Arcanine";
            evolvelevel = 999;
            evolveform = 59;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/059b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/059.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/059sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/059s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon059.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Roar";
            MoveTree[2] = "Ember";
            MoveTree[3] = "Leer";
            MoveTree[4] = "Take Down";
            type = fire;

        } else if (n == 60) {
            name = "Poliwag";
            evolvelevel = 25;
            evolveform = 61;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/060b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/060.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/060sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/060s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon060.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Bubble";
            MoveTree[16] = "Hypnosis";
            MoveTree[19] = "Water Gun";
            MoveTree[25] = "Double Slap";
            MoveTree[31] = "Body Slam";
            MoveTree[38] = "Amnesia";
            MoveTree[45] = "Hydro Pump";
            type = water;

        } else if (n == 61) {
            name = "Poliwhirl";
            evolvelevel = 999;
            evolveform = 62;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/061b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/061.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/061sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/061s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon061.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Bubble";
            MoveTree[16] = "Hypnosis";
            MoveTree[19] = "Water Gun";
            MoveTree[26] = "Double Slap";
            MoveTree[33] = "Body Slam";
            MoveTree[41] = "Amnesia";
            MoveTree[49] = "Hydro Pump";
            type = water;

        } else if (n == 62) {
            name = "Poliwrath";
            evolvelevel = 999;
            evolveform = 62;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/062b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/062.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/062sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/062s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon062.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[10] = "Double Slap";
            MoveTree[10] = "Body Slam";
            MoveTree[10] = "Hyposis";
            MoveTree[10] = "Water Gun";
            type = water;

        } else if (n == 63) {
            name = "Abra";
            evolvelevel = 16;
            evolveform = 64;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/063b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/063.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/063sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/063s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon063.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Teleport";
            type = psychic;

        } else if (n == 64) {
            name = "Kadabra";
            evolvelevel = 999;
            evolveform = 65;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/064b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/064.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/064sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/064s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon064.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Teleport";
            MoveTree[16] = "Confusion";
            MoveTree[20] = "Disable";
            MoveTree[27] = "Psybeam";
            MoveTree[31] = "Recover";
            MoveTree[38] = "Psychic";
            MoveTree[42] = "Reflect";
            type = psychic;

        } else if (n == 65) {
            name = "Alakazam";
            evolvelevel = 999;
            evolveform = 65;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/065b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/065.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/065sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/065s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon065.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Teleport";
            MoveTree[16] = "Confusion";
            MoveTree[20] = "Disable";
            MoveTree[27] = "Psybeam";
            MoveTree[31] = "Recover";
            MoveTree[38] = "Psychic";
            MoveTree[42] = "Reflect";
            type = psychic;

        } else if (n == 66) {
            name = "Machop";
            evolvelevel = 28;
            evolveform = 67;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/066b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/066.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/066sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/066s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon066.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Karate Chop";
            MoveTree[20] = "Low Kick";
            MoveTree[25] = "Leer";
            MoveTree[32] = "Focus Energy";
            MoveTree[39] = "Seismic Toss";
            MoveTree[46] = "Submission";
            type = fighting;

        } else if (n == 67) {
            name = "Machoke";
            evolvelevel = 50;
            evolveform = 68;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/067b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/067.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/067sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/067s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon067.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Karate Chop";
            MoveTree[20] = "Low Kick";
            MoveTree[25] = "Leer";
            MoveTree[36] = "Focus Energy";
            MoveTree[44] = "Seismic Toss";
            MoveTree[52] = "Submission";
            type = fighting;

        } else if (n == 68) {
            name = "Machamp";
            evolvelevel = 999;
            evolveform = 68;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/068b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/068.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/068sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/068s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon068.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Karate Chop";
            MoveTree[20] = "Low Kick";
            MoveTree[25] = "Leer";
            MoveTree[32] = "Focus Energy";
            MoveTree[39] = "Seismic Toss";
            MoveTree[46] = "Submission";
            type = fighting;

        } else if (n == 69) {
            name = "Bellsprout";
            evolvelevel = 21;
            evolveform = 70;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/069b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/069.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/069sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/069s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon069.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Vine Whip";
            MoveTree[2] = "Growth";
            MoveTree[13] = "Wrap";
            MoveTree[15] = "Poison Powder";
            MoveTree[18] = "Sleep Powder";
            MoveTree[21] = "Stun Spore";
            MoveTree[26] = "Acid";
            MoveTree[33] = "Razor Leaf";
            MoveTree[42] = "Slam";
            type = grass;

        } else if (n == 70) {
            name = "Weepinbell";
            evolvelevel = 999;
            evolveform = 71;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/070b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/070.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/070sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/070s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon070.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Vine Whip";
            MoveTree[2] = "Growth";
            MoveTree[13] = "Wrap";
            MoveTree[15] = "Poison Powder";
            MoveTree[18] = "Sleep Powder";
            MoveTree[21] = "Stun Spore";
            MoveTree[26] = "Acid";
            MoveTree[33] = "Razor Leaf";
            MoveTree[42] = "Slam";
            type = grass;

        } else if (n == 71) {
            name = "Victreebel";
            evolvelevel = 999;
            evolveform = 71;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/071b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/071.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/071sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/071s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon071.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[13] = "Wrap";
            MoveTree[15] = "Poison Powder";
            MoveTree[18] = "Sleep Powder";
            type = grass;

        } else if (n == 72) {
            name = "Tentacool";
            evolvelevel = 30;
            evolveform = 73;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/072b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/072.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/072sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/072s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon072.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Acid";
            MoveTree[7] = "Supersonic";
            MoveTree[13] = "Wrap";
            MoveTree[18] = "Poison Sting";
            MoveTree[22] = "Water Gun";
            MoveTree[27] = "Constrict";
            MoveTree[33] = "Barrier";
            MoveTree[40] = "Screech";
            MoveTree[48] = "Hydro Pump";
            type = water;

        } else if (n == 73) {
            name = "Tentacruel";
            evolvelevel = 999;
            evolveform = 73;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/073b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/073.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/073sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/073s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon073.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Acid";
            MoveTree[7] = "Supersonic";
            MoveTree[13] = "Wrap";
            MoveTree[18] = "Poison Sting";
            MoveTree[22] = "Water Gun";
            MoveTree[27] = "Constrict";
            MoveTree[33] = "Barrier";
            MoveTree[40] = "Screech";
            MoveTree[48] = "Hydro Pump";
            type = water;

        } else if (n == 74) {
            name = "Geodude";
            evolvelevel = 25;
            evolveform = 75;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/074b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/074.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/074sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/074s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon074..gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[11] = "Defense Curl";
            MoveTree[16] = "Rock Throw";
            MoveTree[21] = "Self Destruct";
            MoveTree[26] = "Harden";
            MoveTree[31] = "Earthquake";
            MoveTree[36] = "Explosion";
            type = rock;

        } else if (n == 75) {
            name = "Graveler";
            evolvelevel = 50;
            evolveform = 76;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/075b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/075.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/075sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/075s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon075.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[11] = "Defense Curl";
            MoveTree[16] = "Rock Throw";
            MoveTree[21] = "Self Destruct";
            MoveTree[26] = "Harden";
            MoveTree[31] = "Earthquake";
            MoveTree[36] = "Explosion";
            type = rock;

        } else if (n == 76) {
            name = "Golem";
            evolvelevel = 999;
            evolveform = 76;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/076b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/076.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/076sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/076s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon076.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[11] = "Defense Curl";
            MoveTree[16] = "Rock Throw";
            MoveTree[21] = "Self Destruct";
            MoveTree[26] = "Harden";
            MoveTree[31] = "Earthquake";
            MoveTree[36] = "Explosion";
            type = rock;

        } else if (n == 77) {
            name = "Ponyta";
            evolvelevel = 40;
            evolveform = 78;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/077b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/077.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/077sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/077s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon077.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Ember";
            MoveTree[30] = "Tail Whip";
            MoveTree[32] = "Stomp";
            MoveTree[35] = "Growl";
            MoveTree[39] = "Fire Spin";
            MoveTree[43] = "Take Down";
            MoveTree[46] = "Agility";
            type = fire;

        } else if (n == 78) {
            name = "Rapidash";
            evolvelevel = 999;
            evolveform = 78;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/078b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/078.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/078sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/078s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon078.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Ember";
            MoveTree[30] = "Tail Whip";
            MoveTree[32] = "Stomp";
            MoveTree[35] = "Growl";
            MoveTree[39] = "Fire Spin";
            MoveTree[47] = "Take Down";
            MoveTree[55] = "Agility";
            type = fire;

        } else if (n == 79) {
            name = "Slowpoke";
            evolvelevel = 37;
            evolveform = 80;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/079b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/079.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/079sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/079s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon079.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Confusion";
            MoveTree[18] = "Disable";
            MoveTree[22] = "Headbutt";
            MoveTree[27] = "Growl";
            MoveTree[33] = "Water Gun";
            MoveTree[40] = "Amnesia";
            MoveTree[48] = "Psychic";
            type = water;

        } else if (n == 80) {
            name = "Slowbro";
            evolvelevel = 999;
            evolveform = 80;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/080b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/080.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/080sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/080s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon080.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Confusion";
            MoveTree[18] = "Disable";
            MoveTree[22] = "Headbutt";
            MoveTree[27] = "Growl";
            MoveTree[33] = "Water Gun";
            MoveTree[37] = "Withdraw";
            MoveTree[40] = "Amnesia";
            MoveTree[48] = "Psychic";
            type = water;

        } else if (n == 81) {
            name = "Magnemite";
            evolvelevel = 30;
            evolveform = 82;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/081b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/081.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/081sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/081s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon081.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[21] = "Sonic Boom";
            MoveTree[25] = "Thundershock";
            MoveTree[29] = "Supersonic";
            MoveTree[35] = "Thunder Wave";
            MoveTree[41] = "Swift";
            MoveTree[47] = "Screech";
            type = electric;

        } else if (n == 82) {
            name = "Magneton";
            evolvelevel = 999;
            evolveform = 82;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/082b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/082.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/082sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/082s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon082.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[21] = "Sonic Boom";
            MoveTree[25] = "Thundershock";
            MoveTree[29] = "Supersonic";
            MoveTree[38] = "Thunder Wave";
            MoveTree[46] = "Swift";
            MoveTree[54] = "Screech";
            type = electric;

        } else if (n == 83) {
            name = "Farfetch'd";
            evolvelevel = 999;
            evolveform = 83;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/083b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/083.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/083sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/083s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon083.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Peck";
            MoveTree[2] = "Sand Attack";
            MoveTree[7] = "Leer";
            MoveTree[15] = "Fury Attack";
            MoveTree[23] = "Swords Dance";
            MoveTree[31] = "Agility";
            MoveTree[39] = "Slash";
            type = flying;

        } else if (n == 84) {
            name = "Doduo";
            evolvelevel = 31;
            evolveform = 85;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/084b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/084.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/084sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/084s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon084.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[10] = "Peck";
            MoveTree[10] = "Growl";
            MoveTree[10] = "Fury Attack";
            MoveTree[10] = "Drill Peck";
            MoveTree[10] = "Rage";
            MoveTree[10] = "Tri Attack";
            MoveTree[10] = "Agility";
            type = flying;

        } else if (n == 85) {
            name = "Dodrio";
            evolvelevel = 999;
            evolveform = 85;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/085b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/085.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/085sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/085s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon085.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Peck";
            MoveTree[20] = "Growl";
            MoveTree[24] = "Fury Attack";
            MoveTree[30] = "Drill Peck";
            MoveTree[36] = "Rage";
            MoveTree[40] = "Tri Attack";
            MoveTree[44] = "Agility";
            type = flying;

        } else if (n == 86) {
            name = "Seel";
            evolvelevel = 34;
            evolveform = 87;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/086b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/086.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/086sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/086s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon086.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Headbutt";
            MoveTree[30] = "Growl";
            MoveTree[35] = "Aurora Beam";
            MoveTree[40] = "Rest";
            MoveTree[45] = "Take Down";
            MoveTree[50] = "Ice Beam";
            type = water;

        } else if (n == 87) {
            name = "Dewgong";
            evolvelevel = 999;
            evolveform = 87;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/087b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/087.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/087sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/087s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon087.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Headbutt";
            MoveTree[30] = "Growl";
            MoveTree[35] = "Aurora Beam";
            MoveTree[44] = "Rest";
            MoveTree[50] = "Take Down";
            MoveTree[56] = "Ice Beam";
            type = water;

        } else if (n == 88) {
            name = "Grimer";
            evolvelevel = 38;
            evolveform = 89;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/088b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/088.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/088sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/088s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon088.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Pound";
            MoveTree[2] = "Disable";
            MoveTree[30] = "Poison Gas";
            MoveTree[33] = "Minimize";
            MoveTree[37] = "Sludge";
            MoveTree[42] = "Harden";
            MoveTree[48] = "Screech";
            MoveTree[55] = "Acid Armor";
            type = poison;

        } else if (n == 89) {
            name = "Muk";
            evolvelevel = 999;
            evolveform = 89;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/089b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/089.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/089sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/089s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon089.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Pound";
            MoveTree[2] = "Disable";
            MoveTree[30] = "Poison Gas";
            MoveTree[33] = "Minimize";
            MoveTree[37] = "Sludge";
            MoveTree[42] = "Harden";
            MoveTree[48] = "Screech";
            MoveTree[55] = "Acid Armor";
            type = poison;

        } else if (n == 90) {
            name = "Shellder";
            evolvelevel = 999;
            evolveform = 91;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/090b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/090.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/090sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/090s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon090.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Withdraw";
            MoveTree[18] = "Supersonic";
            MoveTree[23] = "Clamp";
            MoveTree[30] = "Aurora Beam";
            MoveTree[39] = "Leer";
            MoveTree[50] = "Ice Beam";
            type = water;

        } else if (n == 91) {
            name = "Cloyster";
            evolvelevel = 999;
            evolveform = 91;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/091b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/091.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/091sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/091s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon091.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Withdraw";
            MoveTree[18] = "Supersonic";
            MoveTree[23] = "Clamp";
            MoveTree[30] = "Aurora Beam";
            MoveTree[30] = "Spike Cannon";
            type = water;

        } else if (n == 92) {
            name = "Gastly";
            evolvelevel = 25;
            evolveform = 93;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/092b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/092.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/092sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/092s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon092.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Lick";
            MoveTree[2] = "Confuse Ray";
            MoveTree[3] = "Nightshade";
            MoveTree[27] = "Hypnosis";
            MoveTree[35] = "Dream Eater";
            type = ghost;

        } else if (n == 93) {
            name = "Haunter";
            evolvelevel = 50;
            evolveform = 94;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/093b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/093.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/093sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/093s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon093.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Lick";
            MoveTree[2] = "Confuse Ray";
            MoveTree[3] = "Nightshade";
            MoveTree[29] = "Hypnosis";
            MoveTree[38] = "Dream Eater";
            type = ghost;

        } else if (n == 94) {
            name = "Gengar";
            evolvelevel = 999;
            evolveform = 94;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/094b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/094.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/094sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/094s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon094.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Lick";
            MoveTree[2] = "Confuse Ray";
            MoveTree[3] = "Nightshade";
            MoveTree[27] = "Hypnosis";
            MoveTree[35] = "Dream Eater";
            type = ghost;

        } else if (n == 95) {
            name = "Onix";
            evolvelevel = 999;
            evolveform = 95;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/095b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/095.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/095sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/095s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon095.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Screech";
            MoveTree[15] = "Bind";
            MoveTree[19] = "Rock Throw";
            MoveTree[25] = "Rage";
            MoveTree[33] = "Slam";
            MoveTree[43] = "Harden";
            type = rock;

        } else if (n == 96) {
            name = "Drowsee";
            evolvelevel = 26;
            evolveform = 97;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/096b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/096.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/096sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/096s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon096.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Pound";
            MoveTree[2] = "Hypnosis";
            MoveTree[12] = "Disable";
            MoveTree[17] = "Confusion";
            MoveTree[24] = "Headbutt";
            MoveTree[29] = "Poison Gas";
            MoveTree[32] = "Psychic";
            MoveTree[37] = "Meditate";
            type = psychic;

        } else if (n == 97) {
            name = "Hypno";
            evolvelevel = 999;
            evolveform = 97;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/097b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/097.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/097sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/097s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon097.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Pound";
            MoveTree[2] = "Hypnosis";
            MoveTree[12] = "Disable";
            MoveTree[17] = "Confusion";
            MoveTree[24] = "Headbutt";
            MoveTree[33] = "Poison Gas";
            MoveTree[37] = "Psychic";
            MoveTree[43] = "Meditate";
            type = psychic;

        } else if (n == 98) {
            name = "Krabby";
            evolvelevel = 28;
            evolveform = 99;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/098b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/098.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/098sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/098s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon098.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Bubble";
            MoveTree[2] = "Leer";
            MoveTree[20] = "Vice Grip";
            MoveTree[25] = "Guillotine";
            MoveTree[30] = "Stomp";
            MoveTree[35] = "Crab Hammer";
            MoveTree[40] = "Harden";
            type = water;

        } else if (n == 99) {
            name = "Kingler";
            evolvelevel = 999;
            evolveform = 99;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/099b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/099.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/099sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/099s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon099.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Bubble";
            MoveTree[2] = "Leer";
            MoveTree[20] = "Vice Grip";
            MoveTree[25] = "Guillotine";
            MoveTree[34] = "Stomp";
            MoveTree[42] = "Crab Hammer";
            MoveTree[49] = "Harden";
            type = water;

        } else if (n == 100) {
            name = "Voltorb";
            evolvelevel = 30;
            evolveform = 101;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/100b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/100.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/100sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/100s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon100.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Screech";
            MoveTree[17] = "Sonic Boom";
            MoveTree[22] = "Self Destruct";
            MoveTree[29] = "Light Screen";
            MoveTree[36] = "Swift";
            MoveTree[43] = "Explosion";
            type = electric;

        } else if (n == 101) {
            name = "Electrode";
            evolvelevel = 999;
            evolveform = 101;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/101b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/101.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/101sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/101s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon101.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Screech";
            MoveTree[17] = "Sonic Boom";
            MoveTree[22] = "Self Destruct";
            MoveTree[29] = "Light Screen";
            MoveTree[40] = "Swift";
            MoveTree[50] = "Explosion";
            type = electric;

        } else if (n == 102) {
            name = "Exeggcute";
            evolvelevel = 999;
            evolveform = 103;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/102b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/102.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/102sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/102s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon102.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Barrage";
            MoveTree[2] = "Hypnosis";
            MoveTree[28] = "Reflect";
            MoveTree[32] = "Leech Seed";
            MoveTree[37] = "Poison Powder";
            MoveTree[42] = "Solarbeam";
            MoveTree[48] = "Sleep Powder";
            type = grass;

        } else if (n == 103) {
            name = "Exeggutor";
            evolvelevel = 999;
            evolveform = 103;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/103b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/103.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/103sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/103s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon103.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Barrage";
            MoveTree[2] = "Hypnosis";
            MoveTree[28] = "Stomp";
            type = grass;

        } else if (n == 104) {
            name = "Cubone";
            evolvelevel = 28;
            evolveform = 105;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/104b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/104.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/104sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/104s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon104.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Bone Club";
            MoveTree[2] = "Growl";
            MoveTree[25] = "Leer";
            MoveTree[31] = "Focus Energy";
            MoveTree[38] = "Thrash";
            MoveTree[43] = "Bonemerang";
            MoveTree[46] = "Rage";
            type = ground;

        } else if (n == 105) {
            name = "Marowak";
            evolvelevel = 999;
            evolveform = 105;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/105b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/105.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/105sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/105s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon105.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Bone Club";
            MoveTree[2] = "Growl";
            MoveTree[25] = "Leer";
            MoveTree[33] = "Focus Energy";
            MoveTree[41] = "Thrash";
            MoveTree[48] = "Bonemerang";
            MoveTree[55] = "Rage";
            type = ground;

        } else if (n == 106) {
            name = "Hitmonlee";
            evolvelevel = 999;
            evolveform = 106;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/106b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/106.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/106sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/106s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon106.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Double Kick";
            MoveTree[2] = "Meditate";
            MoveTree[33] = "Rolling Kick";
            MoveTree[38] = "Jump Kick";
            MoveTree[43] = "Focus Energy";
            MoveTree[48] = "High Jump Kick";
            MoveTree[53] = "Mega Kick";
            type = fighting;

        } else if (n == 107) {
            name = "Hitmonchan";
            evolvelevel = 999;
            evolveform = 107;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/107b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/107.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/107sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/107s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon107.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Comet Punch";
            MoveTree[2] = "Agility";
            MoveTree[33] = "Fire Punch";
            MoveTree[38] = "Ice Punch";
            MoveTree[43] = "Thunder Punch";
            MoveTree[48] = "Mega Punch";
            MoveTree[53] = "Counter";
            type = fighting;

        } else if (n == 108) {
            name = "Lickitung";
            evolvelevel = 999;
            evolveform = 108;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/108b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/108.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/108sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/108s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon108.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Wrap";
            MoveTree[2] = "Supersonic";
            MoveTree[7] = "Stomp";
            MoveTree[15] = "Disable";
            MoveTree[23] = "Defense Curl";
            MoveTree[31] = "Slam";
            MoveTree[39] = "Screech";
            type = normal;

        } else if (n == 109) {
            name = "Koffing";
            evolvelevel = 35;
            evolveform = 110;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/109b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/109.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/109sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/109s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon109.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Smog";
            MoveTree[32] = "Sludge";
            MoveTree[37] = "Smokescreen";
            MoveTree[40] = "Self Destruct";
            MoveTree[45] = "Haze";
            MoveTree[48] = "Explosion";
            type = poison;

        } else if (n == 110) {
            name = "Weezing";
            evolvelevel = 999;
            evolveform = 110;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/110b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/110.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/110sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/110s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon110.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Smog";
            MoveTree[3] = "Sludge";
            MoveTree[39] = "Smokescreen";
            MoveTree[43] = "Self Destruct";
            MoveTree[49] = "Haze";
            MoveTree[53] = "Explosion";
            type = poison;

        } else if (n == 111) {
            name = "Rhyhorn";
            evolvelevel = 42;
            evolveform = 112;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/111b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/111.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/111sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/111s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon111.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Horn Attack";
            MoveTree[30] = "Stomp";
            MoveTree[35] = "Tail Whip";
            MoveTree[40] = "Fury Attack";
            MoveTree[45] = "Horn Drill";
            MoveTree[50] = "Leer";
            MoveTree[55] = "Take Down";
            type = ground;

        } else if (n == 112) {
            name = "Rhydon";
            evolvelevel = 999;
            evolveform = 112;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/112b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/112.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/112sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/112s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon112.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Horn Attack";
            MoveTree[30] = "Stomp";
            MoveTree[35] = "Tail Whip";
            MoveTree[40] = "Fury Attack";
            MoveTree[48] = "Horn Drill";
            MoveTree[55] = "Leer";
            MoveTree[64] = "Take Down";
            type = ground;

        } else if (n == 113) {
            name = "Chansey";
            evolvelevel = 999;
            evolveform = 113;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/113b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/113.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/113sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/113s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon113.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Pound";
            MoveTree[2] = "Double Slap";
            MoveTree[24] = "Sing";
            MoveTree[30] = "Growl";
            MoveTree[38] = "Minimize";
            MoveTree[44] = "Defense Curl";
            MoveTree[48] = "Light Screen";
            MoveTree[54] = "Double Edge";
            type = normal;

        } else if (n == 114) {
            name = "Tangela";
            evolvelevel = 999;
            evolveform = 114;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/114b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/114.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/114sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/114s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon114.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Constrict";
            MoveTree[2] = "Bind";
            MoveTree[29] = "Absorb";
            MoveTree[32] = "Poison Powder";
            MoveTree[36] = "Stun Spore";
            MoveTree[39] = "Sleep Powder";
            MoveTree[45] = "Slam";
            MoveTree[49] = "Growth";
            type = grass;

        } else if (n == 115) {
            name = "Kangaskhan";
            evolvelevel = 999;
            evolveform = 115;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/115b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/115.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/115sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/115s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon115.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Comet Punch";
            MoveTree[2] = "Rage";
            MoveTree[26] = "Bite";
            MoveTree[31] = "Tail Whip";
            MoveTree[36] = "Mega Punch";
            MoveTree[41] = "Leer";
            MoveTree[46] = "Dizzy Punch";
            type = normal;

        } else if (n == 116) {
            name = "Horsea";
            evolvelevel = 32;
            evolveform = 117;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/116b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/116.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/116sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/116s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon116.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Bubble";
            MoveTree[19] = "Smokescreen";
            MoveTree[24] = "Leer";
            MoveTree[30] = "Water Gun";
            MoveTree[37] = "Agility";
            MoveTree[45] = "Hydro Pump";
            type = water;

        } else if (n == 117) {
            name = "Seadra";
            evolvelevel = 999;
            evolveform = 117;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/117b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/117.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/117sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/117s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon117.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Bubble";
            MoveTree[19] = "Smokescreen";
            MoveTree[24] = "Leer";
            MoveTree[30] = "Water Gun";
            MoveTree[41] = "Agility";
            MoveTree[52] = "Hydro Pump";
            type = water;

        } else if (n == 118) {
            name = "Goldeen";
            evolvelevel = 33;
            evolveform = 119;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/118b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/118.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/118sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/118s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon118.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Peck";
            MoveTree[2] = "Tail Whip";
            MoveTree[19] = "Supersonic";
            MoveTree[24] = "Horn Attack";
            MoveTree[30] = "Fury Attack";
            MoveTree[37] = "Waterfall";
            MoveTree[45] = "Horn Drill";
            MoveTree[54] = "Agility";
            type = water;

        } else if (n == 119) {
            name = "Seaking";
            evolvelevel = 999;
            evolveform = 119;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/119b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/119.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/119sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/119s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon119.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Peck";
            MoveTree[2] = "Tail Whip";
            MoveTree[19] = "Supersonic";
            MoveTree[24] = "Horn Attack";
            MoveTree[30] = "Fury Attack";
            MoveTree[39] = "Waterfall";
            MoveTree[48] = "Horn Drill";
            MoveTree[54] = "Agility";
            type = water;

        } else if (n == 120) {
            name = "Staryu";
            evolvelevel = 999;
            evolveform = 121;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/120b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/120.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/120sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/120s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon120.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[17] = "Water Gun";
            MoveTree[22] = "Harden";
            MoveTree[27] = "Recover";
            MoveTree[32] = "Swift";
            MoveTree[37] = "Minimize";
            MoveTree[42] = "Light Screen";
            MoveTree[47] = "Hydro Pump";
            type = water;

        } else if (n == 121) {
            name = "Starmie";
            evolvelevel = 999;
            evolveform = 121;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/121b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/121.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/121sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/121s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon121.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Water Gun";
            MoveTree[3] = "Harden";
            type = water;

        } else if (n == 122) {
            name = "Mr. Mime";
            evolvelevel = 999;
            evolveform = 122;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/122b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/122.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/122sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/122s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon122.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Confusion";
            MoveTree[2] = "Barrier";
            MoveTree[23] = "Light Screen";
            MoveTree[31] = "Double Slap";
            MoveTree[39] = "Meditate";
            MoveTree[47] = "Substitute";
            type = psychic;

        } else if (n == 123) {
            name = "Scyther";
            evolvelevel = 999;
            evolveform = 123;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/123b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/123.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/123sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/123s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon123.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Quick Attack";
            MoveTree[17] = "Leer";
            MoveTree[20] = "Focus Energy";
            MoveTree[24] = "Double Team";
            MoveTree[29] = "Slash";
            MoveTree[35] = "Swords Dance";
            MoveTree[42] = "Agility";
            type = bug;

        } else if (n == 124) {
            name = "Jynx";
            evolvelevel = 999;
            evolveform = 124;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/124b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/124.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/124sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/124s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon124.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Pound";
            MoveTree[2] = "Lovely Kiss";
            MoveTree[15] = "Sing";
            MoveTree[23] = "Double Slap";
            MoveTree[31] = "Ice Punch";
            MoveTree[39] = "Meditate";
            MoveTree[47] = "Blizzard";
            type = ice;

        } else if (n == 125) {
            name = "Electrabuzz";
            evolvelevel = 999;
            evolveform = 125;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/125b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/125.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/125sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/125s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon125.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Quick Attack";
            MoveTree[2] = "Leer";
            MoveTree[34] = "Thunder Shock";
            MoveTree[37] = "Screech";
            MoveTree[42] = "Thunder Punch";
            MoveTree[49] = "Light Screen";
            MoveTree[54] = "Thunder";
            type = electric;

        } else if (n == 126) {
            name = "Magmar";
            evolvelevel = 999;
            evolveform = 126;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/126b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/126.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/126sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/126s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon126.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Ember";
            MoveTree[36] = "Leer";
            MoveTree[39] = "Confuse Ray";
            MoveTree[43] = "Fire Punch";
            MoveTree[48] = "Smokescreen";
            MoveTree[52] = "Smog";
            MoveTree[55] = "Flamethrower";
            type = fire;

        } else if (n == 127) {
            name = "Pinsir";
            evolvelevel = 999;
            evolveform = 127;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/127b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/127.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/127sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/127s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon127.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Vice Grip";
            MoveTree[25] = "Seismic Toss";
            MoveTree[30] = "Guillotine";
            MoveTree[36] = "Focus Energy";
            MoveTree[43] = "Harden";
            MoveTree[49] = "Slash";
            MoveTree[54] = "Sword Dance";
            type = bug;

        } else if (n == 128) {
            name = "Tauros";
            evolvelevel = 999;
            evolveform = 128;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/128b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/128.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/128sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/128s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon128.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[21] = "Stomp";
            MoveTree[28] = "Tail Whip";
            MoveTree[35] = "Leer";
            MoveTree[44] = "Rage";
            MoveTree[51] = "Take Down";
            type = normal;

        } else if (n == 129) {
            name = "Magikarp";
            evolvelevel = 20;
            evolveform = 130;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/129b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/129.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/129sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/129s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon129.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Splash";
            MoveTree[15] = "Tackle";
            type = water;

        } else if (n == 130) {
            name = "Gyarados";
            evolvelevel = 999;
            evolveform = 130;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/130b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/130.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/130sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/130s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon130.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[20] = "Bite";
            MoveTree[25] = "Dragon Rage";
            MoveTree[32] = "Leer";
            MoveTree[41] = "Hydro Pump";
            MoveTree[52] = "Hyper Beam";
            type = water;

        } else if (n == 131) {
            name = "Lapras";
            evolvelevel = 999;
            evolveform = 131;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/131b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/131.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/131sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/131s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon131.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Water Gun";
            MoveTree[2] = "Growl";
            MoveTree[16] = "Sing";
            MoveTree[20] = "Mist";
            MoveTree[25] = "Body Slam";
            MoveTree[31] = "COnfuse Ray";
            MoveTree[38] = "Ice Beam";
            MoveTree[46] = "Hydro Pump";
            type = water;

        } else if (n == 132) {
            name = "Ditto";
            evolvelevel = 999;
            evolveform = 132;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/132b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/132.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/132sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/132s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon132.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Transform";
            type = normal;

        } else if (n == 133) {
            name = "Eevee";
            evolvelevel = 999;
            evolveform = 133;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/133b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/133.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/133sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/133s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon133.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Sand Attack";
            MoveTree[27] = "Quick Attack";
            MoveTree[31] = "Tail Whip";
            MoveTree[37] = "Bite";
            MoveTree[45] = "Take Down";
            type = normal;

        } else if (n == 134) {
            name = "Vaporeon";
            evolvelevel = 999;
            evolveform = 134;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/134b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/134.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/134sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/134s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon134.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Sand Attack";
            MoveTree[27] = "Quick Attack";
            MoveTree[31] = "Water Gun";
            MoveTree[37] = "Tail Whip";
            MoveTree[40] = "Bite";
            MoveTree[42] = "Acid Armor";
            MoveTree[44] = "Haze";
            MoveTree[48] = "Mist";
            MoveTree[54] = "Hydro Pump";
            type = water;

        } else if (n == 135) {
            name = "Jolteon";
            evolvelevel = 999;
            evolveform = 135;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/135b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/135.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/135sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/135s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon135.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Sand Attack";
            MoveTree[27] = "Quick Attack";
            MoveTree[31] = "Thundershock";
            MoveTree[37] = "Tail Whip";
            MoveTree[40] = "Thunderwave";
            MoveTree[42] = "Double Kick";
            MoveTree[44] = "Agility";
            MoveTree[48] = "Pin Missile";
            MoveTree[54] = "Thunder";
            type = electric;

        } else if (n == 136) {
            name = "Flareon";
            evolvelevel = 999;
            evolveform = 136;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/136b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/136.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/136sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/136s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon136.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Sand Attack";
            MoveTree[27] = "Quick Attack";
            MoveTree[31] = "Ember";
            MoveTree[37] = "Tail Whip";
            MoveTree[40] = "Bite";
            MoveTree[42] = "Leer";
            MoveTree[44] = "Fire Spin";
            MoveTree[48] = "Rage";
            MoveTree[54] = "Flamethrower";
            type = fire;

        } else if (n == 137) {
            name = "Porygon";
            evolvelevel = 999;
            evolveform = 137;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/137b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/137.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/137sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/137s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon137.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Tackle";
            MoveTree[2] = "Sharpen";
            MoveTree[3] = "Conversion";
            MoveTree[23] = "Psybeam";
            MoveTree[28] = "Recover";
            MoveTree[35] = "Agility";
            MoveTree[42] = "Tri Attack";
            type = normal;

        } else if (n == 138) {
            name = "Omanyte";
            evolvelevel = 40;
            evolveform = 139;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/138b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/138.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/138sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/138s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon138.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Water Gun";
            MoveTree[2] = "Withdraw";
            MoveTree[34] = "Horn Attack";
            MoveTree[39] = "Leer";
            MoveTree[44] = "Spike Cannon";
            MoveTree[49] = "Hydro Pump";
            type = rock;

        } else if (n == 139) {
            name = "Omastar";
            evolvelevel = 999;
            evolveform = 139;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/139b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/139.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/139sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/139s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon139.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Water Gun";
            MoveTree[2] = "Withdraw";
            MoveTree[34] = "Horn Attack";
            MoveTree[39] = "Leer";
            MoveTree[46] = "Spike Cannon";
            MoveTree[53] = "Hydro Pump";
            type = rock;

        } else if (n == 140) {
            name = "Kabuto";
            evolvelevel = 40;
            evolveform = 141;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/140b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/140.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/140sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/140s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon140.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[2] = "Harden";
            MoveTree[34] = "Absorb";
            MoveTree[39] = "Slash";
            MoveTree[44] = "Leer";
            MoveTree[49] = "Hydro Pump";
            type = rock;

        } else if (n == 141) {
            name = "Kabutops";
            evolvelevel = 999;
            evolveform = 141;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/141b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/141.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/141sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/141s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon141.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Scratch";
            MoveTree[2] = "Harden";
            MoveTree[34] = "Absorb";
            MoveTree[39] = "Slash";
            MoveTree[46] = "Leer";
            MoveTree[53] = "Hydro Pump";
            type = rock;

        } else if (n == 142) {
            name = "Aerodactyl";
            evolvelevel = 999;
            evolveform = 142;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/142b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/142.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/142sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/142s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon142.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Wing Attack";
            MoveTree[2] = "Agility";
            MoveTree[33] = "Supersonic";
            MoveTree[38] = "Bite";
            MoveTree[45] = "Take Down";
            MoveTree[54] = "Hyper Beam";
            type = flying;

        } else if (n == 143) {
            name = "Snorlax";
            evolvelevel = 999;
            evolveform = 143;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/143b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/143.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/143sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/143s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon143.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Headbutt";
            MoveTree[2] = "Amnesia";
            MoveTree[3] = "Rest";
            MoveTree[35] = "Body Slam";
            MoveTree[41] = "Harden";
            MoveTree[48] = "Double Edge";
            MoveTree[56] = "Hyper Beam";
            type = normal;

        } else if (n == 144) {
            name = "Articuno";
            evolvelevel = 999;
            evolveform = 144;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/144b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/144.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/144sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/144s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon144.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Peck";
            MoveTree[2] = "Ice Beam";
            MoveTree[51] = "Blizzard";
            MoveTree[55] = "Agility";
            MoveTree[60] = "Mist";
            type = ice;

        } else if (n == 145) {
            name = "Zapados";
            evolvelevel = 999;
            evolveform = 145;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/145b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/145.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/145sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/145s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon145.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Thundershock";
            MoveTree[2] = "Drill Peck";
            MoveTree[51] = "Thunder";
            MoveTree[55] = "Agility";
            MoveTree[60] = "Light Screen";
            type = electric;

        } else if (n == 146) {
            name = "Moltres";
            evolvelevel = 999;
            evolveform = 146;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/146b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/146.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/146sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/146s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon146.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Peck";
            MoveTree[2] = "Fire Spin";
            MoveTree[51] = "Leer";
            MoveTree[55] = "Agility";
            MoveTree[60] = "Sky Attack";

            type = fire;

        } else if (n == 147) {
            name = "Dratini";
            evolvelevel = 30;
            evolveform = 148;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/147b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/147.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/147sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/147s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon147.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Wrap";
            MoveTree[2] = "Leer";
            MoveTree[10] = "Thunderwave";
            MoveTree[20] = "Agility";
            MoveTree[30] = "Slam";
            MoveTree[40] = "Dragon Rage";
            MoveTree[50] = "Hyper Beam";
            type = dragon;

        } else if (n == 148) {
            name = "Dragonair";
            evolvelevel = 55;
            evolveform = 149;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/148b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/148.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/148sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/148s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon148.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Wrap";
            MoveTree[2] = "Leer";
            MoveTree[10] = "Thunderwave";
            MoveTree[20] = "Agility";
            MoveTree[35] = "Slam";
            MoveTree[45] = "Dragon Rage";
            MoveTree[55] = "Hyper Beam";
            type = dragon;

        } else if (n == 149) {
            name = "Dragonite";
            evolvelevel = 999;
            evolveform = 149;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/149b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/149.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/149sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/149s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon149.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Wrap";
            MoveTree[2] = "Leer";
            MoveTree[10] = "Thunderwave";
            MoveTree[20] = "Agility";
            MoveTree[35] = "Slam";
            MoveTree[45] = "Dragon Rage";
            MoveTree[55] = "Wing Attack";
            MoveTree[60] = "Hyper Beam";
            type = dragon;

        } else if (n == 150) {
            name = "Mewtwo";
            evolvelevel = 999;
            evolveform = 150;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/150b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/150.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/150sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/150s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon150.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[1] = "Psychic";
            MoveTree[2] = "Recover";
            MoveTree[3] = "Barrier";
            MoveTree[4] = "Psyball";
            type = psychic;

        } else if (n == 151) {
            name = "Lugia";
            evolvelevel = 999;
            evolveform = 151;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/151b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/151.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/151sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/151s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon151.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[10] = "";
            type = psychic;

        } else if (n == 152) {
            name = "Ho-oh";
            evolvelevel = 999;
            evolveform = 152;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/152b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/152.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/152sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/152s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon152.gif");
            hp = 20;
            attack = 14;
            def = 15;
            spd = 14;
            spAttack = 40;
            spDef = 10;
            MoveTree[10] = "";
            type = fire;

        } else if (n == 153) {
            name = "Nyan Cat";
            evolvelevel = 999;
            evolveform = 153;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/153b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/153.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/153sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/153s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon153.gif");
            hp = 150;
            attack = 150;
            def = 100;
            spd = 200;
            spAttack = 200;
            spDef = 150;
            MoveTree[1] = "Annoy";
            MoveTree[2] = "Thunder";
            MoveTree[3] = "Hyper Beam";
            MoveTree[4] = "Confuse";
            MoveTree[45] = "Psybeam";
            MoveTree[50] = "Hydro Pump";
            MoveTree[53] = "Psychic";
            MoveTree[57] = "Fire Blast";
            MoveTree[62] = "Rape";
            MoveTree[74] = "Solarbeam";
            MoveTree[80] = "Swift";
            MoveTree[99] = "Rainbow Squirt";
            type = psychic;
        } else if (n == 154) {
            name = "Pedobear";
            evolvelevel = 999;
            evolveform = 154;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/154b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/154.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/154sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/154s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon154.gif");
            hp = 150;
            attack = 150;
            def = 100;
            spd = 200;
            spAttack = 200;
            spDef = 150;
            MoveTree[1] = "Sleep Powder";
            MoveTree[2] = "Wrap";
            MoveTree[3] = "Rape";
            MoveTree[4] = "Bind";
            MoveTree[45] = "Lick";
            MoveTree[50] = "Molest";
            type = normal;
        } else if (n == 155) {
            name = "Nokia";
            evolvelevel = 999;
            evolveform = 155;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/155b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/155.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/155sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/155s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon155.gif");
            hp = 150;
            attack = 150;
            def = 100;
            spd = 200;
            spAttack = 200;
            spDef = 150;
            MoveTree[1] = "Indestructable";
            type = normal;
        } else if (n == 156) {
            name = "Suicune";
            evolvelevel = 999;
            evolveform = 156;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/156b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/156.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/156sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/156s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon156.gif");
            hp = 150;
            attack = 150;
            def = 100;
            spd = 200;
            spAttack = 200;
            spDef = 150;
            MoveTree[1] = "Mist";
            MoveTree[2] = "Bubblebeam";
            MoveTree[3] = "Agility";
            MoveTree[4] = "Hydro Pump";
            type = psychic;
        } else if (n == 157) {
            name = "Entai";
            evolvelevel = 999;
            evolveform = 157;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/157b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/157.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/157sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/157s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon157.gif");
            hp = 150;
            attack = 150;
            def = 100;
            spd = 200;
            spAttack = 200;
            spDef = 150;
            MoveTree[1] = "Flamethrower";
            MoveTree[2] = "Agility";
            MoveTree[3] = "Fire Spin";
            MoveTree[4] = "Fire Blast";
            type = psychic;
        } else if (n == 158) {
            name = "Raikou";
            evolvelevel = 999;
            evolveform = 158;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/158b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/158.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/158sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/158s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon158.gif");
            hp = 150;
            attack = 150;
            def = 100;
            spd = 200;
            spAttack = 200;
            spDef = 150;
            MoveTree[1] = "Thunderwave";
            MoveTree[2] = "Thunderbolt";
            MoveTree[3] = "Agility";
            MoveTree[4] = "Thunder";
            type = electric;
        } else if (n == 159) {
            name = "Mew";
            evolvelevel = 909;
            evolveform = 159;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/159b.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/159.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/159sb.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/159s.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon159.gif");
            hp = 150;
            attack = 150;
            def = 100;
            spd = 200;
            spAttack = 200;
            spDef = 150;
            MoveTree[1] = "Annoy";
            MoveTree[2] = "Thunder";
            MoveTree[3] = "Hyper Beam";
            MoveTree[4] = "Confuse";
            MoveTree[45] = "Psybeam";
            MoveTree[50] = "Hydro Pump";
            MoveTree[53] = "Psychic";
            MoveTree[57] = "Fire Blast";
            MoveTree[62] = "Rape";
            MoveTree[74] = "Solarbeam";
            MoveTree[80] = "Swift";
            MoveTree[99] = "Rainbow Squirt";
            type = psychic;
        } else {
            name = "MISSINGNO";
            evolvelevel = 999;
            evolveform = 160;
            back_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/160.png");
            front_sprite = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/160.png");
            back_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/160.png");
            front_sprite_s = Toolkit.getDefaultToolkit().createImage("Graphics/Pokemon/160.png");
            party_icon = Toolkit.getDefaultToolkit().createImage("Graphics/Icons/icon160.gif");
            hp = 30;
            attack = 999;
            def = 0;
            spd = 20;
            spAttack = 999;
            spDef = 0;
            MoveTree[1] = "Water Gun";
            MoveTree[2] = "Water Gun";
            MoveTree[3] = "Sky Attack";
            type = flying;
        }
        condition = null;
        curHP = (level * 5) + (hp + TMP_HPbump + hpbump);
        health = curHP;
        curattack = (level * 5) + (attack + TMPattackbump + attackbump);
        curdef = (level * 5) + (def + TMPdeffensebump + deffensebump);
        curspAttack = (level * 5) + (spAttack + TMPspattackbump + spattackbump);
        curspDef = (level * 5) + (spDef + TMPspattackbump + spdeffensebump);
        curspd = (level * 5) + (spd + TMPspeedbump + speedbump);

    }

    public void paint(Graphics g) {
        if (inEvolve) {
            EvoName = name;
            EvoImage = front_sprite;
            tmpMove1 = move1;
            tmpMove2 = move2;
            tmpMove3 = move3;
            tmpMove4 = move4;
            create(number, level);
            g.drawImage(EvolveBG, 0, 0, null);
            g.drawString("" + name + " is Evolving!", 20, 350);
            count++;
            if (count < (modifier / 2)) {
                g.drawImage(EvoImage, 200, 60, null);
            } else {
                g.drawImage(front_sprite, 200, 60, null);
                if (count >= modifier) {
                    count = 0;
                    modifier /= 2;
                }
            }
            if (modifier < 2) {
                Evolved = true;
            }
        }
        if (Evolved) {
            if (!ResetMoves) {
                move1 = tmpMove1;
                move2 = tmpMove2;
                move3 = tmpMove3;
                move4 = tmpMove4;
            }
            modifier = 100;
            g.drawImage(EvolveBG, 0, 0, null);
            g.drawImage(front_sprite, 200, 60, null);
            g.drawString("" + EvoName + " evolved into " + name + "!", 20, 350);
        } else if (inLearnMoveE) {
            g.drawImage(Message, 0, 350, null);
            g.drawString("" + name + " learned " + MoveTree[level] + "!", 25, 350);
        } else if (inLearnMoveH) {
            g.drawImage(Message, 0, 350, null);
            if (next1) {
                g.drawString("Which move should be replaced?", 25, 350);
                g.drawImage(moves, hp, hp, null);
                g.drawString(move1, hp, hp);
                g.drawString(move2, hp, hp);
                g.drawString(move3, hp, hp);
                g.drawString(move4, hp, hp);
            } else if (next2) {
                g.drawString("Delete " + selected + " and replace it with " + MoveTree[level] + "?", 25, 350);
            } else if (next3) {
                g.drawString("Stop learning " + MoveTree[level] + "?", 25, 350);
            } else if (next4) {
                g.drawString("" + name + " did not learn " + MoveTree[level], 25, 350);
            }
            g.drawString("" + name + " is trying to learn " + MoveTree[level] + ", but", 25, 350);
            g.drawString("" + name + " can only learn four moves...", 25, 350);

            g.drawString("Delete a previous move to make room for " + MoveTree[level] + "?", 25, 350);
            g.drawImage(YesNoImage, 300, 300, null);
        } else if (inNewLevelStats) {
            g.drawImage(Message, 0, 350, null);
        }
    }
}