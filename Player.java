import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int speed = 6;
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
        collectingNuggets();
        foundWall();
    }    

    protected void movingAndTurning() {

        if(Greenfoot.isKeyDown("right")) {
            if(getImage() != imageRight) {
                setImage(imageRight);
            }
            this.setLocation(getX() + speed, getY());
        }

        if(Greenfoot.isKeyDown("left")) {
            if(getImage() != imageLeft) {
                setImage(imageLeft);
            }
            this.setLocation(getX() - speed, getY());
        }

        if(Greenfoot.isKeyDown("up")) {
            this.setLocation(getX(), getY() - speed);
        }

        if(Greenfoot.isKeyDown("down")) {
            this.setLocation(getX(), getY() + speed);
        }
    }

    protected void collectingNuggets() {
        Actor nugget;
        nugget = getOneObjectAtOffset(0, 0, Nugget.class);
        if(this.isTouching(Nugget.class)) {
            getWorld().removeObject(nugget);
        }
    }

    protected void foundWall() {
        int x, y, i, wx, wy;

        x = getX();
        y = getY();
        i = getImage().getWidth() / 2;
        wx = getWorld().getWidth() - i;
        wy = getWorld().getHeight() - i;

        if(x >= wx) { 
            this.setLocation(getX() - speed, getY());            
        }

        if(y >= wy) {
            this.setLocation(getX(), getY() - speed);            
        }

        if(x <= i) { 
            this.setLocation(getX() + speed, getY());            
        }

        if(y <= i) { 
            this.setLocation(getX(), getY() + speed);            
        }
    }
}