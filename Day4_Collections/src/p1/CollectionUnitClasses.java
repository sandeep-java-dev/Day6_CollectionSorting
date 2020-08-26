package p1;

import java.util.Arrays;

public class CollectionUnitClasses {

	public static void main(String[] args) {
		
		int arr[] = {1,5,78,15,658,41,62};
		
		for (int i : arr) {
			System.out.print(" "+i);
		}
		
		Arrays.sort(arr);
		
		System.out.println("\n");
		for (int i : arr) {
			System.out.print(" "+i);
		}
		
		
	}
}
