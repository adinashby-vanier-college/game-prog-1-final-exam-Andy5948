// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class FinishLocation extends Actor
{

    /**
     * Act - do whatever the FinishLocation wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isGameWon()) {
            transitionToGameWorld();
        }
    }

    /**
     * checks if game is won
     */
    public boolean isGameWon()
    {
        World MyWorld = getWorld();
        Actor Ladybug = getOneIntersectingObject(Ladybug.class);
        if (Ladybug != null) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * transitions to losing screen
     */
    public void transitionToGameWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        gameWonWorld.started();
        Greenfoot.setWorld(gameWonWorld);
    }
}
