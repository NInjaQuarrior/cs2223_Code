package Q3;

public class StopWatch {

	double start = 0;
	double time = 0;

	public void start() {
		start = System.currentTimeMillis();
	}

	public double getElapsedTime() {
		return (System.currentTimeMillis() - start);
	}

	public double getTime() {
		return time;
	}

	public double stop() {

		time = (System.currentTimeMillis() - start);
		return time;
	}

	public void reset() {
		start = 0;
	}
}
