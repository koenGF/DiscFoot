import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }

    public void bounce(int speed, int degrees) {
        move(speed);        
        int x, y, i, wx, wy;

        x = getX();
        y = getY();
        i = getImage().getWidth() / 2;
        wx = getWorld().getWidth() - i;
        wy = getWorld().getHeight() - i;

        if(x >= wx) { 
            move(-speed);
            setRotation(getRotation() + degrees);
        }

        if(y >= wy) { 
            move(-speed);
            setRotation(getRotation() + degrees);
        }

        if(x <= i) { 
            move(-speed);
            setRotation(getRotation() + degrees);
        }

        if(y <= i) { 
            move(-speed);
            setRotation(getRotation() + degrees);
        }
    }

    protected void foundPlayer() {
        GreenfootSound sound = new GreenfootSound("DR SFX DEATH GOREnew1.mp3");
        Actor player;
        player = getOneObjectAtOffset(0, 0, Player.class);
        if(player != null) {
            sound.play();
            getWorld().addObject(new Blood(), getX(), getY());
            getWorld().removeObject(player);
            Greenfoot.stop();
        }
    }
}