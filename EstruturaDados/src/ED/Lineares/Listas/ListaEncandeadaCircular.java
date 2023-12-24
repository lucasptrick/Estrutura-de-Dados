package ED.Lineares.Listas;


public class ListaEncandeadaCircular {
	NoListaEncandeada cabeca;
	NoListaEncandeada rabo;
	int tamanho;
	
	public ListaEncandeadaCircular(NoListaEncandeada cabeca) {
		this.cabeca = cabeca;
		tamanho = 1;
	}
	
	public void add(int indice, int elemento) {
		var novo = new NoListaEncandeada(elemento);
		NoListaEncandeada atual = cabeca;
		for(int i=0;i<=indice;i++) {
			if(atual!=null) {
				if(i== indice-1) {
					NoListaEncandeada proximo = atual.getNoProx();
					if(proximo != null && proximo.getNoProx() != null) {
						proximo.getNoProx().setNoAnterior(novo);
						novo.setNoProx(proximo.getNoProx());
					}
					if(indice==tamanho) {	

						rabo = novo;
						novo.setNoProx(cabeca);
						cabeca.setNoAnterior(rabo);
						tamanho++;
					}

					novo.setNoAnterior(atual);
					atual.setNoProx(novo);
				}

				atual=atual.getNoProx();

			}else {
				System.out.println("Indice invalido");
				break;
			}
		}
	}

	public int get(int indice) throws Exception{
		NoListaEncandeada atual = cabeca;
		for(int k=0;k<=indice;k++) {
			if(atual!=null) {
				if(k==indice) {
					return atual.valor;
				}
				atual=atual.getNoProx();
			}else {
				break;
			}
		}
		throw new Exception("Indice invalido!");
	}
	public void remove(int indice) {
		NoListaEncandeada atual = cabeca;
		for(int k=0;k<=indice;k++) {
			if(atual!=null) {
				if(k==indice) {
					NoListaEncandeada anterior = atual.getNoAnterior();
					NoListaEncandeada proximo = atual.getNoProx();
					atual.getNoAnterior().setNoProx(proximo);
					if(proximo !=null) {
						proximo.setNoAnterior(atual);
					}
					if(indice==tamanho) {
						this.rabo = anterior;
						this.cabeca.setNoAnterior(rabo);
						this.rabo.setNoProx(cabeca);
					}
					tamanho--;
				}
				atual=atual.getNoProx();
			}else {
				break;
			}
		}
	}
	public void show() {
		NoListaEncandeada atual = cabeca;
		int cont = 0;
		while(cont != 8) {
			System.out.println(atual.valor);
			try {
				Thread.sleep(350);
			}catch(Exception e) {

			}
			atual = atual.getNoProx();
			cont++;
		}
	}
}
