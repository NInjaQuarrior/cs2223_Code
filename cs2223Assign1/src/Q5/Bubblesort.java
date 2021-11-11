package Q5;

public class Bubblesort {

	static long steps = 0;

	public static int[] sort(int[] array) {

		for (int i = 0; i < (array.length - 1); i++) {
			for (int j = 0; j < (array.length - i - 1); j++) {
				steps++;
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
		}
		return array;
	}

	public static long getSteps() {
		return steps;
	}
}
