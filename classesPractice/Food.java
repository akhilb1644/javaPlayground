package classesPractice;

public abstract class Food {
	protected int calories;
	protected String name;
	protected FoodType foodType;
	
	public Food() { // no arg constructor
		calories = 0;
		name = "Unknown";
		foodType = FoodType.OTHER;
	}
	
	public Food(int calories,String name,FoodType foodType) {
		this.calories = calories;
		this.name = name;
		this.foodType = foodType;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public String getName() {
		return name;
	}
	
	public FoodType getFoodType() {
		return foodType;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public void setName(String name) {
		this.name = name;
	}
/*
	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
*/
}