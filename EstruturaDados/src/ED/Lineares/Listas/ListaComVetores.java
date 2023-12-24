package ED.Lineares.Listas;

import java.util.Arrays;

public class ListaComVetores<T> {
	T[] vetor;
    int tamanho;

    @SuppressWarnings("unchecked")
	public ListaComVetores(int tamanhoVetor) throws Exception {
        if (tamanhoVetor < 0) {
            throw new Exception("O tamanho do vetor não pode ser negativo");
        }
        vetor = (T[]) new Object[tamanhoVetor];
        tamanho = 0;
    }
    
    public void insert(int position, T element) throws Exception {
        if (position < 0 || position > tamanho) {
            throw new Exception("O índice está fora da lista");
        }
        if (tamanho == vetor.length) {
            T[] novoVetor = Arrays.copyOf(vetor, vetor.length * 2);
            vetor = novoVetor;
        }
        for (int i = tamanho; i > position; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[position] = element;
        tamanho++;
    }
    
	public void printList() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Index:"+ i + " | Element:"+vetor[i]);
		}
	}
}
	
	    


