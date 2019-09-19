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
public class Goal extends Actor
{

    /**
     * Act - do whatever the Goal wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() { 
        if (isWorldEmpty()) {
            detectVictory();
        }        
    }
    
    public boolean isWorldEmpty() {
        World world = getWorld();
        if (world.getObjects(Paper.class).isEmpty() && world.getObjects(Rock.class).isEmpty() && world.getObjects(Scissors.class).isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
    public void detectVictory()
    {
        Actor player = getOneIntersectingObject(Player.class);
        if (player != null) {
            World wonWorld = new WonWorld();
            getWorld().removeObject(player);
            Greenfoot.playSound("goal.wav");
            Greenfoot.setWorld(wonWorld);
        }
    }
}
