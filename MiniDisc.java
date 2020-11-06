import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MiniDisc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiniDisc extends Enemy
{
    int random;
    public MiniDisc() {
        setRotation(Greenfoot.getRandomNumber(270) + 135);
    }
    
    /**
     * Act - do whatever the MiniDisc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        random = Greenfoot.getRandomNumber(180);
        foundPlayer();
        bounce(7, random);
    }    
}