import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act(){
        moveAndTurn();
        eat();    
    }
    //allows the crab to turn left or right and makes it move at a speed of 3.
    public void moveAndTurn(){
      
        move(3);
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }
    //The crab eats the worms and it gets removed from the world.
    public void eat(){
        Actor worm = getOneIntersectingObject(Worm.class);
        if(worm != null){
            World world = getWorld();
            world.removeObject(worm);
            Greenfoot.playSound("eating.wav");
        }
    }
}