package me.main;

public class SelectionSort extends SortClass {

	public SelectionSort() {
		super.name = "Selection Sort";
	}
	
	
	@Override
	public void Sort(int[] arr) {
		super.StartTimer();
		int n = arr.length;
		int i;
		int j;
		int lowestI;

		for (i = 0; i < n - 1; i++) {
			lowestI = i;

			for (j = i + 1; j < n; j++) {
				if (arr[j] < arr[lowestI]) {
					lowestI = j;
				}
			}

			if (lowestI != i) {
				super.Swap(arr, i, lowestI);
			}
		}
		super.EndTimer();
	}
}
