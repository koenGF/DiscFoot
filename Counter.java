import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private GreenfootSound one = new GreenfootSound("DR SFX UI CLICK Round1.mp3");    
    int points = 0, randomX, randomY;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        NuggetSpawn();
    }
    
    private int NuggetSpawn() {
        int worldNuggets = getWorld().getObjects(Nugget.class).size();        
        if(worldNuggets < 10) {
            points++;
            if(points >= 20 && points % 10 == 0){
            getWorld().addObject(new MiniDisc(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    this.setImage(new GreenfootImage("" + points, 40, new Color(255, 255, 255), new Color(0, 0, 0, 0)));
        }
            else {
                this.setImage(new GreenfootImage("" + points, 40, Color.BLACK, new Color(0, 0, 0, 0)));            
            }
            randomX = Greenfoot.getRandomNumber(getWorld().getWidth() - 20) + 10;
            randomY = Greenfoot.getRandomNumber(getWorld().getHeight() - 20) + 10;
            getWorld().addObject(new Nugget(), randomX, randomY);
            one.stop();
            one.play();
        }
        return points;
    }
}