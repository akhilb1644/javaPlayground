public class Oblast extends Subdivision {
	private Republic higherRepublic; // not taken from interface

	public Oblast() {
		name = "";
		higherRepublic = new Republic();
	}

	public Oblast(String name,Republic higherRepublic) {
		this.name = name;
		this.higherRepublic = new Republic(Republic);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Republic getHigherRepublic() {
		return new Republic(higherRepublic);
	}

	public void setHigherRepublic(Republic higherRepublic) {
		this.higherRepublic = new Republic(higherRepublic);
	}
}