package ED.NaoLineares;

import ED.NaoLineares.Arvores.ArvoreAVL;
import ED.NaoLineares.Arvores.ArvoreBinariaBusca;
import ED.NaoLineares.Arvores.ArvoreVaziaException;

public class AppMain_Arvores {

	public static void main(String[] args) throws ArvoreVaziaException {
		System.out.println("---------------- Arvore Binária de Busca --------------------");
		ArvoreBinariaBusca<Integer> abb = new ArvoreBinariaBusca<Integer>();
		
		System.out.println("----[Inserindo]----");
		abb.insert(40);
		abb.insert(20);
		abb.insert(10);
		abb.insert(60);
		abb.insert(30);
		abb.insert(50);
		abb.insert(70);

		System.out.println("----[Removendo]----");
		//arvore.remove(8);

		//arvore.remove(9);

		//arvore.remove(6);
		
		System.out.println("----[InOrder]----");
		abb.inOrder();




		System.out.println("---------------- Arvore AVL --------------------");
		ArvoreAVL<Integer> avl = new ArvoreAVL<Integer>();

		System.out.println("----[Inserindo]----");
		//System.out.println("Inserindo os elementos na seguinte ordem: 3, 4, 5");
		avl.inserir(5);
		avl.inserir(4);
		avl.inserir(3);


		System.out.println("----[Removendo]----");
		//System.out.println("Removendo o elemento: 4 - 'A nova raiz'");
		//avl.remover(4);


		System.out.println("----[Exibindo]----");
		System.out.println(avl.raiz.getEsquerda().getChave()); //Oq era Raiz na inserção da AVL virou Raiz.getEsquerda() após o balanceamento;
		System.out.println(avl.raiz.getChave()); //Oq era Raiz.getDireita() virou Raiz da AVL após o balanceamento;
		System.out.println(avl.raiz.getDireita().getChave()); //Oq era Raiz.getDireita().getDireita() virou Raiz.getDireita() após o balanceamento;


		System.out.println("----[InOrder]----");
		System.out.println(avl.inorder());
		System.out.println(avl.raiz.getChave());
		
	}
}
