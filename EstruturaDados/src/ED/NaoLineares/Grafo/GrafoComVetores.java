package ED.NaoLineares.Grafo;

import java.util.Arrays;

public class GrafoComVetores {

	private int vertices;
	private int[][] matrizAdjacente;

	public GrafoComVetores(int vertices) {
		this.vertices = vertices;
		this.matrizAdjacente = new int[vertices][vertices];
	}

	public void inserirAresta(int v1, int v2) {
		matrizAdjacente[v1][v2] = 1;
		matrizAdjacente[v2][v1] = 1;
	}

	public boolean existeAresta(int v1, int v2) {
		return matrizAdjacente[v1][v2] == 1;
	}


	public void imprimirMatrizAdjacentes() {
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				System.out.print(matrizAdjacente[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public int[] obterVerticesAdjacentes(int vertice) {
		int[] adjacentes = new int[matrizAdjacente.length];
		int count = 0;
		for (int i = 0; i < matrizAdjacente.length; i++) {
			if (matrizAdjacente[vertice][i] == 1) {
				adjacentes[count] = i;
				count++;
			}
		}
		return Arrays.copyOf(adjacentes, count);//return adjacentes;
	}

	public void imprimirEstruturaAdjacentes() {
		for (int i = 0; i < vertices; i++) {
			System.out.print("Vertice [" + i + "]");
			int[] adjacentes = listaAdjacentes(i);
			for (int j = 0; j < adjacentes.length; j++) {
				System.out.print(" -> " + adjacentes[j] + "");
			}
			System.out.println();
		}
	}

	public void removerAresta(int v1, int v2) {
		matrizAdjacente[v1][v2] = 0;
		matrizAdjacente[v2][v1] = 0;
	}

	public int obterVertices() {
		return vertices;
	}
	private int[] listaAdjacentes(int vertice) {
		int[] adjacentes = new int[vertices];
		int count = 0;
		for (int i = 0; i < vertices; i++) {
			if (matrizAdjacente[vertice][i] == 1) {
				adjacentes[count++] = i;
			}
		}
		// Retorna um subarray com apenas os elementos adjacentes
		return Arrays.copyOf(adjacentes, count);
	}
}
