import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    //int monster_speed = 4;
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //setLocation( getX() - monster_speed , getY() );
        if (getX()==0)
        {
            setLocation(0,getY());
        }  
                setLocation(getX()-12,getY());
    }
}
