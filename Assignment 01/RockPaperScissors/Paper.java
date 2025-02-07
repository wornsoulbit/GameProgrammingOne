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
public class Paper extends Actor {

    /**
     * Act - do whatever the Paper wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    	removeRock();
    }

    public void removeRock(){

        Actor rock = getOneIntersectingObject(RockPlayer.class);
        World world = getWorld();
        
        if(rock != null){
        
            Player paperPlayer = new PaperPlayer();
            world.removeObject(rock);
            world.addObject(paperPlayer, getX(), getY());
        }
    }
}
