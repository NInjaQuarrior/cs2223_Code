package Q2;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import Q5.ScrewItSort;
import edu.princeton.cs.algs4.StdRandom;

public class Main {	
	public static void main(String[] args) {
		
		int[] allowList = IntStream.generate(() -> 
		new Random().nextInt(250000)).limit(250000).toArray();
				
		Arrays.sort(allowList);

		
		int[] list = new int[10];
		for(int i = 0; i < 10; i++) {
			list[i] = (int) StdRandom.uniform(10);
		}
		
		int[] candidates = IntStream.generate(() -> 
		new Random().nextInt(250000)).limit(100).toArray();
		
		for(int i :candidates) {
			if(LinearSearch.search(i, allowList) != -1) {
				  System.out.format("found %d in list \n", i);
			}else {
				System.out.format("NOT found  %d in list \n", i);
			}
		}
		
		for(int i :candidates) {
			if(BinarySearch.search(i, allowList) != -1) {
				System.out.println("found in list");
			}else {
				System.out.println("NOT found in list");
			}
		}
		
		for(int i :candidates) {
			if(BinaryRecursiveSearch.search(i, allowList, 0 , allowList.length) != -1) {
				System.out.println("found in list");
			}else {
				System.out.println("NOT found in list");
			}
		}
		
		System.out.format("Steps in LinearSeach: %d \n", LinearSearch.getSteps());
		
		System.out.format("Steps in BinearSeach: %d \n", BinarySearch.getSteps());
		
		System.out.format("Steps in BinearRecusiveSeach: %d \n", BinaryRecursiveSearch.getSteps());
	}	
}
