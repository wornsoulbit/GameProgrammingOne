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
public class RockPlayer extends Player {

    /**
     * Act - do whatever the RockPlayer wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    	crushScissor();
        moveAround();
    }

    //Crushes scissor if a rock intersects one.
    public void crushScissor() {
    	Actor scissor = getOneIntersectingObject(Scissors.class);
    	if (scissor != null) {
    		World world = getWorld();
            world.removeObject(scissor);
            Greenfoot.playSound("crush.wav");
    	}
    }
}
