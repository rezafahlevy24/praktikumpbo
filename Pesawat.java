import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesawat extends Actor
{
    /**
     * Act - do whatever the Pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pesawat()
    {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
        setRotation(270);
    }
    public void act()
    {        
        move(3);
        belok();
    }
    public void belok()
    {
        
        if (isAtEdge()){
            int x = getX();
            int y = getY();
            if (x == 599){
                setLocation(x -1, y);
                setRotation(getRotation()+90);
            } else if (x == 0){
                setLocation(x +1,y);
                setRotation(getRotation()+90);
            } else if (y == 599){
                setLocation(x ,y -1);
                setRotation(getRotation()+90);
            } else if (y == 0){
                setLocation(x ,y +1);
                setRotation(getRotation()+90);
            }
        }
    }
}
