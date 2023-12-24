package ED.Lineares;

import java.util.stream.Stream;

import ED.Lineares.Pilha.Pilha;

public class AppMain_Pilha {

	public static void main(String[] args) throws Exception {
		System.out.println("---------------- Pilha --------------------");
		Pilha<Object> pilha = new Pilha<Object>();

		// Inserindo objetos na pilha
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);

		// Exibindo a Pilha
		Stream.of(pilha.vetor).forEach(System.out::println);
		System.out.println("\n");
		
		// Removendo o último objeto adicionado
		pilha.pop();	


	}
}
