import java.util.*;

@SuppressWarnings("removal")

public class Queuer {
	public static void main(String[] args) {
		Queue<String> countries = new PriorityQueue<>();

		countries.add("France");

		System.out.println(countries);

		countries.offer("Sweden");

		System.out.println("Without violating the capacity restriction: " + countries);

		countries.remove("France");

		System.out.println(countries);
	}
}

/*
Output:
[France]
Without violating the capacity restriction: [France, Sweden]
[Sweden]

*/
