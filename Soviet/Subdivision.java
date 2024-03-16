public abstract class Subdivision {
	protected int funding;
	protected String name;

	abstract void setName(String name);
	abstract String getName();
	abstract void setFunding(int funding);
	abstract int getFunding();
}