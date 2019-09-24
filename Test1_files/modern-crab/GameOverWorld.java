import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld() {
        super(560, 560, 1);
    }
    public void act() {
        if(Greenfoot.isKeyDown("space")){
            World crabWorld = new CrabWorld();
            Greenfoot.setWorld(crabWorld);
        }
    }
}
