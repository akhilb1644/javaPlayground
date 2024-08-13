package JavaPlaygroundOther;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int choice;
		
		while (true) {
			System.out.print("Do you want to create a new...\n"
					+ "1. Country\n"
					+ "2. Political\n"
					+ "3. I don't want anything");
			choice = k.nextInt();
			
			if (choice == 1) {
				Country yourCountry = new Country();
				
				System.out.print("Hello, what is the name of your country? ");
				yourCountry.setName(k.nextLine());
				
				System.out.print("What is the population of this country? ");
				yourCountry.setPopulation(k.nextInt());
				
				System.out.print("Which continent is this country from:\n"
						+ "1. North America\n"
						+ "2. South America\n"
						+ "3. Europe\n"
						+ "4. Africa\n"
						+ "5. Asia\n"
						+ "6. Australia\n"
						+ "Pick One: ");
				choice = k.nextInt();
				
				if (choice == 1) {
					yourCountry.setContinent(Continent.NORTH_AMERICA);
				} else if (choice == 2) {
					yourCountry.setContinent(Continent.SOUTH_AMERICA);
				} else if (choice == 3) {
					yourCountry.setContinent(Continent.EUROPE);
				} else if (choice == 4) {
					yourCountry.setContinent(Continent.AFRICA);
				} else if (choice == 5) {
					yourCountry.setContinent(Continent.ASIA);
				} else {
					yourCountry.setContinent(Continent.AUSTRALIA);
				}
			} else if (choice == 2) {
				
			}
		}
	}
}