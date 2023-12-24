package ED.NaoLineares.Arvores;

public class ArvoreVaziaException extends Exception{
	@Override
	public String getMessage() {
		return "Árvore vázia";
	}
}
