package me.main;

public class QuickSort extends SortClass {

	public QuickSort() {
		super.name = "Quick Sort";
	}
	
	public int[] arr;
	
	@Override
	public void Sort(int[] arr) {
		super.StartTimer();
		this.arr = arr;
		quickSort(0, this.arr.length - 1);
		super.EndTimer();
	}
	
	private void quickSort(int l, int r) {
		int q;
        if (l < r) {
            q = partition(l, r);
            quickSort(l, q);
            quickSort(q + 1, r);
        }
	}
	
	 int partition(int l, int r) {

	        int i, j, x = arr[(l + r) / 2];
	        i = l - 1;
	        j = r + 1;
	        while (true) {
	            do {
	                i++;
	            } while (arr[i] < x);

	            do {
	                j--;
	            } while (arr[j] > x);

	            if (i < j) {
	            	super.Swap(arr, i, j);
	            } else {
	                return j;
	            }
	        }
	    }

}
