// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(600, 400, 1);
        gameMusic =  new  GreenfootSound("win.wav");
        showTextWithBigBlackFont("Congratulations, You Win", 20, 200);
    }

    /**
     * 
     */
    public void started()
    {
        gameMusic.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        gameMusic.stop();
    }

    /**
     * 
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
