import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Amazing Rock, Paper, Scissors Maze
 * 
 * @author: Nicolas Bergeron
 * 
 * Vanier College 2019 
 */
public class PaperPlayer extends Player {

    /**
     * Act - do whatever the PaperPlayer wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    	coverRock();
        moveAround();
    }

    public void coverRock() {
    	Actor rock = getOneIntersectingObject(Rock.class);
    	if (rock != null) {
    		World world = getWorld();
            world.removeObject(rock);
            Greenfoot.playSound("cover.wav");
    	}
    }
}
