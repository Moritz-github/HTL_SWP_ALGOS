package me.main;

public class Test {

	public static void main(String[] args) {
		/*int toSort[] = {9, 4, 3, 6, 5, 1, 2, 9, 4, 5, 7};
	
		bubbleSort(toSort);
		
		for(int i = 0; i < toSort.length; i++) {
			System.out.println(toSort[i]);
		}*/
		System.out.println(palindrome("anna", 0));
	}
	
	// palindrom
	public static boolean palindrome(String word, int pointer) {
		System.out.println(pointer);
		if (pointer-1 > (word.length())/2) {
			return true;
		}
		
		if (word.charAt(pointer) != word.charAt(word.length()-1-pointer)) {
			return false;
		}
		
		return palindrome(word, pointer+1);
		
	}
	
	public static void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] =  arr[i2];
		arr[i2] = temp;
	}
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		
		for (int j = 0; j < n; j++)
			for (int i = 0; i < (n-1) - j; i++) {
				if (arr[i] > arr[i+1]) {
					swap(arr, i, i+1);
				}
			}
	}

	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; ++i) {
			
		}
	}
	
}
