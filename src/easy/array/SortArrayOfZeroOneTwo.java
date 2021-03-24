package easy.array;

import java.util.Arrays;

/*
 * Difficulty level: easy average
 * */

class SortArrayOfZeroOneTwo {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 2, 1, 1, 0, 1, 2 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int arr[]) {
		int med = 0, lo = 0, temp = 0, hi = arr.length - 1;
		while (med <= hi) {
			switch (arr[med]) {
			case 0:
				temp = arr[lo];
				arr[lo] = arr[med];
				arr[med] = temp;
				++med;
				++lo;
				break;
			case 1:
				++med;
				break;
			case 2:
				temp = arr[hi];
				arr[hi] = arr[med];
				arr[med] = temp;
				--hi;
			}
		}
	}

}