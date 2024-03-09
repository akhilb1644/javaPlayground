import java.util.*;

@SuppressWarnings("removal")

public class Mapper {
	public static void main(String[] args) {
		Map<String, Integer> birthYears = new HashMap<String, Integer>();

		birthYears.put("Vladimir Lenin",new Integer(1780)); // This is incorrect, will be changed later
		birthYears.put("Josef Stalin",new Integer(1878));
		birthYears.put("Vyacheslav Molotov",new Integer(1890)); // We will remove him later
		birthYears.put("Nikita Khrushchev",new Integer(1894));
		birthYears.put("Leonid Brezhnev",new Integer(1906));
		birthYears.put("Yuri Andropov",new Integer(1914));
		birthYears.put("Konstantin Chernenko",new Integer(1911));
		birthYears.put("Mikhail Gorbachev",new Integer(1931));

		for (Map.Entry<String, Integer> bys : birthYears.entrySet())  {
            		System.out.println(bys.getKey() + " -> " + bys.getValue()); 
		}

		System.out.println(" ");

		birthYears.put("Vladimir Lenin",new Integer(1870)); // Now it is fixed

		for (Map.Entry<String, Integer> bys : birthYears.entrySet()) {
            		System.out.println(bys.getKey() + " -> " + bys.getValue()); 
		}

		System.out.println(" ");

		birthYears.remove("Vyacheslav Molotov");

		for (Map.Entry<String, Integer> bys : birthYears.entrySet()) {
            		System.out.println(bys.getKey() + " -> " + bys.getValue()); 
		}

		System.out.println(" ");
	}
}