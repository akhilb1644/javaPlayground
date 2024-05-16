package classesPractice;

public class Vegetable extends Food {
	protected boolean seeds;
	
	public Vegetable() {
		super(0,"Unknown",FoodType.VEGETABLE);
		seeds = true;
	}
	
	public Vegetable(int calories,String name,boolean seeds) {
		super(calories,name,FoodType.VEGETABLE);
		this.seeds = seeds;
	}
	
	public boolean seedsPresent() {
		return seeds;
	}
	
	public void setSeeds(boolean seeds) {
		this.seeds = seeds;
	}
}
