// WARNING: This file is auto-generated and any changes to it will be overwritten
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
public class ScissorsPlayer extends Player {

    /**
     * Act - do whatever the ScissorsPlayer wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    	cutPaper();
        moveAround();
    }

    public void cutPaper() {
    	Actor paper = getOneIntersectingObject(Paper.class);
    	if (paper != null) {
    		World world = getWorld();
            world.removeObject(paper);
            Greenfoot.playSound("cut.wav");
    	}
    }
}
