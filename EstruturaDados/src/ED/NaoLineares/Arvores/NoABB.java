package ED.NaoLineares.Arvores;

public class NoABB <T> {
	NoABB<T> left;
	NoABB<T> right;
	T value;
	public NoABB(T value) {
		this.value = value;
	}
	public NoABB(T value, NoABB<T> left) {
		this.left = left;
	}
	public NoABB(NoABB<T> left, NoABB<T> right) {
		this.left = left;
		this.right = right;
	}
}
