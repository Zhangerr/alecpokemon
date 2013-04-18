package pokemonalecversion;

import java.awt.Image;
import java.util.Random;

public class Playa extends Actor {

    private String name;
    private Image sprite;
    private short pokemonowned = 1;
    private int id;
    private int exp;
    private byte level = 1;
    private byte modifier = 6;
    public int money;
    private Random r = new Random();

    public Playa(int x, int y, String n) {
        super(x, y);
        name = n;
    }

    public void addEXP(int enemylvl) {
        exp += (int) Math.sqrt(enemylvl);
        if (exp >= modifier * (int) Math.pow(level, 3)) {
            exp -= modifier * ((int) Math.pow(level, 3));
            level++;
        }
    }

    public int getLevel() {
        return level;
    }

    public void createTrainerID() {
        id = 10000 + r.nextInt(90000);
    }

    public int getOriginalX() {
        return super.o_loc_x;
    }

    public int getOriginalY() {
        return super.o_loc_y;
    }

    public int getCurrentX() {
        return super.loc_x;
    }

    public int getCurrentY() {
        return super.loc_y;
    }

    public void setCurrentX(int x) {
        super.loc_x = x;
    }

    public void setCurrentY(int y) {
        super.loc_y = y;
    }

    public void moveUp() {
        super.loc_y--;
    }

    public void moveDown() {
        super.loc_y++;
    }

    public void moveLeft() {
        super.loc_x--;
    }

    public void moveRight() {
        super.loc_x++;
    }

    public void setName(String input) {
        name = input;
    }

    public String getName() {
        return name;
    }

    public void caughtAPokemon() {
        pokemonowned++;
    }

    public int getPokemonOwned() {
        return pokemonowned;
    }

    public void setID(int input) {
        id = input;
    }

    public int getID() {
        return id;
    }

    public void setSprite(Image image) {
        sprite = image;
    }

    public Image getSprite() {
        return sprite;
    }

    public int crashTest(NPC other) {
        if (other.getActionNum() != 59) {
            if ((other.getCurrentY() + 1) == getCurrentY()) {
                if ((other.getCurrentX()) == getCurrentX()) {
                    return 1;
                }
            }
            if ((other.getCurrentY() - 1) == getCurrentY()) {
                if ((other.getCurrentX()) == getCurrentX()) {
                    return 2;
                }
            }
            if ((other.getCurrentX() + 1) == getCurrentX()) {
                if ((other.getCurrentY()) == getCurrentY()) {
                    return 3;
                }
            }
            if ((other.getCurrentX() - 1) == getCurrentX()) {
                if ((other.getCurrentY()) == getCurrentY()) {
                    return 4;
                }
            }
        }
        return 0;
    }

    public int crashTest(Tiles other) {
        if (other == null) {
            return 0;
        }
        if ((other.getCurrentY() + 1) == getCurrentY()) {
            if ((other.getCurrentX()) == getCurrentX()) {
                return 1;
            }
        }
        if ((other.getCurrentY() - 1) == getCurrentY()) {
            if ((other.getCurrentX()) == getCurrentX()) {
                return 2;
            }
        }
        if ((other.getCurrentX() + 1) == getCurrentX()) {
            if ((other.getCurrentY()) == getCurrentY()) {
                return 3;
            }
        }
        if ((other.getCurrentX() - 1) == getCurrentX()) {
            if ((other.getCurrentY()) == getCurrentY()) {
                return 4;
            }
        }
        return 0;
    }

    public int slidingCrashTest(Tiles other, byte facing) {
        if (other == null) {
            return 0;
        }
        if (facing == 1) {
            if ((other.getCurrentY() + 2) == getCurrentY()) {
                if ((other.getCurrentX()) == getCurrentX()) {
                    return 1;
                }
            }
        } else if (facing == 2) {
            if ((other.getCurrentY() - 2) == getCurrentY()) {
                if ((other.getCurrentX()) == getCurrentX()) {
                    return 2;
                }
            }
        } else if (facing == 3) {
            if ((other.getCurrentX() + 2) == getCurrentX()) {
                if ((other.getCurrentY()) == getCurrentY()) {
                    return 3;
                }
            }
        } else {
            if ((other.getCurrentX() - 2) == getCurrentX()) {
                if ((other.getCurrentY()) == getCurrentY()) {
                    return 4;
                }
            }
        }




        return 0;
    }
}