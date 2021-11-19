package Q2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		StopWatch heapWatch = new StopWatch();
		StopWatch insertWatch = new StopWatch();
		StopWatch quickWatch = new StopWatch();

		int size = 1000;

		int[] list = IntStream.generate(() -> new Random().nextInt(size)).limit(size).toArray();
		Integer[] listInt = Arrays.stream(list).boxed().toArray(Integer[]::new);

		heapWatch.start();
		HeapSort.sort(listInt);
		System.out.println("heapsort sorted?: " + HeapSort.isSorted(listInt));
		System.out.println("heapsort time: " + heapWatch.stop());

		quickWatch.start();
		Quicksort.sort(listInt);
		System.out.println("quicksort sorted?: " + Quicksort.isSorted(listInt));
		System.out.println("quicksort time: " + quickWatch.stop());

		list = IntStream.generate(() -> new Random().nextInt(size)).limit(size).toArray();
		listInt = Arrays.stream(list).boxed().toArray(Integer[]::new);

		insertWatch.start();
		InsertionSort.sort(listInt);
		System.out.println("insertsort sorted?: " + InsertionSort.isSorted(listInt));
		System.out.println("insertsort time: " + insertWatch.stop());
	}
}
