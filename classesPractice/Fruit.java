package classesPractice;

public class Fruit extends Food {
	protected boolean seeds;
	
	public Fruit() {
		super(0,"Unknown",FoodType.FRUIT);
		seeds = true;
	}
	
	public Fruit(int calories,String name,boolean seeds) {
		super(calories,name,FoodType.FRUIT);
		this.seeds = seeds;
	}
	
	public boolean seedsPresent() {
		return seeds;
	}
	
	public void setSeeds(boolean seeds) {
		this.seeds = seeds;
	}
}
