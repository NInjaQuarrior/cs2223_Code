package Q2;

public class LinearSearch {
	
	public static long steps = 0;
	
	
	public static int search(int key, int[] array) {
			
		for(int i = 0; i < array.length; i++) {
			steps++;
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
			
	
	public static long getSteps()
	{
		return steps;
	} 
	
}
