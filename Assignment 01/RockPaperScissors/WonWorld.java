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
        drawText("You Win!", 350, 300);
        drawText("Press enter to play again!", 190, 450);
    }
    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            World mazeWorld = new MazeWorld();
            Greenfoot.setWorld(mazeWorld);
        }
    }
    public void drawText(String message, int x, int y){
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}
