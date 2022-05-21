/**
 * This class extends the abstract class of Duck. It specifies how Mallard Duck
 * will quack and fly via behavior implementation classes that implements QuackBehavior and FlyBehavior interfaces.
 * 
 * The codes were retrieved from Chapter 1 of "Head First Design Patterns", by
 * O'Reilly.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */
public class MallardDuck extends Duck {
	/**
	 * 
	 * This is a constructor for this class that creates instances for behavior
	 * implementation classes for Mallard ducks. It sets the specificQuackBehavior as Quack
	 * object, and specificFlyBehavior with FlyWithWings object. It sets name of the duck as the given parameter.
	 * 
	 * @param mallardDuckName the name of the duck to be set.
	 */
	public MallardDuck(String mallardDuckName) {
		super(mallardDuckName);
		specificQuackBehavior = new Quack();
		specificFlyBehavior = new FlyWithWings();
		
	}
	
	/**
	 * 
	 * This is a constructor for this class that creates instances for behavior
	 * implementation classes for Mallard ducks. It sets the specificQuackBehavior as Quack
	 * object, and specificFlyBehavior with FlyWithWings object. It sets name of the duck with a default name.
	 * 
	 * @param mallardDuckName the name of the duck to be set.
	 */
	public MallardDuck() {
		super();
		specificQuackBehavior = new Quack();
		specificFlyBehavior = new FlyWithWings();
		
	}

	/**
	 * This method defines the display method for Mallard duck, clarifying that this
	 * object is a Mallard duck.
	 */
	public void display() {
		System.out.println("I'm a real Mallard duck");
		System.out.println("My Name is: " +getName());
	}



}
