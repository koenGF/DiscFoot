import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        populateTheWorld();
    }

    protected void populateTheWorld() {
        int middleWidth = getWidth() / 2;
        int middleHeight = getWidth() / 2;
        addObject(new Counter(), 20, 20);
        addObject(new Timer(), getWidth() - 40, 20);
        addObject(new Player(), middleWidth, getHeight() - getHeight() / 4);
        addObject(new Disc(), 40, 40);
        addObject(new Disc(), getWidth() - 40, getWidth() - 40);
        for(int teller = 0; teller < 10; teller++) {
            addObject(new Nugget(), Greenfoot.getRandomNumber(getWidth() - 20) + 10, Greenfoot.getRandomNumber(getHeight() - 20) + 10);
        }
        for(int teller = 0; teller < 3; teller++) {
            addObject(new MiniDisc(), middleWidth, middleHeight);
        }
        setPaintOrder(Counter.class, MiniDisc.class, Disc.class, Player.class, Nugget.class);
    }
}