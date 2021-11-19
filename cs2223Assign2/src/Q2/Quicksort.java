package Q2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Quicksort {
	static int steps = 0;

	static int partition(Comparable[] array, int lo, int hi) {

		Comparable pivot = array[hi];

		int storeIndex = (lo - 1);

		for (int i = lo; i <= hi - 1; i++) {
			if (less(array[i], pivot)) {

				storeIndex++;
				exch(array, storeIndex, i);
			}
		}

		exch(array, storeIndex + 1, hi);
		return (storeIndex + 1);
	}

	public static void sort(Comparable[] a) {
		shuffleArray(a);
		sort(a, 0, a.length - 1);
	}

	public static void sort(Comparable[] array, int lo, int hi) {

		if (hi <= lo)
			return;
		int j = partition(array, lo, hi);
		sort(array, lo, j - 1);
		sort(array, j + 1, hi);

	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public static boolean isSorted(Comparable[] a) { // Test whether the array entries are in order.
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

	// taken from class code
	static void shuffleArray(Comparable[] ar) {
		// If running on Java 6 or older, use `new Random()` on RHS here
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			Comparable a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

}
