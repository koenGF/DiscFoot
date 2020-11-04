import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nugget here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nugget extends Actor
{
    /**
     * Act - do whatever the Nugget wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        nuggetSpawn();
    }
    
    private void nuggetSpawn() {
        int worldNuggets = getWorld().getObjects(Nugget.class).size();
        if(worldNuggets < 10) {
            getWorld().addObject(new Nugget(), Greenfoot.getRandomNumber(getWorld().getWidth() - 30) + 15, Greenfoot.getRandomNumber(getWorld().getHeight() - 30));
        }
    }
}