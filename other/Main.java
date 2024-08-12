import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int population;
		String country;
		int num;
		Continent continent;
		
		System.out.print("Hello, what is the name of your country? ")
		country = k.nextLine();
		
		System.out.print("What is the population of this country? ");
		population = k.nextInt();
		
		System.out.print("Which continent is this country from:\n"
				+ "1. North America\n"
				+ "2. South America\n"
				+ "3. Europe\n"
				+ "4. Africa\n"
				+ "5. Asia\n"
				+ "6. Australia\n"
				+ "Pick One: ");
		num = k.nextInt();
		
		if (num == 1) {
			continent = Continent.NORTH_AMERICA;
		} else if (num == 2) {
			continent = Continent.SOUTH_AMERICA;
		} else if (num == 3) {
			continent = Continent.EUROPE;
		} else if (num == 4) {
			continent = Continent.AFRICA;
		} else if (num == 5) {
			continent = Continent.ASIA;
		} else {
			continent = Continent.AUSTRALIA;
		}
	}
}