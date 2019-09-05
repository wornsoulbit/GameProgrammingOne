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
    public void addLobster(){
    	Actor worm = getOneIntersectingObject(Worm.class);
    	Actor lobster = new Lobster();
    	if(worm != null){
    		World world = getWorld();
            world.removeObject(worm);
            world.addObject(lobster,getX(),getY());
    	}
    }
}
