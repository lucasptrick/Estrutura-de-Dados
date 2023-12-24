package ED.NaoLineares.Arvores;


public class NoAVL<T extends Comparable<T>> {
	   private NoAVL<T> esquerda;
	    private NoAVL<T> direita;
	    private NoAVL<T> pai;
	    private T chave;
	    private int balanceamento;

	    public NoAVL(T chave) {
	        setEsquerda(setDireita(setPai(null)));
	        setBalanceamento(0);
	        setChave(chave);
	    }

	    public String toString() {
	        return chave.toString();
	    }

	    public T getChave() {
	        return chave;
	    }

	    public void setChave(T chave) {
	        this.chave = chave;
	    }

	    public int getBalanceamento() {
	        return balanceamento;
	    }

	    public void setBalanceamento(int balanceamento) {
	        this.balanceamento = balanceamento;
	    }

	    public NoAVL<T> getPai() {
	        return pai;
	    }

	    public NoAVL<T> setPai(NoAVL<T> pai) {
	        this.pai = pai;
	        return pai;
	    }

	    public NoAVL<T> getDireita() {
	        return direita;
	    }

	    public NoAVL<T> setDireita(NoAVL<T> direita) {
	        this.direita = direita;
	        return direita;
	    }

	    public NoAVL<T> getEsquerda() {
	        return esquerda;
	    }

	    public void setEsquerda(NoAVL<T> esquerda) {
	        this.esquerda = esquerda;
	    }
}
