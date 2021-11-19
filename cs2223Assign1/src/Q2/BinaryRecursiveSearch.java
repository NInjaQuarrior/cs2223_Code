package Q2;

public class BinaryRecursiveSearch {

	public static long steps = 0;

	public static int search(int key, int[] array, int start, int end) {

		if (start < end) {
			steps++;
			int mid = start + (end - start) / 2;

			// search either before or after mid point
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] > key) {
				return search(key, array, start, mid - 1);
			} else {
				return search(key, array, mid + 1, end);
			}
		}
		return -1;
	}

	public static long getSteps() {
		return steps;
	}
}
