public class AutonomousRepublic extends Subdivision,AutonomousSubdivision {
	public AutonomousRepublic() {
		super();
		parentRepublic = new Republic();
	}

	public AutonomousRepublic(String name,Republic parentRepublic) {
		super(name);
		this.parentRepublic = new Republic(parentRepublic);
	}

	public AutonomousRepublic(AutonomousRepublic a) {
		name = a.getName();
		parentRepublic = a.getParentRepublic();
	}

	public Republic getParentRepublic() {
		return new Republic(parentRepublic);
	}

	public void setParentRepublic(Republic parentRepublic) {
		this.parentRepublic = new Republic(parentRepublic);
	}

	public int getFunding() {
		return funding;
	}

	public int setFunding(int funding) {
		this.funding = funding;
	}
}