import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LobsterCage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LobsterCage extends Actor
{
    /**
     * Act - do whatever the LobsterCage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        lobsterIntersecting();
    }
    
    public void dontMove() {
        World world = getWorld();
        world.addObject( new FakeLobster(), getX(), getY());
    }
    
    public void lobsterIntersecting() {
        Actor lobster = getOneIntersectingObject(Lobster.class);
        if (lobster != null) {
            World world = getWorld();
            world.removeObject(lobster);
            dontMove();
        }
    }
}
