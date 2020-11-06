import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disc extends Enemy
{
    /**
     * Act - do whatever the Disc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        bounce(10, 90);
        foundPlayer();
    }    
}
