package Q2;
import Q2.ScrewItSort;
import edu.princeton.cs.algs4.StdRandom;

public class Main {	
	public static void main(String[] args) {
		ScrewItSort fuck = new ScrewItSort();
		int[] list = new int[1000];
		for(int i = 0; i < 1000; i++) {
			list[i] = (int) StdRandom.uniform(10000);
		}
		for(int i :fuck.sort(list)) {
			System.out.println(i);
		}
	}	
}
