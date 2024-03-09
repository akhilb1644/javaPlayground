import java.util.Stack;

public class Stacker {
	public static void main(String[] args) {
		Stack<String> states = new Stack<>();
		
		states.push("Alabama");
		states.push("Alaska");
		states.push("Arizona");

		System.out.println(states);

		System.out.println(states.peek()); // peek at top element

		states.pop(); // removes top element

		System.out.println(states);

		System.out.println(states.search("Alabama"));
		System.out.println(states.search("Arkansas"));
	}
}