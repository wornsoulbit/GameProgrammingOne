import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FakeLobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FakeLobster extends Actor
{
    /**
     * Act - do whatever the FakeLobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        moveAround();
    }
    
    public void moveAround() {
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }
}
