package ED.Lineares.Listas;

public class Lista {
	int [] vetor;
	int tamanho;
	
	public Lista (int tamanhoVetor) throws Exception {
		if (tamanhoVetor < 0) {
			throw new Exception("O tamanho do vetor não pode ser negativo");
		}
		vetor = new int[tamanhoVetor];
		tamanho = 0;
	}
	
	public void add(int indice, int elemento) throws Exception {
		 if (indice < 0 || indice > tamanho) {
		        throw new Exception("O índice está fora da lista");
		    }
		    if (tamanho == vetor.length) {
		        int[] novoVetor = new int[vetor.length * 2];
		        System.arraycopy(vetor, 0, novoVetor, 0, vetor.length);
		        vetor = novoVetor;
		    }
		    for (int i = tamanho; i > indice; i--) {
		        vetor[i] = vetor[i - 1];
		    }
		    vetor[indice] = elemento;
		    tamanho++;
	}
	
	public int get(int indice)  throws Exception {
		if (indice < 0 || indice >=tamanho) {
			throw new Exception("O indíce está fora da lista");
		}
		System.out.println("Elemento solicitado:" +vetor[indice]);
		return vetor[indice];
	}
	
	public int set(int indice, int elemento) throws Exception {
		if (indice < 0 || indice >=tamanho) {
			throw new Exception("O indíce está fora da lista");
		}
		vetor[indice] = elemento;
		System.out.println("Elemento [" +elemento+ "] foi adicionado no indíce: "+indice);
		return elemento;
	}
	
	
	public int remove(int indice) throws Exception {
		if (indice < 0 || indice >=tamanho) {
			throw new Exception("O indíce está fora da lista");
		}
		int elementoRemovido = vetor[indice];
		for (int i = indice; i < tamanho - 1; i++) {
			vetor[i] = vetor[i+1];
			tamanho--;
		}
		System.out.println("O elemnto: [" +elementoRemovido+ "] foi removido!");
		return elementoRemovido;
		
	}
}
