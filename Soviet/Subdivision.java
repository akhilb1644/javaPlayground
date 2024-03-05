public class Subdivision {
	protected String name;

	public Subdivision() {
		name = "Unknown";
	}	

	public Subdivision(String name) {
		this.name = name;
	}

	public Subdivision(Subdivision s) {
		name = s.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}