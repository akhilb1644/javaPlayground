import java.util.*;

public class Setter {
	public static void main(String[] args) {
		Set<String> regions = new HashSet<>();

		regions.add("Ozarks");
		regions.add("Badlands");
		regions.add("Ozarks"); // There is no redundancy in sets, this won't show

		System.out.println("First set: " + regions);

		Set<String> regions1 = new HashSet<>();
		regions1.add("Cascadia");
		regions1.add("Ozarks");
		regions1.add("Piney Woods");
		
		System.out.println("Second set: " + regions1);
		
		Set<String> and = new HashSet<>(regions1);
		and.addAll(regions); // Redundancies are removed here
		System.out.println("First and Second Sets: " + and);

		Set<String> intersect = new HashSet<>(regions1);
		intersect.retainAll(regions);
		System.out.println("Intersection of First and Second Sets: " + intersect);

		Set<String> different = new HashSet<>(regions1);
		different.removeAll(regions);
		System.out.println("Difference between First and Second Sets: " + different);

		System.out.println("Does the first set contain Appalacia? " + regions.contains("Appalacia"));
	}
}