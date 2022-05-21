/**
 * This class implements the interface QuackBehavior, and specifies the quack
 * method for ducks that squeak.
 * 
 * The codes were retrieved from Chapter 1 of "Head First Design Patterns", by
 * O'Reilly.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */
public class Squeak implements QuackBehavior {

	/**
	 * This method shows the quack behavior for ducks that squeak.
	 */
	public void quack() {
		System.out.println("Squeak");
	}
}
