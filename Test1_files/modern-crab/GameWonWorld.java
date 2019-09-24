import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(560, 560, 1);
        showTextWithBigBlackFont("You Win!", 180, 200);
        showTextWithSmallBlackFont("To play again press space!", 54, 400);
    }

    /**
     * 
     */
    public void act() {
        if(Greenfoot.isKeyDown("space")){
            World crabWorld = new CrabWorld();
            Greenfoot.setWorld(crabWorld);
        }
    }
    
    public void showTextWithBigBlackFont(String message, int x, int y) {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
    public void showTextWithSmallBlackFont(String message, int x, int y) {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(40);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
