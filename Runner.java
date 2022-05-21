
/**
 * This is a runner class that contains main method. It creates and tests duck
 * objects, DuckFactory, and Decoy.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.1
 */
public class Runner {

	public static void main(String[] args) {
		
		
		// testing concrete mallard duck
		System.out.println("Testing part 1:");
		System.out.println("");
		Duck mallard = new MallardDuck("Mallardy");
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		System.out.println("///////");
		//
		// testing concrete model duck
		Duck model = new ModelDuck("Modely");
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.display();
		System.out.println("///////");
		//
		//testing concrete rubber duck
		Duck rubber = new RubberDuck();
		rubber.performQuack();
		rubber.performFly();
		rubber.display();
		System.out.println("///////");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//
		//
		//

		System.out.println("Testing part 2, DuckFactory:");
		System.out.println("");
		// testing createDuck with no parameters
		DuckFactory duckCreator = new DuckFactory();
		System.out.println(
				"If createDuck method do not get any paramter, duckFactory will create: " + duckCreator.getSpecies());
		Duck factoryMallard = duckCreator.createDuck(Species.MALLARD);
		System.out.println("createDuck() recieved MALLARD as parameter.");
		factoryMallard.performQuack();
		factoryMallard.performFly();
		
		factoryMallard.display();
		System.out.println("///////");
		//
		// testing createDuck without parameter
		duckCreator.setName("Wang");
		System.out.println("Name was set as Wang");
		duckCreator.setSpecies(Species.MANDARIN);
		System.out.println("Species was set as Mandarin");
		System.out.println(
				"If createDuck method do not get any paramter, duckFactory will create: " + duckCreator.getSpecies());
		
		Duck factoryMandarin = duckCreator.createDuck();
		System.out.println("createDuck() did not get any parameter.");
		factoryMandarin.performQuack();
		factoryMandarin.performFly();
		factoryMandarin.display();
		System.out.println("///////");
		//
		// testing createDuck with parameter
		duckCreator.setName("Ken");
		System.out.println("Name was set as Ken");
		System.out.println(
				"If createDuck method do not get any paramter, duckFactory will create: " + duckCreator.getSpecies());
		Duck factoryRedhead = duckCreator.createDuck(Species.REDHEAD);
		System.out.println("createDuck() recieved REDHEAD as parameter.");
		factoryRedhead.performQuack();
		factoryRedhead.performFly();
		factoryRedhead.display();
		System.out.println("///////");
		//
		// testing createDuck with parameter
		duckCreator.setName("Devon");
		System.out.println("Name was set as Devon");
		System.out.println(
				"If createDuck method do not get any paramter, duckFactory will create: " + duckCreator.getSpecies());
		Duck factoryDecoy = duckCreator.createDuck(Species.DECOY);
		System.out.println("createDuck() recieved DECOY as parameter.");
		factoryDecoy.performQuack();
		factoryDecoy.performFly();
		factoryDecoy.display();
		System.out.println("///////");

		
	
		System.out.println(
				"If createDuck method do not get any paramter, duckFactory will create: " + duckCreator.getSpecies());
		Duck emptyFactory = duckCreator.createDuck();
		System.out.println("createDuck() recieved REDHEAD as parameter.");
		emptyFactory.performQuack();
		emptyFactory.performFly();
		emptyFactory.display();
		System.out.println("///////");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		//
		//
		//
		// testing builder pattren, decoy
		System.out.println("Testing part 3, Decoy:");
		System.out.println("");
		Decoy myDecoyEmptyParam = new Decoy.Name().done();
		myDecoyEmptyParam.display();
		System.out.println("///////");

		Decoy myDecoyOnlyName = new Decoy.Name("Jane").done();
		myDecoyOnlyName.display();
		myDecoyOnlyName.performFly();
		myDecoyOnlyName.performQuack();
		System.out.println("///////");

		Decoy myDecoyFull = new Decoy.Name("Alex").weight(300.5).leg(1).color(DuckColor.BLACK).canFly(false)
				.canQuack(false).gender("male").done();
		myDecoyFull.display();
		myDecoyFull.performFly();
		myDecoyFull.performQuack();
		System.out.println("///////");

		Decoy myDecoyRandomCombination = new Decoy.Name("Sam").color(DuckColor.BLACK).canFly(false).leg(0).done();
		myDecoyRandomCombination.display();
		myDecoyRandomCombination.performFly();
		myDecoyRandomCombination.performQuack();
		System.out.println("///////");

//	 	The following should be used for input not specified:	
//		duckName = "Dexter";
//		weightInGram = 500;
//		numberOfLegs = 2;
//		bodyColor = duckColor.BROWN;
//		isFlyable = true;
//		isQuackable = true;

	}
}
