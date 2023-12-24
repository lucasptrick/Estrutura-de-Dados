package ED.NaoLineares;

import ED.NaoLineares.Grafo.GrafoComLinkedList;
import ED.NaoLineares.Grafo.GrafoComVetores;

public class AppMain_Grafos {

	public static void main(String[] args) {
		System.out.println("----------------Grafos com LinkedList(g1)----------------");
		GrafoComLinkedList<Integer> g1 = new GrafoComLinkedList<Integer>(5);

		//Inserir uma aresta no grafo de números:
		g1.inserirAresta(0, 1);
		g1.inserirAresta(0, 2);
		g1.inserirAresta(1, 3);
		g1.inserirAresta(2, 3);
		g1.inserirAresta(3, 4);

		//Imprimindo o grafo:
		System.out.println("Matriz Adjacência do Grafo:\n");
		g1.imprimirMatrizAdjacente();
		System.out.println("--------------------------------\n");

		//Imprimindo o grafo:
		System.out.println("Estrutura Adjacência do Grafo:\n");
		g1.imprimirEstruturaAdjacente();
		System.out.println("--------------------------------\n");

		//Imprimindo os Graus de cada vértices:	*Bônus
		System.out.println("Grau dos vértices do grafo acima:");
		System.out.println("G(0): " + g1.obterGrauDoVertice(0));
		System.out.println("G(1): " + g1.obterGrauDoVertice(1));
		System.out.println("G(2): " + g1.obterGrauDoVertice(2));
		System.out.println("G(3): " + g1.obterGrauDoVertice(3));
		System.out.println("G(4): " + g1.obterGrauDoVertice(4));
		System.out.println("\n--------------------------------\n");
		
		//Verificar se existe determinada Aresta no grafo:
		System.out.println("Existência da aresta (0, 1):  >>" + g1.existeAresta(0, 1) + "<<");
		System.out.println("Existência da aresta (2, 4):  >>" + g1.existeAresta(2, 4) + "<<");
		System.out.println("\n--------------------------------\n");

		//Obter a lista de vértices adjacentes a um determinado vértice:
		System.out.println("Vertices adjacentes a 0:  >>" + g1.obterVerticesAdjacentes(0) + "<<");
		System.out.println("Vertices adjacentes a 3:  >>" + g1.obterVerticesAdjacentes(3) + "<<");
		System.out.println("\n--------------------------------\n");

		//Retirar uma aresta do grafo:
		g1.removerAresta(0, 1);
		System.out.println("Existência da aresta (0, 1) após a remoção: >>" + g1.existeAresta(0, 1) + "<<");
		System.out.println("Vertices adjacentes a 0 após a remoção:  >>" + g1.obterVerticesAdjacentes(0) + "<<");
		System.out.println("\n--------------------------------\n");

		//Obter o número de vértices do grafo:
		System.out.println("Número de vértices do grafo:  >>" + g1.obterNumeroDeVertices() + "<<");


		
		
		
		

		System.out.println("----------------Grafos com Vetores(g2)----------------");
		GrafoComVetores g2 = new GrafoComVetores(5); //Criar um grafo vazio, CHECK!!!
		
		System.out.println("Grafo criado com " + g2.obterVertices() + " vértices");
		System.out.println("Matriz adjacente: ");
		g2.imprimirMatrizAdjacentes();
		System.out.println("--------------------------------\n");

		//Inserir uma aresta no grafo, CHECK!!!
		g2.inserirAresta(0, 1);
		g2.inserirAresta(0, 2);
		g2.inserirAresta(1, 3);
		g2.inserirAresta(2, 3);
		g2.inserirAresta(3, 4);

		//Verificar se existe determinada Aresta no grafo, CHECK!!!
		System.out.println("Existência da aresta (0, 1):  >> " + g2.existeAresta(0, 1) + " <<");
		System.out.println("Existência da aresta (2, 4):  >> " + g2.existeAresta(2, 4) + " <<");
		System.out.println("\n--------------------------------\n");

		//Obter a lista de vértices adjacentes a um determinado vértice, CHECK!!!
		int[] adj = g2.obterVerticesAdjacentes(0);
		System.out.println("Vertices adjacentes à [0]");
		for (int i = 0; i < adj.length; i++) 
		{ System.out.print(" -> " + adj[i]); }
		System.out.println("\n--------------------------------\n");

		//Retirar uma aresta do grafo, CHECK!!!
		g2.removerAresta(0, 1);
		System.out.println("Existência da aresta (0, 1) após a remoção: >>" + g2.existeAresta(0, 1) + "<<");
		System.out.print("Vertices adjacentes à 0 após a remoção:");
		int[] adj3 = g2.obterVerticesAdjacentes(0);
		for (int i = 0; i < adj3.length; i++) 
		{ System.out.print(" -> " + adj3[i]); }
		System.out.println("\n--------------------------------\n");

		//Imprimindo o grafo, CHECK!!!
		System.out.println("Matriz Adjacência do Grafo:");
		g2.imprimirMatrizAdjacentes();
		System.out.println("--------------------------------\n");		

		System.out.println("Estrutura Adjacência do Grafo:");
		g2.imprimirEstruturaAdjacentes();
		System.out.println("--------------------------------\n");

		//Obter o número de vértices do grafo, CHECK!!!
		System.out.println("Número de vértices do grafo:  >> " + g2.obterVertices() + " <<");

	}
}
