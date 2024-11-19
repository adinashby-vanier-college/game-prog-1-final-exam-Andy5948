// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld()
    {
        super(600, 400, 1);
        gameMusic =  new  GreenfootSound("lose.wav");
        showTextWithBigWhiteFont("Game Over", 130, 200);
        started();
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
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}
