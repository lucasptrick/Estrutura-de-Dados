package ED.NaoLineares.Grafo;

import java.util.LinkedList;

public class GrafoComLinkedList<T> {
	private int vertices;
	private LinkedList<T> adj[];

	public GrafoComLinkedList(int vertices) {
		this.vertices = vertices;
		adj = new LinkedList[vertices];

		for (int i = 0; i < vertices; i++) {
			adj[i] = new LinkedList<T>();
		}
	}

	public void inserirAresta(T v1, T v2) { 
		adj[(Integer) v1].add(v2);
		adj[(Integer) v2].add(v1);
	}

	public boolean existeAresta(T v1, T v2) {
		return adj[(Integer) v1].contains(v2);
	}

	public LinkedList<T> obterVerticesAdjacentes(T v) {
		return adj[(Integer) v];
	}

	public int obterGrauDoVertice(T v) {
		return adj[(Integer)v].size();
	}

	public void removerAresta(T v1, T v2) {
		adj[(Integer) v1].remove(v2);
		adj[(Integer) v2].remove(v1);
	}

	public void imprimirEstruturaAdjacente() {
		for (int i = 0; i < vertices; i++) {
			System.out.print("Vértice [" + i + "]");
			for (T j : adj[i]) {
				System.out.print(" -> " + j + "");
			}
			System.out.println("\n");
		}
	}

	public void imprimirMatrizAdjacente() {
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				if (adj[i].contains(j)) System.out.print(" 1 |");
				else System.out.print(" 0 |");
			}
			System.out.println("");
		}
	}

	public int obterNumeroDeVertices() {
		return vertices;
	}
}
