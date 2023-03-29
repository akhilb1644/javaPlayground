package life;
import java.util.Scanner;

public class cell {
	public static void main(String[] args) {
		int cells = 1;
		int calories;
		int generations;
		int required;
		int deficit;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many generations do you want to run this program for?");
		generations = keyboard.nextInt();
		System.out.println(" ");
		for (int count = 1;count <= generations;count++) {
			calories = 100000000;
			required = cells * 500;
			deficit = required - calories;
			if (deficit < 0) {
				cells *= 2;
			}else {
				cells -= (Math.floorDiv(deficit, 500) + 1);
			}
			if (count%10 == 0) {
				cells = Math.floorDiv(cells,100);
			}
			System.out.println("Generation " + count + " has a population of " + cells + " cells!");
		}
	}
}
