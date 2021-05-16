package me.main;

public class BubbleSort extends SortClass{

	public BubbleSort() {
		super.name = "Bubble Sort";
	}

	@Override
	public void Sort(int[] to_sort) {
		super.StartTimer();
				
		for(int i=1; i < to_sort.length; i++) {
			for(int j=0; j < to_sort.length - i; j++) {
				if(to_sort[j] > to_sort[j+1]) {
					super.Swap(to_sort, j, j+1);
				}
			}
		}
		super.EndTimer();
		
	}
	
}
