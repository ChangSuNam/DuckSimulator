/**
 * This in an interface for fly. It contains method for ducks to fly, which can
 * be specified in each behavior implementation class.
 * 
 * The codes were retrieved from Chapter 1 of "Head First Design Patterns", by
 * O'Reilly.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */

public interface FlyBehavior {
	/**
	 * This is an abstract method that Classes implementing FlyBehavior should use.
	 */
	public void fly();
}
