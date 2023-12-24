package ED.Lineares.Listas;

public class NoListaCircular {
	int valor;
	NoListaCircular anterior;
	NoListaCircular prox;
	
	public NoListaCircular(int elemento) {
		this.valor = elemento;
	}

	public NoListaCircular getAnterior() {
		return anterior;
	}

	public void setAnterior(NoListaCircular anterior) {
		this.anterior = anterior;
		anterior.prox = this;
	}

	public NoListaCircular getProx() {
		return prox;
	}

	public void setProx(NoListaCircular prox) {
		this.prox = prox;
		prox.anterior = this;
	}
}
