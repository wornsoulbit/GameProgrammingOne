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
        drawText("Amazing Rock, Paper, Scissors Maze!", 250, 50);
        drawText("To start press space!", 350, 700);
    }
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            World mazeWorld = new MazeWorld();
            Greenfoot.setWorld(mazeWorld);
        }
    }
    public void drawText(String message, int x, int y){
        GreenfootImage bg = getBackground();
        Font font =  new  Font(25);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
