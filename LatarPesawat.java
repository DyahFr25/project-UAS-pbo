import greenfoot.*;

public class LatarPesawat extends World
{
    public LatarPesawat()
    {    
        super(600, 400, 1);
    }

    public void act() 
    {
        if (Greenfoot.mousePressed(null))
        {
            Greenfoot.setWorld(new Latar());
        }
    }    
}
