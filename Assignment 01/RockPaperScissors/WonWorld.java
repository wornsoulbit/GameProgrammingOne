import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WonWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WonWorld extends World
{

    /**
     * Constructor for objects of class WonWorld.
     * 
     */
    public WonWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(12, 10, 75); 
        drawWinningText("You Win!", 330, 350);
    }
    public void drawWinningText(String message, int x, int y){
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}
