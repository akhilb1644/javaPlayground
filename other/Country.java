package JavaPlaygroundOther;
public class Country implements Organization {
	private int population;
	private String name;
	private Continent continent;
	
	public Country() {
		population = 0;
		name = "";
		continent = Continent.ASIA;
	}
	
	public Country(int population, String name,Continent continent) {
		this.population = population;
		this.name = name;
		this.continent = continent;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public String getName() {
		return name;
	}
	
	public Continent getContinent() {
		return continent;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	public String toString() {
		return String.format("Name: %s \nPopulation: %d \nContinent: %s",name,population,continent);
	}
}