package pokemonalecversion;

import java.util.Random;

public class Attacks {

    private String move;
    private int Accuracy;
    private int ExecuteTime;
    private byte type;
    private int damage;
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
    private byte times;

    public Attacks(String name) {
        move = name;
        if ("Absorb".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 20;
            Accuracy = 100;
            type = normal;
        } else if ("Acid".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            type = poison;
            Accuracy = 100;
        } else if ("Acid Armor".equals(move)) {
            ExecuteTime = 100 - (2 * (40));
            damage = 0;
            Accuracy = 100;
            type = poison;
        } else if ("Agility".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = psychic;
            Accuracy = 100;
        } else if ("Amnesia".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = psychic;
            Accuracy = 100;
        } else if ("Aurora Beam".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 65;
            type = ice;
            Accuracy = 100;
        } else if ("Barrage".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 15;
            Accuracy = 85;
            type = normal;
        } else if ("Barrier".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = psychic;
            Accuracy = 100;
        } else if ("Bide".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            Accuracy = 100;
            type = normal;
        } else if ("Bind".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 15;
            type = normal;
            Accuracy = 75;
        } else if ("Bite".equals(move)) {
            ExecuteTime = 100 - (2 * (25));
            damage = 60;
            type = normal;
            Accuracy = 100;
        } else if ("Blizzard".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 120;
            type = ice;
            Accuracy = 90;
        } else if ("Body Slam".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 85;
            Accuracy = 100;
            type = normal;
        } else if ("Bone Club".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 65;
            Accuracy = 85;
            type = ground;
        } else if ("Bonemerang".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 50;
            type = ground;
            Accuracy = 90;
        } else if ("Bubble".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 20;
            Accuracy = 100;
            type = water;
        } else if ("Bubblebeam".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 65;
            Accuracy = 100;
            type = water;
        } else if ("Clamp".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 35;
            Accuracy = 75;
            type = water;
        } else if ("Comet Punch".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 18;
            type = normal;
            Accuracy = 85;
        } else if ("Confuse Ray".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            type = ghost;
            Accuracy = 100;
        } else if ("Confusion".equals(move)) {
            ExecuteTime = 100 - (2 * (25));
            damage = 50;
            type = normal;
            Accuracy = 100;
        } else if ("Constrict".equals(move)) {
            ExecuteTime = 100 - (2 * (35));
            damage = 10;
            type = normal;
            Accuracy = 100;
        } else if ("Conversion".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Counter".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = fighting;
            Accuracy = 100;
        } else if ("Crabhammer".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 90;
            type = water;
            Accuracy = 85;
        } else if ("Defense Curl".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Dig".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 60;
            type = ground;
            Accuracy = 100;
        } else if ("Disable".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = normal;
            Accuracy = 55;
        } else if ("Dizzy Punch".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 70;
            type = normal;
            Accuracy = 100;
        } else if ("Double-Edge".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 100;
            type = normal;
            Accuracy = 100;
        } else if ("Double Kick".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 30;
            type = fighting;
            Accuracy = 100;
        } else if ("Double Slap".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 15;
            type = normal;
            Accuracy = 85;
        } else if ("Double Team".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Dragon Rage".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            type = dragon;
            Accuracy = 100;
        } else if ("Dream Eater".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 100;
            type = psychic;
            Accuracy = 100;
        } else if ("Drill Peck".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 80;
            type = flying;
            Accuracy = 100;
        } else if ("Earthquake".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 100;
            type = ground;
            Accuracy = 100;
        } else if ("Egg Bomb".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 100;
            type = normal;
            Accuracy = 75;
        } else if ("Ember".equals(move)) {
            ExecuteTime = 100 - (2 * (25));
            damage = 40;
            type = fire;
            Accuracy = 100;
        } else if ("Explosion".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 250;
            type = fire;
            Accuracy = 100;
        } else if ("Fire Blast".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 120;
            type = fire;
            Accuracy = 85;
        } else if ("Fire Punch".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 75;
            type = fire;
            Accuracy = 100;
        } else if ("Fire Spin".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 15;
            type = fire;
            Accuracy = 70;
        } else if ("Fissure".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 0;
            Accuracy = 30;
            type = ground;
        } else if ("Flamethrower".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 95;
            Accuracy = 100;
            type = fire;
        } else if ("Focus Energy".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Fury Attack".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 15;
            type = normal;
            Accuracy = 85;
        } else if ("Fury Swipes".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 18;
            type = normal;
            Accuracy = 80;
        } else if ("Glare".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = normal;
            Accuracy = 75;
        } else if ("Growl".equals(move)) {
            ExecuteTime = 100 - (2 * (40));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Growth".equals(move)) {
            ExecuteTime = 100 - (2 * (40));
            damage = 0;
            Accuracy = 100;
            type = normal;
        } else if ("Guillotine".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 0;
            type = normal;
            Accuracy = 30;
        } else if ("Gust".equals(move)) {
            ExecuteTime = 100 - (2 * (35));
            damage = 40;
            Accuracy = 100;
            type = flying;
        } else if ("Harden".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Haze".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = ice;
            Accuracy = 100;
        } else if ("Headbutt".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 70;
            Accuracy = 100;
            type = normal;
        } else if ("High Jump Kick".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 85;
            type = fighting;
            Accuracy = 90;
        } else if ("Horn Attack".equals(move)) {
            ExecuteTime = 100 - (2 * (25));
            damage = 65;
            type = normal;
            Accuracy = 100;
        } else if ("Horn Drill".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 0;
            type = normal;
            Accuracy = 30;
        } else if ("Hydro Pump".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 120;
            Accuracy = 80;
            type = water;
        } else if ("Hyper Beam".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 150;
            Accuracy = 90;
            type = normal;
        } else if ("Hyper Fang".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 80;
            type = ice;
            Accuracy = 90;
        } else if ("Hypnosis".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = psychic;
            Accuracy = 60;
        } else if ("Ice Beam".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 95;
            type = ice;
            Accuracy = 100;
        } else if ("Ice Punch".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 75;
            type = ice;
            Accuracy = 100;
        } else if ("Jump Kick".equals(move)) {
            ExecuteTime = 100 - (2 * (25));
            damage = 70;
            Accuracy = 95;
            type = fighting;
        } else if ("Karate Chop".equals(move)) {
            ExecuteTime = 100 - (2 * (25));
            damage = 50;
            Accuracy = 100;
            type = normal;
        } else if ("Kinesis".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 0;
            type = psychic;
            Accuracy = 80;
        } else if ("Leech Life".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 20;
            type = bug;
            Accuracy = 100;
        } else if ("Leech Seed".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            Accuracy = 90;
            type = grass;
        } else if ("Leer".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            Accuracy = 100;
            type = normal;
        } else if ("Lick".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 20;
            Accuracy = 100;
            type = ghost;
        } else if ("Light Screen".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            Accuracy = 100;
            type = psychic;
        } else if ("Lovely Kiss".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            Accuracy = 75;
            type = normal;
        } else if ("Low Kick".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 50;
            type = fighting;
            Accuracy = 90;
        } else if ("Meditate".equals(move)) {
            ExecuteTime = 100 - (2 * (40));
            damage = 0;
            type = psychic;
            Accuracy = 100;
        } else if ("Mega Drain".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 40;
            Accuracy = 100;
            type = grass;
        } else if ("Mega Kick".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 120;
            Accuracy = 75;
            type = normal;
        } else if ("Mega Punch".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 80;
            Accuracy = 85;
            type = normal;
        } else if ("Metronome".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Mimic".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            Accuracy = 100;
            damage = 0;
            type = normal;
        } else if ("Minimize".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            Accuracy = 100;
            type = normal;
        } else if ("Mirror Move".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            Accuracy = 100;
            type = flying;
        } else if ("Mist".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = ice;
            Accuracy = 100;
        } else if ("Night Shade".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 0;
            type = ghost;
            Accuracy = 100;
        } else if ("Pay Day".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 40;
            type = normal;
            Accuracy = 100;
        } else if ("Peck".equals(move)) {
            ExecuteTime = 100 - (2 * (35));
            damage = 35;
            type = flying;
            Accuracy = 100;
        } else if ("Petal Dance".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 70;
            type = grass;
            Accuracy = 100;
        } else if ("Pin Missile".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 14;
            type = bug;
            Accuracy = 85;
        } else if ("Poison Gas".equals(move)) {
            ExecuteTime = 100 - (2 * (40));
            damage = 0;
            type = poison;
            Accuracy = 55;
        } else if ("Poison Sting".equals(move)) {
            ExecuteTime = 100 - (2 * (35));
            Accuracy = 100;
            type = poison;
            damage = 15;
        } else if ("Poison Powder".equals(move)) {
            ExecuteTime = 100 - (2 * (35));
            damage = 0;
            Accuracy = 75;
            type = poison;
        } else if ("Pound".equals(move)) {
            ExecuteTime = 100 - (2 * (35));
            damage = 40;
            type = normal;
            Accuracy = 100;
        } else if ("Psybeam".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            type = psychic;
            damage = 65;
            Accuracy = 100;
        } else if ("Psychic".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 90;
            type = psychic;
            Accuracy = 100;
        } else if ("Psywave".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 0;
            type = psychic;
            Accuracy = 80;
        } else if ("Quick Attack".equals(move)) {
            ExecuteTime = 100 - (2 * (45));
            damage = 40;
            type = normal;
            Accuracy = 100;
        } else if ("Rage".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            type = normal;
            damage = 20;
            Accuracy = 100;
        } else if ("Razor Leaf".equals(move)) {
            ExecuteTime = 100 - (2 * (25));
            damage = 55;
            type = grass;
            Accuracy = 95;
        } else if ("Razor Wind".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 80;
            type = normal;
            Accuracy = 75;
        } else if ("Recover".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = psychic;
            Accuracy = 100;
        } else if ("Reflect".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = psychic;
            Accuracy = 100;
        } else if ("Rest".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            Accuracy = 100;
            type = psychic;
        } else if ("Roar".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Rock Slide".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 75;
            Accuracy = 90;
            type = rock;
        } else if ("Rock Throw".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 50;
            type = rock;
            Accuracy = 75;
        } else if ("Rolling Kick".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 60;
            type = fighting;
            Accuracy = 85;
        } else if ("Sand Attack".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Scratch".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 40;
            type = normal;
            Accuracy = 100;
        } else if ("Screech".equals(move)) {
            ExecuteTime = 100 - (2 * (40));
            damage = 0;
            Accuracy = 85;
            type = normal;
        } else if ("Seismic Toss".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            Accuracy = 100;
            type = fighting;
        } else if ("Self Destruct".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 200;
            Accuracy = 100;
            type = normal;
        } else if ("Sharpen".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Sing".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 0;
            type = normal;
            Accuracy = 55;
        } else if ("Skull Bash".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 100;
            Accuracy = 100;
            type = normal;
        } else if ("Sky Attack".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 140;
            Accuracy = 90;
            type = flying;
        } else if ("Slam".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 80;
            type = normal;
            Accuracy = 75;
        } else if ("Slash".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 70;
            type = normal;
            Accuracy = 100;
        } else if ("Sleep Powder".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 0;
            type = grass;
            Accuracy = 75;
        } else if ("Sludge".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 65;
            type = poison;
            Accuracy = 100;
        } else if ("Smog".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 20;
            type = poison;
            Accuracy = 70;
        } else if ("Smokescreen".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Softboiled".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 50;
            Accuracy = 100;
            type = normal;
        } else if ("Solarbeam".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            damage = 120;
            Accuracy = 100;
            type = grass;
        } else if ("Sonic Boom".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            Accuracy = 90;
            type = normal;
        } else if ("Spike Cannon".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 20;
            type = normal;
            Accuracy = 100;
        } else if ("Splash".equals(move)) {
            ExecuteTime = 100 - (2 * (40));
            damage = 0;
            Accuracy = 100;
            type = normal;
        } else if ("Spore".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 0;
            type = grass;
            Accuracy = 100;
        } else if ("Stomp".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 65;
            Accuracy = 100;
            type = normal;
        } else if ("String Shot".equals(move)) {
            ExecuteTime = 100 - (2 * (40));
            damage = 0;
            Accuracy = 100;
            type = normal;
        } else if ("Stun Spore".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            Accuracy = 75;
            type = grass;
        } else if ("Submission".equals(move)) {
            ExecuteTime = 100 - (2 * (25));
            damage = 80;
            Accuracy = 80;
            type = fighting;
        } else if ("Substitute".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            Accuracy = 100;
            type = normal;
        } else if ("Super Fang".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            type = normal;
            Accuracy = 90;
        } else if ("Supersonic".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            Accuracy = 55;
            type = normal;
        } else if ("Surf".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 95;
            type = water;
            Accuracy = 100;
        } else if ("Swift".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 60;
            Accuracy = 999;
            type = normal;
        } else if ("Swords Dance".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Tackle".equals(move)) {
            ExecuteTime = 100 - (2 * (35));
            damage = 35;
            type = normal;
            Accuracy = 95;
        } else if ("Tail Whip".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 0;
            Accuracy = 100;
            type = normal;
        } else if ("Take Down".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 90;
            type = normal;
            Accuracy = 85;
        } else if ("Teleport".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = psychic;
            Accuracy = 100;
        } else if ("Thrash".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 90;
            type = normal;
            Accuracy = 100;
        } else if ("Thunder".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 120;
            type = electric;
            Accuracy = 70;
        } else if ("Thunder Wave".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = electric;
            Accuracy = 100;
        } else if ("Thunderbolt".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 95;
            type = electric;
            Accuracy = 100;
        } else if ("Thunder Punch".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 75;
            Accuracy = 100;
            type = electric;
        } else if ("Thundershock".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 40;
            Accuracy = 100;
            type = electric;
        } else if ("Toxic".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            type = poison;
            Accuracy = 85;
        } else if ("Transform".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 0;
            type = normal;
            Accuracy = 100;
        } else if ("Tri Attack".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 80;
            type = normal;
            Accuracy = 100;
        } else if ("Twineedle".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 25;
            Accuracy = 100;
            type = bug;
        } else if ("Vice Grip".equals(move)) {
            ExecuteTime = 100 - (2 * (30));
            damage = 55;
            type = normal;
            Accuracy = 100;
        } else if ("Vine Whip".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            damage = 35;
            type = grass;
            Accuracy = 100;
        } else if ("Water Gun".equals(move)) {
            ExecuteTime = 100 - (2 * (25));
            damage = 40;
            Accuracy = 100;
            type = normal;
        } else if ("Waterfall".equals(move)) {
            ExecuteTime = 100 - (2 * (15));
            damage = 80;
            Accuracy = 100;
            type = normal;
        } else if ("Whirlwind".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            damage = 0;
            type = flying;
            Accuracy = 85;
        } else if ("Wing Attack".equals(move)) {
            ExecuteTime = 100 - (2 * (35));
            damage = 60;
            type = flying;
            Accuracy = 100;
        } else if ("Withdraw".equals(move)) {
            ExecuteTime = 100 - (2 * (40));
            damage = 0;
            type = water;
            Accuracy = 100;
        } else if ("Wrap".equals(move)) {
            ExecuteTime = 100 - (2 * (20));
            type = normal;
            damage = 5;
            Accuracy = 85;
        } else if ("Annoy".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            type = normal;
            damage = 150;
            Accuracy = 85;
        } else if ("Rape".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            type = normal;
            damage = 50;
            Accuracy = 70;
        } else if ("Molest".equals(move)) {
            ExecuteTime = 100 - (2 * (10));
            type = normal;
            damage = 50;
            Accuracy = 70;
        } else if ("Rainbow Squirt".equals(move)) {
            ExecuteTime = 100 - (2 * (5));
            type = normal;
            damage = 999;
            Accuracy = 80;
        } else if ("Psyball".equals(move)) {
            ExecuteTime = 100 - (2 * (25));
            type = psychic;
            damage = 70;
            Accuracy = 80;
        } else {
            damage = 0;
        }
    }

