package richelieu;
import java.util.Scanner;

public class France {
	public static void main(String[] args) {
		int year;
		boolean condition = true;
		String name;
		int decision;
		
		while (condition == true) {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("What is the current year");
			year = keyboard.nextInt();
			if (year > 1958) {
				name = "Fifth French Republic";
			} else if (year > 1946) {
				name = "Fourth French Republic";
			} else if (year > 1944) {
				name = "Provisional Government of the French Republic";
			} else if (year > 1940) {
				name = "Free France";
			} else if (year > 1870) {
				name = "Third French Republic";
			} else if (year > 1852) {
				name = "Second French Empire";
			} else if (year > 1848) {
				name = "Second French Republic";
			} else if (year > 1830) {
				name = "Kingdom of France(July Monarchy)";
			} else if (year > 1815) {
				name = "Kingdom of France(Bourbon Restoration)";
			} else if (year > 1804) {
				name = "First French Empire";
			} else if (year > 1792) {
				name = "First French Republic";
			} else if (year > 1791) {
				name = "Kingdom of France(Constitutional Monarchy)";
			} else if (year > 1190) {
				name = "Kingdom of France(Ancient Regime)";
			} else if (year > 987) {
				name = "Kingdom of France(Ancient Regime, officially called \"Kingdom of the Franks\"";
			} else {
				System.out.println("Please choose a year that is greater than 987 instead. Thank you.");
				continue;
			}
			System.out.println("Year: " + year);
			System.out.println("Name of Regime: " + name);
			System.out.print("Would you like to go again(1 for yes, 0 for no)");
			decision = keyboard.nextInt();
			if (decision == 0) {
				condition = false;
			}
		}
	}
}

//Source: Wikipedia