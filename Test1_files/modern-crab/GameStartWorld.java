import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameStartWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameStartWorld extends World
{

    /**
     * Constructor for objects of class GameStartWorld.
     * 
     */
    public GameStartWorld() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act() {
        if(Greenfoot.isKeyDown("space")){
            World crabWorld = new CrabWorld();
            Greenfoot.setWorld(crabWorld);
        }
    }
}
