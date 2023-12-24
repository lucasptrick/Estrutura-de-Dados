package ED.Lineares.Listas;


public class ListaCircular {
	NoListaCircular cabeca;
	NoListaCircular calda;
	int tamanho;

	private boolean listaSemCabeca() {
		return cabeca==null;
	}

	private boolean elementoExiste(NoListaCircular no) {
		return no != null;
	}

	private NoListaCircular elementoNaPosicao(int indice) throws Exception{
		NoListaCircular atual = cabeca;
		if(indice > tamanho || indice < 0) {
			throw new Exception();
		}

		for(int k=0;k<=indice;k++) {
			if(k == indice) {
				return atual;
			}
			atual = atual.getProx();

		}
		return atual;

	}

	public void add(int indice,int elemento) throws Exception {
		NoListaCircular novoNo = new NoListaCircular(elemento);
		if(listaSemCabeca()) {
			cabeca = novoNo;
			novoNo.setProx(novoNo);
			calda = novoNo;

		}else {
			NoListaCircular elementoNaPosicao = elementoNaPosicao(indice);
			if(elementoExiste(elementoNaPosicao)) {
				elementoNaPosicao.getAnterior().setProx(novoNo);
				novoNo.setProx(elementoNaPosicao);

			}else {
				NoListaCircular anterior = elementoNaPosicao(indice-1);
				novoNo.setAnterior(anterior);

			}
			if(elementoNaPosicao.getProx() == cabeca) {
				calda = novoNo;
			
			}
			if(indice==0) {
				cabeca = novoNo;

			}
		}

		tamanho++;

	}

	public void remove(int indice) throws Exception {
	    if (indice < 0 || indice >= tamanho) {
	        throw new Exception("Índice inválido");
	    }

	    NoListaCircular elementoNaPosicao = elementoNaPosicao(indice);

	    if (indice == 0 && !listaSemCabeca()) {
	        NoListaCircular pescoco = elementoNaPosicao(1);
	        if (elementoExiste(pescoco)) {
	            pescoco.setAnterior(cabeca.getAnterior());
	        }

	        cabeca = pescoco;

	    } else if (!listaSemCabeca() && indice < tamanho) {
	        elementoNaPosicao.getProx().setAnterior(elementoNaPosicao.getAnterior());
	        elementoNaPosicao.getAnterior().setProx(elementoNaPosicao.getProx());

	    } else {
	        throw new Exception("Índice inválido");
	    }

	    if (elementoNaPosicao.getProx() == cabeca) {
	        calda = elementoNaPosicao.getAnterior();
	    }

	    tamanho--;
	}

//	public void remove(int indice) throws Exception{
//		NoListaCircular elementoNaPosicao = elementoNaPosicao(indice);
//		if(indice==0 && !listaSemCabeca()) {
//			NoListaCircular pescoco = elementoNaPosicao(1);
//			if(elementoExiste(pescoco)) {
//				pescoco.setAnterior(cabeca.getAnterior());
//
//			}
//
//			cabeca = pescoco;
//
//		}else if(!listaSemCabeca() && indice<tamanho) {
//			elementoNaPosicao.getProx().setAnterior(elementoNaPosicao.getAnterior());
//			elementoNaPosicao.getAnterior().setProx(elementoNaPosicao.getProx());
//
//		}else {
//			throw new Exception();			
//
//		}
//
//		if(elementoNaPosicao.getProx()==cabeca){
//			calda = elementoNaPosicao.getAnterior();
//
//		}
//
//		tamanho--;
//
//	}

	public Integer get(int indice) throws Exception{
		if(indice>=tamanho) {
			throw new Exception();
			
		}
		
		NoListaCircular no = elementoNaPosicao(indice);

		if (no != null) {
			return no.valor;
		}
		return null;
	}

	public void testeCircular() {
		NoListaCircular atual = cabeca;
		int cont = 0;
		while(cont != 8) {
			System.out.println(atual.valor);
			try {
				Thread.sleep(350);
			}catch(Exception e) {
				
			}
			atual =atual.getProx();
			cont++;
		}
	}
}
