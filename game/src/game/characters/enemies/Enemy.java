package game.characters.enemies;
import game.characters.Character;

/**
 *
 * @author Cristina Picazo Merlos
 */
public class Enemy extends Character{
    	public static final String DEFAULT_SCARY_MSG = "Do you want to know what the fear is?";
	
	public Enemy(String name, String description, int secretWeapon){
		super(name, description,secretWeapon);
	}
	public void scare(){
		System.out.println(DEFAULT_SCARY_MSG);
	}
        public void scare(String message){
            message = "Feel fear....";
            System.out.println(message);
        }
}
