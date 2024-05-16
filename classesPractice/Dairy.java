package classesPractice;

public class Dairy extends Food {
	protected boolean frozen;
	
	public Dairy() {
		super(0,"Unknown",FoodType.DAIRY);
		frozen = false;
	}
	
	public Dairy(int calories,String name,boolean frozen) {
		super(calories,name,FoodType.DAIRY);
		this.frozen = frozen;
	}
	
	public boolean getFrozen() {
		return frozen;
	}
	
	public void setSeeds(boolean frozen) {
		this.frozen = frozen;
	}
}
