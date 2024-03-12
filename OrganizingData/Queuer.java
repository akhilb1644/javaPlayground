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

		System.out.println(countries.peek()); // peeks at head with no exception for empty queues
      
      		System.out.println(countries);
      
      		countries.add("France");
      
     		System.out.println(countries);
      
      		countries.poll(); // no exception for empty queues
      
      		System.out.println(countries);
      
      		countries.add("France");
      
      		System.out.println(countries);
      
      		countries.remove(); // exception for empty queues
      
      		System.out.println(countries);
      
      		System.out.println(countries.element()); // peeks at head but there is exception for empty queues
	}
}

/*
Output:
[France]
Without violating the capacity restriction: [France, Sweden]
[Sweden]
Sweden
[Sweden]
[France, Sweden]
[Sweden]
[France, Sweden]
[Sweden]

*/
