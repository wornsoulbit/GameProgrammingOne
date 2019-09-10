import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld(){
        super(560, 560, 1);
        drawWinningText("You Win!", 180, 260);
    }

    public void drawWinningText(String message, int x, int y){
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}