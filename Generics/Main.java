@SuppressWarnings("unchecked")
public class Main {
	public static <K,V> String formalPrint(DictionaryWord<K,V> w1) {
		return "Entry: " + w1.getEntry() + "\nDescription: " + w1.getDescription();
	}

	public static void main(String[] args) {
		/* UsefulNumber<String> i = new UsefulNumber<>("hi"); 
			- The above line would be an error due to bounded types
		*/

		UsefulNumber<Double> u = new UsefulNumber<>(3.14);
		System.out.println(u.getHashCode());

		// With K and V
		DictionaryWord<String,String> coffee = new DictionaryWord<>("coffee","a drink");
		coffee.printInfo();
		DictionaryWord word = coffee; // This is fine
/*
word is a raw type
*/
		word.printInfo();

		DictionaryWord<String,String> f = word; 
		// assigning raw type to paramaterized type leads to warnings, you need to supress the warnings
		f.printInfo();

		word.setEntry("water");
		word.printInfo();
		System.out.println("");
		System.out.println(formalPrint(word)); // No need to define K and V, they are inferred from "word"

		short y = 7634;
		LessMemoryNumber<Short> lev = new LessMemoryNumber<Short>(y);
		System.out.println(lev.giveTheHash());
	}
}
