package pokemonalecversion;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class NPC extends Actor {

    private String name;
    public String text;
    private int X;
    private int Y;
    private String battleText;
    private int ActionNum;
    private Image[] Images = new Image[14];
    private Image[] RunImages = new Image[14];
    private Image sprite = null;
    private Image battleSprite;
    private byte derp;
    private byte Dir;
    private int bounce;
    public boolean footsprite = true;
    public boolean BattleAble;
    private Random r = new Random();
    public int movespritepixels = 0;
    private boolean Run = false;
    public boolean talking = false;
    private boolean followin = false;
    private boolean walking = false;
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

    public NPC(int x, int y, String n, String t, String s, Image bs, String b, int a) {
        super(x, y);
        X = x;
        Y = y;
        name = n;
        text = t;
        ActionNum = a;
        battleText = b;
        battleSprite = bs;
        if (s != null) {
            if (ActionNum < 10) {
                sprite = Toolkit.getDefaultToolkit().getImage(getClass().getResource("" + s + "1" + ".png"));
                for (int i = 0; i <= 12;) {
                    i++;
                    Images[i] = null;
                }
                for (int i = 0; i <= 12;) {
                    i++;
                    Images[i] = Toolkit.getDefaultToolkit().getImage(getClass().getResource("" + s + i + ".png"));
                }
            } else if (ActionNum == 10) {
                sprite = Toolkit.getDefaultToolkit().getImage(getClass().getResource("" + s + 1 + ".png"));
                for (int i = 0; i <= 12;) {
                    i++;
                    Images[i] = null;
                }
                for (int i = 0; i <= 12;) {
                    i++;
                    Images[i] = Toolkit.getDefaultToolkit().getImage(getClass().getResource("" + s + i + ".png"));
                }
                for (int i = 0; i <= 12;) {
                    i++;
                    RunImages[i] = null;
                }
                for (int i = 0; i <= 12;) {
                    i++;
                    RunImages[i] = Toolkit.getDefaultToolkit().getImage(getClass().getResource("" + s + "Run" + i + ".png"));
                }
            } else if (ActionNum == 20) {
                sprite = Toolkit.getDefaultToolkit().getImage(getClass().getResource(s));
            } else {
                sprite = Toolkit.getDefaultToolkit().getImage(getClass().getResource(s + ".png"));
            }
        }
    }

    public boolean getBattleAble() {
        return BattleAble;
    }

    public String getBattleText() {
        return battleText;
    }

    public int getBounce() {
        return bounce;
    }

    public int getActionNum() {
        return ActionNum;
    }

    public int getOriginalX() {
        return super.o_loc_x;
    }

    public int getOriginalY() {
        return super.o_loc_y;
    }

    public int getCurrentX() {
        return super.getX();
    }

    public int getCurrentY() {
        return super.getY();
    }

    public int getDirection() {
        if (up) {
            return 1;
        } else if (down) {
            return 2;
        } else if (left) {
            return 3;
        } else {
            return 4;
        }
    }

    public void setDirection(int dir) {
        up = false;
        down = false;
        left = false;
        right = false;
        if (dir == 1) {
            up = !up;
        } else if (dir == 2) {
            down = !down;
        } else if (dir == 3) {
            left = !left;
        } else if (dir == 4) {
            right = !right;
        }
    }

    public void setWalking(boolean x) {
        walking = x;
    }

    public int getWidth() {
        return sprite.getWidth(null) / 4;
    }

    public int getHeight() {
        return sprite.getHeight(null) / 4;
    }

    public void remove() {
        super.loc_x = 0;
        super.loc_y = 0;
    }

    public void Return() {
        super.loc_x = X;
        super.loc_y = Y;
    }

    public void setSprite(String Image) {
        if ("Up".equals(Image)) {
            Dir = 1;
            if (Run) {
                sprite = RunImages[2];
            } else {
                sprite = Images[2];
            }
        } else if ("Up1".equals(Image)) {
            Dir = 1;
            if (Run) {
                sprite = RunImages[7];
            } else {
                sprite = Images[7];
            }
        } else if ("Up2".equals(Image)) {
            Dir = 1;
            if (Run) {
                sprite = RunImages[8];
            } else {
                sprite = Images[8];
            }
        } else if ("Down".equals(Image)) {
            Dir = 2;
            if (Run) {
                sprite = RunImages[1];
            } else {
                sprite = Images[1];
            }
        } else if ("Down1".equals(Image)) {
            Dir = 2;
            if (Run) {
                sprite = RunImages[5];
            } else {
                sprite = Images[5];
            }
        } else if ("Down2".equals(Image)) {
            Dir = 2;
            if (Run) {
                sprite = RunImages[6];
            } else {
                sprite = Images[6];
            }
        } else if ("Left".equals(Image)) {
            Dir = 3;
            if (Run) {
                sprite = RunImages[3];
            } else {
                sprite = Images[3];
            }
        } else if ("Left1".equals(Image)) {
            Dir = 3;
            if (Run) {
                sprite = RunImages[9];
            } else {
                sprite = Images[9];
            }
        } else if ("Left2".equals(Image)) {
            Dir = 3;
            if (Run) {
                sprite = RunImages[10];
            } else {
                sprite = Images[10];
            }
        } else if ("Right".equals(Image)) {
            Dir = 4;
            if (Run) {
                sprite = RunImages[4];
            } else {
                sprite = Images[4];
            }
        } else if ("Right1".equals(Image)) {
            Dir = 4;
            if (Run) {
                sprite = RunImages[11];
            } else {
                sprite = Images[11];
            }
        } else if ("Right2".equals(Image)) {
            Dir = 4;
            if (Run) {
                sprite = RunImages[12];
            } else {
                sprite = Images[12];
            }
        } else {
            sprite = null;
        }
    }

    public void Move() {
        if (!talking) {
            if (ActionNum == 2 || ActionNum == 5) {
                int R;
                R = r.nextInt(150);
                if (R == 50) {
                    setSprite("Down");
                } else if (R == 75) {
                    setSprite("Up");
                } else if (R == 100) {
                    setSprite("Right");
                } else if (R == 125) {
                    setSprite("Left");
                }
            } else {
                if (!followin) {
                    if (ActionNum != 0) {
                        if (movespritepixels == 0) {
                            walking = false;
                            up = false;
                            right = false;
                            down = false;
                            left = false;
                        }
                    }
                    if (!walking && ActionNum != 0) {
                        derp = (byte) r.nextInt(150);
                        if (derp == 50) {
                            if (movable_up) {
                                walking = !walking;
                                up = true;
                            }
                        } else if (derp == 75) {
                            if (movable_down) {
                                walking = !walking;
                                down = true;
                            }
                        } else if (derp == 100) {
                            if (movable_left) {
                                walking = !walking;
                                left = true;
                            }
                        } else if (derp == 125) {
                            if (movable_right) {
                                walking = !walking;
                                right = true;
                            }
                        }
                    }
                }
                if (walking) {
                    if (!sliding && !swiming) {
                        if (up) {
                            if (movespritepixels >= 0 && movespritepixels < 4) {
                                bounce = 2;
                                setSprite("Up");
                            } else if (movespritepixels >= 4 && movespritepixels < 8) {
                                setSprite("Up");
                            } else if (movespritepixels >= 8 && movespritepixels < 12) {
                                bounce = 0;
                                if (footsprite == false) {
                                    setSprite("Up1");
                                } else {
                                    setSprite("Up2");
                                }
                            } else if (movespritepixels >= 12 && movespritepixels < 15) {
                                if (footsprite == false) {
                                    setSprite("Up1");
                                } else {
                                    setSprite("Up2");
                                }
                            } else {
                                setSprite("Up");
                            }
                            if (Run && walking) {
                                movespritepixels += 2;
                            } else if (walking) {
                                movespritepixels++;
                            }
                        } else if (down) {
                            if (movespritepixels >= 0 && movespritepixels < 4) {
                                bounce = 2;
                                setSprite("Down");
                            } else if (movespritepixels >= 4 && movespritepixels < 8) {
                                setSprite("Down");
                            } else if (movespritepixels >= 8 && movespritepixels < 12) {
                                bounce = 0;
                                if (footsprite == false) {
                                    setSprite("Down1");
                                } else {
                                    setSprite("Down2");
                                }
                            } else if (movespritepixels >= 12 && movespritepixels < 15) {
                                if (footsprite == false) {
                                    setSprite("Down1");
                                } else {
                                    setSprite("Down2");
                                }
                            } else {
                                setSprite("Down");
                            }

                            if (Run && walking) {
                                movespritepixels += 2;
                            } else if (walking) {
                                movespritepixels++;
                            }
                        } else if (left) {
                            if (movespritepixels >= 0 && movespritepixels < 4) {
                                bounce = 2;
                                setSprite("Left");
                            } else if (movespritepixels >= 4 && movespritepixels < 8) {
                                setSprite("Left");
                            } else if (movespritepixels >= 8 && movespritepixels < 12) {
                                bounce = 0;
                                if (footsprite == false) {
                                    setSprite("Left1");
                                } else {
                                    setSprite("Left2");
                                }
                            } else if (movespritepixels >= 12 && movespritepixels < 15) {
                                if (footsprite == false) {
                                    setSprite("Left1");
                                } else {
                                    setSprite("Left2");
                                }
                            } else {
                                setSprite("Left");
                            }
                            if (Run && walking) {
                                movespritepixels += 2;
                            } else if (walking) {
                                movespritepixels++;
                            }
                        } else if (right) {
                            if (movespritepixels >= 0 && movespritepixels < 4) {
                                bounce = 2;
                                setSprite("Right");
                            } else if (movespritepixels >= 4 && movespritepixels < 8) {
                                setSprite("Right");
                            } else if (movespritepixels >= 8 && movespritepixels < 12) {
                                bounce = 0;
                                if (footsprite == false) {
                                    setSprite("Right1");
                                } else {
                                    setSprite("Right2");
                                }
                            } else if (movespritepixels >= 12 && movespritepixels < 15) {
                                if (footsprite == false) {
                                    setSprite("Right1");
                                } else {
                                    setSprite("Right2");
                                }
                            } else {
                                setSprite("Right");
                            }

                            if (Run && walking) {
                                movespritepixels += 2;
                            } else if (walking) {
                                movespritepixels++;
                            }
                        }
                    } else {
                        if (right) {
                            setSprite("Right");
                        } else if (left) {
                            setSprite("Left");
                        } else if (up) {
                            setSprite("Up");
                        } else if (down) {
                            setSprite("Down");
                        }
                    }
                }
                //Movement Reset
                if (movespritepixels >= 16) {
                    movespritepixels = 0;
                    if (Run) {
                        if (right) {
                            setSprite("Right");
                        } else if (left) {
                            setSprite("Left");
                        } else if (up) {
                            setSprite("Up");
                        } else if (down) {
                            setSprite("Down");
                        }
                    }
                    if (up == true && movable_up == true) {
                        super.loc_y--;
                    } else if (down == true && movable_down == true) {
                        super.loc_y++;
                    } else if (left == true && movable_left == true) {
                        super.loc_x--;
                    } else if (right == true && movable_right == true) {
                        super.loc_x++;
                    }
                    if (ActionNum != 0) {
                        if (!sliding) {
                            walking = false;
                            up = false;
                            down = false;
                            left = false;
                            right = false;
                        } else {
                            if (up && !movable_up) {
                                walking = false;
                                up = false;
                                down = false;
                                left = false;
                                right = false;
                            } else if (down && !movable_down) {
                                walking = false;
                                up = false;
                                down = false;
                                left = false;
                                right = false;
                            } else if (left && !movable_left) {
                                walking = false;
                                up = false;
                                down = false;
                                left = false;
                                right = false;
                            } else if (right && !movable_right) {
                                walking = false;
                                up = false;
                                down = false;
                                left = false;
                                right = false;
                            }
                        }
                    }
                    footsprite = !footsprite;
                }
            }
        }
    }

    public void setFollow(boolean b) {
        followin = b;
    }

    public void follow(Actor O, int facing) {
        followin = true;
        walking = false;
        if (Dir == 4) {
            setSprite("Right");
        } else if (Dir == 3) {
            setSprite("Left");
        } else if (Dir == 1) {
            setSprite("Up");
        } else if (Dir == 2) {
            setSprite("Down");
        }
        if (!((O.getX() == loc_x && O.getY() == (loc_y - 1)) || (O.getX() == (loc_x + 1) && O.getY() == loc_y) || (O.getX() == loc_x && O.getY() == (loc_y + 1)) || (O.getX() == (loc_x - 1) && O.getY() == loc_y))) {
            if (Math.abs(O.getX() - loc_x) > 7 || Math.abs(O.getY() - loc_y) > 7) {
                if (facing == 1) {
                    setSprite("Up");
                    loc_x = O.getX();
                    loc_y = O.getY() + 1;
                } else if (facing == 2) {
                    setSprite("Down");
                    loc_x = O.getX();
                    loc_y = O.getY() - 1;
                } else if (facing == 3) {
                    setSprite("Left");
                    loc_x = O.getX() + 1;
                    loc_y = O.getY();
                } else if (facing == 4) {
                    setSprite("Right");
                    loc_x = O.getX() - 1;
                    loc_y = O.getY();
                }
            } else {
                walking = true;
                if (facing == 1 || facing == 2) {
                    if (loc_x != O.getX()) {
                        if (O.getX() > loc_x) {
                            right = true;
                        } else {
                            left = true;
                        }
                    } else {
                        if (O.getY() > loc_y) {
                            down = true;
                        } else {
                            up = true;
                        }
                    }
                } else {
                    if (loc_y != O.getY()) {
                        if (O.getY() > loc_y) {
                            down = true;
                        } else {
                            up = true;
                        }
                    } else {
                        if (O.getX() > loc_x) {
                            right = true;
                        } else {
                            left = true;
                        }
                    }
                }
            }
        }
    }

    public void reset() {
        movable_up = true;
        movable_down = true;
        movable_left = true;
        movable_right = true;
    }

    public void crashTest(Playa other) {
        if ((other.getCurrentY() + 1) == getCurrentY()) {
            if ((other.getCurrentX()) == getCurrentX()) {
                movable_up = false;
            }
        }
        if ((other.getCurrentY() - 1) == getCurrentY()) {
            if ((other.getCurrentX()) == getCurrentX()) {
                movable_down = false;
            }
        }
        if ((other.getCurrentX() + 1) == getCurrentX()) {
            if ((other.getCurrentY()) == getCurrentY()) {
                movable_left = false;
            }
        }
        if ((other.getCurrentX() - 1) == getCurrentX()) {
            if ((other.getCurrentY()) == getCurrentY()) {
                movable_right = false;
            }
        }
    }

    public void crashTest(Tiles other) {
        if (other != null) {
            if ((other.getCurrentY() + 1) == getCurrentY()) {
                if ((other.getCurrentX()) == getCurrentX()) {
                    movable_up = false;
                }
            }
            if ((other.getCurrentY() - 1) == getCurrentY()) {
                if ((other.getCurrentX()) == getCurrentX()) {
                    movable_down = false;
                }
            }
            if ((other.getCurrentX() + 1) == getCurrentX()) {
                if ((other.getCurrentY()) == getCurrentY()) {
                    movable_left = false;
                }
            }
            if ((other.getCurrentX() - 1) == getCurrentX()) {
                if ((other.getCurrentY()) == getCurrentY()) {
                    movable_right = false;
                }
            }
        }
    }

    public void crashTest(NPC other) {
        if ((other.getCurrentY() + 1) == getCurrentY()) {
            if ((other.getCurrentX()) == getCurrentX()) {
                movable_up = false;
            }
        }
        if ((other.getCurrentY() - 1) == getCurrentY()) {
            if ((other.getCurrentX()) == getCurrentX()) {
                movable_down = false;
            }
        }
        if ((other.getCurrentX() + 1) == getCurrentX()) {
            if ((other.getCurrentY()) == getCurrentY()) {
                movable_left = false;
            }
        }
        if ((other.getCurrentX() - 1) == getCurrentX()) {
            if ((other.getCurrentY()) == getCurrentY()) {
                movable_right = false;
            }
        }
    }

    public void Running(boolean running) {
        if (running) {
            Run = true;
        } else {
            Run = false;
        }
    }

    public String getName() {
        return name;
    }

    public Image getSprite() {
        return sprite;
    }

    public Image getBattleSprite() {
        return battleSprite;
    }

    @Override
    public String getText() {
        return text;
    }

    public int getTextLength() {
        return text.length();
    }
}