/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.vehicles;
import game.characters.Explorer;
import game.terrains.Maze;
/**
 *
 * @author Cristina Picazo Merlos
 */
public class Car implements Explorer{
   private String name;
   public Car(String name){
       this.name = name;
   }
   public char getFootprint(){
        return 'c';
       
   }
   public void explore(Maze mazeToExplore){
	    if (mazeToExplore.findPathFrom(1, 0)) {
			mazeToExplore.print(getFootprint());
		} else {
			System.out.println("no solution found");
		}
	}
}
