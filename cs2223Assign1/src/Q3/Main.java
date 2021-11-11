package Q3;

public class Main {

	static StopWatch linWatch = new StopWatch();
	static StopWatch quadWatch = new StopWatch();
	static StopWatch cuWatch = new StopWatch();

	static int inputSize = 100000;

	public static void main(String[] args) {
		linearFunction();
		System.out.println("linear time: " + linWatch.getTime());
		quadraticFunction();
		System.out.println("quadratic time: " + quadWatch.getTime());
		cubicFunction();
		System.out.println("cubic time: " + cuWatch.getTime());

	}

	static int linearFunction() {
		linWatch.start();
		int sum = 0;
		for (int i = 0; i < inputSize; i++) {
			sum++;
		}
		linWatch.stop();
		return sum;
	}

	static int quadraticFunction() {
		quadWatch.start();
		int sum = 0;
		for (int i = 0; i < inputSize; i++) {
			for (int j = 0; j < inputSize; j++) {
				sum++;
			}
		}
		quadWatch.stop();
		return sum;
	}

	static int cubicFunction() {
		cuWatch.start();
		int sum = 0;
		for (int i = 0; i < inputSize; i++) {
			for (int j = 0; j < inputSize; j++) {
				for (int k = 0; k < inputSize; k++) {
					sum++;
				}
			}
		}
		cuWatch.stop();
		return sum;
	}

}
