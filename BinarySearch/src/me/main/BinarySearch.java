package me.main;

public class BinarySearch {
	public static void main(String[] args) {
		int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		for (int n : myIntArray) {
			System.out.println(iterativeSearch(myIntArray, n));
			System.out.println(binarySearchIterative(myIntArray, n));
			System.out.println(binarySearchRecursive(myIntArray, n));
			System.out.println();
		}
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
