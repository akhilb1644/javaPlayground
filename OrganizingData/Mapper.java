import java.util.*;

@SuppressWarnings("removal")

public class Mapper {
	public static void main(String[] args) {
		Map<String, Integer> birthYears = new HashMap<String, Integer>();

/*
These are unordered, so they won't show up in the below order
*/

		birthYears.put("Vladimir Lenin",new Integer(1780)); // This is incorrect, will be changed later
		birthYears.put("Josef Stalin",new Integer(1878));
		birthYears.put("Vyacheslav Molotov",new Integer(1890)); // We will remove him later
		// I think Molotov = "Hammer man" cause Molot = "hammer"
		birthYears.put("Nikita Khrushchev",new Integer(1894));
		birthYears.put("Leonid Brezhnev",new Integer(1906));
		birthYears.put("Yuri Andropov",new Integer(1914));
		birthYears.put("Konstantin Chernenko",new Integer(1911));
		birthYears.put("Mikhail Gorbachev",new Integer(1931));

		System.out.println(birthYears + "\n");

		birthYears.put("Vladimir Lenin",new Integer(1870)); // Now it is fixed

		System.out.println(birthYears + "\n");

		birthYears.remove("Vyacheslav Molotov");

		System.out.println(birthYears + "\n");

		birthYears.clear();

		System.out.println(birthYears + "\n");

		birthYears.put("Vladimir Lenin",new Integer(1870));
		birthYears.put("Josef Stalin",new Integer(1878));
		birthYears.put("Nikita Khrushchev",new Integer(1894));
		birthYears.put("Leonid Brezhnev",new Integer(1906));
		birthYears.put("Yuri Andropov",new Integer(1914));
		birthYears.put("Konstantin Chernenko",new Integer(1911));
		birthYears.put("Mikhail Gorbachev",new Integer(1931));

		System.out.println(birthYears + "\n");

		System.out.println("Is Vyacheslav Molotov there? " + birthYears.containsKey("Vyacheslav Molotov") + "\n");

		System.out.println("Was someone born in 1893? " + birthYears.containsValue(1893) + "\n");

		System.out.println("Set version is: " + birthYears.entrySet() + "\n");

		System.out.println("Nikita Khrushchev was born in the year " + birthYears.get("Nikita Khrushchev") + ".\n");

		System.out.println("Hash code for map \"birthYears\" is = " + birthYears.hashCode() + "\n");

		System.out.println("Is the map empty? " + birthYears.isEmpty() + "\n");

		System.out.println("List of Soviet Leaders: " + birthYears.keySet() + "\n");

		Map<String,Integer> b = new HashMap<>();

		b.putAll(birthYears);
		
		System.out.println(b + "\n");

		System.out.println(birthYears.values() + "\n"); // This is a collection

		System.out.println("Are the maps \"birthYears\" and \"b\" equal to eachother? " + birthYears.equals(b) + "\n");

		System.out.println(birthYears.getOrDefault("Alexei Rykov",1881) + "\n");

		System.out.println("\"birthYears\" after getOrDefault method: " + birthYears + "\n");
	}
}

/*
Output:
{Josef Stalin=1878, Leonid Brezhnev=1906, Mikhail Gorbachev=1931, Konstantin Chernenko=1911, Vyacheslav Molotov=1890, Nikita Khrushchev=1894, Yuri Andropov=1914, Vladimir Lenin=1780}

{Josef Stalin=1878, Leonid Brezhnev=1906, Mikhail Gorbachev=1931, Konstantin Chernenko=1911, Vyacheslav Molotov=1890, Nikita Khrushchev=1894, Yuri Andropov=1914, Vladimir Lenin=1870}

{Josef Stalin=1878, Leonid Brezhnev=1906, Mikhail Gorbachev=1931, Konstantin Chernenko=1911, Nikita Khrushchev=1894, Yuri Andropov=1914, Vladimir Lenin=1870}

{}

{Josef Stalin=1878, Leonid Brezhnev=1906, Mikhail Gorbachev=1931, Konstantin Chernenko=1911, Nikita Khrushchev=1894, Yuri Andropov=1914, Vladimir Lenin=1870}

Is Vyacheslav Molotov there? false

Was someone born in 1893? false

Set version is: [Josef Stalin=1878, Leonid Brezhnev=1906, Mikhail Gorbachev=1931, Konstantin Chernenko=1911, Nikita Khrushchev=1894, Yuri Andropov=1914, Vladimir Lenin=1870]

Nikita Khrushchev was born in the year 1894.

Hash code for map "birthYears" is = 2074808840

Is the map empty? false

List of Soviet Leaders: [Josef Stalin, Leonid Brezhnev, Mikhail Gorbachev, Konstantin Chernenko, Nikita Khrushchev, Yuri Andropov, Vladimir Lenin]

{Josef Stalin=1878, Leonid Brezhnev=1906, Mikhail Gorbachev=1931, Konstantin Chernenko=1911, Nikita Khrushchev=1894, Yuri Andropov=1914, Vladimir Lenin=1870}

[1878, 1906, 1931, 1911, 1894, 1914, 1870]

Are the maps "birthYears" and "b" equal to eachother? true

1881

"birthYears" after getOrDefault method: {Josef Stalin=1878, Leonid Brezhnev=1906, Mikhail Gorbachev=1931, Konstantin Chernenko=1911, Nikita Khrushchev=1894, Yuri Andropov=1914, Vladimir Lenin=1870}
*/
