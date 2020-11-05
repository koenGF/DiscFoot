import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int points = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int worldNuggets = getWorld().getObjects(Nugget.class).size();
        if(worldNuggets < 10) {
            points++;
        }

        this.setImage(new GreenfootImage("" + points, 40, Color.BLACK,new Color(0, 0, 0, 0)));
    }
}