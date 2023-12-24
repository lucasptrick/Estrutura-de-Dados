package ED.Lineares.Pilha;

public class Pilha <E>{
	static final int tamanhoMax = 5;
	public Object [] vetor;
	int tamanho;

	public Pilha() {
		this.vetor = new Object [tamanhoMax];
		this.tamanho = 0;
	}
	public void push (int elemento) throws Exception {
		if (this.tamanho == vetor.length ) {
			throw new Exception("A pilha está cheia!");
		} try {
			this.vetor[tamanho] = elemento;
			this.tamanho++;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public Object pop() throws Exception {
		if (tamanho == 0) {
			throw new Exception("A pilha está vazia!");
		}
		Object elementoRemovido = vetor[tamanho - 1];
		vetor[tamanho - 1] = null;
		tamanho--;
		System.out.println("O seguinte elemento foi removido: " + elementoRemovido);		
		return elementoRemovido;
	}
	public void redimencionar() {
		int novaCapacidade = vetor.length*2;
		Integer [] novoVetor = new Integer[novaCapacidade];
		System.arraycopy(vetor, 0, novoVetor, 0, tamanho);
		vetor = novoVetor;
	}
}
