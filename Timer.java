import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private long startTime;
    
    public Timer() {
        startTime = System.currentTimeMillis();
    }
    
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.setImage(new GreenfootImage("" + GetElapsedTime(), 40, Color.BLACK,new Color(0, 0, 0, 0)));
    }    
    
    public String GetElapsedTime() {
        long milDuration;
        int seconds, minutes;
        String duration;
        
        milDuration = System.currentTimeMillis() - startTime;
        seconds = (int)(milDuration / 1000);
        minutes = seconds / 60;
        seconds %= 60;
        duration = minutes + ":" + seconds;
        return duration;
    }
}