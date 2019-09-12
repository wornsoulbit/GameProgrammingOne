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
public class Rock extends Actor {

    /**
     * Act - do whatever the Rock wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    	killScissor();
    }

    public void killScissor(){
        Actor scissor = getOneIntersectingObject(Scissors.class);
        if(scissor != null){
            World world = getWorld();
            world.removeObject(scissor);
            world.addObject(Rock, getX(), getY());
        }
    }
}
