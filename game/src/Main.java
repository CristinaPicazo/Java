import game.characters.Character;
import game.characters.Explorer;
import game.characters.enemies.*;
import game.terrains.Maze;
import game.vehicles.Car;

/**
 *
 * @author Cristina Picazo Merlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Character heroDerezade = new Character("Derezade", 
                                       "Programming student. " +
                                       "\n" +
                                       "The hero of this story",
                                       Character.CLEVERNESS);
        Witch witchTani = new Witch("Tani, the witch",
                                       "A malevolent witch");
        Ghost ghostGo = new Ghost("Go, the ghost",
                                       "The backyard ghost.");
                                       
	    heroDerezade.printInfo();
	    witchTani.printInfo();
	    ghostGo.printInfo();
	    
	     /* 1st combat*/
		System.out.println("1st combat Hero vs Witch");
		heroDerezade.fight(witchTani);
		System.out.println("Info after the 1st combat");
		heroDerezade.printInfo();
		witchTani.printInfo();
		
		/* 2nd combat*/
		System.out.println("2nd combat Hero vs Ghost");
		heroDerezade.fight(witchTani, ghostGo);
		System.out.println("Info after the 2nd combat");
		heroDerezade.printInfo();
		witchTani.printInfo();
		ghostGo.printInfo();
		
int[][] maze =  
		{{0, 0, 1, 1, 1, 1, 1, 1},
		{2, 0, 1, 0, 0, 0, 1, 1},
		{1, 0, 1, 0, 0, 0, 0, 0},
		{1, 1, 1, 0, 0, 0, 0, 0},
		{0, 0, 1, 0, 1, 3, 1, 1},
		{0, 0, 1, 0, 1, 0, 0, 1},
		{1, 0, 1, 1, 1, 0, 0, 0},
		{1, 1, 1, 0, 1, 1, 0, 0}}; 
		
		Maze sampleMaze = new Maze(maze);
		
        //polymorphism using superclasses 
        Character [] characters = {heroDerezade, witchTani, ghostGo};
        for(int i=0; i<characters.length;i++){
            characters[i].printInfo();
        }
        
        
        //polymorphism using interfaces    
        Car myFerrari = new Car("Ferrari");
        
        System.out.println("All exploring: hero +, witch w, ghost g, ferrari c");
	    Explorer [] explorers = {heroDerezade, witchTani, ghostGo, myFerrari};
	    for(int i=0; i<explorers.length; i++){
	        explorers[i].explore(sampleMaze);
	        
	    }
	  
	}
}