// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{

    /**
     * Act - do whatever the Canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isGameLost()) {
            transitionToGameOver();
        }
        shoot();
    }

    /* shots canonballs*/

    /**
     * 
     */
    public void shoot()
    {
        World world = getWorld();
        Actor wait;
    }

    /**
     * checks if game is lost
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * transition to losing screen
     */
    public void transitionToGameOver()
    {
        World MyWorld = getWorld();
        World gameOverWorld =  new  GameOverWorld();
        gameOverWorld.started();
        Greenfoot.setWorld(gameOverWorld);
    }
}
