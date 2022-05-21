/**
 * This class extends the abstract class of Duck. It specifies how Rubber Duck
 * will quack and fly via behavior implementation classes that implements QuackBehavior and FlyBehavior interfaces.
 * 
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */
public class RubberDuck extends Duck {
	/**
	 * This is a constructor for this class that creates instances for behavior
	 * implementation classes for Rubber ducks. It sets the specificQuackBehavior as Squeak
	 * object, and specificFlyBehavior with FlyNoWay object. It sets name of the duck as the given parameter.
	 * 
	 *
	 * @param rubberDuckName the name of the duck to be set.
	 */
	public RubberDuck(String rubberDuckName) {
		super(rubberDuckName);
		specificQuackBehavior = new Squeak();
		specificFlyBehavior = new FlyNoWay();
		
	}
	/**
	 * This is a constructor for this class that creates instances for behavior
	 * implementation classes for Rubber ducks. It sets the specificQuackBehavior as Squeak
	 * object, and specificFlyBehavior with FlyNoWay object. It sets name of the duck with a default name.
	 * 
	 */
	public RubberDuck() {
		super();
		specificQuackBehavior = new Squeak();
		specificFlyBehavior = new FlyNoWay();
		
	}

	/**
	 * This method defines the display method for Rubber duck, clarifying that this
	 * object is a Rubber duck.
	 */
	public void display() {
		System.out.println("I'm a rubber duck");
		System.out.println("My Name is: " +getName());
	}



}
