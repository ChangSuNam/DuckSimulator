/**
 * This class extends the abstract class of Duck. It creates decoy ducks with
 * builder pattern, using the inner class Name. It specifies how Decoy Duck will
 * quack and fly via behavior implementation classes that implements
 * QuackBehavior and FlyBehavior interfaces.
 * 
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.3
 */
public class Decoy extends Duck {
	/**
	 * 
	 * This constructor takes Name class as parameter, and sets fields of Decoy from
	 * information given from Name Class is private to protect Info pattern
	 * 
	 * @param builder the static inner class that will create decoy object.
	 */
	private Decoy(Name builder) {
		weightInGram = builder.weightInGram;
		numberOfLegs = builder.numberOfLegs;
		bodyColor = builder.bodyColor;
		isFlyable = builder.isFlyable;
		isQuackable = builder.isQuackable;
		duckName = builder.duckName;
		theGender = builder.theGender;
		
		if (this.isFlyable == true) {
			specificFlyBehavior = new FlyWithWings();
		} else {
			specificFlyBehavior = new FlyNoWay();
		}

		if (this.isQuackable == true) {
			specificQuackBehavior = new Quack();
		} else {
			specificQuackBehavior = new MuteQuack();
		}

	}

	/**
	 * This is a get method to get weight of the decoy.
	 * 
	 * @return weightInGram the weight of Decoy duck.
	 */
	public double getWeightInGram() {
		return weightInGram;
	}

	/**
	 * This is a get method to get number of legs of the deocy
	 * 
	 * @return numberOfLegs the amount of leg the Decoy duck has.
	 */
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	/**
	 * This is a get method to get color of the decoy.
	 * 
	 * @return bodyColor the color of Decoy duck.
	 */
	public DuckColor getBodyColor() {
		return bodyColor;
	}
	
	/**
	 * This is a get method to get the gender of the duck.
	 * 
	 * @return theGender the gender of Decoy duck.
	 */
	public String getTheGender() {
		return theGender;
	}


	/**
	 * This is a get method to get the boolean value that indicates if the decoy
	 * duck can fly.
	 * 
	 * @return isFLyable the ability of Decoy duck to fly.
	 */
	public boolean getIsFlyable() {

		return isFlyable;
	}

	/**
	 * This is a get method to get the boolean value that indicates if the decoy
	 * duck can quack.
	 * 
	 * @return isQuackable the ability of Decoy duck to quack.
	 */
	public boolean getIsQuackable() {
		return isQuackable;
	}

	/**
	 * This is an overridden method that returns information of decoy duck created
	 * in String.
	 * 
	 * @Override overrides toString() method
	 */
	public String toString() {
		return "\n" + "Decoy " + "{ duckName = " + duckName + "\n" + ", weightInGram = " + weightInGram + "\n"
				+ ", numberOfLegs = " + numberOfLegs + "\n" + ", bodyColor = " + bodyColor + "\n" + ", isFlyable = "
				+ isFlyable + "\n" + ", theGender = " + theGender+ "\n" + ", isQuackable = " + isQuackable + "\n" + "}";
	}

	/**
	 * This method displays information about decoy.
	 */
	public void display() {
		System.out.println("This duck has the following property: " + toString());

	}

	/**
	 * This is the innner static class that will create decoy with combinations of
	 * inputs given.
	 * 
	 * 
	 * @author ChangSu Nam
	 * @UNI cn2521
	 * @since Assignment 3 2.3
	 */

	public static class Name {

		/**
		 * This constructor sets name of the duck to be created with the given
		 * parameter, and sets the rest of the field with reasonable default values.
		 * 
		 * @param specificName the name to be set for Decoy
		 */
		public Name(String specificName) {
			duckName = specificName;
			weightInGram = 500;
			numberOfLegs = 2;
			bodyColor = DuckColor.BROWN;
			theGender = "female";
			isFlyable = true;
			isQuackable = true;	
		
		}

		/**
		 * This constructor sets every field with reasonable default value, when
		 * parameter is not provided
		 */
		public Name() {
			duckName = "Dexter";
			weightInGram = 500;
			numberOfLegs = 2;
			bodyColor = DuckColor.BROWN;
			theGender = "female";
			isFlyable = true;
			isQuackable = true;

		}

		/**
		 * This method sets the weight of the duck to be created with the given
		 * parameter.
		 * 
		 * @param specificWeight the weight of the duck to be created.
		 * @return the static class Name to be used for builder pattern.
		 */
		public Name weight(double specificWeight) {
			weightInGram = specificWeight;
			return this;

		}

		/**
		 * This method sets the number of legs of the duck to be created with the given
		 * parameter.
		 * 
		 * @param legCount the number of leg of the duck to be created.
		 * @return the static class Name to be used for builder pattern.
		 */
		public Name leg(int legCount) {
			numberOfLegs = legCount;
			return this;

		}

		/**
		 * This method sets the color of the duck to be created with the given
		 * parameter.
		 * 
		 * @param specificColor the color of the duck to be created.
		 * @return the static class Name to be used for builder pattern.
		 */
		public Name color(DuckColor specificColor) {
			bodyColor = specificColor;
			return this;

		}

		/**
		 * This method sets the ability to fly for the duck to be created with the given
		 * parameter.
		 * 
		 * @param hasFlyability the ability for the duck to fly.
		 * @return the static class Name to be used for builder pattern.
		 */
		public Name canFly(boolean hasFlyability) {
			isFlyable = hasFlyability;
			return this;
		}

		/**
		 * This method sets the ability to quack for the duck to be created with the
		 * given parameter.
		 * 
		 * @param hasVoice the ability for the duck to quack.
		 * @return the static class Name to be used for builder pattern.
		 */
		public Name canQuack(boolean hasVoice) {
			isQuackable = hasVoice;
			return this;
		}
		
		/**
		 * This method sets the gender of the duck to be created with the
		 * given parameter.
		 * 
		 * @param specificGender the gender of the duck to be created.
		 * @return the static class Name to be used for builder pattern.
		 */
		public Name gender(String specificGender) {
			theGender = specificGender;
			return this;
		}

		/**
		 * This method is the builder method to return the finished object. It makes the
		 * inner object to the outer object.
		 * 
		 * @return Decoy duck to be created with the specific fields.
		 */
		public Decoy done() {
			return new Decoy(this);

		}

		/*
		 * weightInGram the weight of the duck to be created. 
		 * numberOfLegs the number of leg of the duck to be created. 
		 * bodyColor the color of duck to be created.
		 * isFlyable the ability for the duck to fly .
		 * isQuackable the ability for the duck to quack. 
		 * duckName the name of the duck.
		 */
		private double weightInGram;
		private int numberOfLegs;
		private DuckColor bodyColor; // enum
		private boolean isFlyable;
		private boolean isQuackable;
		private String theGender;
		private String duckName;

	}
	/*
	 * weightInGram the weight of the duck to be created. 
	 * numberOfLegs the number of leg of the duck to be created. 
	 * bodyColor the color of duck to be created.
	 * isFlyable the ability for the duck to fly .
	 * isQuackable the ability for the duck to quack. 
	 */
	private final double weightInGram;
	private final int numberOfLegs;
	private final DuckColor bodyColor; // enum
	private final boolean isFlyable;
	private final boolean isQuackable;
	private final String theGender;

}
