import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
    	moveAround();
    	addLobster();
        killCrab();
        if(isGameOver()){
            transitionToGameLostWorld();
        }
    }
    //Lets the lobster move randomly
    public void moveAround(){
    	move(4);
    	if(Greenfoot.getRandomNumber(10)==1){
    		turn(Greenfoot.getRandomNumber(90)-45);
    	}
    	if(isAtEdge()){
    		turn(180);
    	}
    }
    //Adds a new Lobster to the world when eaten.
    public void addLobster(){
    	Actor worm = getOneIntersectingObject(Worm.class);
    	Actor lobster = new Lobster();
    	if(worm != null){
    		World world = getWorld();
            world.removeObject(worm);
            world.addObject(lobster,getX(),getY());
    	}
    }
    //Kills the crab if they hit eachother.
    public void killCrab(){
        if (isTouching(Crab.class)) {
            removeTouching(Crab.class);
        }
    }
    //Checks to see if there is any crabs in the world.
    public boolean isGameOver(){
        World world = getWorld();
        if (world.getObjects(Crab.class).isEmpty()) {
            return true;
        }else{
            return false;
        }    
    }
    public void transitionToGameLostWorld(){
        World gameOverWorld = new GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
}
