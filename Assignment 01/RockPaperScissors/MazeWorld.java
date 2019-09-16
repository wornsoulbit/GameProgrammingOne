// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Amazing Rock, Paper, Scissors Maze
 * 
 * @author: Nicolas Bergeron
 * 
 * Vanier College 2019 
 */
public class MazeWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class MazeWorld.
     */
    public MazeWorld()
    {
        super(12, 10, 75);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall =  new Wall();
        addObject(wall, 11, 1);
        Wall wall2 =  new Wall();
        addObject(wall2, 10, 1);
        Wall wall3 =  new Wall();
        addObject(wall3, 8, 0);
        Wall wall4 =  new Wall();
        addObject(wall4, 8, 1);
        Wall wall5 =  new Wall();
        addObject(wall5, 8, 2);
        Wall wall6 =  new Wall();
        addObject(wall6, 8, 3);
        Wall wall7 =  new Wall();
        addObject(wall7, 9, 3);
        Wall wall8 =  new Wall();
        addObject(wall8, 10, 3);
        Wall wall9 =  new Wall();
        addObject(wall9, 10, 4);
        Wall wall10 =  new Wall();
        addObject(wall10, 8, 5);
        Wall wall11 =  new Wall();
        addObject(wall11, 8, 6);
        Wall wall12 =  new Wall();
        addObject(wall12, 9, 6);
        Wall wall13 =  new Wall();
        addObject(wall13, 10, 6);
        Wall wall14 =  new Wall();
        addObject(wall14, 10, 7);
        Wall wall15 =  new Wall();
        addObject(wall15, 10, 8);
        Wall wall16 =  new Wall();
        addObject(wall16, 10, 9);
        RockPlayer rockPlayer =  new RockPlayer();
        addObject(rockPlayer, 11, 5);
        Rock rock =  new Rock();
        addObject(rock, 8, 4);
        Scissors scissors =  new Scissors();
        addObject(scissors, 11, 0);
        Scissors scissors2 =  new Scissors();
        addObject(scissors2, 11, 9);
        Paper paper =  new Paper();
        addObject(paper, 11, 6);
        Wall wall17 =  new Wall();
        addObject(wall17, 6, 5);
        Wall wall18 =  new Wall();
        addObject(wall18, 6, 6);
        Wall wall19 =  new Wall();
        addObject(wall19, 6, 7);
        Wall wall20 =  new Wall();
        addObject(wall20, 6, 8);
        Wall wall21 =  new Wall();
        addObject(wall21, 7, 8);
        Wall wall22 =  new Wall();
        addObject(wall22, 8, 8);
        Wall wall23 =  new Wall();
        addObject(wall23, 5, 8);
        Wall wall24 =  new Wall();
        addObject(wall24, 6, 3);
        Wall wall25 =  new Wall();
        addObject(wall25, 6, 2);
        Wall wall26 =  new Wall();
        addObject(wall26, 5, 2);
        Wall wall27 =  new Wall();
        addObject(wall27, 4, 2);
        Wall wall28 =  new Wall();
        addObject(wall28, 4, 1);
        Wall wall29 =  new Wall();
        addObject(wall29, 4, 0);
        Wall wall30 =  new Wall();
        addObject(wall30, 6, 1);
        Wall wall31 =  new Wall();
        addObject(wall31, 4, 8);
        Wall wall32 =  new Wall();
        addObject(wall32, 4, 9);
        Wall wall33 =  new Wall();
        addObject(wall33, 5, 5);
        Wall wall34 =  new Wall();
        addObject(wall34, 4, 5);
        Wall wall35 =  new Wall();
        addObject(wall35, 4, 4);
        Wall wall36 =  new Wall();
        addObject(wall36, 3, 4);
        Wall wall37 =  new Wall();
        addObject(wall37, 2, 4);
        Wall wall38 =  new Wall();
        addObject(wall38, 2, 3);
        Wall wall39 =  new Wall();
        addObject(wall39, 2, 2);
        Wall wall40 =  new Wall();
        addObject(wall40, 2, 1);
        Wall wall41 =  new Wall();
        addObject(wall41, 1, 1);
        Wall wall42 =  new Wall();
        addObject(wall42, 0, 3);
        Wall wall43 =  new Wall();
        addObject(wall43, 0, 4);
        Wall wall44 =  new Wall();
        addObject(wall44, 0, 5);
        Wall wall45 =  new Wall();
        addObject(wall45, 0, 6);
        Wall wall46 =  new Wall();
        addObject(wall46, 1, 6);
        Wall wall47 =  new Wall();
        addObject(wall47, 2, 6);
        Wall wall48 =  new Wall();
        addObject(wall48, 2, 7);
        Wall wall49 =  new Wall();
        addObject(wall49, 2, 8);
        Wall wall50 =  new Wall();
        addObject(wall50, 1, 8);
        Goal goal =  new Goal();
        addObject(goal, 1, 7);
        Rock rock2 =  new Rock();
        addObject(rock2, 6, 4);
        Paper paper2 =  new Paper();
        addObject(paper2, 5, 4);
        Scissors scissors3 =  new Scissors();
        addObject(scissors3, 5, 1);
        Paper paper3 =  new Paper();
        addObject(paper3, 5, 3);
        Rock rock3 =  new Rock();
        addObject(rock3, 5, 9);
        Paper paper4 =  new Paper();
        addObject(paper4, 7, 7);
        Scissors scissors4 =  new Scissors();
        addObject(scissors4, 9, 8);
        Scissors scissors5 =  new Scissors();
        addObject(scissors5, 4, 3);
        Rock rock4 =  new Rock();
        addObject(rock4, 5, 6);
        Scissors scissors6 =  new Scissors();
        addObject(scissors6, 5, 7);
        Rock rock5 =  new Rock();
        addObject(rock5, 0, 7);
        Scissors scissors7 =  new Scissors();
        addObject(scissors7, 0, 8);
        Paper paper5 =  new Paper();
        addObject(paper5, 0, 9);
        Rock rock6 =  new Rock();
        addObject(rock6, 5, 0);
        removeObject(rock6);
        removeObject(scissors3);
        Rock rock7 =  new Rock();
        addObject(rock7, 5, 1);
        Scissors scissors9 =  new Scissors();
        addObject(scissors9, 5, 0);
    }
}
