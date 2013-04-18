package pokemonalecversion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JPanel;

//colorization 0.64 0.71 0.76 0.042 0.71
public class PokemonAlecVersion extends JPanel implements KeyListener, ActionListener {

    private boolean noob = true;
    private boolean noBattle = false;
    public boolean radio = false;
    //Event variables
    private boolean Z = false;
    private boolean X = false;
    private boolean UP = false;
    private boolean DOWN = false;
    private boolean LEFT = false;
    private boolean RIGHT = false;
    private javax.swing.Timer gameTimer;
    private int keyCode;
    //JFrame Stuff
    public static JFrame jf;
    public Toolkit tk = jf.getToolkit();
    //Intro Variables
    private Font pokefont = new Font("I dont know what this String is even for?", Font.PLAIN, 18);
    private Font Introfont = new Font("I dont know what this String is even for?", Font.BOLD, 12);
    private Image Explosion;
    private Image Pikachu;
    private boolean PikaScratch = false;
    private Image TitleScreen = tk.createImage(getClass().getResource("Graphics/Intro/TitleScreen.png"));
    private Image PokemonLogo1 = tk.createImage(getClass().getResource("Graphics/Intro/PokemonLogo1.png"));
    private Image PokemonLogo2 = tk.createImage(getClass().getResource("Graphics/Intro/PokemonLogo2.png"));
    private Image PokemonLogo3 = tk.createImage(getClass().getResource("Graphics/Intro/PokemonLogo3.png"));
    private Image PokemonLogo4 = tk.createImage(getClass().getResource("Graphics/Intro/PokemonLogo4.png"));
    private Image PokemonLogo5 = tk.createImage(getClass().getResource("Graphics/Intro/PokemonLogo5.png"));
    private Image PokemonLogo6 = tk.createImage(getClass().getResource("Graphics/Intro/PokemonLogo6.png"));
    private Image LoadIcon1 = tk.createImage(getClass().getResource("Graphics/Intro/loading1.png"));
    private Image LoadIcon2 = tk.createImage(getClass().getResource("Graphics/Intro/loading2.png"));
    private Image LoadIcon3 = tk.createImage(getClass().getResource("Graphics/Intro/loading3.png"));
    private Image LoadIcon4 = tk.createImage(getClass().getResource("Graphics/Intro/loading4.png"));
    private Image Icon = tk.createImage(getClass().getResource("Graphics/Icons/icon025.png"));
    private Image Trees = tk.createImage(getClass().getResource("Graphics/Intro/Trees.png"));
    private Image Bushes = tk.createImage(getClass().getResource("Graphics/Intro/Bushes.png"));
    private Image Grass = tk.createImage(getClass().getResource("Graphics/Intro/Grass.png"));
    private Image PikaRun1 = tk.createImage(getClass().getResource("Graphics/Intro/PikaRun1.png"));
    private Image PikaRun2 = tk.createImage(getClass().getResource("Graphics/Intro/PikaRun2.png"));
    private Image PikaRun3 = tk.createImage(getClass().getResource("Graphics/Intro/PikaRun3.png"));
    private Image PikaRun4 = tk.createImage(getClass().getResource("Graphics/Intro/PikaRun4.png"));
    private Image PikaDance1 = tk.createImage(getClass().getResource("Graphics/Intro/PikaDance1.png"));
    private Image PikaDance2 = tk.createImage(getClass().getResource("Graphics/Intro/PikaDance2.png"));
    private Image PikaDance3 = tk.createImage(getClass().getResource("Graphics/Intro/PikaDance3.png"));
    private Image PikaDance4 = tk.createImage(getClass().getResource("Graphics/Intro/PikaDance4.png"));
    private Image PikaScratch1 = tk.createImage(getClass().getResource("Graphics/Intro/PikaScratch1.png"));
    private Image PikaScratch2 = tk.createImage(getClass().getResource("Graphics/Intro/PikaScratch2.png"));
    private Image PikaScratch3 = tk.createImage(getClass().getResource("Graphics/Intro/PikaScratch3.png"));
    private Image PikaShock1 = tk.createImage(getClass().getResource("Graphics/Intro/PikaShock1.png"));
    private Image PikaShock2 = tk.createImage(getClass().getResource("Graphics/Intro/PikaShock2.png"));
    private Image PikaShock3 = tk.createImage(getClass().getResource("Graphics/Intro/PikaShock3.png"));
    private Image PikaStand = tk.createImage(getClass().getResource("Graphics/Intro/PikaStand.png"));
    private Image PikaSleep = tk.createImage(getClass().getResource("Graphics/Intro/PikaSleep.png"));
    private Image Explosion1 = tk.createImage(getClass().getResource("Graphics/Intro/Explosion1.png"));
    private Image Explosion2 = tk.createImage(getClass().getResource("Graphics/Intro/Explosion2.png"));
    private Image Explosion3 = tk.createImage(getClass().getResource("Graphics/Intro/Explosion3.png"));
    private Image Explosion4 = tk.createImage(getClass().getResource("Graphics/Intro/Explosion4.png"));
    private Image Explosion5 = tk.createImage(getClass().getResource("Graphics/Intro/Explosion5.png"));
    private Image Bolts = tk.createImage(getClass().getResource("Graphics/Intro/Bolts.png"));
    private boolean atTitle = false;
    private boolean inTransition = false;
    private boolean inThunderShock = false;
    private boolean Loading = true;
    private boolean visible = true;
    private boolean continued;
    private short num = 0;
    private short lower = 0;
    private int RunPikaRun = 0;
    private boolean atContinueScreen = false;
    private boolean gamestarted = false;
    private int offsetX = 0, offsetY = 0;
    private byte concurrentMenuItem = 0;
    public double seconds = 0;
    //locational booleans
    private boolean MaysHouse = false;
    public boolean dark = false;
    public double oldTime;
    public double minutes = 0;
    public double hours = 0;
    // Playa Variables
    private String name = "Alec";
    private boolean pickaxe = false;
    private boolean swim = false;
    private boolean machete = false;
    private boolean wave = true;
    private int treeloc1, bushloc1, grassloc1;
    private int treeloc2 = -1023;
    private int bushloc2 = -1023;
    private int grassloc2 = -1023;
    private byte ichyness;
    public Image cardSprite = tk.createImage(getClass().getResource("Graphics/NPCs/Battle/trainer000.png"));
    private Image Down = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Down.png"));
    private Image Down1 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Down1.png"));
    private Image Down2 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Down2.png"));
    private Image FishDown = tk.createImage(getClass().getResource("Graphics/NPCs/Player/FishDown.png"));
    private Image FishLeft = tk.createImage(getClass().getResource("Graphics/NPCs/Player/FishLeft.png"));
    private Image FishRight = tk.createImage(getClass().getResource("Graphics/NPCs/Player/FishRight.png"));
    private Image FishUp = tk.createImage(getClass().getResource("Graphics/NPCs/Player/FishUp.png"));
    private Image Left = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Left.png"));
    private Image Left1 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Left1.png"));
    private Image Left2 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Left2.png"));
    private Image Right = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Right.png"));
    private Image Right1 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Right1.png"));
    private Image Right2 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Right2.png"));
    private Image Up = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Up.png"));
    private Image Up1 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Up1.png"));
    private Image Up2 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/Up2.png"));
    private Image RunDown = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunDown.png"));
    private Image RunDown1 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunDown1.png"));
    private Image RunDown2 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunDown2.png"));
    private Image RunLeft = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunLeft.png"));
    private Image RunLeft1 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunLeft1.png"));
    private Image RunLeft2 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunLeft2.png"));
    private Image RunRight = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunRight.png"));
    private Image RunRight1 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunRight1.png"));
    private Image RunRight2 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunRight2.png"));
    private Image RunUp = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunUp.png"));
    private Image RunUp1 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunUp1.png"));
    private Image RunUp2 = tk.createImage(getClass().getResource("Graphics/NPCs/Player/RunUp2.png"));
    public Playa alec = new Playa(10, 9, name);
    public byte facing = 1;
    public byte lastdir = 1;
    private byte movespritepixels = 0;
    private boolean tryinRun = false;
    private boolean walking = false;
    private boolean running = false;
    private boolean swiming = false;
    private boolean sliding = false;
    private boolean up = false;
    private boolean down = false;
    private boolean left = false;
    private boolean right = false;
    private boolean movable_up = true;
    private boolean movable_down = true;
    private boolean movable_left = true;
    private boolean movable_right = true;
    private boolean talkable = false;
    private boolean disable_talk = true;
    private boolean footsprite = false;
    private short checktile1;
    private short checktile2;
    private String text = "";
    private short posX = 224;
    private short posY = 118;
    private short currentX_loc;
    private short currentY_loc;
    private short posX_tile;
    private short posY_tile;
    private boolean movable = true;
    private static Random gen = new Random();
    private int stepscount = 0;
    public byte badges = 0;
    public int money = 2000;
    public long timePlayed = 0;
    public long currentTime = 0;
    public short[][] PokedexIndex = new short[155][2];
    public Pokemon[] pokedex = new Pokemon[155];
    public Pokemon[] pokemonparty = new Pokemon[6];
    public Pokemon[] enemyparty = new Pokemon[6];
    public Pokemon wildPokemon = new Pokemon();
    public Pokemon TrainerPokemon1 = new Pokemon();
    public Pokemon TrainerPokemon2 = new Pokemon();
    public Pokemon TrainerPokemon3 = new Pokemon();
    public Pokemon TrainerPokemon4 = new Pokemon();
    public Pokemon TrainerPokemon5 = new Pokemon();
    public Pokemon TrainerPokemon6 = new Pokemon();
    public Pokemon first = new Pokemon();
    public Pokemon second = new Pokemon();
    public Pokemon third = new Pokemon();
    public Pokemon fourth = new Pokemon();
    public Pokemon fifth = new Pokemon();
    public Pokemon sixth = new Pokemon();
    public Items[] Potions = new Items[30];
    public Items[] Holdables = new Items[15];
    public Items[] Balls = new Items[5];
    public Items[] Tools = new Items[10];
    private byte potion = 0;
    private byte hold = 0;
    private byte ball = 0;
    private byte tool = 0;
    //storyline variables
    public boolean Follow = false;
    public boolean Badge1 = false;
    public boolean Badge2 = false;
    public boolean Badge3 = false;
    public boolean Badge4 = false;
    public boolean Badge5 = false;
    public boolean Badge6 = false;
    public boolean Badge7 = false;
    public boolean Badge8 = false;
    private int storyline = 0;
    private String MapLoc = "Town1";
    public Items tmpItem;
    // Map Variables
    private Image[] tileset = new Image[1114];
    private short[] impassibleTiles = new short[]{
        3, 4, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 18, 19,
        20, 21, 22, 23, 24,
        40, 41, 42, 48, 49, 50, 51, 52, 56, 58,
        57, 59, 60, 61, 64, 65, 66, 67, 68,
        69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
        81, 82, 83, 84, 86, 87, 88, 89, 90, 91, 92, 93,
        94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104,
        105, 106, 107, 108, 109, 110, 111, 112, 113, 114,
        115, 116, 117, 118, 119, 120, 121, 122, 123, 124,
        125, 126, 127, 128, 129, 130, 131, 132, 134,
        135, 136, 137, 138, 139, 140, 141, 142, 143, 144,
        145, 146, 147, 148, 149, 150, 151, 152, 153, 154,
        155, 156, 157, 158, 159, 160, 161, 162, 163, 164,
        166, 167, 168, 169, 170, 171, 172, 173, 174,
        175, 176, 177, 178, 179, 180, 181, 182, 183, 184,
        185, 186, 187, 188, 189, 190, 191, 192, 193, 194,
        195, 196, 197, 199, 200, 201, 202, 203, 204,
        205, 206, 207, 208, 209, 211, 212, 213, 214,
        215, 216, 218, 219, 220, 221, 222, 223, 224,
        225, 226, 227, 228, 229, 230, 231, 232, 234,
        235, 236, 237, 238, 239, 240, 241, 242, 243, 244,
        245, 246, 247, 248, 249, 251, 252, 253, 256,
        296, 305, 258, 259, 260, 264, 265, 266, 267, 268,
        269, 270, 271, 272, 273, 274, 275, 276, 277, 278,
        279, 326, 328, 329, 330, 331, 334, 335, 336, 337,
        338, 341, 342, 343, 344, 345, 346, 349, 357, 365,
        381, 382, 384, 385, 386, 387, 392, 393, 394, 396,
        397, 398, 400, 401, 402, 403, 404, 405, 406,
        477, 478, 479, 486, 494, 495, 501, 503, 509, 523,
        540, 541, 542, 808, 549, 552, 553, 566, 567,
        568, 574, 575, 578, 579, 581, 582, 583, 586,
        591, 594, 599, 600, 602, 603, 604, 605, 606, 607,
        608, 614, 615, 616, 635, 636, 638, 639, 644, 646,
        647, 651, 717, 718, 725, 726,
        809, 810, 811, 812, 813, 816, 817, 818, 819, 820,
        821, 824, 825, 861, 864, 870, 871, 872, 880, 888,
        890, 896, 914, 922, 728, 729, 730, 731, 732, 733,
        736, 737, 738, 739, 740, 741, 742, 743, 746, 770,
        771, 772, 773, 774, 775, 798, 762, 764, 765, 769,
        515, 512, 520, 521, 528, 529};
    private short[] Layer1 = new short[57000];
    private short[] Layer2 = new short[57000];
    private short[] Layer3 = new short[57000];
    private ArrayList<Tiles> ImpassibleMapTiles = new ArrayList<Tiles>();
    private ArrayList<Tiles> ImpassibleMapTiles_withSwim = new ArrayList<Tiles>();
    private short MaxMapX = 227;
    private short MaxMapY = 246;
    private short x_coor = 0;
    private short y_coor = 0;
    private int tile_number = 0;
    //NPC Action Number Standardiser
    private String curMayText = "Hey " + name + "!";
    private boolean MayFollow = true;
    private byte Using = 0;
    private byte Walky = 1;
    private byte Spiner = 2;
    private byte Stander = 3;
    private byte Stalker = 4;
    private byte SpiningBattler = 5;
    private byte Camper = 6;
    private byte FriendlyBattler = 7;
    private byte Pokemon = 8;
    private byte BattleAblePokemon = 20;
    private byte mayster = 10;
    private byte FindableItem = 11;
    private byte sign = 12;
    private byte Tree = 13;
    private byte SmashRock = 14;
    private byte Healer = 15;
    private byte bouncer;
    private String Bridge1 = "Graphics/Pictures/Bridge1";
    private String Bridge2 = "Graphics/Pictures/Bridge2";
    private String Bridge3 = "Graphics/Pictures/Bridge3";
    private String Bridge4 = "Graphics/Pictures/Bridge4";
    private String Bridge5 = "Graphics/Pictures/Bridge5";
    private String Bridge6 = "Graphics/Pictures/Bridge6";
    private String signPic = "Graphics/Objects/Sign";
    private String sign2Pic = "Graphics/Objects/Sign2";
    private String itemballPic = "Graphics/Objects/ItemBall";
    private String CutableTreePic = "Graphics/Objects/CutableShrub";
    private String SmashablePic = "Graphics/Objects/BreakableRock";
    private String BoulderPic = "Graphics/Objects/Boulder";
    private boolean button1 = false;
    private boolean button2 = false;
    private boolean button4 = false;
    private boolean button5 = false;
    private boolean button6 = false;
    private boolean button7 = false;
    // NPC's
    //Overworld NPCs
    private NPC May = new NPC(7, 153, "May", curMayText, "Graphics/NPCs/NPC/May", null, null, mayster);
    private NPC NurseLookGood = new NPC(36, 166, "Nurse Joy", "Its wierd not being in every PokeCenter at once.", "Graphics/NPCs/NPC/NurseJoy", null, null, Stander);
    private NPC NurseJoy = new NPC(36, 167, "Nurse Joy", "Ima gonna heala your pokomona", null, null, null, Healer);
    private NPC CashierLookGood = new NPC(48, 153, "Fake", "How did you get back here!?!?!", "Graphics/NPCs/NPC/BusinessMan", null, null, Stander);
    private NPC CashierReal = new NPC(49, 153, "Cashier", "What would you like to buy?", null, null, null, Stander);
    //Town1
    private NPC Women = new NPC(187, 114, "Mary", "I love this town it is so quaint.", "Graphics/NPCs/NPC/NiceGirl", null, null, Walky);
    private NPC Mom = new NPC(17, 154, "Mom", "Your dad is soooo hot.", "Graphics/NPCs/NPC/olRedEyes", null, null, Walky);
    private NPC kid = new NPC(71, 155, "Josh", "Pokemon scare me", "Graphics/NPCs/NPC/BowGirl", null, null, Walky);
    private NPC Women2 = new NPC(67, 154, "Lisa", "My kids a pussy.", "Graphics/NPCs/NPC/JeansGirl", null, null, Spiner);
    private NPC Oak = new NPC(145, 154, "Oak", "Get the fuck out you thief!", "Graphics/NPCs/NPC/Scientist", null, null, Walky);
    private NPC labAssistent = new NPC(144, 160, "Larry", "I have a Phd in Pokemon Anatomy.", "Graphics/NPCs/NPC/Scientist", null, null, Walky);
    private NPC MaysMom = new NPC(19, 154, "Barbra", "I'm May's lucious mother.", "Graphics/NPCs/NPC/Curls", null, null, Walky);
    private NPC MaysDad = new NPC(22, 154, "Randy", "Don't you rape my daughter on your travels!", "Graphics/NPCs/NPC/DarkMan", null, null, Walky);
    private NPC squirtle = new NPC(149, 153, "Squirtle", "Steal the WATER Pokemon Squirtle?", itemballPic, null, null, FindableItem);
    private NPC charmander = new NPC(150, 153, "Charmander", "Steal the FIRE pokemon Charmander? ", itemballPic, null, null, FindableItem);
    private NPC bulbasuar = new NPC(151, 153, "Bulbasaur", "Steal the GRASS pokemon Bulbasaur?", itemballPic, null, null, FindableItem);
    private NPC Sign1 = new NPC(81, 102, "Sign", "" + name + "'s House", signPic, null, null, sign);
    private NPC Sign2 = new NPC(81, 102, "Sign", "May's House", signPic, null, null, sign);
    private NPC Sign3 = new NPC(81, 102, "Sign", "Welcom to Pallet Town!", signPic, null, null, sign);
    private NPC Sign4 = new NPC(81, 102, "Sign", "Professor Oaks's Labratory", signPic, null, null, sign);
    //Route1
    private NPC BugCather1 = new NPC(166, 125, "Bug Catcher Sam", "Wana battle my shity bug pokemon?", "Graphics/NPCs/NPC/BugCatcher", cardSprite, "You're just too good for me.", FriendlyBattler);
    private NPC BugCather2 = new NPC(146, 116, "Bug Catcher Dave", "My Bug Pokemon are unstoppable!", "Graphics/NPCs/NPC/BugCatcher", cardSprite, "I'll keep training till I'm as good as you.", FriendlyBattler);
    private NPC BugCather3 = new NPC(137, 113, "Bug Catcher Joe", "Caterpie is probably the best Pokemon there is.", "Graphics/NPCs/NPC/BugCatcher", cardSprite, "Awwhh! My Caterpie just shit on me!", FriendlyBattler);
    private NPC CutableTree1 = new NPC(122, 121, null, "This small tree can be easily cut down.", CutableTreePic, null, null, Tree);
    private NPC CutableTree2 = new NPC(123, 121, null, "This small tree can be easily cut down.", CutableTreePic, null, null, Tree);
    private NPC CutableTree3 = new NPC(123, 122, null, "This small tree can be easily cut down.", CutableTreePic, null, null, Tree);
    private NPC CutableTree4 = new NPC(124, 122, null, "This small tree can be easily cut down.", CutableTreePic, null, null, Tree);
    //Town2 
    private NPC GymLeader1 = new NPC(2, 191, "Herpa", "Beating my GRASS pokemon is impossibru!!!", "Graphics/NPCs/NPC/GymLeader1_", null, null, Stander);
    private NPC GrassGirl1 = new NPC(3, 194, "Betty", "I love my Bellsprout soooo much!", "Graphics/NPCs/NPC/GreenWomen", null, null, SpiningBattler);
    private NPC GrassGirl2 = new NPC(9, 192, "Sopia", "This one time I was about to finally.. Nevermind lets battle!", "Graphics/NPCs/NPC/GreenWomen", null, null, SpiningBattler);
    private NPC GrassGirl3 = new NPC(15, 196, "Helen", "I'm into grass pokemon for the great weed they grow.", "Graphics/NPCs/NPC/GreenWomen", null, null, SpiningBattler);
    private NPC GrassGirl4 = new NPC(16, 191, "Zoey", "I love training grass pokemon", "Graphics/NPCs/NPC/GreenWomen", null, null, Stalker);
    private NPC OldMan = new NPC(40, 169, "Ol'Jim", "Nurse Joy can heal your pokemon if they get hurt.", "Graphics/NPCs/NPC/OldMan", null, null, Walky);
    private NPC TagKid = new NPC(103, 116, "David", "I'm playing tag! Get Out Da Way Bitches!", "Graphics/NPCs/NPC/FutureLesbo", null, null, Using);
    private NPC IT = new NPC(103, 111, "John", "I'm it!", "Graphics/NPCs/NPC/Girl", null, null, Using);
    private NPC PORPLE = new NPC(53, 157, "John", "PORPLE!!!!!!!", "Graphics/NPCs/NPC/PORPLE", null, null, Stander);
    //Route2
    private NPC Trainer1 = new NPC(106, 103, "Gypsy Slayer", "I'ma fight yah with me pokomonas. GO!", "Graphics/NPCs/NPC/PORPLE", null, null, Stalker);
    private NPC Trainer2 = new NPC(114, 100, "Gaylord Fagston", "I just didnt do because the people the people they're comming!!!", "Graphics/NPCs/NPC/PORPLE", null, null, FriendlyBattler);
    private NPC Trainer3 = new NPC(113, 86, "Peter Griffin's left nut", "If water melons were people... mahahahahah!", "Graphics/NPCs/NPC/PORPLE", null, null, FriendlyBattler);
    private NPC Trainer4 = new NPC(111, 77, "John Campbel", "I havn't seen her since the last time", "Graphics/NPCs/NPC/PORPLE", null, null, SpiningBattler);
    private NPC Trainer5 = new NPC(116, 71, "Shawn Korby", "I'm sooooooooo straight i shit rainbows", "Graphics/NPCs/NPC/PORPLE", null, null, Stalker);
    //Town3
    //Pokemon NPCs
    private NPC NyanCat = new NPC(1, 1, "Pokemon", "Meow me menenen Meow meow meow!", "Graphics/Icons/icon153.gif", null, null, BattleAblePokemon);
    private NPC Zapidos = new NPC(4, 220, "Pokemon", "KaaaZap!", "Graphics/Icons/icon145.gif", null, null, BattleAblePokemon);
    private NPC Articuno = new NPC(111, 236, "Pokemon", "KaHoooo!", "Graphics/Icons/icon144.gif", null, null, BattleAblePokemon);
    private NPC Ho_oh = new NPC(1, 1, "Pokemon", "Kaayooo!", "Graphics/Icons/icon152.gif", null, null, BattleAblePokemon);
    private NPC Lugia = new NPC(1, 1, "Pokemon", "Beenanina!", "Graphics/Icons/icon151.gif", null, null, BattleAblePokemon);
    private NPC MewTwo = new NPC(1, 1, "Pokemon", "Ready to get fucked up?", "Graphics/Icons/icon150.gif", null, null, BattleAblePokemon);
    //smashable Rocks
    private NPC Smashable1 = new NPC(83, 102, null, "This rock looks like could be smashed.", SmashablePic, null, null, 31);
    //Boulders
    //private NPC Boulder1 = new NPC(1, 1, null, "This rock can be pushed around.", BoulderPic, null, null, 33);
    //itemballs
    private NPC ItemBall1 = new NPC(79, 102, "1", "You found a Potion!", itemballPic, null, null, FindableItem);
    //Moltras Cave Barriers
    private NPC Moltras = new NPC(88, 239, "Pokemon", "KaaawYoooo!", "Graphics/Icons/icon146.gif", null, null, BattleAblePokemon);
    private NPC Barrier1 = new NPC(60, 234, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier2 = new NPC(61, 234, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier3 = new NPC(62, 234, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier4 = new NPC(63, 234, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier5 = new NPC(60, 238, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier6 = new NPC(61, 238, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier7 = new NPC(62, 238, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier8 = new NPC(63, 238, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier9 = new NPC(66, 227, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier10 = new NPC(66, 228, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier11 = new NPC(66, 229, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier12 = new NPC(69, 227, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier13 = new NPC(69, 228, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier14 = new NPC(69, 229, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier15 = new NPC(82, 221, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier16 = new NPC(83, 221, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier17 = new NPC(84, 221, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier18 = new NPC(85, 221, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier19 = new NPC(82, 224, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier20 = new NPC(83, 224, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier21 = new NPC(84, 224, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier22 = new NPC(85, 224, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier23 = new NPC(79, 217, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier24 = new NPC(79, 218, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier25 = new NPC(70, 217, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier26 = new NPC(70, 218, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier27 = new NPC(71, 230, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier28 = new NPC(72, 230, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier29 = new NPC(73, 230, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier30 = new NPC(74, 230, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier31 = new NPC(71, 234, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier32 = new NPC(72, 234, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier33 = new NPC(73, 234, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier34 = new NPC(74, 234, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier35 = new NPC(85, 233, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier36 = new NPC(86, 233, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier37 = new NPC(87, 233, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier38 = new NPC(85, 237, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier39 = new NPC(86, 237, "Invisible Wall", null, null, null, null, 50);
    private NPC Barrier40 = new NPC(87, 237, "Invisible Wall", null, null, null, null, 50);
    //Moltras Cave Buttons
    private NPC Button1 = new NPC(63, 240, "Button", "*Pushed Strange Button.", null, null, null, 51);
    private NPC Button2 = new NPC(60, 229, "Button", "*Pushed Strange Button.", null, null, null, 52);
    private NPC Button3 = new NPC(72, 225, "Button", "*Pushed Strange Button.", null, null, null, 53);
    private NPC Button4 = new NPC(85, 227, "Button", "*Pushed Strange Button.", null, null, null, 54);
    private NPC Button5 = new NPC(80, 215, "Button", "*Pushed Strange Button.", null, null, null, 55);
    private NPC Button6 = new NPC(63, 217, "Button", "*Pushed Strange Button.", null, null, null, 56);
    private NPC Button7 = new NPC(78, 237, "Button", "*Pushed Strange Button.", null, null, null, 57);
    private NPC Button8 = new NPC(90, 239, "Button", "*Pushed Strange Button.", null, null, null, 58);
    //Moltras Cave Bridges
    private NPC bridge1 = new NPC(66, 227, "Invisible Wall", null, Bridge1, null, null, 59);
    private NPC bridge2 = new NPC(60, 234, "Invisible Wall", null, Bridge2, null, null, 59);
    private NPC bridge3 = new NPC(71, 230, "Invisible Wall", null, Bridge3, null, null, 59);
    private NPC bridge4 = new NPC(85, 233, "Invisible Wall", null, Bridge4, null, null, 59);
    private NPC bridge5 = new NPC(82, 221, "Invisible Wall", null, Bridge5, null, null, 59);
    private NPC bridge6 = new NPC(70, 217, "Invisible Wall", null, Bridge6, null, null, 59);
    //NPC Arrays
    private NPC[] currentMapNPC;
    private NPC[] Town1NPCs = new NPC[]{
        Women,
        Mom,
        kid,
        Women2,
        Oak,
        labAssistent,
        MaysMom,
        MaysDad,
        squirtle,
        charmander,
        bulbasuar,};
    private NPC[] Town2NPCs = new NPC[]{
        NurseJoy,
        NurseLookGood,
        PORPLE,
        CashierLookGood,
        CashierReal,
        OldMan,
        TagKid,
        IT,
        CutableTree1,
        CutableTree2,
        CutableTree3,
        CutableTree4,};
    private NPC[] Town3NPCs = new NPC[]{};
    private NPC[] Town4NPCs = new NPC[]{};
    private NPC[] Town5NPCs = new NPC[]{};
    private NPC[] Town6NPCs = new NPC[]{};
    private NPC[] Town7NPCs = new NPC[]{};
    private NPC[] Town8NPCs = new NPC[]{};
    private NPC[] Route1NPCs = new NPC[]{
        BugCather1,
        BugCather2,
        BugCather3,
        Women,
        CutableTree1,
        CutableTree2,
        CutableTree3,
        CutableTree4,};
    private NPC[] Route2NPCs = new NPC[]{};
    private NPC[] Route3NPCs = new NPC[]{};
    private NPC[] Route4NPCs = new NPC[]{};
    private NPC[] Route5NPCs = new NPC[]{};
    private NPC[] Route6NPCs = new NPC[]{};
    private NPC[] BeachNPCs = new NPC[]{};
    private NPC[] MtNPCs = new NPC[]{};
    private NPC[] HoohNPCs = new NPC[]{};
    private NPC[] IslandsNPCs = new NPC[]{
        Moltras,
        Articuno,
        Zapidos,
        Barrier1,
        Barrier2,
        Barrier3,
        Barrier4,
        Barrier5,
        Barrier6,
        Barrier7,
        Barrier8,
        Barrier9,
        Barrier10,
        Barrier11,
        Barrier12,
        Barrier13,
        Barrier14,
        Barrier15,
        Barrier16,
        Barrier17,
        Barrier18,
        Barrier19,
        Barrier20,
        Barrier21,
        Barrier22,
        Barrier23,
        Barrier24,
        Barrier25,
        Barrier26,
        Barrier27,
        Barrier28,
        Barrier29,
        Barrier30,
        Barrier31,
        Barrier32,
        Barrier33,
        Barrier34,
        Barrier35,
        Barrier36,
        Barrier37,
        Barrier38,
        Barrier39,
        Barrier40,
        Button1,
        Button2,
        Button3,
        Button4,
        Button5,
        Button6,
        Button7,
        Button8,
        bridge1,
        bridge2,
        bridge3,
        bridge4,
        bridge5,
        bridge6,};
    private NPC[] LakeNPCs = new NPC[]{};
    private NPC[] WorkCampNPCs = new NPC[]{};
    private NPC[] CastleCourtYardNPCs = new NPC[]{};
    private NPC[] CastleNPCs = new NPC[]{};
    private NPC[] MewTwoNPCs = new NPC[]{};
    // Battle Variables
    public String TrainerName;
    public boolean enemysturn = false;
    public Pokemon trainerparty[] = new Pokemon[6];
    public Battle Battle;
    public boolean inBattle = false;
    private int r;
    private byte rndwildmodify = 15;
    private byte enemylvl;
    // Menu Variables
    private Menus menu;
    private boolean boobs = false;
    private boolean nigglet = false;
    private int nig = 0;
    private boolean SelectedFirstPokemon = false;
    private boolean SelectingPokemon = false;
    private boolean MaysFirst = false;
    public boolean inDialog = false;
    private boolean inQuestion = false;
    private byte curYesNoSelect = 0;
    private boolean yes = false;
    public boolean next = false;
    public boolean inMenu = false;
    private Image arrow = tk.createImage(getClass().getResource("Graphics/Pictures/Arrow.png"));
    private Image messagebox = tk.createImage(getClass().getResource("Graphics/Pictures/Message_Text.png"));
    private Image YesNo = tk.createImage(getClass().getResource("Graphics/Pictures/YesNo.png"));
    private Image SelectingPokemonFrame = tk.createImage(getClass().getResource("Graphics/Pictures/BattleMoveStatsBox.png"));
    // Sound Variables
    public MidiPlayer currentBGM;
    public MidiPlayer lastBGM;
    public boolean changeBGM = false;
    private MidiPlayer Morowind = new MidiPlayer("Music/BGM/main.mid", true);
    private MidiPlayer DarkWorld = new MidiPlayer("Music/BGM/DarkWorld.mid", true);
    private MidiPlayer MayTheme = new MidiPlayer("Music/BGM/MayTheme.mid", true);
    private MidiPlayer MaySad = new MidiPlayer("Music/BGM/May.mid", true);
    private MidiPlayer Guy = new MidiPlayer("Music/BGM/ProfessorOak.mid", true);
    private MidiPlayer Mobster = new MidiPlayer("Music/BGM/mobencounter.mid", true);
    private MidiPlayer BroTheme = new MidiPlayer("Music/BGM/Rival.mid", true);
    private MidiPlayer Town1 = new MidiPlayer("Music/BGM/NewBarkTown.mid", true);
    private MidiPlayer Town2 = new MidiPlayer("Music/BGM/VioletCity.mid", true);
    private MidiPlayer Town3 = new MidiPlayer("Music/BGM/ceruleancity.mid", true);
    private MidiPlayer Town4 = new MidiPlayer("Music/BGM/vermilioncity.mid", true);
    private MidiPlayer Town5 = new MidiPlayer("Music/BGM/woodstown.mid", true);
    private MidiPlayer Town6 = new MidiPlayer("Music/BGM/CherrygroveCity.mid", true);
    private MidiPlayer Town7 = new MidiPlayer("Music/BGM/azaleatown.mid", true);
    private MidiPlayer Town8 = new MidiPlayer("Music/BGM/viridiancity.mid", true);
    private MidiPlayer route1 = new MidiPlayer("Music/BGM/Route1.mid", true);
    private MidiPlayer route2 = new MidiPlayer("Music/BGM/route2.mid", true);
    private MidiPlayer route3 = new MidiPlayer("Music/BGM/Route30.mid", true);
    private MidiPlayer route4 = new MidiPlayer("Music/BGM/Route29.mid", true);
    private MidiPlayer route5 = new MidiPlayer("Music/BGM/Route30.mid", true);
    private MidiPlayer route6 = new MidiPlayer("Music/BGM/Route27.mid", true);
    private MidiPlayer songofstorms = new MidiPlayer("Music/BGM/RandomHouse.mid", true);
    private MidiPlayer Lab = new MidiPlayer("Music/BGM/Route29.mid", true);
    private MidiPlayer MobHQ = new MidiPlayer("Music/BGM/MobHQ.mid", true);
    private MidiPlayer secretbase = new MidiPlayer("Music/BGM/sbase.mid", true);
    private MidiPlayer secretbaseV = new MidiPlayer("Music/BGM/sbaseV.mid", true);
    private MidiPlayer Beach = new MidiPlayer("Music/BGM/Route29.mid", true);
    private MidiPlayer forest = new MidiPlayer("Music/BGM/forest.mid", true);
    private MidiPlayer HoohMt = new MidiPlayer("Music/BGM/unioncave.mid", true);
    private MidiPlayer Mt = new MidiPlayer("Music/BGM/Route29.mid", true);
    private MidiPlayer BurnedTower = new MidiPlayer("Music/BGM/burnedtower.mid", true);
    private MidiPlayer HoohTower = new MidiPlayer("Music/BGM/HoohTower", true);
    private MidiPlayer NyanTower = new MidiPlayer("Music/BGM/NyanTower.mid", true);
    private MidiPlayer IceCave = new MidiPlayer("Music/BGM/IceCave.mid", true);
    private MidiPlayer MoltrasCave = new MidiPlayer("Music/BGM/Cave.mid", true);
    private MidiPlayer ZapidosCave = new MidiPlayer("Music/BGM/cinnabarmansion.mid", true);
    private MidiPlayer ArticunoCave = new MidiPlayer("Music/BGM/IceCave.mid", true);
    private MidiPlayer LugiaCave = new MidiPlayer("Music/BGM/unioncave.mid", true);
    private MidiPlayer HoohCave = new MidiPlayer("Music/BGM/unioncave.mid", true);
    private MidiPlayer Lake = new MidiPlayer("Music/BGM/RandomHouse.mid", true);
    private MidiPlayer MewTwoArea = new MidiPlayer("Music/BGM/unioncave.mid", true);
    private MidiPlayer Castle = new MidiPlayer("Music/BGM/CastleInside.mid", true);
    private MidiPlayer WorkCamp = new MidiPlayer("Music/BGM/May.mid", true);
    private MidiPlayer Islands = new MidiPlayer("Music/BGM/unioncave.mid", true);
    private MidiPlayer Surfing = new MidiPlayer("Music/BGM/surf.mid", true);
    private MidiPlayer CastleCourtyard = new MidiPlayer("Music/BGM/CastleCourtyard.mid", true);
    private MidiPlayer pokecenter = new MidiPlayer("Music/BGM/PokemonCenter.mid", true);
    private MidiPlayer pokemart = new MidiPlayer("Music/BGM/PokeMart.mid", true);
    private MidiPlayer gym = new MidiPlayer("Music/BGM/Gym.mid", true);
    private MidiPlayer brobattle = new MidiPlayer("Music/BGM/RivalBattle.mid", true);
    private MidiPlayer championbattle = new MidiPlayer("Music/BGM/ChampionBattle.mid", true);
    private MidiPlayer trainerbattle = new MidiPlayer("Music/BGM/TrainerBattle.mid", true);
    private MidiPlayer wildbattle = new MidiPlayer("Music/BGM/WildBattle.mid", true);
    private MidiPlayer nyanbattle = new MidiPlayer("Music/BGM/NyanCat", true);
    private MidiPlayer legendarybirdbattle = new MidiPlayer("Music/BGM/legendarybirdbattle.mid", true);
    private MidiPlayer lugiaHoohbattle = new MidiPlayer("Music/BGM/Hooh-LugiaBattle.mid", true);
    private MidiPlayer mewtwobattle = new MidiPlayer("Music/BGM/MewTwoBattle.mid", true);
    private MidiPlayer victoryjingle = new MidiPlayer("Music/BGM/Wild_Victory.mid", true);
    private MidiPlayer healing = new MidiPlayer("Music/BGM/Healer.mid", true);
    public JukeBox SE = new JukeBox();

    public PokemonAlecVersion() {
        menu = new Menus(this);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(480, 320));
        addKeyListener(this);
        gameTimer = new javax.swing.Timer(100, this);
        gameTimer.start();
    }

    // ActionListener
    public void actionPerformed(ActionEvent e) {
        currentTime = java.lang.System.currentTimeMillis();
        if (gamestarted) {
            seconds = (currentTime - timePlayed) / 1000;
            alec.setCurrentX(posX_tile);
            alec.setCurrentY(posY_tile);
            if (facing == 4) {
                if (running) {
                    alec.setSprite(RunRight);
                } else {
                    alec.setSprite(Right);
                }
            } else if (facing == 3) {
                if (running) {
                    alec.setSprite(RunLeft);
                } else {
                    alec.setSprite(Left);
                }
            } else if (facing == 1) {
                if (running) {
                    alec.setSprite(RunUp);
                } else {
                    alec.setSprite(Up);
                }
            } else if (facing == 2) {
                if (running) {
                    alec.setSprite(RunDown);
                } else {
                    alec.setSprite(Down);
                }
            }
            //Player Crashtesting with NPC's 
            movable_up = true;
            movable_down = true;
            movable_left = true;
            movable_right = true;
            nigglet = false;
            boobs = false;
            if (!walking) {
                if (tryinRun) {
                    running = true;
                } else {
                    running = false;
                }
            }
            if ("Town2".equals(MapLoc)) {
                TagKid.setWalking(true);
                if (TagKid.loc_x == 103 && TagKid.loc_y == 117) {
                    TagKid.setDirection(4);
                } else if (TagKid.loc_x == 111 && TagKid.loc_y == 117) {
                    TagKid.setDirection(2);
                } else if (TagKid.loc_x == 111 && TagKid.loc_y == 121) {
                    TagKid.setDirection(3);
                } else if (TagKid.loc_x == 87 && TagKid.loc_y == 121) {
                    TagKid.setDirection(1);
                } else if (TagKid.loc_x == 87 && TagKid.loc_y == 117) {
                    TagKid.setDirection(4);
                } else if (TagKid.loc_x == 91 && TagKid.loc_y == 117) {
                    TagKid.setDirection(2);
                } else if (TagKid.loc_x == 91 && TagKid.loc_y == 119) {
                    TagKid.setDirection(4);
                } else if (TagKid.loc_x == 103 && TagKid.loc_y == 119) {
                    TagKid.setDirection(1);
                }
                TagKid.Move();
                TagKid.setWalking(true);
                IT.setWalking(true);
                if (IT.loc_x == 103 && IT.loc_y == 117) {
                    IT.setDirection(4);
                } else if (IT.loc_x == 111 && IT.loc_y == 117) {
                    IT.setDirection(2);
                } else if (IT.loc_x == 111 && IT.loc_y == 121) {
                    IT.setDirection(3);
                } else if (IT.loc_x == 87 && IT.loc_y == 121) {
                    IT.setDirection(1);
                } else if (IT.loc_x == 87 && IT.loc_y == 117) {
                    IT.setDirection(4);
                } else if (IT.loc_x == 91 && IT.loc_y == 117) {
                    IT.setDirection(2);
                } else if (IT.loc_x == 91 && IT.loc_y == 119) {
                    IT.setDirection(4);
                } else if (IT.loc_x == 103 && IT.loc_y == 119) {
                    IT.setDirection(1);
                }
                IT.Move();
                IT.setWalking(true);
            }
            for (int i = 0; i < currentMapNPC.length; i++) {
                if (currentMapNPC[i].getActionNum() < 10) {
                    currentMapNPC[i].crashTest(alec);
                    for (Tiles t : ImpassibleMapTiles) {
                        currentMapNPC[i].crashTest(t);
                    }
                    for (int z = 0; z < currentMapNPC.length; z++) {
                        if (z != i) {
                            currentMapNPC[i].crashTest(currentMapNPC[z]);
                        }
                    }
                    if (currentMapNPC[i].getActionNum() != Stander && currentMapNPC[i].getActionNum() != Camper) {
                        currentMapNPC[i].Move();
                        currentMapNPC[i].reset();
                    }
                    if (!inDialog) {
                        currentMapNPC[i].talking = false;
                    }
                }
                if (alec.crashTest(currentMapNPC[i]) == 1) {
                    movable_up = false;
                    if (facing == 1) {
                        nigglet = true;
                        nig = i;
                        disable_talk = false;
                    }
                } else if (alec.crashTest(currentMapNPC[i]) == 2) {
                    movable_down = false;
                    if (facing == 2) {
                        nigglet = true;
                        nig = i;
                        disable_talk = false;
                    }

                } else if (alec.crashTest(currentMapNPC[i]) == 3) {
                    movable_left = false;
                    if (facing == 3) {
                        nigglet = true;
                        nig = i;
                        disable_talk = false;
                    }
                } else if (alec.crashTest(currentMapNPC[i]) == 4) {
                    movable_right = false;
                    if (facing == 4) {
                        nigglet = true;
                        nig = i;
                        disable_talk = false;
                    }
                }
            }
            //Crashtesting with May
            if (alec.crashTest(May) == 1) {
                movable_up = false;
                if (facing == 1) {
                    nigglet = true;
                    boobs = true;
                    disable_talk = false;
                }
            } else if (alec.crashTest(May) == 2) {
                movable_down = false;
                if (facing == 2) {
                    boobs = true;
                    nigglet = true;
                    disable_talk = false;
                }

            } else if (alec.crashTest(May) == 3) {
                movable_left = false;
                if (facing == 3) {
                    boobs = true;
                    nigglet = true;
                    disable_talk = false;
                }
            } else if (alec.crashTest(May) == 4) {
                movable_right = false;
                if (facing == 4) {
                    boobs = true;
                    nigglet = true;
                    disable_talk = false;
                }
            }
            //May Crashtesting
            May.crashTest(alec);
            for (Tiles t : ImpassibleMapTiles) {
                May.crashTest(t);
            }
            for (int z = 0; z < currentMapNPC.length; z++) {
                May.crashTest(currentMapNPC[z]);
            }
            if (MayFollow) {
                May.follow(alec, facing);
                May.Running(running);
            }
            May.Move();
            May.reset();
            //Crashtesting with Inpassible Tiles
            checktile();
            if (!swim) {
                for (Tiles t : ImpassibleMapTiles) {
                    if (alec.crashTest(t) == 1) {
                        movable_up = false;
                    }
                    if (alec.crashTest(t) == 2) {
                        movable_down = false;
                    }
                    if (alec.crashTest(t) == 3) {
                        movable_left = false;
                    }
                    if (alec.crashTest(t) == 4) {
                        movable_right = false;
                    }
                }
            } else {
                for (Tiles t : ImpassibleMapTiles_withSwim) {
                    if (alec.crashTest(t) == 1) {
                        movable_up = false;
                    }
                    if (alec.crashTest(t) == 2) {
                        movable_down = false;
                    }
                    if (alec.crashTest(t) == 3) {
                        movable_left = false;
                    }
                    if (alec.crashTest(t) == 4) {
                        movable_right = false;
                    }
                }
            }
            if (keyCode != 0) {
                if (UP || keyCode == 38) {
                    UP = true;
                    UP();
                    if (inMenu || inBattle) {
                        keyCode = 0;
                        UP = !UP;
                    }
                } else if (DOWN || keyCode == 40) {
                    DOWN = true;
                    DOWN();
                    if (inMenu || inBattle) {
                        keyCode = 0;
                        DOWN = !DOWN;
                    }
                } else if (LEFT || keyCode == 37) {
                    LEFT = true;
                    LEFT();
                    if (inMenu || inBattle) {
                        keyCode = 0;
                        LEFT = !LEFT;
                    }
                } else if (RIGHT || keyCode == 39) {
                    RIGHT = true;
                    RIGHT();
                    if (inMenu || inBattle) {
                        keyCode = 0;
                        RIGHT = !RIGHT;
                    }
                } else if (keyCode == 32) {
                    SPACE();
                } else if (keyCode == 10) {
                    ENTER();
                } else if (keyCode == 90) {
                    Z();
                    keyCode = 0;
                } else if (keyCode == 88) {
                    X();
                    keyCode = 0;
                }
                if (keyCode == KeyEvent.VK_Z) {
                    Z = !Z;
                    if (Z) {
                        keyCode = 0;
                    }
                } else if (X && keyCode == KeyEvent.VK_X) {
                    X = !X;
                    if (X) {
                        keyCode = 0;
                    }
                }
                if (inMenu || inBattle) {
                    if (UP && keyCode == KeyEvent.VK_UP) {
                        keyCode = 0;
                        UP = true;
                    } else if (DOWN && keyCode == KeyEvent.VK_DOWN) {
                        keyCode = 0;
                        DOWN = true;
                    } else if (LEFT && keyCode == KeyEvent.VK_LEFT) {
                        keyCode = 0;
                        LEFT = true;
                    } else if (RIGHT && keyCode == KeyEvent.VK_RIGHT) {
                        keyCode = 0;
                        RIGHT = true;
                    }
                }
            }
            //Movement Scrolling
            if (running && walking) {
                talkable = false;
                movespritepixels += 2;
                if ((up && movable_up) || (up && (movespritepixels > 1))) {
                    offsetY += 4;
                }
                if ((down && movable_down) || (down && (movespritepixels > 1))) {
                    offsetY -= 4;
                }
                if ((left && movable_left) || (left && (movespritepixels > 1))) {
                    offsetX += 4;
                }
                if ((right && movable_right) || (right && (movespritepixels > 1))) {
                    offsetX -= 4;
                }
            } else if (walking) {
                movespritepixels++;
                talkable = false;
                if ((up && movable_up) || (up && (movespritepixels > 1))) {
                    offsetY += 2;
                }
                if ((down && movable_down) || (down && (movespritepixels > 1))) {
                    offsetY -= 2;
                }
                if ((left && movable_left) || (left && (movespritepixels > 1))) {
                    offsetX += 2;
                }
                if ((right && movable_right) || (right && (movespritepixels > 1))) {
                    offsetX -= 2;
                }
            }
            if (!sliding) {
                if ((up && movable_up) || (up && (movespritepixels > 1))) {
                    if (movespritepixels >= 0 && movespritepixels < 4) {
                        bouncer = 2;
                        if (running) {
                            alec.setSprite(RunUp);
                        } else {
                            alec.setSprite(Up);
                        }
                    } else if (movespritepixels >= 4 && movespritepixels < 8) {
                        if (running) {
                            alec.setSprite(RunUp);
                        } else {
                            alec.setSprite(Up);
                        }
                    } else if (movespritepixels >= 8 && movespritepixels < 12) {
                        bouncer = 0;
                        if (footsprite == false) {
                            if (running) {
                                alec.setSprite(RunUp1);
                            } else {
                                alec.setSprite(Up1);
                            }
                        } else {
                            if (running) {
                                alec.setSprite(RunUp2);
                            } else {
                                alec.setSprite(Up2);
                            }
                        }
                    } else if (movespritepixels >= 12 && movespritepixels < 15) {
                        if (footsprite == false) {
                            if (running) {
                                alec.setSprite(RunUp1);
                            } else {
                                alec.setSprite(Up1);
                            }
                        } else {
                            if (running) {
                                alec.setSprite(RunUp2);
                            } else {
                                alec.setSprite(Up2);
                            }
                        }
                    } else {
                        if (running) {
                            alec.setSprite(RunUp);
                        } else {
                            alec.setSprite(Up);
                        }
                    }
                } else if ((down && movable_down) || (down && (movespritepixels > 1))) {
                    if (movespritepixels >= 0 && movespritepixels < 4) {
                        bouncer = 2;
                        if (running) {
                            alec.setSprite(RunDown);
                        } else {
                            alec.setSprite(Down);
                        }
                    } else if (movespritepixels >= 4 && movespritepixels < 8) {
                        if (running) {
                            alec.setSprite(RunDown);
                        } else {
                            alec.setSprite(Down);
                        }
                    } else if (movespritepixels >= 8 && movespritepixels < 12) {
                        bouncer = 0;
                        if (footsprite == false) {
                            if (running) {
                                alec.setSprite(RunDown1);
                            } else {
                                alec.setSprite(Down1);
                            }
                        } else {
                            if (running) {
                                alec.setSprite(RunDown2);
                            } else {
                                alec.setSprite(Down2);
                            }
                        }
                    } else if (movespritepixels >= 12 && movespritepixels < 15) {
                        if (footsprite == false) {
                            if (running) {
                                alec.setSprite(RunDown1);
                            } else {
                                alec.setSprite(Down1);
                            }
                        } else {
                            if (running) {
                                alec.setSprite(RunDown2);
                            } else {
                                alec.setSprite(Down2);
                            }
                        }
                    } else {
                        if (running) {
                            alec.setSprite(RunDown);
                        } else {
                            alec.setSprite(Down);
                        }
                    }
                } else if ((left && movable_left) || (left && (movespritepixels > 1))) {
                    if (movespritepixels >= 0 && movespritepixels < 4) {
                        bouncer = 2;
                        if (running) {
                            alec.setSprite(RunLeft);
                        } else {
                            alec.setSprite(Left);
                        }
                    } else if (movespritepixels >= 4 && movespritepixels < 8) {
                        if (running) {
                            alec.setSprite(RunLeft);
                        } else {
                            alec.setSprite(Left);
                        }
                    } else if (movespritepixels >= 8 && movespritepixels < 12) {
                        bouncer = 0;
                        if (footsprite == false) {
                            if (running) {
                                alec.setSprite(RunLeft1);
                            } else {
                                alec.setSprite(Left1);
                            }
                        } else {
                            if (running) {
                                alec.setSprite(RunLeft2);
                            } else {
                                alec.setSprite(Left2);
                            }
                        }
                    } else if (movespritepixels >= 12 && movespritepixels < 15) {
                        if (footsprite == false) {
                            if (running) {
                                alec.setSprite(RunLeft1);
                            } else {
                                alec.setSprite(Left1);
                            }
                        } else {
                            if (running) {
                                alec.setSprite(RunLeft2);
                            } else {
                                alec.setSprite(Left2);
                            }
                        }
                    } else {
                        if (running) {
                            alec.setSprite(RunLeft);
                        } else {
                            alec.setSprite(Left);
                        }
                    }
                } else if ((right && movable_right) || (right && (movespritepixels > 1))) {
                    if (movespritepixels >= 0 && movespritepixels < 4) {
                        bouncer = 2;
                        if (running) {
                            alec.setSprite(RunRight);
                        } else {
                            alec.setSprite(Right);
                        }
                    } else if (movespritepixels >= 4 && movespritepixels < 8) {
                        if (running) {
                            alec.setSprite(RunRight);
                        } else {
                            alec.setSprite(Right);
                        }
                    } else if (movespritepixels >= 8 && movespritepixels < 12) {
                        bouncer = 0;
                        if (footsprite == false) {
                            if (running) {
                                alec.setSprite(RunRight1);
                            } else {
                                alec.setSprite(Right1);
                            }
                        } else {
                            if (running) {
                                alec.setSprite(RunRight2);
                            } else {
                                alec.setSprite(Right2);
                            }
                        }
                    } else if (movespritepixels >= 12 && movespritepixels < 15) {
                        if (footsprite == false) {
                            if (running) {
                                alec.setSprite(RunRight1);
                            } else {
                                alec.setSprite(Right1);
                            }
                        } else {
                            if (running) {
                                alec.setSprite(RunRight2);
                            } else {
                                alec.setSprite(Right2);
                            }
                        }
                    } else {
                        if (running) {
                            alec.setSprite(RunRight);
                        } else {
                            alec.setSprite(Right);
                        }
                    }
                }
            } else {
                if (right && movable_right) {
                    if (running) {
                        alec.setSprite(RunRight);
                    } else {
                        alec.setSprite(Right);
                    }
                } else if (left && movable_left) {
                    if (running) {
                        alec.setSprite(RunLeft);
                    } else {
                        alec.setSprite(Left);
                    }
                } else if (up && movable_up) {
                    if (running) {
                        alec.setSprite(RunUp);
                    } else {
                        alec.setSprite(Up);
                    }
                } else if (down && movable_down) {
                    if (running) {
                        alec.setSprite(RunDown);
                    } else {
                        alec.setSprite(Down);
                    }
                }
            }
            //Movement Reset
            if (movespritepixels >= 16) {
                movespritepixels = 0;
                if (right) {
                    if (running) {
                        alec.setSprite(RunRight);
                    } else {
                        alec.setSprite(Right);
                    }
                    posX_tile += 1;
                } else if (left) {
                    if (running) {
                        alec.setSprite(RunLeft);
                    } else {
                        alec.setSprite(Left);
                    }
                    posX_tile -= 1;
                } else if (up) {
                    if (running) {
                        alec.setSprite(RunUp);
                    } else {
                        alec.setSprite(Up);
                    }
                    posY_tile -= 1;
                } else if (down) {
                    if (running) {
                        alec.setSprite(RunDown);
                    } else {
                        alec.setSprite(Down);
                    }
                    posY_tile += 1;
                }
                if (!sliding) {
                    walking = false;
                    running = false;
                    up = false;
                    down = false;
                    left = false;
                    right = false;
                } else {
                    movable_up = true;
                    movable_down = true;
                    movable_left = true;
                    movable_right = true;
                    checktile();
                    for (Tiles t : ImpassibleMapTiles) {
                        if (alec.slidingCrashTest(t, facing) == 1) {
                            movable_up = false;
                        }
                        if (alec.slidingCrashTest(t, facing) == 2) {
                            movable_down = false;
                        }
                        if (alec.slidingCrashTest(t, facing) == 3) {
                            movable_left = false;
                        }
                        if (alec.slidingCrashTest(t, facing) == 4) {
                            movable_right = false;
                        }
                    }
                    System.out.println("(" + posX_tile + "," + posY_tile + ")");
                    System.out.println("up: " + movable_up);
                    System.out.println("down: " + movable_down);
                    System.out.println("left: " + movable_left);
                    System.out.println("right: " + movable_right);
                    if (up && !movable_up) {
                        walking = false;
                        running = false;
                        up = false;
                        down = false;
                        left = false;
                        right = false;
                    } else if (down && !movable_down) {
                        walking = false;
                        running = false;
                        up = false;
                        down = false;
                        left = false;
                        right = false;
                    } else if (left && !movable_left) {
                        walking = false;
                        running = false;
                        up = false;
                        down = false;
                        left = false;
                        right = false;
                    } else if (right && !movable_right) {
                        walking = false;
                        running = false;
                        up = false;
                        down = false;
                        left = false;
                        right = false;
                    }
                }
                footsprite = !footsprite;
                checkBGM();
                checkBattle();
                transfer();
                if (!walking) {
                    if (facing == 4) {
                        if (tryinRun) {
                            alec.setSprite(RunRight);
                        } else {
                            alec.setSprite(Right);
                        }
                    } else if (facing == 3) {
                        if (tryinRun) {
                            alec.setSprite(RunLeft);
                        } else {
                            alec.setSprite(Left);
                        }
                    } else if (facing == 1) {
                        if (tryinRun) {
                            alec.setSprite(RunUp);
                        } else {
                            alec.setSprite(Up);
                        }
                    } else if (facing == 2) {
                        if (tryinRun) {
                            alec.setSprite(RunDown);
                        } else {
                            alec.setSprite(Down);
                        }
                    }
                }
            }
        } else {
            if (keyCode != 0) {
                if (keyCode == 38) {
                    UP();
                } else if (keyCode == 40) {
                    DOWN();
                } else if (keyCode == 37) {
                    LEFT();
                } else if (keyCode == 39) {
                    RIGHT();
                } else if (keyCode == 32) {
                    SPACE();
                } else if (keyCode == 10) {
                    ENTER();
                } else if (keyCode == 90) {
                    Z();
                } else if (keyCode == 88) {
                    X();
                }
                keyCode = 0;
            }
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform at = new AffineTransform();
        g2.setTransform(at);
        if (Loading) {
            g.setFont(Introfont);
            g.drawImage(Trees, -treeloc1, 0, null);
            g.drawImage(Bushes, -bushloc1, 0, null);
            g.drawImage(Grass, -grassloc1, 0, null);
            g.setColor(Color.white);
            if (RunPikaRun % 4 == 1) {
                bushloc1 += 4;
                grassloc1 += 8;
                treeloc1 += 2;
                bushloc2 += 4;
                grassloc2 += 8;
                treeloc2 += 2;
                g.drawImage(PikaRun1, 180, 180, null);
                g.drawImage(LoadIcon1, 260, 280, null);
            } else if (RunPikaRun % 4 == 2) {
                bushloc1 += 4;
                grassloc1 += 8;
                treeloc1 += 2;
                bushloc2 += 4;
                grassloc2 += 8;
                treeloc2 += 2;
                g.drawImage(PikaRun2, 180, 180, null);
                g.drawImage(LoadIcon2, 260, 280, null);
            } else if (RunPikaRun % 4 == 3) {
                bushloc1 += 4;
                grassloc1 += 8;
                treeloc1 += 2;
                bushloc2 += 4;
                grassloc2 += 8;
                treeloc2 += 2;
                g.drawImage(PikaRun3, 180, 180, null);
                g.drawImage(LoadIcon3, 260, 280, null);
            } else {
                bushloc1 += 4;
                grassloc1 += 8;
                treeloc1 += 2;
                bushloc2 += 4;
                grassloc2 += 8;
                treeloc2 += 2;
                g.drawImage(PikaRun4, 180, 180, null);
                g.drawImage(LoadIcon4, 260, 280, null);
            }
            g.drawString("Loading", 210, 290);
            if (num == 0) {
                
                tileset[0] = null;
                for (int i = 0; i < 1112;) {
                    i++;
                    tileset[i] = tk.createImage(getClass().getResource("Graphics/Tiles/tile-" + i + ".png"));
                }
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("Data/TileArray.map"));
                    String line;
                    StringTokenizer tokens;
                    for (int layers = 0; layers < 3; layers++) {
                        line = reader.readLine();
                        tokens = new StringTokenizer(line);
                        for (int y = 0; y < (MaxMapX * MaxMapY); y++) {
                            String code = tokens.nextToken();
                            if (layers == 0) {
                                Layer1[y] = Short.parseShort(code);
                            } else if (layers == 1) {
                                Layer2[y] = Short.parseShort(code);
                            } else if (layers == 2) {
                                Layer3[y] = Short.parseShort(code);
                            }
                        }
                    }
                    reader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException i) {
                    i.printStackTrace();
                }
            } else if (num == 1) {
                Image[] jippy = {PikaRun2, PikaRun3, PikaRun4, PikaDance1,
                    PikaDance2, PikaDance3, PikaDance4, PikaScratch1,
                    PikaScratch2, PikaScratch3, PikaShock2, PikaShock3,
                    PikaStand, PikaSleep, Explosion1, Explosion2, Explosion3,
                    Explosion4, Explosion5, Bolts, TitleScreen, PokemonLogo1,
                    PokemonLogo2, PokemonLogo3, PokemonLogo4, PokemonLogo5,
                    PokemonLogo6, LoadIcon1, LoadIcon2, LoadIcon3, LoadIcon4};
                for (Image i : jippy) {
                    g.drawImage(i, 500, 500, null);
                }
            } else if (num == 2) {
                for (int i = 0; i < Town2NPCs.length;) {
                    if (Town2NPCs[i].getActionNum() < 10) {
                        Town2NPCs[i].setSprite("Up");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Up1");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Up2");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Down");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Down1");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Down2");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Left");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Left1");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Left2");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Right");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Right1");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                        Town2NPCs[i].setSprite("Right2");
                        g.drawImage(Town2NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 3) {
                for (int i = 0; i < Town3NPCs.length;) {
                    if (Town3NPCs[i].getActionNum() < 10) {
                        Town3NPCs[i].setSprite("Up");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Up1");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Up2");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Down");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Down1");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Down2");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Left");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Left1");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Left2");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Right");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Right1");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                        Town3NPCs[i].setSprite("Right2");
                        g.drawImage(Town3NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 4) {
                for (int i = 0; i < Town4NPCs.length;) {
                    if (Town4NPCs[i].getActionNum() < 10) {
                        Town4NPCs[i].setSprite("Up");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Up1");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Up2");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Down");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Down1");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Down2");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Left");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Left1");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Left2");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Right");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Right1");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                        Town4NPCs[i].setSprite("Right2");
                        g.drawImage(Town4NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 5) {
                for (int i = 0; i < Town5NPCs.length;) {
                    if (Town5NPCs[i].getActionNum() < 10) {
                        Town5NPCs[i].setSprite("Up");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Up1");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Up2");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Down");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Down1");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Down2");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Left");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Left1");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Left2");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Right");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Right1");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                        Town5NPCs[i].setSprite("Right2");
                        g.drawImage(Town5NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 6) {
                for (int i = 0; i < Town6NPCs.length;) {
                    if (Town6NPCs[i].getActionNum() < 10) {
                        Town6NPCs[i].setSprite("Up");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Up1");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Up2");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Down");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Down1");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Down2");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Left");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Left1");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Left2");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Right");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Right1");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                        Town6NPCs[i].setSprite("Right2");
                        g.drawImage(Town6NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 7) {
                for (int i = 0; i < Town7NPCs.length;) {
                    if (Town7NPCs[i].getActionNum() < 10) {
                        Town7NPCs[i].setSprite("Up");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Up1");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Up2");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Down");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Down1");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Down2");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Left");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Left1");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Left2");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Right");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Right1");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                        Town7NPCs[i].setSprite("Right2");
                        g.drawImage(Town7NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 8) {
                for (int y = 1; y <= MaxMapY; y++) {
                    for (int x = 1; x <= MaxMapX; x++) {
                        for (int i = 0; i < impassibleTiles.length; i++) {
                            if (Layer1[tile_number] == impassibleTiles[i]
                                    || Layer2[tile_number] == impassibleTiles[i]) {
                                if (impassibleTiles[i] > 39 && impassibleTiles[i] < 57 || impassibleTiles[i] == 58) {
                                    ImpassibleMapTiles.add(new Tiles(x_coor / 32, y_coor / 32, null));
                                } else {
                                    ImpassibleMapTiles.add(new Tiles(x_coor / 32, y_coor / 32, null));
                                    ImpassibleMapTiles_withSwim.add(new Tiles(x_coor / 32, y_coor / 32, null));
                                }

                            }
                        }
                        x_coor += 32;
                        tile_number++;
                    }
                    x_coor = 0;
                    y_coor += 32;
                }
                tile_number = 0;
                x_coor = 0;
                y_coor = 0;
            } else if (num == 9) {
                for (int i = 0; i < Route1NPCs.length;) {
                    if (Route1NPCs[i].getActionNum() < 10) {
                        Route1NPCs[i].setSprite("Up");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Up1");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Up2");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Down");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Down1");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Down2");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Left");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Left1");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Left2");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Right");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Right1");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                        Route1NPCs[i].setSprite("Right2");
                        g.drawImage(Route1NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 10) {
                for (int i = 0; i < Route2NPCs.length;) {
                    if (Route2NPCs[i].getActionNum() < 10) {
                        Route2NPCs[i].setSprite("Up");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Up1");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Up2");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Down");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Down1");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Down2");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Left");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Left1");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Left2");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Right");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Right1");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                        Route2NPCs[i].setSprite("Right2");
                        g.drawImage(Route2NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 11) {
                for (int i = 0; i < Route3NPCs.length;) {
                    if (Route3NPCs[i].getActionNum() < 10) {
                        Route3NPCs[i].setSprite("Up");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Up1");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Up2");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Down");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Down1");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Down2");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Left");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Left1");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Left2");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Right");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Right1");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                        Route3NPCs[i].setSprite("Right2");
                        g.drawImage(Route3NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 12) {
                for (int i = 0; i < Route4NPCs.length;) {
                    if (Route4NPCs[i].getActionNum() < 10) {
                        Route4NPCs[i].setSprite("Up");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Up1");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Up2");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Down");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Down1");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Down2");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Left");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Left1");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Left2");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Right");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Right1");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                        Route4NPCs[i].setSprite("Right2");
                        g.drawImage(Route4NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 13) {
                for (int i = 0; i < Route5NPCs.length;) {
                    if (Route5NPCs[i].getActionNum() < 10) {
                        Route5NPCs[i].setSprite("Up");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Up1");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Up2");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Down");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Down1");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Down2");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Left");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Left1");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Left2");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Right");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Right1");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                        Route5NPCs[i].setSprite("Right2");
                        g.drawImage(Route5NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 14) {
                for (int i = 0; i < Route6NPCs.length;) {
                    if (Route6NPCs[i].getActionNum() < 10) {
                        Route6NPCs[i].setSprite("Up");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Up1");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Up2");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Down");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Down1");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Down2");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Left");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Left1");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Left2");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Right");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Right1");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                        Route6NPCs[i].setSprite("Right2");
                        g.drawImage(Route6NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 15) {
                for (int i = 0; i < BeachNPCs.length;) {
                    if (BeachNPCs[i].getActionNum() < 10) {
                        BeachNPCs[i].setSprite("Up");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Up1");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Up2");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Down");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Down1");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Down2");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Left");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Left1");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Left2");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Right");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Right1");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                        BeachNPCs[i].setSprite("Right2");
                        g.drawImage(BeachNPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 16) {
                for (int i = 0; i < MtNPCs.length;) {
                    if (MtNPCs[i].getActionNum() < 10) {
                        MtNPCs[i].setSprite("Up");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Up1");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Up2");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Down");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Down1");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Down2");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Left");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Left1");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Left2");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Right");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Right1");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                        MtNPCs[i].setSprite("Right2");
                        g.drawImage(MtNPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 17) {
                for (int i = 0; i < HoohNPCs.length;) {
                    if (HoohNPCs[i].getActionNum() < 10) {
                        HoohNPCs[i].setSprite("Up");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Up1");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Up2");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Down");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Down1");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Down2");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Left");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Left1");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Left2");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Right");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Right1");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                        HoohNPCs[i].setSprite("Right2");
                        g.drawImage(HoohNPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 18) {
                for (int i = 0; i < IslandsNPCs.length;) {
                    if (IslandsNPCs[i].getActionNum() < 10) {
                        IslandsNPCs[i].setSprite("Up");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Up1");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Up2");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Down");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Down1");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Down2");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Left");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Left1");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Left2");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Right");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Right1");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                        IslandsNPCs[i].setSprite("Right2");
                        g.drawImage(IslandsNPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 19) {
                for (int i = 0; i < LakeNPCs.length;) {
                    if (LakeNPCs[i].getActionNum() < 10) {
                        LakeNPCs[i].setSprite("Up");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Up1");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Up2");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Down");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Down1");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Down2");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Left");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Left1");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Left2");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Right");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Right1");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                        LakeNPCs[i].setSprite("Right2");
                        g.drawImage(LakeNPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 20) {
                for (int i = 0; i < WorkCampNPCs.length;) {
                    if (WorkCampNPCs[i].getActionNum() < 10) {
                        WorkCampNPCs[i].setSprite("Up");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Up1");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Up2");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Down");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Down1");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Down2");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Left");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Left1");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Left2");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Right");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Right1");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                        WorkCampNPCs[i].setSprite("Right2");
                        g.drawImage(WorkCampNPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 21) {
                for (int i = 0; i < CastleCourtYardNPCs.length;) {
                    if (CastleCourtYardNPCs[i].getActionNum() < 10) {
                        CastleCourtYardNPCs[i].setSprite("Up");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Up1");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Up2");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Down");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Down1");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Down2");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Left");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Left1");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Left2");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Right");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Right1");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                        CastleCourtYardNPCs[i].setSprite("Right2");
                        g.drawImage(CastleCourtYardNPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 22) {
                for (int i = 0; i < CastleNPCs.length;) {
                    if (CastleNPCs[i].getActionNum() < 10) {
                        CastleNPCs[i].setSprite("Up");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Up1");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Up2");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Down");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Down1");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Down2");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Left");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Left1");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Left2");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Right");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Right1");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                        CastleNPCs[i].setSprite("Right2");
                        g.drawImage(CastleNPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 23) {
                for (int i = 0; i < MewTwoNPCs.length;) {
                    if (MewTwoNPCs[i].getActionNum() < 10) {
                        MewTwoNPCs[i].setSprite("Up");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Up1");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Up2");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Down");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Down1");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Down2");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Left");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Left1");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Left2");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Right");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Right1");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                        MewTwoNPCs[i].setSprite("Right2");
                        g.drawImage(MewTwoNPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }

            } else if (num == 24) {
                for (int i = 0; i < Town1NPCs.length;) {
                    if (Town1NPCs[i].getActionNum() < 10) {
                        Town1NPCs[i].setSprite("Up");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Up1");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Up2");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Down");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Down1");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Down2");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Left");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Left1");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Left2");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Right");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Right1");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                        Town1NPCs[i].setSprite("Right2");
                        g.drawImage(Town1NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else if (num == 25) {
                menu.loadImages(g);
            } else if (num == 26) {
                //Battle.loadImages(g);
            } else if (num == 27) {
                for (int i = 1; i < 152;) {
                    pokedex[i] = new Pokemon();
                    pokedex[i].create(i, 1);
                    i++;
                }
                for (int i = 0; i < 25;) {
                    Potions[i] = new Items(0);
                    i++;
                }
                for (int i = 0; i < 15;) {
                    Holdables[i] = new Items(0);
                    i++;
                }
                for (int i = 0; i < 5;) {
                    Balls[i] = new Items(0);
                    i++;
                }
                for (int i = 0; i < 10;) {
                    Tools[i] = new Items(0);
                    i++;
                }
            } else if (num == 28) {
                for (int i = 1; i < 152; i++) {
                    g.drawImage(pokedex[i].getBackSprite(), 500, 500, null);
                    g.drawImage(pokedex[i].getFrontSprite(), 500, 500, null);
                    g.drawImage(pokedex[i].getIcon(), 500, 500, null);
                }
            } else if (num == 29) {
                g.drawImage(Down, 500, 500, null);
                g.drawImage(Down1, 500, 500, null);
                g.drawImage(Down2, 500, 500, null);
                g.drawImage(FishUp, 500, 500, null);
                g.drawImage(FishDown, 500, 500, null);
                g.drawImage(FishLeft, 500, 500, null);
                g.drawImage(FishRight, 500, 500, null);
                g.drawImage(Left, 500, 500, null);
                g.drawImage(Left1, 500, 500, null);
                g.drawImage(Left2, 500, 500, null);
                g.drawImage(Right, 500, 500, null);
                g.drawImage(Right1, 500, 500, null);
                g.drawImage(Right2, 500, 500, null);
                g.drawImage(Up, 500, 500, null);
                g.drawImage(Up1, 500, 500, null);
                g.drawImage(Up2, 500, 500, null);
                g.drawImage(RunDown, 500, 500, null);
                g.drawImage(RunDown1, 500, 500, null);
                g.drawImage(RunDown2, 500, 500, null);
                g.drawImage(RunLeft, 500, 500, null);
                g.drawImage(RunLeft1, 500, 500, null);
                g.drawImage(RunLeft2, 500, 500, null);
                g.drawImage(RunRight, 500, 500, null);
                g.drawImage(RunRight1, 500, 500, null);
                g.drawImage(RunRight2, 500, 500, null);
                g.drawImage(RunUp, 500, 500, null);
                g.drawImage(RunUp1, 500, 500, null);
                g.drawImage(RunUp2, 500, 500, null);
                May.setSprite("Up");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Up1");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Up2");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Down");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Down1");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Down2");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Left");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Left1");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Left2");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Right");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Right1");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Right2");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.Running(true);
                May.setSprite("Up");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Up1");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Up2");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Down");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Down1");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Down2");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Left");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Left1");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Left2");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Right");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Right1");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.setSprite("Right2");
                g.drawImage(May.getSprite(), 500, 500, null);
                May.Running(false);
            } else if (num == 30) {
                SE.loadClip("Music/SE/Collision.wav", "Collision", 1);
                SE.loadClip("Music/SE/Select.wav", "Select", 1);
                SE.loadClip("Music/SE/Menu.wav", "Menu", 1);
                SE.loadClip("Music/SE/Damage.wav", "Damage", 1);
                SE.loadClip("Music/SE/EnterDoor.wav", "Enter", 1);
                SE.loadClip("Music/SE/ExitDoor.wav", "Exit", 1);
                SE.loadClip("Music/SE/itemfound.midi", "itemfound", 1);
                SE.loadClip("Music/SE/PEWDIEPIE.wav", "PEWDIEPIE", 1);
                SE.loadClip("Music/SE/DarkCrystal.wav", "DarkCrystal", 1);
                SE.loadClip("Music/SE/PokemonTheme1.wav", "Theme", 1);
                SE.playClip("Theme");
            } else if (num == 31) {
                for (int i = 0; i < Town8NPCs.length;) {
                    if (Town8NPCs[i].getActionNum() < 10) {
                        Town8NPCs[i].setSprite("Up");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Up1");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Up2");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Down");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Down1");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Down2");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Left");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Left1");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Left2");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Right");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Right1");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                        Town8NPCs[i].setSprite("Right2");
                        g.drawImage(Town8NPCs[i].getSprite(), 500, 500, null);
                    }
                    i++;
                }
            } else {
                for (Image i : tileset) {
                    g.drawImage(i, 500, 500, null);
                }
                Loading = !Loading;
                atTitle = !atTitle;
            }
            num++;
            RunPikaRun++;
        } else if (atTitle) {
            g.setFont(Introfont);
            setPreferredSize(new Dimension(480, 320));
            requestFocus();
            RunPikaRun++;
            g.drawImage(Trees, -treeloc1, 0, null);
            g.drawImage(Trees, -treeloc2, 0, null);
            g.drawImage(Bushes, -bushloc1, 0, null);
            g.drawImage(Bushes, -bushloc2, 0, null);
            g.drawImage(Grass, -grassloc1, 0, null);
            g.drawImage(Grass, -grassloc2, 0, null);
            if (RunPikaRun % 4 == 1) {
                bushloc1 += 4;
                grassloc1 += 8;
                treeloc1 += 2;
                bushloc2 += 4;
                grassloc2 += 8;
                treeloc2 += 2;
                g.drawImage(PikaRun1, 180, 180 + lower, null);
            } else if (RunPikaRun % 4 == 2) {
                bushloc1 += 4;
                grassloc1 += 8;
                treeloc1 += 2;
                bushloc2 += 4;
                grassloc2 += 8;
                treeloc2 += 2;
                g.drawImage(PikaRun2, 180, 180 + lower, null);
            } else if (RunPikaRun % 4 == 3) {
                bushloc1 += 4;
                grassloc1 += 8;
                treeloc1 += 2;
                bushloc2 += 4;
                grassloc2 += 8;
                treeloc2 += 2;
                g.drawImage(PikaRun3, 180, 180 + lower, null);
            } else {
                bushloc1 += 4;
                grassloc1 += 8;
                treeloc1 += 2;
                bushloc2 += 4;
                grassloc2 += 8;
                treeloc2 += 2;
                g.drawImage(PikaRun4, 180, 180 + lower, null);
                visible = !visible;
            }
            if (treeloc1 >= 1022) {
                treeloc1 = -1022;
            }
            if (grassloc1 >= 1022) {
                grassloc1 = -1022;
            }
            if (bushloc1 >= 1022) {
                bushloc1 = -1022;
            }
            if (treeloc2 >= 1022) {
                treeloc2 = -1022;
            }
            if (grassloc2 >= 1022) {
                grassloc2 = -1022;
            }
            if (bushloc2 >= 1022) {
                bushloc2 = -1022;
            }
            if (visible) {
                g.setColor(Color.white);
                g.drawString("PRESS ENTER", 200, 150);
            }
        } else if (inTransition) {
            g.setFont(Introfont);
            lower++;
            g.drawImage(TitleScreen, 0, 48, null);
            g.drawImage(PokemonLogo1, 74, lower - 112, null);
            RunPikaRun++;
            if (RunPikaRun % 4 == 2) {
                if (wave) {
                    num++;
                } else {
                    num--;
                }
                if (num == 1 || num == 2) {
                    Pikachu = PikaDance1;
                } else if (num == 3 || num == 4) {
                    Pikachu = PikaDance2;
                } else if (num == 5 || num == 6) {
                    Pikachu = PikaDance3;
                } else if (num == 7) {
                    Pikachu = PikaDance4;
                } else {
                    wave = !wave;
                }
            }
            g.drawImage(Pikachu, 200, 180, null);
            if (lower == 132) {
                inTransition = !inTransition;
                gameTimer.setDelay(100);
                atContinueScreen = !atContinueScreen;
                Pikachu = PikaStand;
                RunPikaRun = 0;
                lower = 0;
                num = 0;
            }
        } else if (atContinueScreen) {
            g.setFont(Introfont);
            g.drawImage(TitleScreen, 0, 48, null);
            if (RunPikaRun == 5) {
                g.drawImage(PokemonLogo2, 74, 20, null);
            } else if (RunPikaRun == 6) {
                g.drawImage(PokemonLogo3, 74, 20, null);
            } else if (RunPikaRun == 7) {
                g.drawImage(PokemonLogo4, 74, 20, null);
            } else if (RunPikaRun == 8) {
                g.drawImage(PokemonLogo5, 74, 20, null);
            } else if (RunPikaRun == 9) {
                g.drawImage(PokemonLogo6, 74, 20, null);
            } else {
                g.drawImage(PokemonLogo1, 74, 20, null);
            }
            RunPikaRun++;
            lower++;
            if (lower > 500) {
                Pikachu = PikaSleep;
                lower = 1000;
            } else if (PikaScratch) {
                if (wave) {
                    num++;
                } else {
                    num--;
                }
                if (num == 1 || num == 2) {
                    Pikachu = PikaScratch1;
                } else if (num == 3 || num == 4) {
                    Pikachu = PikaScratch2;
                } else if (num == 5) {
                    Pikachu = PikaScratch3;
                } else {
                    wave = !wave;
                    ichyness--;
                    if (ichyness <= 0) {
                        PikaScratch = !PikaScratch;
                        num = 0;
                    }
                }
            } else {
                if (gen.nextInt(50) == 10) {
                    PikaScratch = !PikaScratch;
                    wave = true;
                    ichyness = (byte) (gen.nextInt(3) + 3);
                } else {
                    Pikachu = PikaStand;
                }
            }
            if (Pikachu == PikaSleep) {
                g.drawImage(Pikachu, 175, 210, null);
            } else {
                g.drawImage(Pikachu, 200, 180, null);
            }
            if (concurrentMenuItem == 0) {
                g.setColor(Color.BLACK);
                g.drawString("CONTINUE", 330, 180);
                g.setColor(Color.darkGray);
                g.drawString("NEW GAME", 330, 210);
                g.drawString("LOAD GAME", 330, 240);
            } else if (concurrentMenuItem == 1) {
                g.setColor(Color.darkGray);
                g.drawString("CONTINUE", 330, 180);
                g.setColor(Color.black);
                g.drawString("NEW GAME", 330, 210);
                g.setColor(Color.darkGray);
                g.drawString("LOAD GAME", 330, 240);
            } else if (concurrentMenuItem == 2) {
                g.setColor(Color.darkGray);
                g.drawString("CONTINUE", 330, 180);
                g.drawString("NEW GAME", 330, 210);
                g.setColor(Color.black);
                g.drawString("LOAD GAME", 330, 240);
            }
            g.setColor(Color.black);
        } else if (inThunderShock) {
            g.setFont(pokefont);
            num++;
            g.drawImage(TitleScreen, 0, 48, null);
            g.drawImage(PokemonLogo1, 74, 0, null);
            if (num == 1 || num == 2 || num == 3) {
                Pikachu = PikaShock1;
            } else if (num == 4) {
                Pikachu = PikaShock2;
            } else if (num == 5) {
                thunderbolts(g, 3, 240, 250);
            } else if (num == 6) {
                thunderbolts(g, 5, 240, 250);
            } else if (num == 7) {
                thunderbolts(g, 7, 240, 250);
            } else if (num == 8) {
                thunderbolts(g, 9, 240, 250);
            } else if (num == 9) {
                thunderbolts(g, 15, 240, 250);
                Explosion = Explosion1;
            } else if (num == 10) {
                thunderbolts(g, 37, 240, 250);
            } else if (num == 11) {
                thunderbolts(g, 37, 240, 250);
                Explosion = Explosion2;
            } else if (num == 12) {
                thunderbolts(g, 50, 240, 250);
                Explosion = Explosion3;
            } else if (num == 13) {
                thunderbolts(g, 50, 240, 250);
                Explosion = Explosion4;
            } else if (num == 14) {
                thunderbolts(g, 23, 240, 250);
                Explosion = Explosion5;
            } else if (num > 14) {
                num = 0;
                inThunderShock = !inThunderShock;
                startgame();
            }
            g.drawImage(Pikachu, 200, 180, null);
            g.drawImage(Explosion, 50, 180, null);
        } else {
            if (!inBattle) {
                g2.setClip(new Rectangle(posX - 240, posY - 160, posX + 480, posY + 320));
                g2.translate(offsetX - (currentX_loc * 32), offsetY - (currentY_loc * 32));
                for (int y = 1; y <= MaxMapY; y++) {
                    for (int x = 1; x <= MaxMapX; x++) {
                        if (Layer1[tile_number] != 0) {
                            if (x_coor / 32 >= alec.loc_x - 8 && x_coor / 32 <= alec.loc_x + 8) {
                                if (y_coor / 32 >= alec.loc_y - 6 && y_coor / 32 < alec.loc_y + 7) {
                                    g.drawImage(tileset[Layer1[tile_number]], x_coor, y_coor, null);
                                }
                            }
                        }
                        if (Layer2[tile_number] != 0) {
                            if (x_coor / 32 >= alec.loc_x - 8 && x_coor / 32 <= alec.loc_x + 8) {
                                if (y_coor / 32 >= alec.loc_y - 6 && y_coor / 32 < alec.loc_y + 7) {
                                    g.drawImage(tileset[Layer2[tile_number]], x_coor, y_coor, null);
                                }
                            }
                        }
                        if (Layer3[tile_number] != 0) {
                            if (x_coor / 32 >= alec.loc_x - 8 && x_coor / 32 <= alec.loc_x + 8) {
                                if (y_coor / 32 >= alec.loc_y - 6 && y_coor / 32 < alec.loc_y + 7) {
                                    g.drawImage(tileset[Layer3[tile_number]], x_coor, y_coor, null);
                                }
                            }
                        }
                        x_coor += 32;
                        tile_number++;
                    }
                    x_coor = 0;
                    y_coor += 32;
                }
                tile_number = 0;
                x_coor = 0;
                y_coor = 0;
                //NPC Sprites
                for (int i = 0; i < currentMapNPC.length; i++) {
                    if (currentMapNPC[i].getActionNum() < 10) {
                        if (currentMapNPC[i].getDirection() == 1) {
                            g.drawImage(currentMapNPC[i].getSprite(),
                                    currentMapNPC[i].getCurrentX() * 32,
                                    currentMapNPC[i].getCurrentY() * 32 - 11
                                    - (currentMapNPC[i].movespritepixels * 2)
                                    - (currentMapNPC[i].getBounce() / 2), null);
                        } else if (currentMapNPC[i].getDirection() == 2) {
                            g.drawImage(currentMapNPC[i].getSprite(),
                                    currentMapNPC[i].getCurrentX() * 32,
                                    currentMapNPC[i].getCurrentY() * 32 - 11
                                    + (currentMapNPC[i].movespritepixels * 2
                                    - (currentMapNPC[i].getBounce() / 2)), null);
                        } else if (currentMapNPC[i].getDirection() == 3) {
                            g.drawImage(currentMapNPC[i].getSprite(),
                                    currentMapNPC[i].getCurrentX() * 32
                                    - (currentMapNPC[i].movespritepixels * 2),
                                    currentMapNPC[i].getCurrentY() * 32 - 11
                                    - (currentMapNPC[i].getBounce() / 2), null);
                        } else {
                            g.drawImage(currentMapNPC[i].getSprite(),
                                    currentMapNPC[i].getCurrentX() * 32
                                    + (currentMapNPC[i].movespritepixels * 2),
                                    currentMapNPC[i].getCurrentY() * 32 - 11
                                    - (currentMapNPC[i].getBounce() / 2), null);
                        }
                    } else {
                        g.drawImage(currentMapNPC[i].getSprite(),
                                currentMapNPC[i].getCurrentX() * 32,
                                currentMapNPC[i].getCurrentY() * 32, null);
                    }
                }
                if (May.getDirection() == 1) {
                    g.drawImage(May.getSprite(),
                            May.getCurrentX() * 32,
                            May.getCurrentY() * 32 - 11
                            - (May.movespritepixels * 2)
                            - (May.getBounce() / 2), null);
                } else if (May.getDirection() == 2) {
                    g.drawImage(May.getSprite(),
                            May.getCurrentX() * 32,
                            May.getCurrentY() * 32 - 11
                            + (May.movespritepixels * 2)
                            - (May.getBounce() / 2), null);
                } else if (May.getDirection() == 3) {
                    g.drawImage(May.getSprite(),
                            May.getCurrentX() * 32
                            - (May.movespritepixels * 2),
                            May.getCurrentY() * 32 - 11
                            - (May.getBounce() / 2), null);
                } else {
                    g.drawImage(May.getSprite(),
                            May.getCurrentX() * 32
                            + (May.movespritepixels * 2),
                            May.getCurrentY() * 32 - 11
                            - (May.getBounce() / 2), null);
                }
                //Reset to 0,0
                g2.translate(-offsetX, -offsetY);
                //Player Sprites
                g2.setTransform(at);
                if (swiming) {
                    g.drawImage(alec.getSprite(), posX, posY + 5 - (bouncer / 2), null);
                } else {
                    g.drawImage(alec.getSprite(), posX, posY - (bouncer / 2), null);
                }
                g.setFont(pokefont);
                g.setColor(Color.white);
                //g.drawString("" + posX_tile + "," + posY_tile, 10, 25);
                showMessageBox(g);
            } else {
                Battle.paint(g);
            }
            if (inMenu) {
                menu.paint(g);
            }
        }
    }