    public String use(Pokemon enemy, Pokemon user) {
        int moh;
        if ("Mimic".equals(move)) {
            moh = (int) Math.random() * 20;
            if (moh == 1) {
                move = enemy.move1;
            } else if (moh == 2) {
                move = enemy.move1;
            } else if (moh == 3) {
                move = enemy.move1;
            } else {
                move = enemy.move1;
            }
        } else if ("Metronome".equals(move)) {
            moh = (int) Math.random() * 10;
            if (moh == 1) {
                move = "Night Shade";
            } else if (moh == 2) {
                move = "Seismic Toss";
            } else if (moh == 3) {
                move = "Dizzy Punch";
            } else if (moh == 4) {
                move = "Gust";
            } else if (moh == 5) {
                move = "Fissure";
            } else if (moh == 6) {
                move = "Leer";
            } else if (moh == 7) {
                move = "Hyper Beam";
            } else if (moh == 8) {
                move = "Dragon Rage";
            } else if (moh == 9) {
                move = "Growl";
            } else if (moh == 10) {
                move = "Harden";
            } else if (moh == 11) {
                move = "Acid";
            } else if (moh == 12) {
                move = "Stomp";
            } else if (moh == 13) {
                move = "Peck";
            } else if (moh == 14) {
                move = "Tri Attack";
            } else if (moh == 15) {
                move = "Swift";
            } else if (moh == 16) {
                move = "Thundershock";
            } else if (moh == 17) {
                move = "Wing Attack";
            } else if (moh == 18) {
                move = "Fire Spin";
            } else if (moh == 19) {
                move = "Bubble";
            } else if (moh == 20) {
                move = "Double Team";
            } else {
                move = "Dream Eater";
            }
        }
        int modifier = 20;
        if (user.HoldItem == 26) {
            modifier = 15;
        }
        Random RandomGen = new Random();
        int r = RandomGen.nextInt(modifier);
        String output = "Haaaaaax";
        if (((int) (Math.random() * 100)) >= (Accuracy + user.TMPaccuracybump)) {
            output = "" + user.getName() + "'s Attack Missed!";
        } else {
            int PDamage;
            if (user.getTypeInt() == type) {
                PDamage = (damage + user.getAttack() + user.getSpAttack()) - enemy.getDeffense();
                if (enemy.getTypeInt() == type) {
                    PDamage = (damage + user.getAttack() + user.getSpAttack()) - (enemy.getDeffense() + enemy.getSpDeffense());
                }
            } else {
                PDamage = (damage + user.getAttack()) - enemy.getDeffense();
                if (enemy.getTypeInt() == type) {
                    PDamage = (damage + user.getAttack()) - (enemy.getDeffense() + enemy.getSpDeffense());
                }
            }
            if (PDamage < 0) {
                PDamage = 0;
            }
            if ("Absorb".equals(move)) {

                if ("water".equals(enemy.getType()) || "rock".equals(enemy.getType()) || "ground".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                output = "Absorbed " + (PDamage / 2) + " points of Health.";
                enemy.ChangeHealth(PDamage);
                user.ChangeHealth(-(PDamage / 2));
            } else if ("Acid".equals(move)) {
                if ("grass".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    enemy.curdef -= user.level;
                    output = "The acid lowered " + enemy.getName() + "'s deffense!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Acid Armor".equals(move)) {
                if (user.curdef >= 500) {
                    output = "" + user.getName() + "'s Deffense Won't go any higher!";
                }
                user.curdef *= 2;
                output = "" + user.getName() + "'s Deffense Doubled!";
                if (user.curdef >= 500) {
                    user.curdef = 500;
                }
            } else if ("Agility".equals(move)) {
                if (user.curspd >= 500) {
                    output = "" + user.getName() + "'s Speed Won't go any higher!";
                }
                user.curspd *= 2;
                output = "" + user.getName() + "'s Speed Doubled!";
                if (user.curspd >= 500) {
                    user.curspd = 500;
                }
            } else if ("Amnesia".equals(move)) {
                if (user.curspAttack >= 500) {
                    output = "" + user.getName() + "'s Specials Won't go any higher!";
                }
                user.curspAttack *= 2;
                output = "" + user.getName() + "'s Specials Doubled!";
                if (user.curspAttack >= 500) {
                    user.curspAttack = 500;
                }
                if (user.curspDef >= 500) {
                    output = "" + user.getName() + "'s Specials Won't go any higher!";
                }
                user.curspDef *= 2;
                output = "" + user.getName() + "'s Specials Doubled!";
                if (user.curspDef >= 500) {
                    user.curspDef = 500;
                }
            } else if ("Aurora Beam".equals(move)) {
                if ("grass".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "dragon".equals(enemy.getType()) || "flying".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    enemy.curattack -= user.level;
                    output = "The Cold Lowered " + enemy.getName() + "'s Attack!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + " was Froze Solid!";
                    enemy.setCondition("frozen");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Barrage".equals(move)) {
                int times;
                times = ((int) Math.random() * 3) + 2;
                output = "Hit " + times + " times!";
                enemy.ChangeHealth(PDamage * times);
            } else if ("Barrier".equals(move)) {
                if (user.curdef >= 500) {
                    output = "" + user.getName() + "'s Deffense Won't go any higher!";
                }
                user.curdef *= 2;
                output = "" + user.getName() + "'s Deffense Doubled!";
                if (user.curdef >= 500) {
                    user.curdef = 500;
                }
            } else if ("Bide".equals(move)) {
                PDamage = r * 5;
                enemy.ChangeHealth(PDamage);
                output = "Random attack equeled " + PDamage;
            } else if ("Bind".equals(move)) {
                int times;
                times = ((int) Math.random() * 3) + 2;
                output = "" + user.getName() + " Bound " + enemy.getName() + " for " + times + "0 seconds!";
                enemy.ChangeHealth(PDamage * times);
            } else if ("Bite".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    enemy.turnmodifier -= 100;
                    output = "" + enemy.getName() + " Flinched!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Blizzard".equals(move)) {
                if ("grass".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "dragon".equals(enemy.getType()) || "flying".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 4)) == 2) {
                    output = "" + enemy.getName() + " was Froze Solid!";
                    enemy.setCondition("frozen");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Body Slam".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 4)) == 2) {
                    output = "" + enemy.getName() + " was Paralyzed!";
                    enemy.setCondition("paralyzed");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Bone Club".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    enemy.turnmodifier -= 100;
                    output = "" + enemy.getName() + " Flinched!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Bonemerang".equals(move)) {
                if ((Math.random() * 3) <= 1) {
                    PDamage *= 2;
                    output = "Hit twice!";
                } else {
                    output = "Only hit once!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Bubble".equals(move)) {
                if ("fire".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + "'s Speed was lowered!";
                    enemy.curspd -= user.getLevel();
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Bubblebeam".equals(move)) {
                if ("fire".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + "'s Speed was lowered!";
                    enemy.curspd -= user.getLevel();
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Clamp".equals(move)) {
                int times;
                times = ((int) Math.random() * 3) + 2;
                output = "" + user.getName() + " Clamped onto " + enemy.getName() + " for " + times + "0 seconds!";
                enemy.ChangeHealth(PDamage * times);
            } else if ("Comet Punch".equals(move)) {
                int times;
                times = ((int) Math.random() * 3) + 2;
                output = " Hit " + times + " times!";
                enemy.ChangeHealth(PDamage * times);
            } else if ("Confuse Ray".equals(move)) {
                enemy.setCondition("confused");
                output = "" + enemy.getName() + " became confused!";
            } else if ("Confusion".equals(move)) {
                if ("fighting".equals(enemy.getType()) || "poison".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + " became confused!";
                    enemy.setCondition("confused");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Constrict".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + "'s Speed was lowered!";
                    enemy.curspd -= user.getLevel();
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Conversion".equals(move)) {
                enemy.type = (byte) user.getTypeInt();
                output = "" + enemy.getName() + "'s type became " + user.getType();
            } else if ("Counter".equals(move)) {
                if ((user.getHealth() - user.getHP()) <= 0) {
                    output = "Counter failed";
                } else {
                    enemy.ChangeHealth((user.getHealth() - user.getHP()));
                    output = "" + user.getName() + " took revenge!";
                }
            } else if ("Crabhammer".equals(move)) {
                PDamage += PDamage * (Math.random() * 1);
                output = "Critical Hit!";
            } else if ("Defense Curl".equals(move)) {
                if (user.getDeffense() >= 500) {
                    output = "" + user.getName() + "'s Defense won't go any higher!";
                } else {
                    user.curdef += user.getLevel();
                }
            } else if ("Dig".equals(move)) {
                if ("fire".equals(enemy.getType()) || "electric".equals(enemy.getType()) || "poison".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else {
                    output = "" + user.getName() + " was just underground... No Questions!";
                }
            } else if ("Disable".equals(move)) {
                r = RandomGen.nextInt(4) + 1;
                if (r == 1) {
                    output = "" + enemy.getName() + "'s " + enemy.move1 + " was Disabled!";
                    enemy.move1 = "Disabled";
                } else if (r == 2) {
                    output = "" + enemy.getName() + "'s " + enemy.move1 + " was Disabled!";
                    enemy.move2 = "Disabled";
                } else if (r == 3) {
                    output = "" + enemy.getName() + "'s " + enemy.move1 + " was Disabled!";
                    enemy.move3 = "Disabled";
                } else {
                    output = "But it failed";
                }
            } else if ("Dizzy Punch".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Double-Edge".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                output = "" + user.getName() + " took a quarter of the damage!";
                user.ChangeHealth((PDamage / 4));
                enemy.ChangeHealth(PDamage);
            } else if ("Double Kick".equals(move)) {
                if ("normal".equals(enemy.getType()) || "steel".equals(enemy.getType()) || "ice".equals(enemy.getType()) || "rock".equals(enemy.getType()) || "dark".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Double Slap".equals(move)) {
                int times;
                times = ((int) Math.random() * 3) + 2;
                output = " Hit " + times + " times!";
                enemy.ChangeHealth(PDamage * times);
            } else if ("Double Team".equals(move)) {
                if (enemy.TMPaccuracybump <= -80) {
                    output = "" + user.getName() + " can't become any more evadasive";
                } else {
                    output = "" + user.getName() + " evadasivness increased!";
                    enemy.TMPaccuracybump -= user.level;
                }
            } else if ("Dragon Rage".equals(move)) {
                enemy.ChangeHealth(40);
            } else if ("Dream Eater".equals(move)) {
                if ("normal".equals(enemy.getType())) {
                    output = "Didn't effect " + enemy.getName();
                } else {
                    if ("asleep".equals(enemy.getCondition())) {
                        if ("psychic".equals(enemy.getType()) || "ghost".equals(enemy.getType())) {
                            PDamage += PDamage * (Math.random() * 1);
                            output = "It was Super Effective!";
                        } else if (r == 10) {
                            PDamage += PDamage * (Math.random() * 1);
                            output = "Critical Hit!";
                        } else {
                            output = "" + enemy.getName() + " had its Dreams Eaten!";
                        }
                        enemy.ChangeHealth(PDamage);
                    } else {
                        output = "but it failed.";
                    }
                }
            } else if ("Drill Peck".equals(move)) {
                if ("grass".equals(enemy.getType()) || "fighting".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Earthquake".equals(move)) {
                if ("flying".equals(enemy.getType())) {
                    output = "it had no effect on " + enemy.getName();
                } else {
                    if ("fire".equals(enemy.getType()) || "electric".equals(enemy.getType()) || "poison".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                        PDamage += PDamage * (Math.random() * 1);
                        output = "It was Super Effective!";
                    } else if (r == 10) {
                        PDamage += PDamage * (Math.random() * 1);
                        output = "Critical Hit!";
                    }
                    enemy.ChangeHealth(PDamage);
                }
            } else if ("Egg Bomb".equals(move)) {
                if ("water".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Ember".equals(move)) {
                if ("grass".equals(enemy.getType()) || "fighting".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + " was Burned!";
                    enemy.setCondition("burned");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Explosion".equals(move)) {
                output = "BOOM!!!";
                enemy.ChangeHealth(9999);
                user.ChangeHealth(9999);
            } else if ("Fire Blast".equals(move)) {
                if ("grass".equals(enemy.getType()) || "fighting".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 5)) == 3) {
                    output = "" + enemy.getName() + " was Burned!";
                    enemy.setCondition("burned");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Fire Punch".equals(move)) {
                if ("grass".equals(enemy.getType()) || "fighting".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + " was Burned!";
                    enemy.setCondition("burned");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Fire Spin".equals(move)) {
                if ("grass".equals(enemy.getType()) || "fighting".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + " was Burned!";
                    enemy.setCondition("burned");
                }
                enemy.ChangeHealth(PDamage * 5);
            } else if ("Fissure".equals(move)) {
                if ("flying".equals(enemy.getType())) {
                    output = "but it failed";
                } else {
                    enemy.ChangeHealth(9999);
                    output = "One Hit KO!";
                }
            } else if ("Flamethrower".equals(move)) {
                if ("grass".equals(enemy.getType()) || "fighting".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + " was Burned!";
                    enemy.setCondition("burned");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Focus Energy".equals(move)) {
                if (user.getAttack() >= 500) {
                    output = "" + user.getName() + "'s Attack won't go any Higher!";
                } else {
                    user.curattack += user.getLevel();
                    output = "" + user.getName() + "'s Attack Increased.";
                }
            } else if ("Fury Attack".equals(move)) {
                int times;
                times = ((int) Math.random() * 3) + 2;
                output = " Hit " + times + " times!";
                enemy.ChangeHealth(PDamage * times);
            } else if ("Fury Swipes".equals(move)) {
                int times;
                times = ((int) Math.random() * 3) + 2;
                output = " Hit " + times + " times!";
                enemy.ChangeHealth(PDamage * times);
            } else if ("Glare".equals(move)) {
                output = "" + enemy.getName() + " was Paralyzed!";
                enemy.setCondition("paralyzed");
            } else if ("Growl".equals(move)) {
                output = "" + enemy.getName() + "'s Attack was lowered";
                enemy.curattack -= user.getLevel();
            } else if ("Growth".equals(move)) {
                output = "" + user.getName() + "'s Special Abilites increased";
                enemy.curspAttack -= user.getLevel();
                enemy.curspDef -= user.getLevel();
            } else if ("Guillotine".equals(move)) {
                enemy.ChangeHealth(9999);
                output = "One Hit KO!";
            } else if ("Gust".equals(move)) {
                if ("grass".equals(enemy.getType()) || "fighting".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Harden".equals(move)) {
                output = "" + user.getName() + "'s Deffense increased";
                user.curdef += user.getLevel();
            } else if ("Haze".equals(move)) {
                output = "" + enemy.getName() + "'s target was lost in the Haze!";
                enemy.setHold(0);
            } else if ("Headbutt".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 4)) == 2) {
                    enemy.turnmodifier -= 100;
                    output = "" + enemy.getName() + " Flinched!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("High Jump Kick".equals(move)) {
                if ("normal".equals(enemy.getType()) || "steel".equals(enemy.getType()) || "ice".equals(enemy.getType()) || "rock".equals(enemy.getType()) || "dark".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Horn Attack".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Horn Drill".equals(move)) {
                enemy.ChangeHealth(9999);
                output = "One Hit KO!";
            } else if ("Hydro Pump".equals(move)) {
                if ("fire".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Hyper Beam".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Hyper Fang".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    enemy.turnmodifier -= 100;
                    output = "" + enemy.getName() + " Flinched!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Hypnosis".equals(move)) {
                output = "" + enemy.getName() + " fell into a deep sleep";
                enemy.setCondition("asleep");
            } else if ("Ice Beam".equals(move)) {
                if ("grass".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "dragon".equals(enemy.getType()) || "flying".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + " was Froze Solid!";
                    enemy.setCondition("frozen");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Ice Punch".equals(move)) {
                if ("grass".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "dragon".equals(enemy.getType()) || "flying".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + " was Froze Solid!";
                    enemy.setCondition("frozen");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Jump Kick".equals(move)) {
                if ("normal".equals(enemy.getType()) || "steel".equals(enemy.getType()) || "ice".equals(enemy.getType()) || "rock".equals(enemy.getType()) || "dark".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Karate Chop".equals(move)) {
                if ("normal".equals(enemy.getType()) || "steel".equals(enemy.getType()) || "ice".equals(enemy.getType()) || "rock".equals(enemy.getType()) || "dark".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Kinesis".equals(move)) {
                if (enemy.TMPaccuracybump <= -80) {
                    output = "" + enemy.getName() + "'s Accuracy can't fall any lower!";
                } else {
                    output = "" + enemy.getName() + "'s Accuracy decreased!";
                    enemy.TMPaccuracybump -= user.level;
                }
            } else if ("Leech Life".equals(move)) {
                if ("grass".equals(enemy.getType()) || "psychic".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else {
                    output = "" + user.getName() + " leeched health from " + enemy.getHealth() + "!";
                }
                user.ChangeHealth(-PDamage);
                enemy.ChangeHealth(PDamage);
            } else if ("Leech Seed".equals(move)) {
                if ("water".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else {
                    output = "" + user.getName() + " leeched health from " + enemy.getHealth() + "!";
                }
                user.ChangeHealth(-PDamage);
                enemy.ChangeHealth(PDamage);
            } else if ("Leer".equals(move)) {
                output = "" + enemy.getName() + "'s Defenses were lowered";
                enemy.curdef -= user.getLevel();
            } else if ("Lick".equals(move)) {
                if ("psychic".equals(enemy.getType()) || "ghost".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    enemy.setCondition("paralyzed");
                    output = "" + enemy.getName() + " was paralyzed!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Light Screen".equals(move)) {
                enemy.curspAttack /= 2;
                enemy.curspDef /= 2;
                output = "" + enemy.getName() + "'s Special Stats were Cut in Half!";
            } else if ("Lovely Kiss".equals(move)) {
                enemy.setCondition("asleep");
                output = "" + enemy.getName() + " was put to sleep";
            } else if ("Low Kick".equals(move)) {
                if ("normal".equals(enemy.getType()) || "steel".equals(enemy.getType()) || "ice".equals(enemy.getType()) || "rock".equals(enemy.getType()) || "dark".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 3)) == 2) {
                    enemy.turnmodifier -= 100;
                    output = "" + enemy.getName() + " Flinched!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Meditate".equals(move)) {
                user.curattack += user.getLevel();
                output = "" + user.getName() + "'s attack was increased";
            } else if ("Mega Drain".equals(move)) {

                if ("water".equals(enemy.getType()) || "rock".equals(enemy.getType()) || "ground".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                output = "Drained " + (PDamage / 2) + " points of Health.";
                enemy.ChangeHealth(PDamage);
                user.ChangeHealth(-(PDamage / 2));
            } else if ("Mega Kick".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Mega Punch".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Minimize".equals(move)) {
                if (enemy.TMPaccuracybump <= -80) {
                    output = "" + user.getName() + " can't become any more evadasive";
                } else {
                    output = "" + user.getName() + " evadasivness increased!";
                    enemy.TMPaccuracybump -= user.level;
                }
            } else if ("Mirror Move".equals(move)) {
                if ((user.getHealth() - user.getHP()) <= 0) {
                    output = "Counter failed";
                } else {
                    enemy.ChangeHealth((user.getHealth() - user.getHP()));
                    output = "" + user.getName() + " took revenge!";
                }
            } else if ("Mist".equals(move)) {
                user.updateStats();
                output = "" + user.getName() + "'s stats were restored!";
            } else if ("Night Shade".equals(move)) {
                enemy.ChangeHealth(user.getLevel());
            } else if ("Pay Day".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Peck".equals(move)) {
                if ("grass".equals(enemy.getType()) || "fighting".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Petal Dance".equals(move)) {
                times++;
                if ("water".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                if (times >= 3) {
                    times = 0;
                    user.setCondition("confused");
                    output = "" + user.getName() + " is Confused why it is so Gay";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Pin Missile".equals(move)) {
                int times;
                times = ((int) Math.random() * 3) + 2;
                output = " Hit " + times + " times!";
                enemy.ChangeHealth(PDamage * times);
            } else if ("Poison Gas".equals(move)) {
                enemy.setCondition("poisoned");
                output = "" + enemy.getName() + " was poisoned!";
            } else if ("Poison Sting".equals(move)) {
                if ("grass".equals(enemy.getType()) || "psychic".equals(enemy.getType()) || "dark".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 4)) == 2) {
                    enemy.setCondition("poisoned");
                    output = "" + enemy.getName() + " was poisoned!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Poison Powder".equals(move)) {
                enemy.setCondition("poisoned");
                output = "" + enemy.getName() + " was poisoned!";
            } else if ("Pound".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Psybeam".equals(move)) {
                if ("fighting".equals(enemy.getType()) || "poison".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + " became confused!";
                    enemy.setCondition("confused");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Psychic".equals(move)) {
                if ("fighting".equals(enemy.getType()) || "poison".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + "'s Special stats were slashed!";
                    enemy.spAttack -= user.level;
                    enemy.spDef -= user.level;
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Psyball".equals(move)) {
                if ("fighting".equals(enemy.getType()) || "poison".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    output = "" + enemy.getName() + "'s Special stats were slashed!";
                    enemy.spAttack -= user.level;
                    enemy.spDef -= user.level;
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Psywave".equals(move)) {
                PDamage = (int) (Math.random() * user.level * user.level);
                enemy.ChangeHealth(PDamage);
            } else if ("Quick Attack".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Rage".equals(move)) {
                PDamage -= user.curHP - user.health;
                enemy.ChangeHealth(PDamage);
            } else if ("Razor Leaf".equals(move)) {
                if ("water".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10 || r == 9 || r == 11) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Razor Wind".equals(move)) {
                if (r == 10 || r == 9 || r == 11) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Recover".equals(move)) {
                user.ChangeHealth(-(user.health / 2));
                output = "" + user.getName() + " gained health!";
            } else if ("Reflect".equals(move)) {
                if (user.getDeffense() >= 500) {
                    output = "" + user.getName() + "'s Defense won't go any higher!";
                }
                user.def *= 2;
                output = "" + user.getName() + " defense doubled!";
            } else if ("Rest".equals(move)) {
                user.setCondition("asleep");
                output = "" + user.getName() + " fell into a deep sleep!";
                user.ChangeHealth(-user.health);
            } else if ("Roar".equals(move)) {
                output = "roared";
            } else if ("Rock Slide".equals(move)) {
                if ("flying".equals(enemy.getType()) || "fire".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10 || r == 9 || r == 11) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Rock Throw".equals(move)) {
                if ("flying".equals(enemy.getType()) || "fire".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10 || r == 9 || r == 11) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Rolling Kick".equals(move)) {
                if ("normal".equals(enemy.getType()) || "steel".equals(enemy.getType()) || "ice".equals(enemy.getType()) || "rock".equals(enemy.getType()) || "dark".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 3)) == 2) {
                    enemy.turnmodifier -= 100;
                    output = "" + enemy.getName() + " Flinched!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Sand Attack".equals(move)) {
                enemy.TMPaccuracybump -= user.getLevel();
                output = "" + enemy.getName() + "'s accuracy fell";
            } else if ("Scratch".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Screech".equals(move)) {
                enemy.curdef /= 2;
                output = "" + enemy.getName() + "'s defense was slashed!";
            } else if ("Seismic Toss".equals(move)) {
                enemy.ChangeHealth(user.getLevel());
            } else if ("Self Destruct".equals(move)) {
                user.ChangeHealth(enemy.getHealth());
                output = "" + user.getName() + " fainted!";
                enemy.ChangeHealth(PDamage);
            } else if ("Sharpen".equals(move)) {
                user.curattack += user.getLevel();
                output = "" + user.getName() + "'s attack increased";
            } else if ("Sing".equals(move)) {
                enemy.setCondition("asleep");
                output = "" + enemy.getName() + " fell into a deep sleep";
            } else if ("Skull Bash".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Sky Attack".equals(move)) {
                if ("grass".equals(enemy.getType()) || "fighting".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Slam".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Slash".equals(move)) {
                PDamage += PDamage * (Math.random() * 1);
                output = "Critical Hit!";
                enemy.ChangeHealth(PDamage);
            } else if ("Sleep Powder".equals(move)) {
                enemy.setCondition("asleep");
                output = "" + enemy.getName() + " fell into a deep sleep";
            } else if ("Sludge".equals(move)) {
                if ("grass".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 3)) == 2) {
                    enemy.setCondition("poisioned");
                    output = "" + enemy.getName() + " became poisoned!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Smog".equals(move)) {
                if ("grass".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else {
                    output = "" + enemy.getName() + " became poisoned!";
                }
                enemy.setCondition("poisioned");
                enemy.ChangeHealth(PDamage);
            } else if ("Smokescreen".equals(move)) {
                output = "" + enemy.getName() + "'s accuracy fell";
                enemy.TMPaccuracybump -= user.getLevel();
            } else if ("Softboiled".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                user.ChangeHealth(-(PDamage / 2));
                enemy.ChangeHealth(PDamage);
            } else if ("Solarbeam".equals(move)) {
                if ("water".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Sonic Boom".equals(move)) {
                enemy.ChangeHealth(20);
            } else if ("Spike Cannon".equals(move)) {
                int times;
                times = ((int) Math.random() * 3) + 2;
                output = "Hit " + times + " times!";
                enemy.ChangeHealth(PDamage * times);
            } else if ("Splash".equals(move)) {
                output = "Nothing Happend...";
            } else if ("Spore".equals(move)) {
                enemy.setCondition("asleep");
                output = "" + enemy.getName() + " fell into a deep sleep";
            } else if ("Stomp".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 10)) == 5) {
                    enemy.turnmodifier -= 100;
                    output = "" + enemy.getName() + " Flinched!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("String Shot".equals(move)) {
                output = "" + enemy.getName() + "'s speed decreased";
                enemy.curspd -= user.getLevel();
            } else if ("Stun Spore".equals(move)) {
                enemy.setCondition("paralyzed");
                output = "" + enemy.getName() + " became paralyzed!";
            } else if ("Submission".equals(move)) {
                if ("normal".equals(enemy.getType()) || "steel".equals(enemy.getType()) || "ice".equals(enemy.getType()) || "rock".equals(enemy.getType()) || "dark".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Super Fang".equals(move)) {
                enemy.ChangeHealth(enemy.curHP / 2);
            } else if ("Supersonic".equals(move)) {
                enemy.setCondition("confused");
                output = "" + enemy.getName() + " became confused!";
            } else if ("Surf".equals(move)) {
                if ("fire".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Swift".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Swords Dance".equals(move)) {
                user.curattack += (2 * user.getLevel());
                output = "" + user.getName() + "'s attack increased!";
            } else if ("Tackle".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Tail Whip".equals(move)) {
                enemy.curdef -= user.getLevel();
                output = "" + enemy.getName() + "'s defense fell";
            } else if ("Take Down".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                output = "" + user.getName() + " was hurt with recoil";
                user.ChangeHealth(((1 / 4) * PDamage));
                enemy.ChangeHealth(PDamage);
            } else if ("Thrash".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                if (Math.random() * 3 == 2) {
                    output = "" + user.getName() + " became confused";
                    user.setCondition("confused");
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Thunder".equals(move)) {
                if ("Ground".equals(enemy.getType())) {
                    output = "It had no effect on " + enemy.getName();
                } else {
                    if ("water".equals(enemy.getType()) || "flying".equals(enemy.getType())) {
                        PDamage += PDamage * (Math.random() * 1);
                        output = "It was Super Effective!";
                    } else if (r == 10) {
                        PDamage += PDamage * (Math.random() * 1);
                        output = "Critical Hit!";
                    } else if (r >= 15) {
                        enemy.setCondition("paralyzed");
                        output = "" + enemy.getName() + " was paralyzed!";
                    }
                    enemy.ChangeHealth(PDamage);
                }
            } else if ("Thunder Wave".equals(move)) {
                enemy.setCondition("paralyzed");
                output = "" + enemy.getName() + " was paralyzed!";
            } else if ("Thunderbolt".equals(move)) {
                if ("Ground".equals(enemy.getType())) {
                    output = "It had no effect on " + enemy.getName();
                } else {
                    if ("water".equals(enemy.getType()) || "flying".equals(enemy.getType())) {
                        PDamage += PDamage * (Math.random() * 1);
                        output = "It was Super Effective!";
                    } else if (r == 10) {
                        PDamage += PDamage * (Math.random() * 1);
                        output = "Critical Hit!";
                    } else if (r >= 15) {
                        enemy.setCondition("paralyzed");
                        output = "" + enemy.getName() + " was paralyzed!";
                    }
                    enemy.ChangeHealth(PDamage);
                }
            } else if ("Thunder Punch".equals(move)) {
                if ("Ground".equals(enemy.getType())) {
                    output = "It had no effect on " + enemy.getName();
                } else {
                    if ("water".equals(enemy.getType()) || "flying".equals(enemy.getType())) {
                        PDamage += PDamage * (Math.random() * 1);
                        output = "It was Super Effective!";
                    } else if (r == 10) {
                        PDamage += PDamage * (Math.random() * 1);
                        output = "Critical Hit!";
                    } else if (r >= 15) {
                        enemy.setCondition("paralyzed");
                        output = "" + enemy.getName() + " was paralyzed!";
                    }
                    enemy.ChangeHealth(PDamage);
                }
            } else if ("Thundershock".equals(move)) {
                if ("Ground".equals(enemy.getType())) {
                    output = "It had no effect on " + enemy.getName();
                } else {
                    if ("water".equals(enemy.getType()) || "flying".equals(enemy.getType())) {
                        PDamage += PDamage * (Math.random() * 1);
                        output = "It was Super Effective!";
                    } else if (r == 10) {
                        PDamage += PDamage * (Math.random() * 1);
                        output = "Critical Hit!";
                    } else if (r >= 15) {
                        enemy.setCondition("paralyzed");
                        output = "" + enemy.getName() + " was paralyzed!";
                    }
                    enemy.ChangeHealth(PDamage);
                }
            } else if ("Toxic".equals(move)) {
                if ("grass".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else {
                    enemy.setCondition("poisoned");
                    output = "" + enemy.getName() + " was poisoned!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Transform".equals(move)) {
                user.create(enemy.getNumber(), user.getLevel());
            } else if ("Tri Attack".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Twineedle".equals(move)) {
                PDamage *= 2;
                if ("grass".equals(enemy.getType()) || "psychic".equals(enemy.getType()) || "dark".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                } else if (((int) (Math.random() * 4)) == 2) {
                    enemy.setCondition("poisoned");
                    output = "" + enemy.getName() + " was poisoned!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Vice Grip".equals(move)) {
                if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Vine Whip".equals(move)) {
                if ("water".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Water Gun".equals(move)) {
                if ("fire".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Waterfall".equals(move)) {
                if ("fire".equals(enemy.getType()) || "ground".equals(enemy.getType()) || "rock".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Wing Attack".equals(move)) {
                if ("grass".equals(enemy.getType()) || "fighting".equals(enemy.getType()) || "bug".equals(enemy.getType())) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "It was Super Effective!";
                } else if (r == 10) {
                    PDamage += PDamage * (Math.random() * 1);
                    output = "Critical Hit!";
                }
                enemy.ChangeHealth(PDamage);
            } else if ("Withdraw".equals(move)) {
                user.curdef += (2 * user.getLevel());
                output = "" + user.getName() + "'s defense rose";
            } else if ("Wrap".equals(move)) {
                int times;
                times = ((int) Math.random() * 3) + 2;
                output = "Hit " + times + " times!";
                enemy.ChangeHealth(PDamage * times);
            } else if ("Annoy".equals(move)) {
                output = "" + enemy.getName() + " was severly annoyed!";
                enemy.curattack += user.getLevel();
                enemy.curspAttack -= user.getLevel();
                enemy.curspDef -= user.getLevel();
                enemy.ChangeHealth(PDamage);
            } else if ("Rape".equals(move)) {
                output = "" + enemy.getName() + "'s innocence was taken!";
                enemy.curspd /= 2;
                enemy.curdef /= 2;
                enemy.curattack /= 2;
                enemy.curspDef /= 2;
                enemy.ChangeHealth(PDamage);
            } else if ("Molest".equals(move)) {
                if (user.getLevel() > enemy.getLevel()) {
                    PDamage *= user.getLevel() - enemy.getLevel();
                    output = "" + enemy.getName() + "'s innocence was taken!";
                    enemy.curspd /= 2;
                    enemy.curdef /= 2;
                    enemy.curattack /= 2;
                    enemy.curspDef /= 2;
                    enemy.ChangeHealth(PDamage);
                } else {
                    output = "TO OLD!";
                }
            } else if ("Indestructable".equals(move)) {
                output = "Nokia cannot be destroyed!";
                user.def = 9999999;
            } else if ("Rainbow Squirt".equals(move)) {
                enemy.ChangeHealth(enemy.getHealth());
            }
        }
        return output;
    }

    public int getAccuracy() {
        return Accuracy;
    }

    public int getDamage() {
        return damage;
    }

    public int getType() {
        return type;
    }
}