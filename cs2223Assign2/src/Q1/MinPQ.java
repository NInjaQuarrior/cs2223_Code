package Q1;

public class MinPQ<Key extends Comparable> {
	private Key[] pq;
	private int N = 0;

	public MinPQ(int maxN) {
		pq = (Key[]) new Comparable[maxN + 1];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public void insert(Key v) {
		pq[++N] = v;
		swim(N);
	}

	public Key delMin() {
		Key min = pq[1];
		exch(1, N--);
		pq[N + 1] = null;
		sink(1);
		return min;
	}

	private boolean isGreater(int i, int j) {
		return ((Comparable<Key>) pq[i]).compareTo(pq[j]) > 0;

	}

	private void exch(int i, int j) {
		Key swap = pq[i];
		pq[i] = pq[j];
		pq[j] = swap;
	}

	private void swim(int k) {
		while (k > 1 && isGreater(k / 2, k)) {
			exch(k, k / 2);
			k = k / 2;
		}
	}

	private void sink(int k) {
		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && isGreater(j, j + 1))
				j++;
			if (!isGreater(k, j))
				break;
			exch(k, j);
			k = j;
		}
	}

}