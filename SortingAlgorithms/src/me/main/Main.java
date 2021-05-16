package me.main;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	static int iterations = 100;
	static int arrSize = 10000;
	static int arrMaxSize = 10000;
	
	public static int[] getRandomIntArr(int arraySize, int maxNumSize) {
		int[] arr = new int[arraySize];
		Random r = new Random();
		for (int i = 0; i < arraySize; i++) {
			arr[i] = r.nextInt(maxNumSize);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println("Let's get this started!");
		
		BubbleSort bs = new BubbleSort();
		QuickSort qs = new QuickSort();
		SelectionSort ss = new SelectionSort();
		Insertionsort is = new Insertionsort();
		
		for (int i = 0; i < iterations; i++) {
			bs.Sort(getRandomIntArr(arrSize, arrMaxSize));
		}
		bs.PrintInfo();
		
		for (int i = 0; i < iterations; i++) {
			qs.Sort(getRandomIntArr(arrSize, arrMaxSize));
		}
		qs.PrintInfo();
		
		for (int i = 0; i < iterations; i++) {
			ss.Sort(getRandomIntArr(arrSize, arrMaxSize));
		}
		ss.PrintInfo();
		
		for (int i = 0; i < iterations; i++) {
			is.Sort(getRandomIntArr(arrSize, arrMaxSize));
		}
		is.PrintInfo();
		
	}
}
