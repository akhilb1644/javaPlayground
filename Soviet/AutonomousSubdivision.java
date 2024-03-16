public abstract class AutonomousSubdivision extends Subdivision {
	protected Republic higherRepublic;

	public Republic getHigherRepublic() {
		return new Republic(higherRepublic);
	}

	public void setHigherRepublic(Republic higherRepublic) {
		this.higherRepublic = new Republic(higherRepublic);
	}
}