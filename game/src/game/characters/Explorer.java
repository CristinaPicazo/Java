package game.characters;
import game.terrains.Maze;

/**
 *
 * @author Cristina Picazo Merlos
 */
public interface Explorer{
    public void explore(Maze mazeToExplore);
    public char getFootprint();
}
