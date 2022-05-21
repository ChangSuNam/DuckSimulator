
/**
 * This class extends the abstract class of Duck. It specifies how Model Duck
 * will quack and fly via behavior implementation classes that implements
 * QuackBehavior and FlyBehavior interfaces.
 * 
 * The codes were retrieved from Chapter 1 of "Head First Design Patterns", by
 * O'Reilly.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */

public class ModelDuck extends Duck {
	/**
	 * This is a constructor for this class that creates instances for behavior
	 * implementation classes for Model ducks. It sets the specificQuackBehavior as
	 * Quack object, and specificFlyBehavior with FlyNoWay object. It sets name of the duck as the given parameter.
	 * 
	 * @param modelDuckName the name of the duck to be set.
	 */
	public ModelDuck(String modelDuckName) {
		super(modelDuckName);
		specificFlyBehavior = new FlyNoWay();
		specificQuackBehavior = new Quack();
	}
	
	/**
	 * This is a constructor for this class that creates instances for behavior
	 * implementation classes for Model ducks. It sets the specificQuackBehavior as
	 * Quack object, and specificFlyBehavior with FlyNoWay object. It sets name of the duck with a default name.
	 * 
	 */
	public ModelDuck() {
		super();
		specificFlyBehavior = new FlyNoWay();
		specificQuackBehavior = new Quack();
	}

	/**
	 * This method defines the display method for Model duck, clarifying that this
	 * object is a Model duck.
	 */

	public void display() {
		System.out.println("I'm a model duck");
		System.out.println("My Name is: " + getName());
	}

}
