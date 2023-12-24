package ED.Lineares;

import java.util.stream.Stream;

import ED.Lineares.Fila.Fila;

public class AppMain_Fila {

	public static void main(String[] args) throws Exception {
		System.out.println("---------------- Fila --------------------");
		Fila fila = new Fila();
		
		// Inserindo elementos na fila
		fila.enqueue(1);
		fila.enqueue(2);
		fila.enqueue(3);
		fila.enqueue(4);
		fila.enqueue(5);

		// Exibindo a fila 
		Stream.of(fila.vetor).forEach(System.out::println);
		System.out.println("\n");
		
		// Removendo primeiros elemento da fila
		fila.dequeue();
		fila.dequeue();
		
		// Exibindo a fila após a remoção
		System.out.println("\n");
		Stream.of(fila.vetor).forEach(System.out::println);

	}
}