// KeyListener Code4

    public void keyPressed(KeyEvent e) {
        keyCode = e.getKeyCode();
    }

    public void Z() {
        if (atContinueScreen) {
            SE.playClip("Select");
            if (concurrentMenuItem == 0) {
                num = 0;
                atContinueScreen = !atContinueScreen;
                inThunderShock = !inThunderShock;
                continued = true;
            } else if (concurrentMenuItem == 1) {
                num = 0;
                atContinueScreen = !atContinueScreen;
                inThunderShock = !inThunderShock;
                continued = false;
            }
        } else if (gamestarted) {
            if (!inMenu && movable && !inBattle && !walking && !disable_talk) {
                talkable = !talkable;
                disable_talk = true;
            }
            if (inDialog) {
                if (inQuestion) {
                    if (curYesNoSelect == 1) {
                        yes = true;
                    }
                    inQuestion = !inQuestion;
                } else {
                    noob = true;
                    inDialog = false;
                }
            }
            if (inMenu) {
                SE.playClip("Select");
                if (menu.inMain) {
                    if (menu.currentSelectionMain == 0) {
                        menu.PokeDex();
                    }
                    if (menu.currentSelectionMain == 1) {
                        menu.Pokemon();
                    }
                    if (menu.currentSelectionMain == 2) {
                        menu.Bag();
                    }
                    if (menu.currentSelectionMain == 3) {
                        menu.PokeGear();
                    }
                    if (menu.currentSelectionMain == 4) {
                        menu.TrainerCard();
                    }
                    if (menu.currentSelectionMain == 5) {
                        menu.Save();
                    }
                    if (menu.currentSelectionMain == 6) {
                        menu.Option();
                    }
                    if (menu.currentSelectionMain == 7) {
                        menu.Exit();
                    }
                }
                if (menu.inPokeDex) {
                    if (noob) {
                        noob = false;
                    } else {
                        if (menu.inPokedexInfo) {
                            menu.inPokedexInfo = false;
                        } else {
                            menu.inPokedexInfo = true;
                            menu.inPokeMap = false;
                        }
                    }
                }
                if (menu.inPokemon) {
                    if (menu.Gave) {
                        menu.Gave = false;
                        menu.inBag = true;
                    }
                    if (menu.inSwitch) {
                        menu.inSwitch = false;
                        if (menu.PokemonSelection == 1) {
                            if (menu.SwitchingPokemon == 2) {
                                second = first;
                            } else if (menu.SwitchingPokemon == 3) {
                                third = first;
                            } else if (menu.SwitchingPokemon == 4) {
                                fourth = first;
                            } else if (menu.SwitchingPokemon == 5) {
                                fifth = first;
                            } else if (menu.SwitchingPokemon == 6) {
                                sixth = first;
                            }
                            first = menu.SelectedPokemon;
                        } else if (menu.PokemonSelection == 2) {
                            if (menu.SwitchingPokemon == 1) {
                                first = second;
                            } else if (menu.SwitchingPokemon == 3) {
                                third = second;
                            } else if (menu.SwitchingPokemon == 4) {
                                fourth = second;
                            } else if (menu.SwitchingPokemon == 5) {
                                fifth = second;
                            } else if (menu.SwitchingPokemon == 6) {
                                sixth = second;
                            }
                            second = menu.SelectedPokemon;
                        } else if (menu.PokemonSelection == 3) {
                            if (menu.SwitchingPokemon == 1) {
                                first = third;
                            } else if (menu.SwitchingPokemon == 2) {
                                second = third;
                            } else if (menu.SwitchingPokemon == 4) {
                                fourth = third;
                            } else if (menu.SwitchingPokemon == 5) {
                                fifth = third;
                            } else if (menu.SwitchingPokemon == 6) {
                                sixth = third;
                            }
                            third = menu.SelectedPokemon;
                        } else if (menu.PokemonSelection == 4) {
                            if (menu.SwitchingPokemon == 1) {
                                first = fourth;
                            } else if (menu.SwitchingPokemon == 2) {
                                second = fourth;
                            } else if (menu.SwitchingPokemon == 3) {
                                third = fourth;
                            } else if (menu.SwitchingPokemon == 5) {
                                fifth = fourth;
                            } else if (menu.SwitchingPokemon == 6) {
                                sixth = fourth;
                            }
                            fourth = menu.SelectedPokemon;
                        } else if (menu.PokemonSelection == 5) {
                            if (menu.SwitchingPokemon == 1) {
                                first = fifth;
                            } else if (menu.SwitchingPokemon == 2) {
                                second = fifth;
                            } else if (menu.SwitchingPokemon == 3) {
                                third = fifth;
                            } else if (menu.SwitchingPokemon == 4) {
                                fourth = fifth;
                            } else if (menu.SwitchingPokemon == 6) {
                                sixth = fifth;
                            }
                            fifth = menu.SelectedPokemon;
                        } else if (menu.PokemonSelection == 6) {
                            if (menu.SwitchingPokemon == 1) {
                                first = sixth;
                            } else if (menu.SwitchingPokemon == 2) {
                                second = sixth;
                            } else if (menu.SwitchingPokemon == 3) {
                                third = sixth;
                            } else if (menu.SwitchingPokemon == 4) {
                                fourth = sixth;
                            } else if (menu.SwitchingPokemon == 5) {
                                fifth = sixth;
                            }
                            sixth = menu.SelectedPokemon;
                        }
                        menu.SwitchingPokemon = 0;
                    }
                    if (menu.inPokeOption) {
                        if (menu.PokeOptionSelection == 1) {
                            menu.inPokeOption = false;
                        } else if (menu.PokeOptionSelection == 2) {
                            noob = true;
                            menu.inSwitch = true;
                            if (menu.PokemonSelection == 1) {
                                menu.SelectedPokemon = first;
                            } else if (menu.PokemonSelection == 2) {
                                menu.SelectedPokemon = second;
                            } else if (menu.PokemonSelection == 3) {
                                menu.SelectedPokemon = third;
                            } else if (menu.PokemonSelection == 4) {
                                menu.SelectedPokemon = fourth;
                            } else if (menu.PokemonSelection == 5) {
                                menu.SelectedPokemon = fifth;
                            } else if (menu.PokemonSelection == 6) {
                                menu.SelectedPokemon = sixth;
                            }
                            menu.SwitchingPokemon = menu.PokemonSelection;
                            menu.inPokeOption = false;
                        } else if (menu.PokeOptionSelection == 3) {
                            menu.inBag = true;
                            menu.inPokemon = false;
                            noob = true;
                            menu.inPokeOption = false;
                        } else if (menu.PokeOptionSelection == 4) {
                            menu.inStatus = true;
                            menu.CurrentPokemonForStats = menu.PokemonSelection;
                        } else if (menu.PokeOptionSelection == 5) {
                            menu.inFly = true;
                            System.out.println("fly");
                        }
                    } else if (menu.BagtoPokemon) {
                        if (menu.PokemonSelection == 0) {
                            menu.inPokemon = false;
                            menu.BagtoPokemon = false;
                            menu.inBag = true;
                            noob = true;
                        } else if (menu.PokemonSelection == 1) {
                            menu.SelectedPokemon = first;
                        } else if (menu.PokemonSelection == 2) {
                            menu.SelectedPokemon = second;
                        } else if (menu.PokemonSelection == 3) {
                            menu.SelectedPokemon = third;
                        } else if (menu.PokemonSelection == 4) {
                            menu.SelectedPokemon = fourth;
                        } else if (menu.PokemonSelection == 5) {
                            menu.SelectedPokemon = fifth;
                        } else if (menu.PokemonSelection == 6) {
                            menu.SelectedPokemon = sixth;
                        }
                        if (menu.curentBagPocket == 0) {
                            if (menu.PokemonSelection == 1) {
                                first.giveStatusPotion(menu.SelectedItem.getItemNum());
                            } else if (menu.PokemonSelection == 2) {
                                second.giveStatusPotion(menu.SelectedItem.getItemNum());
                            } else if (menu.PokemonSelection == 3) {
                                third.giveStatusPotion(menu.SelectedItem.getItemNum());
                            } else if (menu.PokemonSelection == 4) {
                                fourth.giveStatusPotion(menu.SelectedItem.getItemNum());
                            } else if (menu.PokemonSelection == 5) {
                                fifth.giveStatusPotion(menu.SelectedItem.getItemNum());
                            } else if (menu.PokemonSelection == 6) {
                                sixth.giveStatusPotion(menu.SelectedItem.getItemNum());
                            }
                            Potions[menu.SelectedItem.getItemNum()].usedOne();
                        } else if (menu.curentBagPocket == 1) {
                            if (menu.SelectedPokemon.HoldItem != 0) {
                                Holdables[menu.SelectedPokemon.HoldItem - 21].addOne();
                            }
                            if (menu.PokemonSelection == 1) {
                                first.setHold(menu.SelectedItem.getItemNum());
                            } else if (menu.PokemonSelection == 2) {
                                second.setHold(menu.SelectedItem.getItemNum());
                            } else if (menu.PokemonSelection == 3) {
                                third.setHold(menu.SelectedItem.getItemNum());
                            } else if (menu.PokemonSelection == 4) {
                                fourth.setHold(menu.SelectedItem.getItemNum());
                            } else if (menu.PokemonSelection == 5) {
                                fifth.setHold(menu.SelectedItem.getItemNum());
                            } else if (menu.PokemonSelection == 6) {
                                sixth.setHold(menu.SelectedItem.getItemNum());
                            }
                            Holdables[menu.SelectedItem.getItemNum() - 21].usedOne();
                        }
                        menu.Gave = true;
                        menu.BagtoPokemon = false;
                        noob = true;
                    } else if (noob) {
                        noob = false;
                    } else {
                        menu.inPokeOption = true;
                        menu.PokeOptionSelection = 1;
                    }
                }
                if (menu.inNO) {
                    menu.inNO = false;
                    noob = true;
                }
                if (menu.inBagOptions) {
                    if (menu.currentSelectionBag == 0) {
                        menu.SelectedItem = menu.tmpOne;
                    } else if (menu.currentSelectionBag == 1) {
                        menu.SelectedItem = menu.tmpTwo;
                    } else if (menu.currentSelectionBag == 2) {
                        menu.SelectedItem = menu.tmpThree;
                    } else if (menu.currentSelectionBag == 3) {
                        menu.SelectedItem = menu.tmpFour;
                    } else if (menu.currentSelectionBag >= 4) {
                        menu.SelectedItem = menu.tmpFive;
                    }
                    if (menu.BagOptionSelection == 0) {
                        if (menu.curentBagPocket > 1) {
                            menu.inBagOptions = false;
                            menu.inNO = true;
                        } else {
                            menu.BagtoPokemon = true;
                            menu.inBag = false;
                            menu.inPokemon = true;
                            menu.inBagOptions = false;
                            noob = true;
                        }
                    } else if (menu.BagOptionSelection == 1) {
                        if (menu.curentBagPocket > 2) {
                            menu.inBagOptions = false;
                            menu.inNO = true;
                        } else {
                            if (menu.SelectedItem.getItemNum() < 20) {
                                Potions[menu.SelectedItem.getItemNum()].usedOne();
                            } else if (menu.SelectedItem.getItemNum() < 32) {
                                Holdables[menu.SelectedItem.getItemNum() - 21].usedOne();
                            } else if (menu.SelectedItem.getItemNum() < 36) {
                                Balls[menu.SelectedItem.getItemNum() - 33].usedOne();
                            } else if (menu.SelectedItem.getItemNum() > 36) {
                                Tools[menu.SelectedItem.getItemNum() - 37].usedOne();
                            }
                            menu.inBagOptions = false;
                        }
                    } else if (menu.BagOptionSelection == 2) {
                        menu.inBagOptions = false;
                    }
                } else if (menu.inBag) {
                    if (noob) {
                        noob = false;
                    } else {
                        menu.inBagOptions = true;
                        menu.BagOptionSelection = 0;
                    }
                }
                if (menu.inPokeGear) {
                    if (noob) {
                        noob = false;
                    } else {
                        if (menu.currentSelectionPokeGear == 0) {
                            menu.inMap = true;
                        } else if (menu.currentSelectionPokeGear == 1) {
                            if (menu.inIpod) {
                                radio = !radio;
                                if (radio) {
                                    SE.playClip(menu.curSong, 1);
                                    currentBGM.stop();
                                } else {
                                    SE.stopAllClips();
                                    currentBGM.start();
                                }
                            } else {
                                menu.inIpod = !menu.inIpod;
                            }
                        } else if (menu.currentSelectionPokeGear == 2) {
                        } else if (menu.currentSelectionPokeGear == 3) {
                            System.out.println("Exit");
                            menu.currentSelectionPokeGear = 0;
                            menu.inPokeGear = false;
                            menu.inMain = true;
                        }
                    }
                }
                if (menu.inSave) {
                    if (noob) {
                        noob = false;
                    } else {
                        if (menu.currentSelectionSave == 0) {
                            saveGame();
                            System.out.println(name + "'s Game has been saved!");
                            wait(1);
                            noob = true;
                            menu.inSave = false;
                            menu.inMain = true;
                        } else {
                            noob = true;
                            menu.inSave = false;
                            menu.inMain = true;
                        }
                    }
                }
            }
        }
    }

    public void X() {
        if (gamestarted) {
            if (!inMenu && movable && !inBattle && !inDialog && !walking) {
                talkable = false;
            }
            if (inDialog && !inQuestion) {
                noob = true;
                inDialog = false;
            }
            if (inMenu) {
                SE.playClip("Select");
                if (menu.inMain) {
                    menu.Exit();
                }
                if (menu.inPokeDex) {
                    if (menu.inPokedexInfo) {
                        menu.inPokedexInfo = false;
                    } else {
                        menu.inPokeDex = false;
                        menu.inMain = true;
                        noob = true;
                    }
                }
                if (menu.inPokemon) {
                    if (menu.Gave) {
                        noob = true;
                        menu.Gave = false;
                        menu.inPokemon = true;
                    }
                    if (menu.BagtoPokemon) {
                        menu.inPokemon = false;
                        menu.BagtoPokemon = false;
                        menu.inBag = true;
                        noob = true;
                    }
                    if (menu.inFly) {
                        menu.inFly = false;
                    } else if (menu.inStatus) {
                        menu.inStatus = false;
                    } else if (menu.inItem) {
                        menu.inItem = false;
                    }
                    if (menu.inPokeOption) {
                        menu.inPokeOption = false;

                    } else {
                        menu.inPokemon = false;
                        if (!menu.BagtoPokemon) {
                            menu.inMain = true;
                        }
                        noob = true;
                    }
                }
                if (menu.inNO) {
                    noob = true;
                    menu.inNO = false;
                }
                if (menu.inBagOptions) {
                    menu.inBagOptions = false;
                } else if (menu.inBag) {
                    noob = true;
                    menu.inBag = false;
                    if (!menu.BagtoPokemon) {
                        menu.inMain = true;
                    }
                }
                if (menu.inPokeGear) {
                    noob = true;
                    menu.inPokeGear = false;
                    menu.inMain = true;
                }
                if (menu.inTrainerCard) {
                    if (keyCode == KeyEvent.VK_X) {
                        menu.inTrainerCard = false;
                        menu.inMain = true;
                    }
                }
                if (menu.inSave) {
                    noob = true;
                    menu.inSave = false;
                    menu.inMain = true;
                }
                if (menu.inOption) {
                    menu.inOption = false;
                    menu.inMain = true;
                }
            }
        }
    }

    public void UP() {
        if (atContinueScreen) {
            lower = 0;
            SE.playClip("Select");
            if (concurrentMenuItem > 0) {
                concurrentMenuItem--;
            }
        } else if (gamestarted) {
            if (!inMenu && movable && !inBattle && !walking && !inDialog) {
                facing = 1;
                if (movable_up) {
                    up = true;
                    walking = true;
                    if (tryinRun) {
                        running = true;
                        alec.setSprite(RunUp);
                    }
                    talkable = false;
                } else {
                    SE.playClip("Collision");
                    alec.setSprite(Up);
                }
            }
            if (inDialog && inQuestion) {
                curYesNoSelect = 1;
            }

            // Menu Scene

            if (inMenu) {
                SE.playClip("Select");
                if (menu.inMain) {
                    if (menu.currentSelectionMain > 0) {
                        menu.currentSelectionMain--;
                    }
                }
                if (menu.inPokeDex) {
                    menu.pokedexSelect--;
                    if (menu.pokedexSelect < 1) {
                        menu.pokedexSelect = 1;
                        menu.pokedexSelection--;
                    }
                    if (menu.pokedexSelection < 1) {
                        menu.pokedexSelection = 143;
                        menu.pokedexSelect = 9;

                    }
                }
                if (menu.inPokemon) {
                    if (menu.inStatus) {
                        menu.CurrentPokemonForStats--;
                        if (menu.CurrentPokemonForStats <= 0) {
                            menu.CurrentPokemonForStats = menu.length;
                        }
                    }
                    if (menu.inPokeOption) {
                        menu.PokeOptionSelection++;
                        if (menu.SelectedPokemon.getFlyable()) {
                            if (menu.PokeOptionSelection > 5) {
                                menu.PokeOptionSelection = 1;
                            }
                        } else {
                            if (menu.PokeOptionSelection > 4) {
                                menu.PokeOptionSelection = 1;
                            }
                        }
                    } else {
                        menu.PokemonSelection--;
                        if (menu.PokemonSelection <= 0) {
                            menu.PokemonSelection = menu.length;
                        }
                    }
                }
                if (menu.inBagOptions) {
                    menu.BagOptionSelection--;
                    if (menu.BagOptionSelection < 0) {
                        menu.BagOptionSelection = 2;
                    }
                } else if (menu.inBag) {
                    if (menu.currentSelectionBag > 0) {
                        menu.currentSelectionBag--;
                    }
                }
                if (menu.inPokeGear) {
                    if (menu.currentSelectionPokeGear > 0) {
                        menu.currentSelectionPokeGear--;
                    }
                }
                if (menu.inSave) {
                    menu.currentSelectionSave = 0;
                }
                if (menu.inOption) {
                    if (menu.currentSelectionOption > 0) {
                        menu.currentSelectionOption--;
                    }
                }
            }
        }
    }

    public void DOWN() {
        if (atContinueScreen) {
            lower = 0;
            SE.playClip("Select");
            if (concurrentMenuItem < 2) {
                concurrentMenuItem++;
            }
        } else if (gamestarted) {
            if (!inMenu && movable && !inBattle && !walking && !inDialog) {
                facing = 2;
                if (movable_down == true) {
                    down = true;
                    walking = true;
                    if (tryinRun) {
                        running = true;
                        alec.setSprite(RunDown);
                    }
                    talkable = false;
                } else {
                    SE.playClip("Collision");
                    alec.setSprite(Down);
                }
            }
            if (inDialog && inQuestion) {
                curYesNoSelect = 0;
            }
            if (inMenu) {
                SE.playClip("Select");
                if (menu.inMain) {
                    if (menu.currentSelectionMain < 7) {
                        menu.currentSelectionMain++;
                    }
                }
                if (menu.inPokeDex) {
                    menu.pokedexSelect++;
                    if (menu.pokedexSelect > 9) {
                        menu.pokedexSelect = 9;
                        menu.pokedexSelection++;
                    }
                    if (menu.pokedexSelection > 143) {
                        menu.pokedexSelection = 1;
                        menu.pokedexSelect = 1;
                    }
                }
                if (menu.inPokemon) {
                    if (menu.inStatus) {
                        if (menu.length == 0) {
                            menu.CurrentPokemonForStats = 0;
                        } else if (menu.length == 1) {
                            menu.CurrentPokemonForStats++;
                            if (menu.CurrentPokemonForStats >= 2) {
                                menu.CurrentPokemonForStats = 0;
                            }
                        } else if (menu.length == 2) {
                            menu.CurrentPokemonForStats++;
                            if (menu.CurrentPokemonForStats >= 3) {
                                menu.CurrentPokemonForStats = 0;
                            }
                        } else if (menu.length == 3) {
                            menu.CurrentPokemonForStats++;
                            if (menu.CurrentPokemonForStats >= 4) {
                                menu.CurrentPokemonForStats = 0;
                            }
                        } else if (menu.length == 4) {
                            menu.CurrentPokemonForStats++;
                            if (menu.CurrentPokemonForStats >= 5) {
                                menu.CurrentPokemonForStats = 0;
                            }
                        } else if (menu.length == 5) {
                            menu.CurrentPokemonForStats++;
                            if (menu.CurrentPokemonForStats >= 6) {
                                menu.CurrentPokemonForStats = 0;
                            }
                        } else if (menu.length == 6) {
                            menu.CurrentPokemonForStats++;
                            if (menu.CurrentPokemonForStats >= 7) {
                                menu.CurrentPokemonForStats = 1;
                            }
                        }
                    }
                    if (menu.inPokeOption) {
                        menu.PokeOptionSelection--;
                        if (menu.SelectedPokemon.getFlyable()) {
                            if (menu.PokeOptionSelection < 1) {
                                menu.PokeOptionSelection = 5;
                            }
                        } else {
                            if (menu.PokeOptionSelection < 1) {
                                menu.PokeOptionSelection = 4;
                            }
                        }
                    } else {
                        if (menu.length == 0) {
                            menu.PokemonSelection = 0;
                        } else if (menu.length == 1) {
                            menu.PokemonSelection++;
                            if (menu.PokemonSelection >= 2) {
                                menu.PokemonSelection = 0;
                            }
                        } else if (menu.length == 2) {
                            menu.PokemonSelection++;
                            if (menu.PokemonSelection >= 3) {
                                menu.PokemonSelection = 0;
                            }
                        } else if (menu.length == 3) {
                            menu.PokemonSelection++;
                            if (menu.PokemonSelection >= 4) {
                                menu.PokemonSelection = 0;
                            }
                        } else if (menu.length == 4) {
                            menu.PokemonSelection++;
                            if (menu.PokemonSelection >= 5) {
                                menu.PokemonSelection = 0;
                            }
                        } else if (menu.length == 5) {
                            menu.PokemonSelection++;
                            if (menu.PokemonSelection >= 6) {
                                menu.PokemonSelection = 0;
                            }
                        } else if (menu.length == 6) {
                            menu.PokemonSelection++;
                            if (menu.PokemonSelection >= 7) {
                                menu.PokemonSelection = 0;
                            }
                        }
                    }
                }
                if (menu.inBagOptions) {
                    menu.BagOptionSelection++;
                    if (menu.BagOptionSelection > 2) {
                        menu.BagOptionSelection = 0;
                    }
                } else if (menu.inBag) {
                    if (menu.curentBagPocket == 0) {
                        if (menu.currentSelectionBag < (potion - 2)) {
                            menu.currentSelectionBag++;
                        }
                    } else if (menu.curentBagPocket == 1) {
                        if (menu.currentSelectionBag < (hold - 1)) {
                            menu.currentSelectionBag++;
                        }
                    } else if (menu.curentBagPocket == 2) {
                        if (menu.currentSelectionBag < (ball - 1)) {
                            menu.currentSelectionBag++;
                        }
                    } else if (menu.curentBagPocket == 3) {
                        if (menu.currentSelectionBag < (tool - 1)) {
                            menu.currentSelectionBag++;
                        }
                    }
                }
                if (menu.inPokeGear) {
                    if (menu.currentSelectionPokeGear < 3) {
                        menu.currentSelectionPokeGear++;
                    }
                }
                if (menu.inSave) {
                    menu.currentSelectionSave = 1;
                }
                if (menu.inOption) {
                    if (menu.currentSelectionOption < 5) {
                        menu.currentSelectionOption++;
                    }
                }
            }
        }
    }

    public void LEFT() {
        if (gamestarted) {
            if (!inMenu && movable && !inBattle && !walking && !inDialog) {
                facing = 3;
                if (movable_left == true) {
                    left = true;
                    walking = true;
                    if (tryinRun) {
                        running = true;
                        alec.setSprite(RunLeft);
                    }
                    talkable = false;
                } else {
                    SE.playClip("Collision");
                    alec.setSprite(Left);
                }
            }
            if (inMenu) {
                if (menu.inPokeDex) {
                    SE.playClip("Select");
                    menu.inPokeMap = !menu.inPokeMap;
                }
                if (menu.inPokemon) {
                    if (menu.inStatus) {
                        SE.playClip("Select");
                        menu.StatusSelection--;
                        if (menu.StatusSelection < 0) {
                            menu.StatusSelection = 2;
                        }
                    }
                }
                if (menu.inBag && !menu.inBagOptions) {
                    SE.playClip("Select");
                    menu.curentBagPocket--;
                    menu.currentSelectionBag = 0;
                    if (menu.curentBagPocket == -1) {
                        menu.curentBagPocket = 3;
                    }
                }
            }
        }
    }

    public void RIGHT() {
        if (gamestarted == true) {
            if (!inMenu && movable && !inBattle && !walking && !inDialog) {
                facing = 4;
                if (movable_right == true) {
                    right = true;
                    walking = true;
                    if (tryinRun) {
                        running = true;
                        alec.setSprite(RunRight);
                    }
                    talkable = false;
                } else {
                    SE.playClip("Collision");
                    alec.setSprite(Right);
                }
            }
            if (inMenu) {
                if (menu.inPokeDex) {
                    SE.playClip("Select");
                    menu.inPokeMap = !menu.inPokeMap;
                }
                if (menu.inPokemon) {
                    if (menu.inStatus) {
                        SE.playClip("Select");
                        menu.StatusSelection++;
                        if (menu.StatusSelection > 2) {
                            menu.StatusSelection = 0;
                        }
                    }
                }
                if (menu.inBag && !menu.inBagOptions) {
                    SE.playClip("Select");
                    menu.curentBagPocket++;
                    menu.currentSelectionBag = 0;
                    if (menu.curentBagPocket == 4) {
                        menu.curentBagPocket = 0;
                    }
                }
            }
        }
    }

    public void ENTER() {
        if (atTitle) {
            atTitle = !atTitle;
            inTransition = !inTransition;
            Pikachu = PikaDance1;
            num = 0;
            gameTimer.setDelay(25);
        } else if (gamestarted && !inMenu && movable && !inBattle && !walking && !inDialog) {
            SE.playClip("Menu");
            menu.inMain = true;
            inMenu = true;
        }

    }

    public void SPACE() {
        if (gamestarted && !inMenu && movable && !inBattle) {
            tryinRun = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        keyCode = e.getKeyCode();
        if (keyCode == 38) {
            lastdir = 1;
            UP = false;
        } else if (keyCode == 40) {
            lastdir = 2;
            DOWN = false;
        } else if (keyCode == 37) {
            lastdir = 3;
            LEFT = false;
        } else if (keyCode == 39) {
            lastdir = 4;
            RIGHT = false;
        } else if (keyCode == 32) {
            tryinRun = false;
        } else if (keyCode == 90) {
            Z = false;
        } else if (keyCode == 88) {
            X = false;
        }
        keyCode = 0;
    }

    public void keyTyped(KeyEvent e) {
    }

    public void checktile() {
        //Wild Pokemon Grass
        sliding = false;
        swiming = false;
        checktile1 = Layer1[(posY_tile * MaxMapX) + posX_tile];
        checktile2 = Layer2[(posY_tile * MaxMapX) + posX_tile];
        if (right) {
            checktile1 = Layer1[(posY_tile * MaxMapX) + posX_tile + 1];
            checktile2 = Layer2[(posY_tile * MaxMapX) + posX_tile + 1];
        } else if (left) {
            checktile1 = Layer1[(posY_tile * MaxMapX) + posX_tile - 1];
            checktile2 = Layer2[(posY_tile * MaxMapX) + posX_tile - 1];
        } else if (up) {
            checktile1 = Layer1[((posY_tile - 1) * MaxMapX) + posX_tile];
            checktile2 = Layer2[((posY_tile - 1) * MaxMapX) + posX_tile];
        } else if (down) {
            checktile1 = Layer1[((posY_tile + 1) * MaxMapX) + posX_tile];
            checktile2 = Layer2[((posY_tile + 1) * MaxMapX) + posX_tile];
        }
        if (checktile1 == 551) {
            sliding = true;
        } else if (checktile1 >= 40 && checktile1 <= 58 && checktile1 != 57) {
            swiming = true;
            MayFollow = false;
            May.setFollow(false);
            May.Running(false);
        }
        if (checktile2 == 551) {
            sliding = true;
        } else if (checktile2 >= 40 && checktile2 <= 58) {
            swiming = true;
            MayFollow = false;
            May.setFollow(false);
            May.Running(false);
        }
        /*
         * if (swiming) { stepscount++; } if (map[(posY_tile * MaxMapX) +
         * posX_tile] == 17) { stepscount += 3; }
         */
    }

    public void transfer() {
        if (posX_tile == 180 && (posY_tile == 112 || posY_tile == 113 || posY_tile == 114 || posY_tile == 115)) {
            if (facing == 4) {
                changeBGM = true;
                MapLoc = "Town1";
            } else if (facing == 3) {
                changeBGM = true;
                MapLoc = "Route1";
            }
        } else if (posX_tile == 119 && (posY_tile == 121 || posY_tile == 122)) {
            if (facing == 3) {
                changeBGM = true;
                MapLoc = "Town2";
            } else if (facing == 4) {
                changeBGM = true;
                MapLoc = "Route1";
            }
        } else if ((posX_tile == 101 || posX_tile == 102 || posX_tile == 103) && posY_tile == 110) {
            if (facing == 1) {
                changeBGM = true;
                MapLoc = "Route2";
            } else if (facing == 2) {
                changeBGM = true;
                MapLoc = "Town2";
            }
        } else if ((posX_tile == 124 || posX_tile == 125) && posY_tile == 65) {
            if (facing == 1) {
                changeBGM = true;
                MapLoc = "Town3";
            } else if (facing == 2) {
                changeBGM = true;
                MapLoc = "Route2";
            }
        } else if (posX_tile == 137 && (posY_tile == 51 || posY_tile == 52)) {
            if (facing == 3) {
                changeBGM = true;
                MapLoc = "Route3";
            } else if (facing == 4) {
                changeBGM = true;
                MapLoc = "Town3";
            }
        } else if ((posX_tile == 214 || posX_tile == 215) && posY_tile == 111) {
            if (facing == 1) {
                changeBGM = true;
                MapLoc = "Route6";
            } else if (facing == 2) {
                changeBGM = true;
                MapLoc = "Town1";
            }
        } else if (posX_tile <= 39 && posY_tile == 96) {
            if (facing == 1) {
                changeBGM = true;
                MapLoc = "Beach";
            } else if (facing == 2) {
                changeBGM = true;
                MapLoc = "Islands";
            }
        } else if (posX_tile >= 39 && posX_tile <= 80 && posY_tile == 110) {
            if (facing == 1) {
                changeBGM = true;
                MapLoc = "Beach";
            } else if (facing == 2) {
                changeBGM = true;
                MapLoc = "Islands";
            }
        } else if (posX_tile == 39 && posY_tile <= 96 && posY_tile >= 110) {
            if (facing == 3) {
                changeBGM = true;
                MapLoc = "Islands";
            } else if (facing == 4) {
                changeBGM = true;
                MapLoc = "Town7";
            }
        } else if (posX_tile == 82 && posY_tile >= 110 && posY_tile <= 140) {
            if (facing == 3) {
                changeBGM = true;
                MapLoc = "Islands";
            } else if (facing == 4) {
                changeBGM = true;
                MapLoc = "Town2";
            }
        } else if (posX_tile == 24 && posY_tile <= 26) {
            if (facing == 3) {
                changeBGM = true;
                MapLoc = "Town8";
            } else if (facing == 4) {
                changeBGM = true;
                MapLoc = "Beach";
            }
        } else if (posX_tile <= 24 && posY_tile == 26) {
            if (facing == 1) {
                changeBGM = true;
                MapLoc = "Town8";
            } else if (facing == 2) {
                changeBGM = true;
                MapLoc = "Beach";
            }
        } else if (posX_tile == 33 && (posY_tile == 56 || posY == 57)) {
            if (facing == 3) {
                changeBGM = true;
                MapLoc = "Beach";
            } else if (facing == 4) {
                changeBGM = true;
                MapLoc = "Mt";
            }
        } else if (posX_tile == 58 && (posY_tile == 75 || posY_tile == 76)) {
            if (facing == 3) {
                changeBGM = true;
                MapLoc = "Mt";
            } else if (facing == 4) {
                changeBGM = true;
                MapLoc = "Route5";
            }
        } else if (posX_tile == 74 && (posY_tile >= 61 || posY_tile <= 73)) {
            if (facing == 3) {
                changeBGM = true;
                MapLoc = "Route5";
            } else if (facing == 4) {
                changeBGM = true;
                MapLoc = "Lake";
            }
        } else if (posX_tile >= 65 && posX_tile <= 72 && posY_tile == 45) {
            if (facing == 1) {
                changeBGM = true;
                MapLoc = "Town6";
            } else if (facing == 2) {
                changeBGM = true;
                MapLoc = "Route5";
            }
        } else if ((posX_tile == 181 || posX_tile == 182) && posY_tile == 52) {
            if (facing == 1) {
                changeBGM = true;
                MapLoc = "Town4";
            } else if (facing == 2) {
                changeBGM = true;
                MapLoc = "Route4";
            }
        } else if ((posX_tile >= 142 || posX_tile <= 150) && posY_tile == 79) {
            if (facing == 1) {
                changeBGM = true;
                MapLoc = "Route4";
            } else if (facing == 2) {
                changeBGM = true;
                MapLoc = "Town5";
            }
        }
        if ("Town1".equals(MapLoc)) {
            //House to outside
            if ((posX_tile == 21 || posX_tile == 22) && posY_tile == 159) {
                SE.playClip("Exit");
                if (!MaysHouse) {
                    MaysMom.remove();
                    MaysDad.remove();
                    Mom.Return();
                    if (posX_tile == 21) {
                        currentX_loc += 182;
                    } else {
                        currentX_loc += 181;
                    }
                    currentY_loc -= 48;
                    posX_tile = 203;
                    posY_tile = 111;
                } else {
                    Mom.remove();
                    MaysMom.Return();
                    MaysDad.Return();
                    MaysHouse = false;
                    if (posX_tile == 21) {
                        currentX_loc += 175;
                    } else {
                        currentX_loc += 174;
                    }
                    currentY_loc -= 48;
                    posX_tile = 196;
                    posY_tile = 111;
                }
            }
            //Outside to House
            if (posX_tile == 203 && posY_tile == 110) {
                MaysMom.remove();
                MaysDad.remove();
                Mom.Return();
                currentX_loc -= 182;
                currentY_loc += 48;
                posX_tile = 21;
                posY_tile = 158;
                SE.playClip("Enter");
            }
            //House: Upstairs to Downstairs
            if (posX_tile == 8 && posY_tile == 151) {
                MaysMom.remove();
                MaysDad.remove();
                Mom.Return();
                currentX_loc += 16;
                currentY_loc += 1;
                posX_tile = 24;
                posY_tile = 152;
                alec.setSprite(Down);
                facing = 2;
                SE.playClip("Exit");
            }
            //House: Downstairs to Upstairs
            if (posX_tile == 24 && posY_tile == 151) {
                alec.setSprite(Down);
                SE.playClip("Enter");
                if (MaysHouse) {
                    Mom.remove();
                    MaysMom.Return();
                    MaysDad.Return();
                    currentX_loc += 1;
                    currentY_loc += 16;
                    posX_tile = 25;
                    posY_tile = 167;
                    changeBGM(MaySad);
                } else {
                    MaysMom.remove();
                    MaysDad.remove();
                    Mom.Return();
                    currentX_loc -= 16;
                    currentY_loc += 1;
                    posX_tile = 8;
                    posY_tile = 152;
                }

            }
            //Outside to Oak's Lab
            if (posX_tile == 187 && posY_tile == 110) {
                currentX_loc -= 40;
                currentY_loc += 52;
                posX_tile = 147;
                posY_tile = 162;
                SE.playClip("Enter");
                changeBGM(Lab);
            }
            //Oak's Lab to outside
            if ((posX_tile == 147 || posX_tile == 148) && posY_tile == 163) {
                if (posX_tile == 147) {
                    currentX_loc += 40;
                } else {
                    currentX_loc += 39;
                }
                currentY_loc -= 52;
                posX_tile = 187;
                posY_tile = 111;
                SE.playClip("Exit");
                changeBGM(Town1);
            }
            //Outside to May's House
            if (posX_tile == 196 && posY_tile == 110) {
                Mom.remove();
                MaysMom.Return();
                MaysDad.Return();
                MaysHouse = true;
                currentX_loc -= 175;
                currentY_loc += 48;
                posX_tile = 21;
                posY_tile = 158;
                SE.playClip("Enter");
            }
            //May's House: Upstairs to Downstairs
            if (posX_tile == 25 && posY_tile == 166) {
                Mom.remove();
                MaysMom.Return();
                MaysDad.Return();
                currentX_loc -= 1;
                currentY_loc -= 14;
                posX_tile = 24;
                posY_tile = 152;
                changeBGM(Town1);
                alec.setSprite(Down);
                facing = 2;
                SE.playClip("Exit");
            }
            //Outside to Random House
            if (posX_tile == 186 && posY_tile == 117) {
                currentX_loc -= 118;
                currentY_loc += 41;
                posX_tile = 68;
                posY_tile = 158;
                SE.playClip("Enter");
            }
            //Random House to Outside
            if ((posX_tile == 69 || posX_tile == 68) && posY_tile == 159) {
                SE.playClip("Exit");
                if (posX_tile == 69) {
                    currentX_loc += 117;
                } else {
                    currentX_loc += 118;
                }
                currentY_loc -= 41;
                posX_tile = 186;
                posY_tile = 118;
            }

        } else if ("Town2".equals(MapLoc)) {
            //Outside to PokeCenter
            if (posX_tile == 112 && posY_tile == 116) {
                currentX_loc -= 76;
                currentY_loc += 56;
                posX_tile = 36;
                posY_tile = 172;
                SE.playClip("Enter");
                NurseLookGood.setSprite("Down");
                changeBGM(pokecenter);
            }
            //PokeCenter to Outside
            if ((posX_tile == 36 || posX_tile == 37) && posY_tile == 173) {
                if (posX_tile == 36) {
                    currentX_loc += 76;
                } else {
                    currentX_loc += 75;
                }
                currentY_loc -= 56;
                posX_tile = 112;
                posY_tile = 117;
                SE.playClip("Exit");
                changeBGM(Town2);
            }
            //Outside to PokeMart
            if (posX_tile == 106 && posY_tile == 116) {
                currentX_loc -= 56;
                currentY_loc += 42;
                posX_tile = 50;
                posY_tile = 158;
                SE.playClip("Enter");
                changeBGM(pokemart);
            }
            //PokeMart to Outside
            if ((posX_tile == 49 || posX_tile == 50) && posY_tile == 159) {
                if (posX_tile == 49) {
                    currentX_loc += 57;
                } else {
                    currentX_loc += 56;
                }
                currentY_loc -= 42;
                posX_tile = 106;
                posY_tile = 117;
                SE.playClip("Exit");
                changeBGM(Town2);
            }
            //Outside to Gym 1
            if (posX_tile == 96 && posY_tile == 118) {
                currentX_loc -= 88;
                currentY_loc += 82;
                posX_tile = 8;
                posY_tile = 200;
                SE.playClip("Enter");
                changeBGM(gym);
            }
            //Gym 1 to Outside
            if ((posX_tile == 8 || posX_tile == 7) && posY_tile == 201) {
                if (posX_tile == 7) {
                    currentX_loc += 89;
                } else {
                    currentX_loc += 88;
                }
                currentY_loc -= 82;
                posX_tile = 96;
                posY_tile = 119;
                SE.playClip("Exit");
                changeBGM(Town2);
            }
            //Outside to Random House
            if (posX_tile == 106 && posY_tile == 120) {
                currentX_loc -= 23;
                currentY_loc += 38;
                posX_tile = 83;
                posY_tile = 158;
                SE.playClip("Enter");
            }
            //Random House to Outside
            if ((posX_tile == 82 || posX_tile == 83) && posY_tile == 159) {
                if (posX_tile == 82) {
                    currentX_loc += 24;
                } else {
                    currentX_loc += 23;
                }
                currentY_loc -= 38;
                posX_tile = 106;
                posY_tile = 121;
                SE.playClip("Exit");
            }

        } else if ("Town3".equals(MapLoc)) {
            //Outside to Justice Tower F1
            if ((posX_tile == 118 || posX_tile == 119) && posY_tile == 43) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Enter");
                changeBGM(route3);
            }
            //Justice Tower F1 to Outside
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Exit");
                changeBGM(Town3);
            }
            //Justice Tower F1 to F2
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Enter");
                alec.setSprite(Down);
                facing = 2;
            }
            //Justice Tower F2 to F1
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Exit");
                alec.setSprite(Down);
                facing = 2;
            }
            //Outside to Mafia HQ F1
            if ((posX_tile == 132 || posX_tile == 133) && posY_tile == 39) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Enter");
                changeBGM(MobHQ);
            }
            //Mafia HQ F1 to Outside
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 132;
                posY_tile = 40;
                SE.playClip("Exit");
                changeBGM(Town3);
            }
            //Mafia HQ F1 to F2
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                alec.setSprite(Down);
                facing = 2;
                SE.playClip("Enter");
            }
            //Mafia HQ F2 to F1
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                alec.setSprite(Down);
                facing = 2;
                SE.playClip("Exit");
            }
            //Outside to House1
            if (posX_tile == 121 && posY_tile == 55) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Enter");
            }
            //House1 to Outside
            if (posX_tile == 1 && posY_tile == 1) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 121;
                posY_tile = 56;
                SE.playClip("Exit");
            }
            //Outside to House2
            if (posX_tile == 151 && posY_tile == 55) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Enter");
            }
            //House2 to Outside
            if (posX_tile == 151 && posY_tile == 56) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Exit");
            }
            //Outside to PokeCenter
            if (posX_tile == 128 && posY_tile == 56) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Enter");
                changeBGM(pokecenter);
            }
            //PokeCenter to Outside
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 128;
                posY_tile = 57;
                SE.playClip("Exit");
                changeBGM(Town3);
            }
            //Outside to Big House F1
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Enter");
            }
            //BigHouse F1 to Outside 
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Exit");
            }
            //Big House F1 to F2
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                alec.setSprite(Down);
                facing = 2;
                SE.playClip("Enter");
            }
            //Big House F2 to F1
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                alec.setSprite(Down);
                facing = 2;
                SE.playClip("Exit");
            }
            //Outside to Mart1 F1
            if (posX_tile == 121 && posY_tile == 62) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Enter");
                changeBGM(pokemart);
            }
            //Mart1 F1 to Outside
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 121;
                posY_tile = 63;
                SE.playClip("Exit");
                changeBGM(Town3);
            }
            //Mart1 F1 to F2
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                alec.setSprite(Down);
                facing = 2;
                SE.playClip("Enter");
            }
            //Mart1 F2 to F1
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                alec.setSprite(Down);
                facing = 2;
                SE.playClip("Exit");
            }
            //Outside to Mart2 F1
            if (posX_tile == 115 && posY_tile == 62) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Enter");
                changeBGM(pokemart);
            }
            //Mart2 F1 to Outside
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 115;
                posY_tile = 63;
                SE.playClip("Exit");
                changeBGM(Town3);
            }
            //Mart2 F1 to F2
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                alec.setSprite(Down);
                facing = 2;
                SE.playClip("Enter");
            }
            //Mart2 F2 to F1
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                alec.setSprite(Down);
                facing = 2;
                SE.playClip("Exit");
            }
            //Outside to Gym2
            if (posX_tile == 132 && posY_tile == 62) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 11;
                posY_tile = 65;
                SE.playClip("Enter");
                changeBGM(gym);
            }
            //Gym2 to Outside
            if (posX_tile == 29 && posY_tile == 63) {
                currentX_loc -= 18;
                currentY_loc += 2;
                posX_tile = 132;
                posY_tile = 63;
                SE.playClip("Exit");
                changeBGM(Town3);
            }
        } else if ("Town4".equals(MapLoc)) {
        } else if ("Town5".equals(MapLoc)) {
        } else if ("Town6".equals(MapLoc)) {
        } else if ("Town7".equals(MapLoc)) {
        } else if ("Town8".equals(MapLoc)) {
        }

        //Zapidos Island
        //Outside to InCave
        if (posX_tile == 12 && posY_tile == 109) {
            currentX_loc -= 7;
            currentY_loc += 135;
            posX_tile = 5;
            posY_tile = 244;
            SE.playClip("Enter");
            changeBGM(ZapidosCave);
        }

        //inCave to Outside
        if ((posX_tile == 5 || posX_tile == 6) && posY_tile == 245) {
            if (posX_tile == 5) {
                currentX_loc += 7;
            } else {
                currentX_loc += 6;
            }
            currentY_loc -= 135;
            posX_tile = 12;
            posY_tile = 110;
            SE.playClip("Exit");
            changeBGM(Islands);
        }

        //EndCave to Outside
        if (posX_tile == 0 && posY_tile == 221) {
            currentX_loc += 12;
            currentY_loc -= 111;
            posX_tile = 12;
            posY_tile = 110;
            SE.playClip("Exit");
            changeBGM(Islands);
        }

        //Articuno Island
        //Outiside to D1
        if (posX_tile == 35 && posY_tile == 120) {
            currentX_loc += 76;
            currentY_loc += 109;
            posX_tile = 111;
            posY_tile = 229;
            SE.playClip("Enter");
            changeBGM(ArticunoCave);
        }

        //First ladder to Second
        if (posX_tile == 144 && posY_tile == 215) {
            currentY_loc += 9;
            posX_tile = 144;
            posY_tile = 224;
            alec.setSprite(Down);
            facing = 2;
            SE.playClip("Enter");
        }
        //Second Ladder to First
        if (posX_tile == 144 && posY_tile == 223) {
            currentY_loc -= 7;
            posX_tile = 144;
            posY_tile = 216;
            alec.setSprite(Down);
            facing = 2;
            SE.playClip("Exit");
        }

        //D2 to Artincuno
        if (posX_tile == 143 && posY_tile == 238) {
            currentX_loc -= 32;
            posX_tile = 111;
            posY_tile = 238;
            alec.setSprite(Up);
            facing = 1;
            SE.playClip("Enter");
        }

        //Articuno to D2
        if (posX_tile == 111 && posY_tile == 239) {
            currentX_loc += 32;
            currentY_loc -= 2;
            posX_tile = 143;
            posY_tile = 237;
            alec.setSprite(Up);
            facing = 1;
            SE.playClip("Exit");
        }
        //inCave to Outside
        if (posX_tile == 111 && posY_tile == 230) {
            currentX_loc -= 76;
            currentY_loc -= 109;
            posX_tile = 35;
            posY_tile = 121;
            SE.playClip("Exit");
            changeBGM(Islands);
        }

        //Moltras Island
        //Outside to inCave
        if (posX_tile == 44 && posY_tile == 133) {
            currentX_loc += 17;
            currentY_loc += 108;
            posX_tile = 61;
            posY_tile = 241;
            SE.playClip("Enter");
            changeBGM(MoltrasCave);
        }

        //inCave to Outside
        if (posX_tile == 61 && posY_tile == 242) {
            currentX_loc -= 17;
            currentY_loc -= 108;
            posX_tile = 44;
            posY_tile = 134;
            SE.playClip("Exit");
            changeBGM(Islands);
        }

        //Lugia Island
        //Outside to InCave
        if (posX_tile == 5 && posY_tile == 136) {
            currentX_loc += 156;
            currentY_loc += 95;
            posX_tile = 161;
            posY_tile = 231;
            SE.playClip("Enter");
            changeBGM(LugiaCave);
        }

        //to InnerChamber
        if ((posX_tile == 160 || posX_tile == 161) && posY_tile == 222) {
            if (posX_tile == 161) {
                currentX_loc -= 1;
            }
            currentY_loc -= 6;
            posX_tile = 160;
            posY_tile = 216;
            SE.playClip("Enter");
        }

        //back to Outer Chamber
        if (posX_tile == 160 && posY_tile == 217) {
            currentX_loc += 1;
            currentY_loc += 6;
            posX_tile = 161;
            posY_tile = 223;
            SE.playClip("Exit");
        }

        //to Outside
        if (posX_tile == 161 && posY_tile == 232) {
            currentX_loc -= 156;
            currentY_loc -= 96;
            posX_tile = 5;
            posY_tile = 136;
            SE.playClip("Exit");
            changeBGM(Islands);
        }
    }

    public void thunderbolts(Graphics g, int length, int x, int y) {
        byte sx = -35;
        byte sy = 0;
        boolean up = true;
        boolean down = true;
        ThunderBolt[] storm = new ThunderBolt[15];
        Point[] p;
        g.setColor(Color.yellow);
        for (ThunderBolt t : storm) {
            sx += 5;
            if (up) {
                sy += 5;
                if (sy >= 35) {
                    up = !up;
                }
            } else {
                sy -= 5;
            }
            t = new ThunderBolt(length, x, y, sx, sy);
            p = t.getPoints();
            g.drawLine(x, y, p[0].getX(), p[0].getY());
            for (int i = 1; i < p.length; i++) {
                g.drawLine(p[i - 1].getX(),
                        p[i - 1].getY(),
                        p[i].getX(),
                        p[i].getY());
            }
        }
    }

    public void changeBGM(MidiPlayer newBGM) {
        if (!dark && !radio) {
            currentBGM.stop();
            currentBGM = newBGM;
            currentBGM.start();
        }
    }

    public void checkBGM() {
        if (changeBGM) {
            changeBGM = !changeBGM;
            if ("Town1".equals(MapLoc)) {
                changeBGM(Town1);
                currentMapNPC = Town1NPCs;
            } else if ("Town2".equals(MapLoc)) {
                changeBGM(Town2);
                currentMapNPC = Town2NPCs;
                TagKid.Return();
                IT.Return();
                TagKid.setDirection(2);
                CashierLookGood.setSprite("Right");
                PORPLE.setSprite("Up");
                IT.setDirection(2);
            /*} else if ("Town3".equals(MapLoc)) {
                changeBGM(Town3);
                currentMapNPC = Town3NPCs;
            } else if ("Town4".equals(MapLoc)) {
                changeBGM(Town4);
                currentMapNPC = Town4NPCs;
            } else if ("Town5".equals(MapLoc)) {
                changeBGM(Town5);
                currentMapNPC = Town5NPCs;
            } else if ("Town6".equals(MapLoc)) {
                changeBGM(Town6);
                currentMapNPC = Town6NPCs;
            } else if ("Town7".equals(MapLoc)) {
                changeBGM(Town7);
                currentMapNPC = Town7NPCs;
            } else if ("Town8".equals(MapLoc)) {
                changeBGM(Town8);
                currentMapNPC = Town8NPCs;
                * 
                */
            } else if ("Route1".equals(MapLoc)) {
                changeBGM(route1);
                currentMapNPC = Route1NPCs;
            } else if ("Route2".equals(MapLoc)) {
                changeBGM(route2);
                currentMapNPC = Route2NPCs;
            /*} else if ("Route3".equals(MapLoc)) {
                changeBGM(route3);
                currentMapNPC = Route3NPCs;
            } else if ("Route4".equals(MapLoc)) {
                changeBGM(route4);
                currentMapNPC = Route4NPCs;
            } else if ("Route5".equals(MapLoc)) {
                changeBGM(route5);
                currentMapNPC = Route5NPCs;
            } else if ("Route6".equals(MapLoc)) {
                changeBGM(route6);
                currentMapNPC = Route6NPCs;
            } else if ("Lake".equals(MapLoc)) {
                changeBGM(Lake);
                currentMapNPC = LakeNPCs;
            } else if ("Beach".equals(MapLoc)) {
                changeBGM(Beach);
                currentMapNPC = BeachNPCs;
            } else if ("Mt".equals(MapLoc)) {
                changeBGM(Mt);
                * 
                */
            } else if ("Islands".equals(MapLoc)) {
                changeBGM(Islands);
                currentMapNPC = IslandsNPCs;
            }
        }
    }

    public void showMessageBox(Graphics g) {
        g.setColor(Color.BLACK);
        if (talkable && !inDialog) {
            if (nigglet) {
                if (boobs) {
                    inDialog = true;
                    MayFollow = true;
                    text = curMayText;
                    if (facing == 1) {
                        May.setSprite("Down");
                    } else if (facing == 2) {
                        May.setSprite("Up");
                    } else if (facing == 3) {
                        May.setSprite("Right");
                    } else {
                        May.setSprite("Left");
                    }
                } else {
                    inDialog = true;
                    text = currentMapNPC[nig].getText();
                    if (facing == 1) {
                        currentMapNPC[nig].setSprite("Down");
                    } else if (facing == 2) {
                        currentMapNPC[nig].setSprite("Up");
                    } else if (facing == 3) {
                        currentMapNPC[nig].setSprite("Right");
                    } else {
                        currentMapNPC[nig].setSprite("Left");
                    }
                    currentMapNPC[nig].talking = true;
                    if (currentMapNPC[nig].getActionNum() == BattleAblePokemon) {
                        lastBGM = currentBGM;
                        currentBGM.stop();
                        if ("Mewtwo".equals(currentMapNPC[nig].getName())) {
                            currentBGM = mewtwobattle;
                            PokedexIndex[150][0]++;
                            wildPokemon.create(150, 100);
                        } else if ("Lugia".equals(currentMapNPC[nig].getName())) {
                            currentBGM = lugiaHoohbattle;
                            wildPokemon.create(151, 70);
                            PokedexIndex[151][0]++;
                        } else if ("Ho-oh".equals(currentMapNPC[nig].getName())) {
                            currentBGM = lugiaHoohbattle;
                            wildPokemon.create(152, 70);
                            PokedexIndex[152][0]++;
                        } else if ("Articuno".equals(currentMapNPC[nig].getName())) {
                            currentBGM = legendarybirdbattle;
                            wildPokemon.create(144, 50);
                            PokedexIndex[144][0]++;
                        } else if ("Moltras".equals(currentMapNPC[nig].getName())) {
                            currentBGM = legendarybirdbattle;
                            wildPokemon.create(146, 50);
                            PokedexIndex[146][0]++;
                        } else if ("Zapidos".equals(currentMapNPC[nig].getName())) {
                            currentBGM = legendarybirdbattle;
                            wildPokemon.create(145, 50);
                            PokedexIndex[145][0]++;
                        }
                        enemyparty[0] = wildPokemon;
                        enemyparty[1] = null;
                        enemyparty[2] = null;
                        enemyparty[3] = null;
                        enemyparty[4] = null;
                        enemyparty[5] = null;
                        currentBGM.start();
                        wait(1);
                        inBattle = true;
                        currentMapNPC[nig].remove();
                        Battle = new Battle(this, pokemonparty, enemyparty, null, true);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                        }
                    } else if (currentMapNPC[nig].getActionNum() == SmashRock && pickaxe) {
                        text = "Used pickaxe to break apart rock.";
                        currentMapNPC[nig].remove();
                    } else if (currentMapNPC[nig].getActionNum() == Tree && machete) {
                        text = "Used machete to cut down tree.";
                        currentMapNPC[nig].remove();
                    } else if (currentMapNPC[nig].getActionNum() == FindableItem) {
                        if ("Town1".equals(MapLoc)) {
                            if (!SelectedFirstPokemon) {
                                SelectingPokemon = true;
                                inQuestion = true;
                                if (yes) {
                                    SelectingPokemon = false;
                                    if (currentMapNPC[nig] == squirtle) {
                                        first.create(1, 5);
                                        text = "Squirtle is Your first Pokemon!";
                                    } else if (currentMapNPC[nig] == charmander) {
                                        first.create(4, 5);
                                        text = "Charmander is Your first Pokemon!";
                                    } else if (currentMapNPC[nig] == bulbasuar) {
                                        first.create(7, 5);
                                        text = "Bulbasuar is Your first Pokemon!";
                                    }
                                    currentMapNPC[nig].remove();
                                    yes = false;
                                }
                                SelectedFirstPokemon = !SelectedFirstPokemon;
                            } else if (!MaysFirst) {
                                SelectingPokemon = true;
                                inQuestion = true;
                                if (yes) {
                                    SelectingPokemon = false;
                                    if (currentMapNPC[nig] == squirtle) {
                                        first.create(1, 5);
                                        text = "Squirtle is Your first Pokemon!";
                                    } else if (currentMapNPC[nig] == charmander) {
                                        first.create(4, 5);
                                        text = "Charmander is Your first Pokemon!";
                                    } else if (currentMapNPC[nig] == bulbasuar) {
                                        first.create(7, 5);
                                        text = "Bulbasuar is Your first Pokemon!";
                                    }
                                    currentMapNPC[nig].remove();
                                    yes = false;
                                }
                            }
                        } else {
                            if (Integer.parseInt(currentMapNPC[nig].getName()) < 20) {
                                Potions[Integer.parseInt(currentMapNPC[nig].getName())].addOne();
                            } else if (Integer.parseInt(currentMapNPC[nig].getName()) < 32) {
                                Holdables[Integer.parseInt(currentMapNPC[nig].getName())].addOne();
                            } else if (Integer.parseInt(currentMapNPC[nig].getName()) < 36) {
                                Balls[Integer.parseInt(currentMapNPC[nig].getName())].addOne();
                            } else if (Integer.parseInt(currentMapNPC[nig].getName()) > 36) {
                                Tools[Integer.parseInt(currentMapNPC[nig].getName())].addOne();
                            }
                            currentMapNPC[nig].remove();
                        }
                    } else if (currentMapNPC[nig].getActionNum() == Healer) {
                        if (noob) {
                            changeBGM(healing);
                            first.Heal();
                            second.Heal();
                            third.Heal();
                            fourth.Heal();
                            fifth.Heal();
                            sixth.Heal();
                            wait(2);
                            changeBGM(pokecenter);
                            noob = false;
                        }
                    } else if (currentMapNPC[nig].getActionNum() == 51) {
                        button1 = !button1;
                        if (button1) {
                            bridge2.setSprite(null);
                            Barrier1.remove();
                            Barrier2.remove();
                            Barrier3.remove();
                            Barrier4.remove();
                            Barrier5.remove();
                            Barrier6.remove();
                            Barrier7.remove();
                            Barrier8.remove();
                        } else {
                            bridge2.setSprite(Bridge2);
                            Barrier1.Return();
                            Barrier2.Return();
                            Barrier3.Return();
                            Barrier4.Return();
                            Barrier5.Return();
                            Barrier6.Return();
                            Barrier7.Return();
                            Barrier8.Return();
                        }
                    } else if (currentMapNPC[nig].getActionNum() == 52) {
                        button2 = !button2;
                        if (button2) {
                            bridge1.setSprite(null);
                            Barrier9.remove();
                            Barrier10.remove();
                            Barrier11.remove();
                            Barrier12.remove();
                            Barrier13.remove();
                            Barrier14.remove();
                        } else {
                            bridge1.setSprite(Bridge1);
                            Barrier9.Return();
                            Barrier10.Return();
                            Barrier11.Return();
                            Barrier12.Return();
                            Barrier13.Return();
                            Barrier14.Return();
                        }
                    } else if (currentMapNPC[nig].getActionNum() == 53) {
                        bridge1.setSprite(Bridge1);
                        bridge2.setSprite(Bridge2);
                        bridge3.setSprite(Bridge3);
                        bridge4.setSprite(Bridge4);
                        bridge5.setSprite(Bridge5);
                        bridge6.setSprite(Bridge6);
                        Barrier1.Return();
                        Barrier2.Return();
                        Barrier3.Return();
                        Barrier4.Return();
                        Barrier5.Return();
                        Barrier6.Return();
                        Barrier7.Return();
                        Barrier8.Return();
                        Barrier9.Return();
                        Barrier10.Return();
                        Barrier11.Return();
                        Barrier12.Return();
                        Barrier13.Return();
                        Barrier14.Return();
                        Barrier15.Return();
                        Barrier16.Return();
                        Barrier17.Return();
                        Barrier18.Return();
                        Barrier19.Return();
                        Barrier20.Return();
                        Barrier21.Return();
                        Barrier22.Return();
                        Barrier23.Return();
                        Barrier24.Return();
                        Barrier25.Return();
                        Barrier26.Return();
                        Barrier27.Return();
                        Barrier28.Return();
                        Barrier29.Return();
                        Barrier30.Return();
                        Barrier31.Return();
                        Barrier32.Return();
                        Barrier33.Return();
                        Barrier34.Return();
                        Barrier35.Return();
                        Barrier36.Return();
                        Barrier37.Return();
                        Barrier38.Return();
                        Barrier39.Return();
                        Barrier40.Return();
                    } else if (currentMapNPC[nig].getActionNum() == 54) {
                        button4 = !button4;
                        if (button4) {
                            bridge5.setSprite(null);
                            Barrier15.remove();
                            Barrier16.remove();
                            Barrier17.remove();
                            Barrier18.remove();
                            Barrier19.remove();
                            Barrier20.remove();
                            Barrier21.remove();
                            Barrier22.remove();
                        } else {
                            bridge5.setSprite(Bridge5);
                            Barrier15.Return();
                            Barrier16.Return();
                            Barrier17.Return();
                            Barrier18.Return();
                            Barrier19.Return();
                            Barrier20.Return();
                            Barrier21.Return();
                            Barrier22.Return();
                        }
                    } else if (currentMapNPC[nig].getActionNum() == 55) {
                        button5 = !button5;
                        if (button5) {
                            bridge6.setSprite(null);
                            Barrier23.remove();
                            Barrier24.remove();
                            Barrier25.remove();
                            Barrier26.remove();
                        } else {
                            bridge6.setSprite(Bridge6);
                            Barrier23.Return();
                            Barrier24.Return();
                            Barrier25.Return();
                            Barrier26.Return();
                        }
                    } else if (currentMapNPC[nig].getActionNum() == 56) {
                        button6 = !button6;
                        if (button6) {
                            bridge3.setSprite(null);
                            Barrier27.remove();
                            Barrier28.remove();
                            Barrier29.remove();
                            Barrier30.remove();
                            Barrier31.remove();
                            Barrier32.remove();
                            Barrier33.remove();
                            Barrier34.remove();
                        } else {
                            bridge3.setSprite(Bridge3);
                            Barrier27.Return();
                            Barrier28.Return();
                            Barrier29.Return();
                            Barrier30.Return();
                            Barrier31.Return();
                            Barrier32.Return();
                            Barrier33.Return();
                            Barrier34.Return();
                        }
                    } else if (currentMapNPC[nig].getActionNum() == 57) {
                        button7 = !button7;
                        if (button7) {
                            bridge4.setSprite(null);
                            Barrier35.remove();
                            Barrier36.remove();
                            Barrier37.remove();
                            Barrier38.remove();
                            Barrier39.remove();
                            Barrier40.remove();
                        } else {
                            bridge4.setSprite(Bridge4);
                            Barrier35.Return();
                            Barrier36.Return();
                            Barrier37.Return();
                            Barrier38.Return();
                            Barrier39.Return();
                            Barrier40.Return();
                        }
                    } else if (currentMapNPC[nig].getActionNum() == 58) {
                        bridge1.setSprite(null);
                        bridge2.setSprite(null);
                        bridge3.setSprite(null);
                        bridge4.setSprite(null);
                        bridge5.setSprite(null);
                        bridge6.setSprite(null);
                        Barrier1.remove();
                        Barrier2.remove();
                        Barrier3.remove();
                        Barrier4.remove();
                        Barrier5.remove();
                        Barrier6.remove();
                        Barrier7.remove();
                        Barrier8.remove();
                        Barrier9.remove();
                        Barrier10.remove();
                        Barrier11.remove();
                        Barrier12.remove();
                        Barrier13.remove();
                        Barrier14.remove();
                        Barrier15.remove();
                        Barrier16.remove();
                        Barrier17.remove();
                        Barrier18.remove();
                        Barrier19.remove();
                        Barrier20.remove();
                        Barrier21.remove();
                        Barrier22.remove();
                        Barrier23.remove();
                        Barrier24.remove();
                        Barrier25.remove();
                        Barrier26.remove();
                        Barrier27.remove();
                        Barrier28.remove();
                        Barrier29.remove();
                        Barrier30.remove();
                        Barrier31.remove();
                        Barrier32.remove();
                        Barrier33.remove();
                        Barrier34.remove();
                        Barrier35.remove();
                        Barrier36.remove();
                        Barrier37.remove();
                        Barrier38.remove();
                        Barrier39.remove();
                        Barrier40.remove();
                    }
                }
            }
        }
        if (inDialog) {
            if (inQuestion) {
                if (SelectingPokemon) {
                    Pokemon tmpPokemon = new Pokemon();
                    if (currentMapNPC[nig] == squirtle) {
                        tmpPokemon.create(1, 5);
                    } else if (currentMapNPC[nig] == charmander) {
                        tmpPokemon.create(4, 5);
                    } else if (currentMapNPC[nig] == bulbasuar) {
                        tmpPokemon.create(7, 5);
                    }
                    g.drawImage(SelectingPokemonFrame, 150, 150, null);
                    g.drawImage(currentMapNPC[nig].getSprite(), 155, 155, null);
                }
                g.drawImage(YesNo, 300, 200, null);
                if (curYesNoSelect == 1) {
                    g.drawImage(arrow, 394, 148, null);
                } else if (curYesNoSelect == 0) {
                    g.drawImage(arrow, 394, 180, null);
                }
            }
            g.drawImage(messagebox, 0, 0, null);
            if (text.length() > 20) {
                g.drawString(text.substring(0, text.length() / 2), 25, 255);
                g.drawString(text.substring(text.length() / 2), 25, 275);
            } else {
                g.drawString(text, 25, 255);
            }
        }
    }

    public void checkBattle() {
        if (noBattle == false) {
            if (stepscount >= rndwildmodify) {
                lastBGM = currentBGM;
                currentBGM.stop();
                currentBGM = wildbattle;
                currentBGM.start();
                enemylvl = (byte) (first.getLevel() * (9 / 10));
                if (r == 1) {
                    wildPokemon.create(198, enemylvl);
                } else if (r == 2) {
                    wildPokemon.create(4, enemylvl); //Creates a wild Charmander
                } else if (r == 3) {
                    wildPokemon.create(25, enemylvl);
                } else if (r == 4) {
                    wildPokemon.create(100, enemylvl);
                } else {
                    wildPokemon.create(101, enemylvl);
                }
                enemyparty[0] = wildPokemon;
                enemyparty[1] = null;
                enemyparty[2] = null;
                enemyparty[3] = null;
                enemyparty[4] = null;
                enemyparty[5] = null;
                wait(1);
                inBattle = true;
                PokedexIndex[wildPokemon.getNumber()][0]++;
                Battle = new Battle(this, pokemonparty, enemyparty, null, true);
                stepscount = 0;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public void startgame() {
        if (continued == true) {
            loadGame();
        } else {
            currentMapNPC = Town1NPCs;
            storyline = 0;
            name = "Gold";
            alec.setName(name);
            alec.createTrainerID();
            currentX_loc = 3 - 7;
            currentY_loc = 154 - 4;
            posX_tile = (short) (currentX_loc + 7);
            posY_tile = (short) (currentY_loc + 4);
            first.create(4, 5);
            second.create(134, 10);
            third.create(151, 99);
            fourth.create(26, 13);
            fifth.create(58, 100);
            sixth.create(128, 1);
            pokemonparty[0] = first;
            pokemonparty[1] = second;
            pokemonparty[2] = third;
            pokemonparty[3] = fourth;
            pokemonparty[4] = fifth;
            pokemonparty[5] = sixth;
            money = 2000;
            for (int i = 0; i < 45;) {
                if (i < 21) {
                    Potions[potion].create(i, 1);
                    potion++;
                } else if (i < 33) {
                    Holdables[hold].create(i, 1);
                    hold++;
                } else if (i < 37) {
                    Balls[ball].create(i, 1);
                    ball++;
                } else if (i > 36) {
                    Tools[tool].create(i, 1);
                    tool++;
                }
                i++;
            }
        }
        pickaxe = true;
        machete = true;
        swim = true;
        SE.stopAllClips();
        currentBGM = Town1;
        currentBGM.start();
        alec.setSprite(Down);
        atTitle = false;
        atContinueScreen = false;
        gamestarted = true;
        movable = true;
        timePlayed = java.lang.System.currentTimeMillis();
        gameTimer.setDelay(23);
    }

    public void saveGame() {
        BufferedWriter bufferedWriter = null;
        try {
            File oldsave = new File("Data/profile.sav");
            oldsave.delete();
            File newsave = new File("Data/profile.sav");
            newsave.createNewFile();
            bufferedWriter = new BufferedWriter(new FileWriter("Data/profile.sav"));

            //player data

            bufferedWriter.write("" + storyline);
            bufferedWriter.newLine();
            bufferedWriter.write(alec.getName());
            bufferedWriter.newLine();
            bufferedWriter.write("" + alec.getID());
            bufferedWriter.newLine();
            bufferedWriter.write("" + posX_tile);
            bufferedWriter.newLine();
            bufferedWriter.write("" + posY_tile);
            bufferedWriter.newLine();
            bufferedWriter.write("" + money);
            bufferedWriter.newLine();
            bufferedWriter.write("" + Badge1);
            bufferedWriter.newLine();
            bufferedWriter.write("" + Badge2);
            bufferedWriter.newLine();
            bufferedWriter.write("" + Badge3);
            bufferedWriter.newLine();
            bufferedWriter.write("" + Badge4);
            bufferedWriter.newLine();
            bufferedWriter.write("" + Badge5);
            bufferedWriter.newLine();
            bufferedWriter.write("" + Badge6);
            bufferedWriter.newLine();
            bufferedWriter.write("" + Badge7);
            bufferedWriter.newLine();
            bufferedWriter.write("" + Badge8);
            bufferedWriter.newLine();

            //items

            for (int i = 0; i < 25;) {
                bufferedWriter.write("" + Potions[i].getItemNum());
                bufferedWriter.newLine();
                bufferedWriter.write("" + Potions[i].getAmount());
                bufferedWriter.newLine();
                i++;
            }
            for (int i = 0; i < 15;) {
                bufferedWriter.write("" + Holdables[i].getItemNum());
                bufferedWriter.newLine();
                bufferedWriter.write("" + Holdables[i].getAmount());
                bufferedWriter.newLine();
                i++;
            }
            for (int i = 0; i < 5;) {
                bufferedWriter.write("" + Balls[i].getItemNum());
                bufferedWriter.newLine();
                bufferedWriter.write("" + Balls[i].getAmount());
                bufferedWriter.newLine();
                i++;
            }
            for (int i = 0; i < 10;) {
                bufferedWriter.write("" + Tools[i].getItemNum());
                bufferedWriter.newLine();
                bufferedWriter.write("" + Tools[i].getAmount());
                bufferedWriter.newLine();
                i++;
            }
            bufferedWriter.write("" + potion);
            bufferedWriter.newLine();
            bufferedWriter.write("" + hold);
            bufferedWriter.newLine();
            bufferedWriter.write("" + ball);
            bufferedWriter.newLine();
            bufferedWriter.write("" + tool);
            bufferedWriter.newLine();
            bufferedWriter.write("" + pickaxe);
            bufferedWriter.newLine();
            bufferedWriter.write("" + swim);
            bufferedWriter.newLine();
            bufferedWriter.write("" + machete);
            bufferedWriter.newLine();

            //pokemon

            bufferedWriter.write("" + first.getNumber());
            bufferedWriter.newLine();
            bufferedWriter.write("" + first.getNumber());
            bufferedWriter.newLine();
            bufferedWriter.write("" + first.getLevel());
            bufferedWriter.newLine();
            bufferedWriter.write("" + second.getNumber());
            bufferedWriter.newLine();
            bufferedWriter.write("" + second.getLevel());
            bufferedWriter.newLine();
            bufferedWriter.write("" + third.getNumber());
            bufferedWriter.newLine();
            bufferedWriter.write("" + third.getLevel());
            bufferedWriter.newLine();
            bufferedWriter.write("" + fourth.getNumber());
            bufferedWriter.newLine();
            bufferedWriter.write("" + fourth.getLevel());
            bufferedWriter.newLine();
            bufferedWriter.write("" + fifth.getNumber());
            bufferedWriter.newLine();
            bufferedWriter.write("" + fifth.getLevel());
            bufferedWriter.newLine();
            bufferedWriter.write("" + sixth.getNumber());
            bufferedWriter.newLine();
            bufferedWriter.write("" + sixth.getLevel());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void loadGame() {
        File file = new File("Data/SaveFile.sav");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            //player data

            storyline = Integer.parseInt(dis.readLine());
            alec.setName(dis.readLine());
            alec.setID(Integer.parseInt(dis.readLine()));
            currentX_loc = (short) (Short.parseShort(dis.readLine()) - 7);
            currentY_loc = (short) (Short.parseShort(dis.readLine()) - 4);
            posX_tile = (short) (currentX_loc + 7);
            posY_tile = (short) (currentY_loc + 4);
            money = Integer.parseInt(dis.readLine());
            Badge1 = Boolean.parseBoolean(dis.readLine());
            Badge2 = Boolean.parseBoolean(dis.readLine());
            Badge3 = Boolean.parseBoolean(dis.readLine());
            Badge4 = Boolean.parseBoolean(dis.readLine());
            Badge5 = Boolean.parseBoolean(dis.readLine());
            Badge6 = Boolean.parseBoolean(dis.readLine());
            Badge7 = Boolean.parseBoolean(dis.readLine());
            Badge8 = Boolean.parseBoolean(dis.readLine());

            //items

            for (int i = 0; i < 25;) {
                Potions[i].create(Integer.parseInt(dis.readLine()), Integer.parseInt(dis.readLine()));
                i++;
            }
            for (int i = 0; i < 15;) {
                Holdables[i].create(Integer.parseInt(dis.readLine()), Integer.parseInt(dis.readLine()));
                i++;
            }
            for (int i = 0; i < 5;) {
                Balls[i].create(Integer.parseInt(dis.readLine()), Integer.parseInt(dis.readLine()));
                i++;
            }
            for (int i = 0; i < 10;) {
                Tools[i].create(Integer.parseInt(dis.readLine()), Integer.parseInt(dis.readLine()));
                i++;
            }
            potion = Byte.parseByte(dis.readLine());
            hold = Byte.parseByte(dis.readLine());
            ball = Byte.parseByte(dis.readLine());
            tool = Byte.parseByte(dis.readLine());
            pickaxe = Boolean.parseBoolean(dis.readLine());
            swim = Boolean.parseBoolean(dis.readLine());
            machete = Boolean.parseBoolean(dis.readLine());

            //pokemon

            first.create(Integer.parseInt(dis.readLine()), Integer.parseInt(dis.readLine()));
            second.create(Integer.parseInt(dis.readLine()), Integer.parseInt(dis.readLine()));
            third.create(Integer.parseInt(dis.readLine()), Integer.parseInt(dis.readLine()));
            fourth.create(Integer.parseInt(dis.readLine()), Integer.parseInt(dis.readLine()));
            fifth.create(Integer.parseInt(dis.readLine()), Integer.parseInt(dis.readLine()));
            sixth.create(Integer.parseInt(dis.readLine()), Integer.parseInt(dis.readLine()));
            pokemonparty[0] = first;
            pokemonparty[1] = second;
            pokemonparty[2] = third;
            pokemonparty[3] = fourth;
            pokemonparty[4] = fifth;
            pokemonparty[5] = sixth;
            fis.close();
            bis.close();
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void wait(int n) {
        long t0, t1;
        t0 = System.currentTimeMillis();
        do {
            t1 = System.currentTimeMillis();
        } while ((t1 - t0) < (n * 1000));
    }

    public static void main(String[] Args) {
        jf = new JFrame("Pokemon: Alec Version");
        PokemonAlecVersion pokemon = new PokemonAlecVersion();
        jf.add(pokemon);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = jf.getSize().width;
        int h = jf.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        jf.setLocation(x, y);
        jf.setVisible(true);
        pokemon.requestFocus(true);
    }
}
