package classesPractice;

public class Meat extends Food {
	private String animal;
	
	public Meat() {
		super(0,"Unknown",FoodType.MEAT);
		animal = "Unknown";
	}
	
	public Meat(int calories,String name,String animal) {
		super(calories,name,FoodType.MEAT);
		this.animal = animal;
	}
	
	public String getAnimal() {
		return animal;
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
}
