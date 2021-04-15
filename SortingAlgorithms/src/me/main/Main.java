package me.main;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static int[] getRandomIntArr(int arraySize, int maxNumSize) {
		int[] arr = new int[arraySize];
		Random r = new Random();
		for (int i = 0; i < arraySize; i++) {
			arr[i] = r.nextInt(maxNumSize);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] toSort = getRandomIntArr(10, 10);
		
		//int[] sortedArray = Insertionsort.sort(toSort, new int[toSort.length], 0);
		
		Insertionsort.heimSORT(toSort);
		int[] sorted = BubbleSort.bubblesort(toSort);
		
		
		SelectionSort.selectionSort(toSort);
		//System.out.println(Binarysearch.Binarysearch(toSort, 22));
		for (int i : toSort) {
			System.out.println(i);
		}
	}
}
