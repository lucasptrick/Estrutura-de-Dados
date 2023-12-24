package ED.Lineares.Listas;

public class NoListaEncandeada {
	int valor;
	NoListaEncandeada noAnterior;
	NoListaEncandeada noProx;
	public NoListaEncandeada(int elemento) {
		this.valor = elemento;
	}
	public NoListaEncandeada getNoAnterior() {
		return noAnterior;
	}
	public void setNoAnterior(NoListaEncandeada noAnterior) {
		this.noAnterior = noAnterior;
	}
	public NoListaEncandeada getNoProx() {
		return noProx;
	}
	public void setNoProx(NoListaEncandeada noProx) {
		this.noProx = noProx;
	}

}
