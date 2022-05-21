/**
 * This class extends the abstract class of Duck. It specifies how Redhead Duck
 * will quack and fly via behavior implementation classes that implements
 * QuackBehavior and FlyBehavior interfaces.
 * 
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */
public class RedheadDuck extends Duck {
	/**
	 * This is a constructor for this class that creates instances for behavior
	 * implementation classes for Redhead ducks. It sets the specificQuackBehavior as
	 * Quack object, and specificFlyBehavior with FlyWithWings object. It sets name of the duck as the given parameter.
	 * 
	 * @param redHeadDuckName the name of the duck to be set.
	 */
	public RedheadDuck(String redHeadDuckName) {
		super(redHeadDuckName);
		specificQuackBehavior = new Quack();
		specificFlyBehavior = new FlyWithWings();

	}
	
	/**
	 * This is a constructor for this class that creates instances for behavior
	 * implementation classes for Redhead ducks. It sets the specificQuackBehavior as
	 * Quack object, and specificFlyBehavior with FlyWithWings object. It sets name of the duck with a default name.
	 * 
	 */
	public RedheadDuck() {
		super();
		specificQuackBehavior = new Quack();
		specificFlyBehavior = new FlyWithWings();

	}

	/**
	 * This method defines the display method for Redhead duck, clarifying that this
	 * object is a Redhead duck.
	 */
	public void display() {
		System.out.println("I'm a redhead duck");
		System.out.println("My Name is: " + getName());
	}

}
