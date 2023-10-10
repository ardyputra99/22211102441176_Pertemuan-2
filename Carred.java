import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carred here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carred extends pendukung
{
    int speed = -3;
    
    public void act()
    {
        Carred a = new Carred();
        Actor i =getOneIntersectingObject(Carblue.class);
        move(speed);
        checkdouble(i);
        end();
        
    }
}
