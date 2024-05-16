package classesPractice;

public class Poultry extends Food { // for things like eggs, not chicken
	private String animalSource;
	
	public Poultry() {
		super(0,"Unknown",FoodType.POULTRY);
		animalSource = "Unknown";
	}
	
	public Poultry(int calories,String name,String animalSource) {
		super(calories,name,FoodType.POULTRY);
		this.animalSource = animalSource;
	}
	
	public String getAnimalSource() {
		return animalSource;
	}
	
	public void setAnimalSource(String animalSource) {
		this.animalSource = animalSource;
	}
}
