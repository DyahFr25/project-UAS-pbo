import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserMusuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserMusuh extends Actor
{
    private int nyawa;
    
    public void gerak()
    {
        setLocation(getX(),getY()+5);
        if(getY()>590){
            getWorld().removeObject(this);
        }else{
            cek_kena();
        }
    }
    
    public void cek_kena() {
    if (isTouching(Pesawat.class) || isTouching(MobilHitam.class)) {
        getWorld().addObject(new Ledakan2(), getX(), getY());
        updateNyawa();
        getWorld().removeObject(this);
        Greenfoot.playSound("meledak.mp3");
    }
}

private void updateNyawa() {
    World world = getWorld();
    if (world instanceof Latar) {
        Latar latar = (Latar) world;
        latar.updatenyawa(-1);
    } else if (world instanceof Latar2) {
        Latar2 latar2 = (Latar2) world;
        latar2.updatenyawa(-1);
    }
}

    
    public void act() 
    {
        gerak();
    }    
}
