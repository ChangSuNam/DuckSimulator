
/**
 * This class implements the interface FlyBehavior, and specifies the fly method
 * for ducks that fly with rockets.
 * 
 * The codes were retrieved from Chapter 1 of "Head First Design Patterns", by
 * O'Reilly.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */
public class FlyRocketPowered implements FlyBehavior {

	/**
	 * This method shows the fly behavior for ducks that fly with rockets.
	 */
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}
