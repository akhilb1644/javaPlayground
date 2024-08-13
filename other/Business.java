package JavaPlaygroundOther;

public class Business implements Organization{
	private String name;
	private int population; // this is number of employees
	private long netWorth;
	
	public Business() {
		name = "";
		population = 0;
		netWorth = 0;
	}
	
	public Business(String name,int population,long netWorth) {
		this.name = name;
		this.population = population;
		this.netWorth = netWorth;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public long getNetWorth() {
		return netWorth;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void setNetWorth(long netWorth) {
		this.netWorth = netWorth;
	}
	
	public String toString() {
		return String.format("\nName: %s\nNumber of Employed: %d\nNet Worth: $%d\n",name,population,netWorth);
	}
}
