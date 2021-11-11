package Q5;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		int size = 400000;

		int[] list = IntStream.generate(() -> new Random().nextInt(size)).limit(size).toArray();

		for (int i : Bubblesort.sort(list)) {
			System.out.println(i);
		}
		list = IntStream.generate(() -> new Random().nextInt(size)).limit(size).toArray();

		for (int i : Mergesort.sort(list, 0, list.length - 1)) {
			System.out.println(i);
		}
		list = IntStream.generate(() -> new Random().nextInt(size)).limit(size).toArray();

		for (int i : Quicksort.sort(list, 0, list.length - 1)) {
			System.out.println(i);
		}

		list = IntStream.generate(() -> new Random().nextInt(size)).limit(size).toArray();

		System.out.println("Steps for Bubblesort: " + Bubblesort.getSteps());
		System.out.println("Steps for Mergesort: " + Mergesort.getSteps());
		System.out.println("Steps for Quicksort: " + Quicksort.getSteps());

	}

}
