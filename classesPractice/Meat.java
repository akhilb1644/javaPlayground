package classesPractice;

public class Meat extends Food {
	private String animal;
	
	public Meat() {
		super(0,"Unknown",FoodType.VEGETABLE);
		animal = "Unknown";
	}
	
	public Meat(int calories,String name,String animal) {
		super(calories,name,FoodType.VEGETABLE);
		this.animal = animal;
	}
	
	public String getAnimal() {
		return animal;
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
}
