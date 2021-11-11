package Q5;

public class Mergesort {

	static int steps = 0;

	public static int[] sort(int[] array, int lo, int hi) {
		if (lo < hi) {
			int mid = (lo + hi) / 2;
			sort(array, lo, mid);

			sort(array, mid + 1, hi);

			return merge(array, lo, mid, hi);
		}
		return array;
	}

	static int[] merge(int[] array, int lo, int mid, int hi) {

		int sizeLeft = mid - lo + 1;
		int sizeRight = hi - mid;

		int tempLeft[] = new int[sizeLeft];
		int tempRight[] = new int[sizeRight];

		for (int i = 0; i < sizeLeft; i++) {
			tempLeft[i] = array[lo + i];
		}
		for (int i = 0; i < sizeRight; i++) {
			tempRight[i] = array[mid + i + 1];
		}

		int indexLeft = 0;
		int indexRight = 0;

		int indexMerge = lo;

		while (indexLeft < sizeLeft && indexRight < sizeRight) {
			steps++;
			if (tempLeft[indexLeft] <= tempRight[indexRight]) {
				array[indexMerge] = tempLeft[indexLeft];
				indexLeft++;
			} else {
				array[indexMerge] = tempRight[indexRight];
				indexRight++;
			}
			indexMerge++;
		}

		while (indexLeft < sizeLeft) {
			steps++;
			array[indexMerge] = tempLeft[indexLeft];
			indexLeft++;
			indexMerge++;
		}

		while (indexRight < sizeRight) {
			steps++;
			array[indexMerge] = tempRight[indexRight];
			indexRight++;
			indexMerge++;
		}

		return array;
	}

	public static int getSteps() {
		return steps;
	}
}
