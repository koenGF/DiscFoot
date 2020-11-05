import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Disc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disc extends Actor
{    
    private GreenfootSound sound;

    /**
     * Act - do whatever the Disc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation();
        foundPlayer();
    }
        
    protected void setRotation() {
        int speed = 10;
        move(speed);
        int x, y, i, wx, wy;
        
        x = getX();
        y = getY();
        i = getImage().getWidth() / 2;
        wx = getWorld().getWidth() - i;
        wy = getWorld().getHeight() - i;
        
        if(x >= wx) { 
            move(-speed);
            setRotation(getRotation() + 90);
        }
        
        if(y >= wy) { 
            move(-speed);
            setRotation(getRotation() + 90);
        }
        
        if(x <= i) { 
            move(-speed);
            setRotation(getRotation() + 90);
        }
        
        if(y <= i) { 
            move(-speed);
            setRotation(getRotation() + 90);
        }
    }
    
    protected void foundPlayer() {
        Actor player;
        player = getOneObjectAtOffset(0, 0, Player.class);
        if(player != null) {
            Greenfoot.playSound("death.wav");
            getWorld().removeObject(player);
            Greenfoot.stop();
        }
    }
}