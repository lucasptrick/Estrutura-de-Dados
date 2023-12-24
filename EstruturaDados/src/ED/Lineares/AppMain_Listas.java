package ED.Lineares;

import ED.Lineares.Listas.*;

public class AppMain_Listas {

	public static void main(String[] args) throws Exception {		
		System.out.println("---------------- Lista --------------------");
		Lista l = new Lista(5);

		// Adicionando elementos à lista
		l.add(0, 0);
		l.add(1, 5);
		l.add(2, 10);
		l.add(3, 15);
		l.add(4, 20);

		// Obtendo um elemento da lista
		l.get(3);

		// Mudando o elemento de um determinado indice
		l.set(4, 25);

		// Removendo um elemento da lista
		l.remove(0);
		System.out.println("-------------------------------------\n");



		System.out.println("---------------- Lista com Vetores --------------------");
		ListaComVetores<Integer> lv = new ListaComVetores<Integer>(10);

		// Adicionando elementos à lista
		lv.insert(0, 10);
		lv.insert(1, 20);
		lv.insert(2, 30);
		lv.insert(3, 40);
		lv.insert(4, 50);

		// Exibindo a lista
		lv.printList();
		System.out.println("-------------------------------------\n");



		System.out.println("----------------- Lista Circular -------------------");
		NoListaCircular no = new NoListaCircular(5);
		ListaCircular lc = new ListaCircular();

		// Adicionando elementos à lista
		lc.add(0, 1);
		lc.add(1, 2);
		lc.add(2, 3);
		lc.add(3, 4);

		//  Removendo um elemento da lista
		lc.remove(3);

		// Exibindo a lista após a remoção
		lc.testeCircular();
		System.out.println("-------------------------------------\n");



		System.out.println("----------------- Lista Encadeada Circular -------------------");
		NoListaEncandeada noEncadeada = new NoListaEncandeada(1);
		ListaEncandeadaCircular lec = new ListaEncandeadaCircular(noEncadeada);

		// Adicionando elementos à lista
		lec.add(1, 2);
		lec.add(2, 3);
		lec.add(3, 4);

		// Exibindo a lista
		System.out.println("Lista Original:");
		lec.show();

		// Obtendo um elemento da lista
		try {
			int elemento = lec.get(2);
			System.out.println("Elemento no índice 2: " + elemento);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Removendo um elemento da lista
		lec.remove(1);

		// Exibindo a lista após a remoção
		System.out.println("Lista após a remoção do elemento no índice 1:");
		lec.show();
		System.out.println("-------------------------------------\n");



		System.out.println("----------------- Lista Duplamente Encadeada Circular -------------------");
		ListaDuplamenteEncadeadaCircular<Integer> ldec = new ListaDuplamenteEncadeadaCircular<Integer>();

		// Adicionando elementos à lista
		ldec.add(0, 5);
		ldec.add(1, 10);
		ldec.add(2, 15);
		ldec.add(3, 20);

		// Exibindo a lista
		System.out.println("Exibindo a lista:");
		System.out.println(ldec.cabeca.valor);
		System.out.println(ldec.cabeca.proximo.valor);
		System.out.println(ldec.cabeca.proximo.proximo.valor);
		System.out.println(ldec.cabeca.proximo.proximo.proximo.valor);
		System.out.println(ldec.cabeca.proximo.proximo.proximo.proximo.valor);
		
		// Exibindo a lista após a remoção
		ldec.remove(1);
		System.out.println("Exibindo a lista após a remoção:");
		System.out.println(ldec.cabeca.valor);
		System.out.println(ldec.cabeca.proximo.valor);
		System.out.println(ldec.cabeca.proximo.proximo.valor);
		System.out.println(ldec.cabeca.proximo.proximo.proximo.valor);

	}
}
