/**
 * This class implements the interface FlyBehavior, and specifies the fly method
 * for ducks that fly with their wings.
 * 
 * The codes were retrieved from Chapter 1 of "Head First Design Patterns", by
 * O'Reilly.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */
public class FlyWithWings implements FlyBehavior {

	/**
	 *This method shows the fly behavior for ducks that fly with their wings.
	 */

	public void fly() {
		System.out.println("I'm flying!!");
	}
}
