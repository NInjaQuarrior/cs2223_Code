package Q1;

public class Monster implements Comparable<Monster> {

	public final String name;
	public final int damage;

	public Monster(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	public int compareTo(Monster m) {
		return this.name.compareTo(m.name);
	}

}
