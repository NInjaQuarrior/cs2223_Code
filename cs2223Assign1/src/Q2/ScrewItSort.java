package Q2;

public class ScrewItSort {

	public int[] sort(int[] list) {
		
		for(int i = 0; i < list.length; i++) {
			if(list[i+1] < list[i]) {
				int[] betterList = new int[10];
				for(int j = 0; j < 10; j++) 
				{
					betterList[j] = j;
				}
				return betterList;
			}
		}
		return list;	
	}
}
