package Q5;

public class Quicksort {
	static int steps = 0;

	static int partition(int[] array, int lo, int hi) {

		int pivot = array[hi];

		int storeIndex = (lo - 1);

		for (int i = lo; i <= hi - 1; i++) {
			if (array[i] < pivot) {
				steps++;
				storeIndex++;
				int temp = array[storeIndex];
				array[storeIndex] = array[i];
				array[i] = temp;
			}
		}
		steps++;
		int temp = array[storeIndex + 1];
		array[storeIndex + 1] = array[hi];
		array[hi] = temp;

		return (storeIndex + 1);
	}

	public static int[] sort(int[] array, int lo, int hi) {

		if (lo < hi) {
			int partIndex = partition(array, lo, hi);

			sort(array, lo, partIndex - 1);
			sort(array, partIndex + 1, hi);

		}
		return array;
	}

	public static int getSteps() {
		return steps;
	}

}
