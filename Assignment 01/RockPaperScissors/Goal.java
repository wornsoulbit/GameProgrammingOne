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
public class Goal extends Actor
{

    /**
     * Act - do whatever the Goal wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        detectVictory();
    }

    /**
     * 
     */
    public void detectVictory()
    {
        Actor player = getOneIntersectingObject(Player.class);
        if (player != null) {
            getWorld().removeObject(player);
            Greenfoot.playSound("goal.wav");
        }
    }
}