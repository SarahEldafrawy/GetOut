package drawables.characters.heros;

import drawables.characters.commands.Command;
import drawables.characters.heros.states.DirectionState;
import drawables.pickables.Weapon;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import maze.Maze;

import java.awt.*;

public class Flash extends StandardHero {
    private static final int HEALTH_POINTS = 100;
    private static final int MOTION_DELAY = 10;
    private static final int WEAPONS_LIMIT = 1;

    public Flash(){
        setHealthPoints();
    }

    @Override
    public boolean move(Command moveCommand, Maze maze) {
        boolean moveResult = super.move(moveCommand, maze);
        try {
            Thread.sleep(MOTION_DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return moveResult;
    }

    @Override
    protected int getHeroStartingHealth() {
        return HEALTH_POINTS;
    }

    @Override
    public void addWeapon(Weapon weapon) {
        super.addWeapon(weapon);
        if(getNumberOfWeapons() > WEAPONS_LIMIT){
            removeFirstWeapon();
        }
    }

    @Override
    public void drawOnCanvas(GraphicsContext gc, Point pt, int width, int height) {

    }

	
}
