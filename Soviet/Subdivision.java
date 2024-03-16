public abstract class Subdivision {
	protected int funding = 0;
	protected String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setFunding(int funding) {
		this.funding = funding;
	}

	public int getFunding() {
		return funding;
	}
}		