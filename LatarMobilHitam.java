import greenfoot.*;

public class LatarMobilHitam extends World
{
    public LatarMobilHitam()
    {    
        super(600, 400, 1);
    }

    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new Latar2());
        }
    }    
}
