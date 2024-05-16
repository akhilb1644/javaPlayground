package Sorting;

import java.util.ArrayList;

public class Sorting {
	private static Integer holdValue;
	private static int otherNum;
	
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> a) {
		for (int num = 1;num < a.size();num++) {
			for (otherNum = num - 1;otherNum >= 0;otherNum--) {
				System.out.println(a);
				if (a.get(num) > a.get(otherNum)) {
					otherNum++;
					break;
				}
			}
			
			if (otherNum != num) {
				a.add(otherNum, a.get(num));
				a.remove(num + 1);
			}
		}
		
		return a;
	}
}
