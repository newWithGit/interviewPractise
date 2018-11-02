package algorithms;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {10,3,4,5,8,6,11,9};
		System.out.println(Arrays.toString(performSelectionSort(arr)));
	}

	private static int[] performSelectionSort(int[] arr) {
		int arrLength = arr.length;
		for (int i = 0; i<arrLength; i++) {
			int min = arr[i];
			int indexofMin = i;
			int temp = 0;

			for (int j = i; j<arrLength; j++) {
				if (arr[j] < min) {
					min = arr[j];
					indexofMin = j;

				}
			}
			if (i!=indexofMin) {

				temp = arr[i];
				arr[i] = arr[indexofMin];
				arr[indexofMin] = temp;
			}

		}
		return arr;
	}
}
