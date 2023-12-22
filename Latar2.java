import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latar2 extends World
{
    private int jeda=0;
    private int score;
    private int nyawa = 3;
    private int time;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Latar2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        tampilnyawa2();
        tampilscore2();
        showTime2();
        time= 1000;
        addObject (new MobilHitam(),250,550);
        prepare();
    }

    public void updatenyawa(int point)
    {
        nyawa = nyawa + point;
        tampilnyawa2();

        if(nyawa ==0)
        {
            Greenfoot.stop();
            addObject(new kalah(),250,300);
        }
    }

    public void tampilnyawa2()
    {
        showText("Nyawa :"+nyawa, 400, 25);
    }

    public void addScore (int points){
        score = score + points;
        tampilscore2();
    }

    private void tampilscore2()
    {
        showText ("Score :"+score, 100, 25);
    }

    private void countTime()
    {
        time--;
        showTime2();
        if (time == 0)
        {
            Greenfoot.stop();
            addObject(new Menang(),250,300);
        }
    }

    private void showTime2()
    {
        showText("Waktu :"+time,250,25);
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber (100) < 3)
        {
            addObject(new Musuh(), Greenfoot.getRandomNumber(599), 500);
        }
        countTime();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
{

}

}
