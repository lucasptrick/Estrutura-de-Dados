package ED.Lineares.Listas;

public class NoListaDuplamente<T> {
	public T valor;
	public NoListaDuplamente<T> proximo;
	public NoListaDuplamente<T> anterior;
	public  NoListaDuplamente(T valor) {
		this.valor = valor;
	}
	
	public void setProximo0(NoListaDuplamente<T> no) {
		this.proximo = no;
	}
	public void setProximo1(NoListaDuplamente<T> no) {
		NoListaDuplamente<T> proximo = this.proximo;
		no.proximo = proximo;
		this.proximo = no;
	}
}
