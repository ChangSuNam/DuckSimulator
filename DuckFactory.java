
/**
 * This class created Duck objects with the enum Species, which contains:
 * {MALLARD, REDHEAD, RUBBER, DECOY, MANDARIN, MODEL}
 * 
 * This class allows user to create variants of ducks using Species
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 * @since Assignment 3 2.2
 */
public class DuckFactory {

	/**
	 * This constructor sets the species and name of the duck.
	 * 
	 * @param specificSpecies  the species of duck
	 * @param specificDuckName the name of duck
	 */
	public DuckFactory(Species thisSpecies, String specificDuckName) {
		specificSpecies = thisSpecies;
		duckName = specificDuckName;
	}

	/**
	 * This constructor sets the default species and name of the duck, when
	 * parameter is not provided
	 * 
	 */
	public DuckFactory() {
		specificSpecies = Species.REDHEAD;
		duckName = "John";

	}

	/**
	 * This method uses switch to created different variants of ducks depending on
	 * the species specified in parameter.
	 * 
	 * @param thisSpecies the species of the duck to be created, from the enum Species
	 * @return duck created with the provided species
	 */
	public Duck createDuck(Species thisSpecies) {
		switch (thisSpecies) {
		case MALLARD:
			MallardDuck factoryCreatedMallard = new MallardDuck(duckName);
			return factoryCreatedMallard;

		case MODEL:
			ModelDuck factoryCreatedModel = new ModelDuck(duckName);
			return factoryCreatedModel;

		case REDHEAD:
			RedheadDuck factoryCreatedRedHead = new RedheadDuck(duckName);
			return factoryCreatedRedHead;
		case RUBBER:
			RubberDuck factoryCreatedRubber = new RubberDuck(duckName);
			return factoryCreatedRubber;
		case DECOY:
			Decoy factoryCreatedDecoy = new Decoy.Name(duckName).done();
			return factoryCreatedDecoy;
		case MANDARIN:
			MandarinDuck factoryCreatedMandarin = new MandarinDuck(duckName);
			return factoryCreatedMandarin;
		default:
			MallardDuck defaultDuck = new MallardDuck(duckName);
			return defaultDuck;

		}

	}
	
	
	/**
	 * This method uses switch to created different variants of ducks depending on
	 * the specificSecies field  in the class, when parameter is not provided
	 * 
	 * @return duck created with the specificSpecies field in the class.
	 */
	public Duck createDuck() {
		switch (specificSpecies) {
		case MALLARD:
			MallardDuck factoryCreatedMallard = new MallardDuck(duckName);
			return factoryCreatedMallard;

		case MODEL:
			ModelDuck factoryCreatedModel = new ModelDuck(duckName);
			return factoryCreatedModel;

		case REDHEAD:
			RedheadDuck factoryCreatedRedHead = new RedheadDuck(duckName);
			return factoryCreatedRedHead;
		case RUBBER:
			RubberDuck factoryCreatedRubber = new RubberDuck(duckName);
			return factoryCreatedRubber;
		case DECOY:
			Decoy factoryCreatedDecoy = new Decoy.Name(duckName).done();
			return factoryCreatedDecoy;
		case MANDARIN:
			MandarinDuck factoryCreatedMandarin = new MandarinDuck(duckName);
			return factoryCreatedMandarin;
		default:
			MallardDuck defaultDuck = new MallardDuck(duckName);
			return defaultDuck;

		}

	}

	/**
	 * This method returns the species set to be created by DuckFactory.
	 * 
	 * @return the species of duck set to be created if creatDuck method does not
	 *         get any parameter
	 */
	public Species getSpecies() {
		return specificSpecies;
	}

	/**
	 * This method sets a new species for DuckFactory to create.
	 * 
	 * @param thisSpecies the species of duck to be set as
	 */
	public void setSpecies(Species thisSpecies) {
		specificSpecies = thisSpecies;
	}

	/**
	 * This method returns the name of duck.
	 * 
	 * @return the name of duck to be created
	 */
	public String getName() {
		return duckName;
	}

	/**
	 * This method sets a new name of duck for DuckFactory to create.
	 * 
	 * @param thisSpecies the new name of duck to be created.
	 */
	public void setName(String thisName) {
		duckName = thisName;
	}

	/**
	 * this method returns the string describing the species of duck
	 * 
	 * @Override overrides toString() method
	 * @return the string describing the species.
	 */
	public String toString() {
		return "This duck's species is a: " + this.getSpecies();
	}

	/*
	 * specificSpecies the species of duck to be created.
	 * duckName the name of duck to be created.
	 */
	private Species specificSpecies;
	private String duckName;
}
