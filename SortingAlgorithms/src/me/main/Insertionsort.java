package me.main;

public class Insertionsort extends SortClass {

	public Insertionsort() {
		super.name = "Insertion Sort";
	}
	
	@Override
	public void Sort(int[] arr) {
		super.StartTimer();
		
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				super.swaps += 1;
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			super.swaps += 1;
			arr[j + 1] = key;
		}
		
		super.EndTimer();
	}
}
