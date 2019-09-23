import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     */
    public StartScreen(){
        super(12, 10, 75);
        GreenfootImage img = getBackground();
        img.scale(900,750);
        setBackground(img);
    }
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            World mazeWorld = new MazeWorld();
            Greenfoot.setWorld(mazeWorld);
        }
    }
}
