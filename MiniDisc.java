import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MiniDisc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiniDisc extends Enemy
{
    public MiniDisc() {
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    /**
     * Act - do whatever the MiniDisc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        foundPlayer();
        setRotation();
    }    
}
