package me.main;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println("Start...");
		keepJavaOccupied(1111);
		System.out.println("Waited...");

		measureTime(1_000, 50_000_000, 10);
	}
	
	public static void keepJavaOccupied(int ms) {
		long start = System.currentTimeMillis();
		while (true) {
			if (System.currentTimeMillis() - ms > start) {
				return;
			}
		}
	}
	
	public static int[] getRandomIntArr(int arraySize, int maxNumSize) {
		int[] arr = new int[arraySize];
		Random r = new Random();
		for (int i = 0; i < arraySize; i++) {
			arr[i] = r.nextInt(maxNumSize);
		}
		Arrays.sort(arr);
		return arr;
	}
	
	public static void measureTime(int iterations, int arraySize, int maxNumSize) {
		int[] arrToSearch = getRandomIntArr(arraySize, maxNumSize);
		int[] numbersToSearch = new int[iterations];
		Random r = new Random();
		for (int i = 0; i < numbersToSearch.length; i++) {
			if (r.nextInt(101) < 90) {
				numbersToSearch[i] = arrToSearch[r.nextInt(arrToSearch.length)];
			} else {
				numbersToSearch[i] = r.nextInt(maxNumSize); 
			}
		}
		
		// iterative
		double start = System.nanoTime();
		for(int toSearch : numbersToSearch) {
			iterativeSearch(arrToSearch, toSearch);
		}
		double iterativeTime = System.nanoTime() - start;
		
		System.out.println("Time took iterative Search: " + iterativeTime);
		
		// binarySearch iterative
		start = System.nanoTime();
		for(int toSearch : numbersToSearch) {
			binarySearchIterative(arrToSearch, toSearch);
		}
		double binarySearchIterativeTime = System.nanoTime() - start;
		
		System.out.println("Time took binary search Iterative Time: " + binarySearchIterativeTime);
		
		System.out.println(iterativeTime / binarySearchIterativeTime);
		/*
		// binarySearch Recursive
		start = System.nanoTime();
		for(int toSearch : numbersToSearch) {
			binarySearchRecursive(arrToSearch, toSearch);
		}
		double binarySearchRecursiveTime = System.nanoTime() - start;
		
		System.out.println("Time took binary search Recursive Time: " + binarySearchRecursiveTime);
		*/
	}

	public static int iterativeSearch(int[] arr, int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearchRecursive(int[] arr, int search) {
		return binarySearchRecursive(arr, search, 0, arr.length);
	}
	
	public static int binarySearchRecursive(int[] arr, int search, int start, int end) {
		if (arr[(start+end)/2] == search) {
			return (start+end)/2;
		}
		if (arr[(start+end)/2] < search) {
			return binarySearchRecursive(arr, search, (end-start)/2+start, end);
		}
		return binarySearchRecursive(arr, search, start, end - (end-start)/2);
	}
	
	public static int binarySearchIterative(int[] arr, int search) {
		int start = 0;
		int end = arr.length;
		while (arr[(start+end)/2] != search && start+1 != end) {
			if (arr[(start+end)/2] < search) {
				start = (end-start)/2 + start;
			} else {
				end = end - (end-start)/2;
			}
		}
		if (arr[(start+end)/2] == search) {
			return (start+end)/2;
		} else {
			return -1;
		}
	}
}
