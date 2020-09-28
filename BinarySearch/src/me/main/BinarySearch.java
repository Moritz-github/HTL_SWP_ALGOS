package me.main;

public class BinarySearch {
	public static void main(String[] args) {
		int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		for (int n : myIntArray) {
			System.out.println(binarySearchIterative(myIntArray, n));
		}
	}
	
	public static int binarySearchIterative(int[] arr, int search) {
		int start = 0;
		int end = arr.length;
		while (arr[(start+end)/2] != search && start+1 != end) {
			//System.out.println(start + ";" + end);
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
	
	/*
	public static int binarySearch(int[] arr, int search) {
		return binarySearch(arr, search,(int) ((arr.length/4.0) + (arr.length/4.0)%1),(int) ((arr.length/2.0) + (arr.length/4.0)%2));
	}
	
	public static int binarySearch(int[] arr, int search, int step, int index) {
		System.out.println("Step: " + step + "; index: " + index + "; val: " + arr[index]);
		if (arr[index] == search) { // if result is found:
			return index;
		}
		
		if (step == -1) {
			return -1;
		}
		
		if (arr[index] > search) { // go Left
			return binarySearch(arr, search, step!=0 ? step/2: -1, index-step);
		}
		
		else { // go Right
			return binarySearch(arr, search, step!=0 ? step/2 : -1, index+step);
		}
	}
	*/
}
