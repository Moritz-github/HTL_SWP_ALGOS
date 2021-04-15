package me.main;

public class BubbleSort {

	public static int[] bubblesort(int[] to_sort) {
		int temp;
		
		for(int i=1; i < to_sort.length; i++) {
			for(int j=0; j < to_sort.length - i; j++) {
				if(to_sort[j] > to_sort[j+1]) {
					temp=to_sort[j];
					to_sort[j]=to_sort[j+1];
					to_sort[j+1]=temp;
				}
			}
		}
		return to_sort;
	}
	
}
