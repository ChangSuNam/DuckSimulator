/**
 * This class implements the interface FlyBehavior, and specifies the fly method
 * for ducks that cannot fly.
 * 
 * The codes were retrieved from Chapter 1 of "Head First Design Patterns", by
 * O'Reilly.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */

public class FlyNoWay implements FlyBehavior {
	
	/**
	 *This method shows the fly behavior for ducks that cannot fly. 
	 */
	public void fly() {
		System.out.println("I can't fly");
	}
}
