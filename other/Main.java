package JavaPlaygroundOther;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int choice;
		long lchoice;
		String ans;
		boolean b = true;
		
		while (b) {
			System.out.print("Do you want to create a new...\n"
					+ "1. Country\n"
					+ "2. Political Party\n"
					+ "3. Business\n"
					+ "4. I don't want anything\n"
					+ "Which one do you want? ");
			choice = k.nextInt();
			
			ans = k.nextLine();
			
			System.out.println("");
			
			if (choice == 1) {
				Country yourCountry = new Country();
				
				System.out.print("Hello, what is the name of your country? ");
				ans = k.nextLine();
				yourCountry.setName(ans);
				
				System.out.print("What is the population of this country? ");
				choice = k.nextInt();
				yourCountry.setPopulation(choice);
				
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
				
				System.out.println(yourCountry);
			} else if (choice == 2) {
				PoliticalParty yourParty = new PoliticalParty();
				
				System.out.print("Hello, what is the name of your political party? ");
				ans = k.nextLine();
				yourParty.setName(ans);
				
				System.out.print("What is the population of this party? ");
				choice = k.nextInt();
				yourParty.setPopulation(choice);
				
				System.out.print("Which political orientation is this party from:\n"
						+ "1. Far Left\n"
						+ "2. Left\n"
						+ "3. Center Left\n"
						+ "4. Center\n"
						+ "5. Center Right\n"
						+ "6. Right\n"
						+ "7. Far Right\n"
						+ "Pick One: ");
				choice = k.nextInt();
				
				if (choice == 1) {
					yourParty.setPoliticalOrientation(Orientation.FAR_LEFT);
				} else if (choice == 2) {
					yourParty.setPoliticalOrientation(Orientation.LEFT);
				} else if (choice == 3) {
					yourParty.setPoliticalOrientation(Orientation.CENTER_LEFT);
				} else if (choice == 4) {
					yourParty.setPoliticalOrientation(Orientation.CENTER);
				} else if (choice == 5) {
					yourParty.setPoliticalOrientation(Orientation.CENTER_RIGHT);
				} else if (choice == 6) {
					yourParty.setPoliticalOrientation(Orientation.RIGHT);
				} else {
					yourParty.setPoliticalOrientation(Orientation.FAR_RIGHT);
				}
				
				System.out.println(yourParty);
			} else if (choice == 3) {
				Business yourBusiness = new Business();
				
				System.out.print("Hello, what is the name of your business? ");
				ans = k.nextLine();
				yourBusiness.setName(ans);
				
				System.out.print("How many employees does the business employ? ");
				choice = k.nextInt();
				yourBusiness.setPopulation(choice);
				
				System.out.print("What is the net worth of your business? ");
				lchoice = k.nextLong();
				yourBusiness.setNetWorth(lchoice);
				
				System.out.println(yourBusiness);
			} else {
				System.out.println("Bye bye");
				b = false;
			}
		}
	}
}