package me.main;

public class Binarysearch {
	
	public static int Binarysearch(int[] arr, int toFind) {
		return Binarysearch(arr, toFind, 0, arr.length);
	}
	
	public static int Binarysearch(int[] arr, int toFind, int start, int end) {
		int pos = start + (end-start)/2;

		if ((pos-start) == 0) {
			return pos;
		}
		
		if (arr[pos] == toFind) {
			return pos;
		}
		
		if (arr[pos] > toFind) {
			return Binarysearch(arr, toFind, start, pos-1);
		} else {
			return Binarysearch(arr, toFind, pos+1, end);
		}
	}
	
}
