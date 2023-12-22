import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rudal2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rudal2 extends Actor
{
    /**
     * Act - do whatever the Rudal2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void gerak2()
    {
        setLocation(getX(),getY()-5);
        if(getY()<10){
            getWorld().removeObject(this);
        }else{
            cek_kena2();
        }
    }
    
    public void cek_kena2(){
        if(isTouching(Musuh.class))
        {
            getWorld().addObject(new Ledakan1(), getX(), getY());
            Latar2 m= (Latar2)getWorld();
            m.addScore(20);
            
            Greenfoot.playSound("explosion.wav");
            removeTouching(Musuh.class);
        }
    }
    
    public void act() 
    {
        gerak2();
    }    
}
