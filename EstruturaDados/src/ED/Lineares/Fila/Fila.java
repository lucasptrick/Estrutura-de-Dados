package ED.Lineares.Fila;

public class Fila {
	public Integer[] vetor;
	int cabeca;
	int rabo;

	public Fila() {
		this.vetor = new Integer[5];
	}

	public void enqueue(int elemento) {
		try {
			if (this.vetor[rabo % vetor.length] == null) {
				this.vetor[rabo % vetor.length] = elemento;
				this.rabo++;
			} else {
				throw new Exception("A fila está cheia!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int dequeue() throws Exception {
		if (this.vetor[cabeca % vetor.length] != null) {
			int elemento = this.vetor[cabeca % vetor.length];
			this.vetor[cabeca % vetor.length] = null;
			this.cabeca++;
			System.out.println("O elemento: " +elemento+ " foi removido ");
			return elemento;
		} else {
			throw new Exception("A fila está vazia meu faixa!");
		}
	}
}