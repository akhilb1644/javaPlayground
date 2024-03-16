public class AutonomousRepublic extends AutonomousSubdivision {
	public AutonomousRepublic() {
		name = "";
		higherRepublic = new Republic();
	}

	public AutonomousRepublic(String name,Republic higherRepublic) {
		this.name = name;
		this.higherRepublic = new Republic(higherRepublic);
	}

	public AutonomousRepublic(AutonomousRepublic a) {
		name = a.getName();
		higherRepublic = a.getHigherRepublic();
	}

	public Republic getHigherRepublic() {
		return new Republic(higherRepublic);
	}

	public void setHigherRepublic(Republic higherRepublic) {
		this.higherRepublic = new Republic(higherRepublic);
	}

	public int getFunding() {
		return funding;
	}

	public void setFunding(int funding) {
		this.funding = funding;
	}
}