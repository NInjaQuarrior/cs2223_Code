package Q2;

public class InsertionSort {

	public static Comparable[] sort(Comparable[] array) {

		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (less(array[j], array[j - 1])) {
					Comparable temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

}
