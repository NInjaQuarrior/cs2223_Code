package cs2223Assign3;

public class InsertionSort {

	public static Term[] sort(Term[] terms) {

		for (int i = 1; i < terms.length; i++) {
			for (int j = i; j > 0; j--) {
				if (greater(terms[j].getTFIDF(), terms[j - 1].getTFIDF())) {
					Term temp = terms[j];
					terms[j] = terms[j - 1];
					terms[j - 1] = temp;
				}
			}
		}
		return terms;
	}

	private static boolean greater(Comparable v, Comparable w) {
		return v.compareTo(w) > 0;
	}

	public static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++)
			if (greater(a[i], a[i - 1]))
				return false;
		return true;
	}

}
