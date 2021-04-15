package me.main;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		
		int n = arr.length;
		int i;
		int j;
		int lowestI;
		int temp;

		for (i = 0; i < n - 1; i++) {
			lowestI = i;

			for (j = i + 1; j < n; j++) {
				if (arr[j] < arr[lowestI]) {
					lowestI = j;
				}
			}

			if (lowestI != i) {
				temp = arr[i];
				arr[i] = arr[lowestI];
				arr[lowestI] = temp;
			}
		}
	}
}
