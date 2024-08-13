package JavaPlaygroundOther;

public class PoliticalParty implements Organization {
	String name;
	int population;
	Orientation politicalOrientation;
	
	public PoliticalParty() {
		name = "";
		population = 0;
		politicalOrientation = Orientation.CENTER;
	}
	
	public PoliticalParty(String name, int population, Orientation politicalOrientation) {
		this.name = name;
		this.population = population;
		this.politicalOrientation = politicalOrientation;
	}
	
	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}
	
	public Orientation getPoliticalOrientation() {
		return politicalOrientation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void setPoliticalOrientation(Orientation politicalOrientation) {
		this.politicalOrientation = politicalOrientation;
	}
}
