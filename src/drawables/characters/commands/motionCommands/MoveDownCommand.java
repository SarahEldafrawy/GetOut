package drawables.characters.commands.motionCommands;

import drawables.Drawable;
import drawables.characters.MovingObject;
import drawables.characters.commands.Command;
import drawables.characters.heros.states.DirectionDownState;
import maze.Maze;

import java.awt.*;

public class MoveDownCommand implements Command {


    @Override
    public boolean execute(MovingObject object, Maze maze) {

        object.setDirectionState(new DirectionDownState());

        MoveUtilities utilities = new MoveUtilities();
        Point position = object.getPosition();
        position.y = position.y - 1;

        object.setPosition(position);
        Drawable itemInNextPosition = maze.getItemInPosition(position);
        boolean isValidMove = utilities.isAValidMove(itemInNextPosition);

        if(isValidMove){
            utilities.performMove(itemInNextPosition,object);
            object.setPosition(position);
            return true;
        }
        return false;

    }
}
