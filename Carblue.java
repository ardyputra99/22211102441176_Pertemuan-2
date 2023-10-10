import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Carblue extends pendukung
{
    int speed = 3;
    
    public void act()
    {
        Carblue a = new Carblue();
        Actor i =getOneIntersectingObject(Carblue.class);
        move(speed);
        checkdouble(i);
        end();
        
    }
}
