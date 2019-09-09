import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new Crab();
        addObject(crab, 262, 272);
        Lobster lobster =  new Lobster();
        addObject(lobster, 453, 69);
        Worm worm = new Worm();
        addObject(worm,374,409);
        Worm worm2 = new Worm();
        addObject(worm2,459,262);
        Worm worm3 = new Worm();
        addObject(worm3,251,149);
        Worm worm4 = new Worm();
        addObject(worm4,157,245);
        Worm worm5 = new Worm();
        addObject(worm5,73,373);
        Worm worm6 = new Worm();
        addObject(worm6,99,128);
        Worm worm7 = new Worm();
        addObject(worm7,206,444);
        Worm worm8 = new Worm();
        addObject(worm8,323,317);
        Worm worm9 = new Worm();
        addObject(worm9,462,480);
        Worm worm10 = new Worm();
        addObject(worm10,509,174);
        Worm worm11 = new Worm();
        addObject(worm11,320,63);
        Worm worm12 = new Worm();
        addObject(worm12,164,58);
        Worm worm13 = new Worm();
        addObject(worm13,283,526);
    }
}
