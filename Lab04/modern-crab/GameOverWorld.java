import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class GameOverWorld extends World{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld(){
        super(560, 560, 1);
        drawGameOverText("Game Over", 180, 260);
    }
    public void drawGameOverText(String message, int x, int y){
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}