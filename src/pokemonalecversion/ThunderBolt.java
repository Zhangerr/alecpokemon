package pokemonalecversion;

import java.util.Random;

public class ThunderBolt {

    private Point[] Points;
    private boolean EO = false;
    private Random gen = new Random();

    public ThunderBolt(int length, int x, int y, int sx, int sy) {
        int X = x;
        int Y = y;
        Points = new Point[length];
        Points[0] = new Point(X, Y);
        for (int i = 1; i < length; i++) {
            if (EO) {
                X -= (gen.nextInt(20) - 10);
                Y -= (gen.nextInt(20) - 10);
            } else {
                X -= sx;
                Y -= sy;
            }
            Points[i] = new Point(X,Y);
            EO = !EO;
        }
    }

    public Point[] getPoints() {
        return Points;
    }
}
