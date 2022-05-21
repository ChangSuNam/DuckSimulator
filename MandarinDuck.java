
/**
 * This class extends the abstract class of Duck. It specifies how Mandarin Duck
 * will quack and fly via behavior implementation classes that implements
 * QuackBehavior and FlyBehavior interfaces.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.2
 */
public class MandarinDuck extends Duck {
	/**
	 * This is a constructor for this class that creates instances for behavior
	 * implementation classes for Mandarin ducks. It sets the specificQuackBehavior as
	 * Quack object, and specificFlyBehavior with FlyWithWings object. It sets name of the duck as the given parameter.
	 * 
	 * @param mandarinDuckName the name of the duck to be set.
	 */
	public MandarinDuck(String mandarinDuckName) {
		super(mandarinDuckName);
		specificFlyBehavior = new FlyWithWings();
		specificQuackBehavior = new Quack();
	}
	
	/**
	 * This is a constructor for this class that creates instances for behavior
	 * implementation classes for Mandarin ducks. It sets the specificQuackBehavior as
	 * Quack object, and specificFlyBehavior with FlyWithWings object. It sets name of the duck with a default name.
	 * 
	 */
	public MandarinDuck() {
		super();
		specificFlyBehavior = new FlyWithWings();
		specificQuackBehavior = new Quack();
	}

	/**
	 * This method defines the display method for Mandarin duck, clarifying that this
	 * object is a Mandarin duck.
	 */

	public void display() {
		System.out.println("I'm a mandarin duck");
		System.out.println("My Name is: " +getName());
	}


}
