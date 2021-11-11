package Q2;

public class BinarySearch {

	public static long steps = 0;

	public static int search(int key, int[] array) {
		int lo = 0;
		int hi = array.length - 1;
		
		while (lo<=hi) {
			steps++;
			int mid = lo + (hi - lo)/2;
			
			if(key <array[mid]) {
				hi = mid -1 ;
			}else if(key > array[mid]) {
				lo = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public static long getSteps()
	{
		return steps;
	} 
	
}
