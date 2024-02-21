import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numPlayers;

		System.out.print("Hello, please enter how many players you would like to play? ");
		numPlayers = scnr.nextInt();
		Player[] players = new Player[numPlayers];
		scnr.nextLine();
		
		for (int i = 0;i < numPlayers;i++) {
			System.out.print("What is the name for the player? ");
			players[i] = new Player(scnr.nextLine());
			System.out.println(players[i]);
		}
	}
}