import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Amazing Rock, Paper, Scissors Maze
 * 
 * @author: Nicolas Bergeron
 * 
 * Vanier College 2019 
 */
public class Player extends Actor
{
    protected boolean keyLeftPressed;
    protected boolean keyRightPressed;
    protected boolean keyUpPressed;
    protected boolean keyDownPressed;

    public Player() {

        updateKeyboardState();
    }

    public void moveAround() {
        
        int originalX = getX();
        int originalY = getY();
        
        if (isLeftKeyPressed()) {
            setLocation(getX() - 1, getY());
        }
        if (isRightKeyPressed()) {
            setLocation(getX() + 1, getY());
        }
        if (isUpKeyPressed()) {
            setLocation(getX(), getY() - 1);
        }
        if (isDownKeyPressed()) {
            setLocation(getX(), getY() + 1);
        }
        
        if (isTouching(Wall.class) || isTouchingSameItem()) {
            setLocation(originalX, originalY);
            Greenfoot.playSound("bump.wav");
        }
        
        updateKeyboardState();
    }

    public boolean isTouchingSameItem() {
        if (getClass() == RockPlayer.class) {
            return isTouching(Rock.class);
        }
        if (getClass() == PaperPlayer.class) {
            return isTouching(Paper.class);
        }
        if (getClass() == ScissorsPlayer.class) {
            return isTouching(Scissors.class);
        }
        return false;
    }

    public boolean isLeftKeyPressed() {
        return keyLeftPressed == false && Greenfoot.isKeyDown("left");
    }

    public boolean isRightKeyPressed() {
        return keyRightPressed == false && Greenfoot.isKeyDown("right");
    }

    public boolean isUpKeyPressed() {
        return keyUpPressed == false && Greenfoot.isKeyDown("up");
    }

    public boolean isDownKeyPressed() {
        return keyDownPressed == false && Greenfoot.isKeyDown("down");
    }

    public void updateKeyboardState() {
        keyLeftPressed = Greenfoot.isKeyDown("left");
        keyRightPressed = Greenfoot.isKeyDown("right");
        keyUpPressed = Greenfoot.isKeyDown("up");
        keyDownPressed = Greenfoot.isKeyDown("down");
    }
}
