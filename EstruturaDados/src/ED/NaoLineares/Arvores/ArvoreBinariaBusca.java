package ED.NaoLineares.Arvores;


public class ArvoreBinariaBusca<T extends Comparable<T>>{
	NoABB<T> raiz;
	
	public void insert(T value) {
		insert(value,this.raiz);
	}
	private void insert(T value, NoABB<T> current) {	
		if(raiz == null) {
			raiz = new NoABB<T>(value);
		}
		
		else if(current.value.compareTo(value)<=0){
			if(current.right == null) current.right = new NoABB<T>(value);
			else insert(value,current.right);	
			
		}
		else{
			if(current.left == null) current.left = new NoABB<T>(value);
			else insert(value, current.left);
		}
	}
	
	public void inOrder() throws ArvoreVaziaException{
		if(raiz==null) {
			throw new ArvoreVaziaException();
		}
		inOrder(raiz);
	}
	private void inOrder(NoABB<T> node) {
		if(node.left==null) {
			System.out.println(node.value);
		}else {
			inOrder(node.left);
			System.out.println(node.value);
		}
		if(node.right != null) {
			inOrder(node.right);
		}
	}
	public void remove(T element) throws NoNuloException {
		NoABB<T> sucessor = sucessor(element);
		NoABB<T> no = getNo(element);
		if(element.compareTo(this.raiz.value)==0) {
			NoABB<T> pai = getPai(sucessor.value);
			if(sucessor != null) {
				sucessor.left = this.raiz.left;
				sucessor.right = this.raiz.right;	
			}
			if(element.compareTo(pai.value)<0) pai.left = null;
			else pai.right = null;
			this.raiz = no;
		}else if(no != null) {
			NoABB<T> pai = getPai(element);
			//System.out.println("PAI: " +  pai.value);
			//System.out.println("SUCESSOR: " +  sucessor.value);
			if(element.compareTo(pai.value) < 0) pai.left = sucessor;
			else pai.right = sucessor;
			if(sucessor != null) sucessor.left = no.left;
		}
	}
	
	public NoABB<T> getPai(T element){
		NoABB<T> atual = this.raiz;
		while(atual != null) {
			if(atual.left != null) {
				if(element.compareTo(atual.left.value) == 0) return atual;
			}
			if(atual.right != null) {
				if(element.compareTo(atual.right.value)== 0) return atual;
			}
			if(element.compareTo(atual.value) < 0) atual = atual.left;
			else if(element.compareTo(atual.value) > 0) atual = atual.right;
			
			if (element.compareTo(atual.value) < 0) {
				atual = atual.left;
			}else if (element.compareTo(atual.value) > 0){
				atual = atual.right;
			}
		}
		
		return atual;
	}
	
	public NoABB<T> sucessor(T element){
		try {
			NoABB<T> no = getNo(element);
			NoABB<T> sucessor = no.right;
			while (sucessor != null) {
				if (sucessor.left == null) {
					return sucessor;
				}
				sucessor = sucessor.left;
			}
		} catch(Exception e) {
			
		} 
		return null;
	}
		
	public NoABB<T> getNo(T element) throws NoNuloException{
		NoABB<T> atual = this.raiz;
		while (atual != null) {
			if (element.compareTo(atual.value) < 0) {
				atual = atual.left;
			}else if (element.compareTo(atual.value) > 0){
				atual = atual.right;
			}else {
				return atual;
			}
		}
		throw new NoNuloException();
	}
}
