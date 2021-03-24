package easy.array;

import java.util.Arrays;

public class AllNegativeIntegersOnSide {
	public static void main(String[] args) {
		int[] arr = { 1, 0, -1, -7, 28, 5, -20, 8, 2 };

		int positiveStart = 0, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				temp = arr[positiveStart];
				arr[positiveStart] = arr[i];
				arr[i] = temp;
				++positiveStart;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
