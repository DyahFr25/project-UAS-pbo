import greenfoot.*;

public class CharSelect extends World
{
    public CharSelect()
    {    
        super(500, 600, 1); 
        prepare();
    }

    private void prepare()
    {
        Pesawat pesawat = new Pesawat();
        MobilHitam mobilHitam = new MobilHitam();
        
        // Tambahkan objek Pesawat dan MobilHitam ke dunia
        int middleX = getWidth() / 2;
        int middleY = getHeight() / 2;
        
        addObject(pesawat, middleX - 100, middleY);
        addObject(mobilHitam, middleX + 100, middleY);
        
    }

    public void act()
    {
        // Tambahkan logika pemilihan karakter
        if (Greenfoot.mousePressed(null))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null)
            {
                Actor actor = mouse.getActor();
                if (actor != null)
                {
                    if (actor instanceof Pesawat)
                    {
                        // Pilih karakter Pesawat
                        startGame(new Latar()); // Ganti dengan kelas World untuk karakter Pesawat
                    }
                    else if (actor instanceof MobilHitam)
                    {
                        // Pilih karakter MobilHitam
                        startGame(new Latar2()); // Ganti dengan kelas World untuk karakter MobilHitam
                    }
                }
            }
        }
    }

    private void startGame(World world)
    {
        Greenfoot.setWorld(world);
    }
}
