/**
 * This in an interface for quack. It contains method for ducks to quack, which
 * can be specified in each behavior implementation class.
 * 
 * The codes were retrieved from Chapter 1 of "Head First Design Patterns", by
 * O'Reilly.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */
public interface QuackBehavior {
	/**
	 * This is an abstract method that Classes implementing QuackBehavior should
	 * use.
	 */
	public void quack();
}
