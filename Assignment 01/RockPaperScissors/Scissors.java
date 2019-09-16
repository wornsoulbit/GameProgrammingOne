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
public class Scissors extends Actor {

    /**
     * Act - do whatever the Scissors wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    	removePaper();
    }

    public void removePaper(){
        
        Actor paper = getOneIntersectingObject(PaperPlayer.class);
        World world = getWorld();

        if(paper != null){
            world.removeObject(paper);
            Player scissorPlayer = new ScissorsPlayer();
            world.addObject(scissorPlayer, getX(), getY());
        }
    }
}
