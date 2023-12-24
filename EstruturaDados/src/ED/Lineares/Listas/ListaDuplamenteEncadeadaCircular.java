package ED.Lineares.Listas;


public class ListaDuplamenteEncadeadaCircular<T> {
	int tamanho;
	public NoListaDuplamente<T> cabeca;
	NoListaDuplamente<T> cauda;
	
	private boolean estaVazia() {
		return cabeca==null;
	}
	
	public NoListaDuplamente<T> get(int posicao) {
		NoListaDuplamente<T> atual = cabeca;
		int pos = 0;
		while(atual!= null) {
			if(pos==posicao)return atual;
			pos +=1; 
			atual = atual.proximo; 
		}
		return null;
	}
	
	private void add(NoListaDuplamente<T> no,int posicao) {
		if(posicao == 0) {
			no.setProximo0(cabeca);
		}else {
			get(posicao-1).setProximo1(no);;
		}
	}
	
	public void add(int posicao,T valor) {
		if(Math.abs(posicao) <=tamanho) {
			NoListaDuplamente<T> no = new NoListaDuplamente<T>(valor); 
			if(!estaVazia()) add(no,posicao);			
			if(posicao == 0) cabeca = no;
			if(posicao == tamanho) cauda =no;
			cauda.proximo = cabeca;
			tamanho++;
		}
	}
	
	private void remove(double posicao) {
		if(posicao == 0.0) {
			cabeca = cabeca.proximo;
			cauda.proximo = cabeca;
		}else {
			NoListaDuplamente<T> anterior = get((int)posicao-1);
			NoListaDuplamente<T> noApagar = anterior.proximo;
			NoListaDuplamente<T> novoProximo = noApagar.proximo;
			anterior.proximo = novoProximo;
     			novoProximo.anterior = anterior;
			
			if(posicao == tamanho) {
				cauda = anterior;
				cauda.proximo = cabeca;
			}
		}
	}
	
	public void remove(int posicao) {
		if(Math.abs(posicao) <= posicao) {
			if(!estaVazia()) remove(Double.valueOf(posicao));
			tamanho--;
		}
	}
	
}
