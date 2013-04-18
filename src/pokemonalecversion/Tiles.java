package pokemonalecversion;
import java.awt.Image;

public class Tiles extends Actor {

	private Image sprite;
	

    public Tiles(int x, int y, Image s) {
    	super(x,y);
    	sprite = s;
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
    
    public Image getSprite() {
    	return sprite;
    }
    
}