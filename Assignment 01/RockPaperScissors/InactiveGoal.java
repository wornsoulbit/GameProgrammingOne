import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class InactiveGoal extends Actor
{

    /**
     * Act - do whatever the InactiveGoal wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        goalCheck();
    }
    public boolean isWorldEmpty() {
        World world = getWorld();
        if (world.getObjects(Paper.class).isEmpty() && world.getObjects(Rock.class).isEmpty() && world.getObjects(Scissors.class).isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
    public void goalCheck() {
       
        Actor goal = new Goal();
        if (isWorldEmpty()) {
            World world = getWorld();
            world.addObject(goal, getX(), getY());
            world.removeObject(this);
        }
    }
}
