package cs2223Assign4;

import java.util.ArrayList;

public class Graph {

	private final int V; // number of vertices
	private int E; // number of edges
	private ArrayList<Integer>[] adj; // adjacency lists

	public Graph(int V) {
		this.V = V;
		this.E = 0;
		adj = (ArrayList<Integer>[]) new ArrayList[V]; // Create array of lists.
		for (int v = 0; v < V; v++) // Initialize all lists
			adj[v] = new ArrayList<Integer>(); // to empty.
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public void addEdge(int v, int w) {
		adj[v].add(w); // Add w to v’s list.
		adj[w].add(v); // Add v to w’s list.
		E++;
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}
}
