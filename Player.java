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
        collectingNuggets();
    }    
    
    protected void movingAndTurning() {
        int speed = 6;
        
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
}