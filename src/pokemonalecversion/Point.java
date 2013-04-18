package pokemonalecversion;

public class Point {

    private short X;
    private short Y;

    public Point(int x, int y) {
        X = (short) x;
        Y = (short) y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}
