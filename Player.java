import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private GreenfootImage imageLeft;
    private GreenfootImage imageRight;
    
    public Player()
    {
        imageLeft = new GreenfootImage("playerLeft.png");
        imageRight = new GreenfootImage("playerRight.png");        
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movingAndTurning();
    }    
    
    protected void movingAndTurning() {
        if(Greenfoot.isKeyDown("right")) {
            setRotation(0);
            if(getImage() != imageRight) {
                setImage(imageRight);
            }
            setRotation(0);
            move(5);
        }
        
        if(Greenfoot.isKeyDown("left")) {
            if(getImage() != imageLeft) {
                setImage(imageLeft);
            }
            setRotation(0);
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("up")) {
            if(getImage() != imageRight) {
                setImage(imageRight);
            }
            setRotation(-90);
            move(5);
        }
        
        if(Greenfoot.isKeyDown("down")) {
            if(getImage() != imageRight) {
                setImage(imageRight);
            }
            setRotation(90);
            move(5);
        }
    }
}
