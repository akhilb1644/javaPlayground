package Sorting;

import java.util.ArrayList;

public class Sorting {
	private static Integer holdValue;
	private static int otherNum;
	
	public static ArrayList<Integer> copy(ArrayList<Integer> a) {
		ArrayList<Integer> b = new ArrayList<>();
		
		for (int i: a) {
			b.add(i);
		}
		
		return b;
	}
	
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> a) {
		a = copy(a);
		
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
	
	public static ArrayList<Integer> selectionSort(ArrayList<Integer> a) {
		a = copy(a);
		int smallest;
		
		for (int i = 0; i < a.size();i++) {
			smallest = i;
			
			for (int j = i + 1;j < a.size();j++) {
				System.out.println(a);
				
				if (a.get(j) < a.get(smallest)) {
					smallest = j;
				}
			}
			
			holdValue = a.get(i);
			a.set(i, a.get(smallest));
			a.set(smallest, holdValue);
		}
		
		return a;
	}
	
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> a) {
		a = copy(a);
		
		for (int i = 0;i < a.size() - 1;i++) {
			for (int j = 0;j < a.size() - 1;j++) {
				System.out.println(a);
				if (a.get(j) > a.get(j + 1)) {
					holdValue = a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, holdValue);
				}
			}
		}
		
		return a;
	}
}
