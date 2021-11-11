package Q5;

public class ScrewItSort {
	static int steps = 0;

	public static int[] sort(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			if (list[i + 1] < list[i]) {
				steps++;
				int[] betterList = new int[10];
				for (int j = 0; j < 10; j++) {
					betterList[j] = j;
				}
				return betterList;
			}
		}
		return list;
	}

	public static int getSteps() {
		return steps;
	}
}
