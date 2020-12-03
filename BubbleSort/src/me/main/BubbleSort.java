package me.main;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {3,2,6,6,5,9,1}
		int[] b = bubblesort(a);
		
		for(int i : b){
			System.out.println(i + " ");
		}
	}
	
	public static int[] bubblesort(int[] toSort) {
		int temp;
		for(int i=1; i < toSort.length; i++) {
			for(int j=0; j < toSort.length-i; j++) {
				if(toSort[j] > toSort[j+1]) {
					temp = toSort[j];
					toSort[j] = toSort[j+1];
					toSort[j+1] = temp;
				}
				
			}
		}
		return toSort;
	}
}
