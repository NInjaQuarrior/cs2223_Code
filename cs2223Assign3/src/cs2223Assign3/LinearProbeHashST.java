package cs2223Assign3;

import java.util.ArrayDeque;
import java.util.Queue;

public class LinearProbeHashST<Key, Value> {

	private int N;
	private int M = 16;
	private Key[] keys; // keys
	private Value[] vals; // values

	public LinearProbeHashST() {
		keys = (Key[]) new Object[M];
		vals = (Value[]) new Object[M];
	}

	public LinearProbeHashST(int capacity) {
		M = capacity;
		N = 0;
		keys = (Key[]) new Object[M];
		vals = (Value[]) new Object[M];
	}

	private int hash(Key key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}

	private void resize(int cap) {
		LinearProbeHashST<Key, Value> t;
		t = new LinearProbeHashST<Key, Value>(cap);
		for (int i = 0; i < M; i++)
			if (keys[i] != null) {
				t.put(keys[i], vals[i]);
			}
		keys = t.keys;
		vals = t.vals;
		M = t.M;
	}

	public void put(Key key, Value val) {
		if (N >= M / 2) {
			resize(2 * M);
		}
		int i;
		for (i = hash(key); keys[i] != null; i = (i + 1) % M)
			if (keys[i].equals(key)) {
				vals[i] = val;
				return;
			}
		keys[i] = key;
		vals[i] = val;
		N++;
	}

	public Value get(Key key) {
		for (int i = hash(key); keys[i] != null; i = (i + 1) % M) {
			if (keys[i].equals(key)) {
				return vals[i];
			}
		}
		return null;
	}

	public Queue<Key> getAllKeys() {
		Queue<Key> que = new ArrayDeque<Key>();
		for (int i = 0; i < M; i++)
			if (keys[i] != null)
				que.add(keys[i]);
		return que;
	}
}
