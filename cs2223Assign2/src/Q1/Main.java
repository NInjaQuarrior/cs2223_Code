package Q1;

import java.util.Random;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		String[] monsters = { "Goblin", "Troll", "Witch", "Orc", "Giant", "Ogre", "Dragon" };

		Random r = new Random();
		int size = 100;
		int range = 1000;

		MinPQ<Integer> minPQInt = new MinPQ<>(size);

		for (int i = 0; i < size; i++) {
			Integer ranInt = r.nextInt(range);
			minPQInt.insert(ranInt);
		}
		// store results
		Stack<Integer> stackInt = new Stack<>();
		while (!minPQInt.isEmpty()) {
			stackInt.push(minPQInt.delMin());
		}

		// show results, will be sorted
		for (Integer i : stackInt) {
			System.out.println(i);
		}

		MinPQ<Monster> minPQMon = new MinPQ<>(size);

		for (int i = 0; i < size; i++) {
			Monster m = new Monster(monsters[r.nextInt(7)], r.nextInt(100));
			minPQMon.insert(m);
		}

		// store results
		Stack<Monster> stackMon = new Stack<>();
		while (!minPQMon.isEmpty()) {
			stackMon.push(minPQMon.delMin());
		}
		// print results, will be sorted by name
		for (Monster i : stackMon) {
			System.out.println("Name: " + i.name + " Damage: " + i.damage);
		}

	}

	public static boolean isSorted(Comparable[] a) { // Test whether the array entries are in order.
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static boolean greater(Comparable v, Comparable w) {
		return v.compareTo(w) > 0;
	}

}
