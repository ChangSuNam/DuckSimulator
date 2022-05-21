/**
 * This class is an abstract class that contains method for object of ducks.
 * 
 * The codes were retrieved from Chapter 1 of "Head First Design Patterns", by
 * O'Reilly.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */
public abstract class Duck {

	/**
	 * This is constructor of Duck Class.
	 * 
	 * @param duckName the name of the duck to be created.
	 */
	public Duck(String duckName) {
		this.duckName = duckName;
	}

	/**
	 * This is constructor of Duck Class that does not have any parameter, setting a
	 * default name for the duck.
	 * 
	 *
	 */
	public Duck() {
		this.duckName = "Larry";
	}

	/**
	 * This is abstract method for display.
	 */
	public abstract void display();

	/**
	 * This method calls fly method from the duck's fly Behavior implementation
	 * class
	 */
	public void performFly() {
		specificFlyBehavior.fly();
	}

	/**
	 * This method calls quack method from the duck's quack Behavior implementation
	 * class
	 */
	public void performQuack() {
		specificQuackBehavior.quack();
	}

	/**
	 * This method displays the duck's swim behavior.
	 */
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	/**
	 * This method sets a new fly behavior for duck.
	 * 
	 * @param howItFlies the fly behavior of the duck
	 */
	public void setFlyBehavior(FlyBehavior howItFlies) {
		specificFlyBehavior = howItFlies;
	}

	/**
	 * This method sets a new quack behavior for duck.
	 * 
	 * @param howItQuacks the quack behavior of the duck
	 */
	public void setQuackBehavior(QuackBehavior howItQuacks) {
		specificQuackBehavior = howItQuacks;
	}
	
	/**
	 * This method for gets the name of duck.
	 */
	public String getName() {
		return this.duckName;
	}
	/**
	 * specificFlyBehavior the interface that defines fly behaviors.
	 * specificQuackBehavior the interface that defines quack behaviors
	 * duckName the name of the duck.
	 */
	FlyBehavior specificFlyBehavior;
	QuackBehavior specificQuackBehavior;
	String duckName;
}