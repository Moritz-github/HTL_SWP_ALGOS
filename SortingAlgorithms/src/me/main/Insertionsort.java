package me.main;

import java.util.Arrays;

public class Insertionsort {

	public static void swap(int[] swap, int s1, int s2) {
		int temp = swap[s1];
		swap[s1] = swap[s2];
		swap[s2] = temp;
	}

	public static void heimSORT(int[] toSort) {
		for (int x = 1; x < toSort.length; x++) {
			for (int y = x; y >= 1; y--) {
				if (toSort[y] >= toSort[y - 1]) {
					break;
				}
				swap(toSort, y, y - 1);
			}
		}
	}

	public static int[] sort(int[] toSort, int[] sortedArray, int sortedArrayLen) {
		int nextInt = toSort[0];
		int posInSortedArray;

		posInSortedArray = Math.abs(Arrays.binarySearch(sortedArray, 0, sortedArrayLen, nextInt) + 1);

		int[] newSortedArray = new int[sortedArray.length];

		if ((posInSortedArray + 1) == sortedArrayLen) {
			newSortedArray[posInSortedArray + 1] = nextInt;
		}

		int temp1 = 0;
		int temp2 = nextInt;

		boolean temp2Overwrite = true;

		newSortedArray = sortedArray.clone();
		for (int i = posInSortedArray; i < newSortedArray.length - 1; i++) {
			if (temp2Overwrite) {
				temp1 = newSortedArray[i];
				newSortedArray[i] = temp2;
			} else {
				temp2 = newSortedArray[i];
				newSortedArray[i] = temp1;
			}
			temp2Overwrite = !temp2Overwrite;
		}
		int[] newToSort = Arrays.copyOfRange(toSort, 1, toSort.length);
		if (newToSort.length == 0) {
			return newSortedArray;
		}
		return sort(newToSort, newSortedArray, sortedArrayLen + 1);
	}
}
