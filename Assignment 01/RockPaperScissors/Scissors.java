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
    	killPaper();
    }

    public void killPaper(){
        Actor paper = getOneIntersectingObject(Paper.class);
        if(paper != null){
            World world = getWorld();
            world.removeObject(paper);
            world.addObject(Paper, getX(), getY());
        }
    }
}
