package ED.NaoLineares.Arvores;


import java.util.ArrayList;

public class ArvoreAVL<T extends Comparable<T>> {

    public NoAVL<T> raiz;

    public void inserir(T chave) {
    	NoAVL<T> novoNo = new NoAVL<T>(chave);
        inserirAVL(this.raiz, novoNo);
    }

    private void inserirAVL(NoAVL<T> aComparar, NoAVL<T> aInserir) {
        if (aComparar == null) {
            this.raiz = aInserir;
            
        } else {
            if (aInserir.getChave().compareTo(aComparar.getChave()) < 0) {
                if (aComparar.getEsquerda() == null) {
                    aComparar.setEsquerda(aInserir);
                    aInserir.setPai(aComparar);
                    verificarBalanceamento(aComparar);
                } else {
                    inserirAVL(aComparar.getEsquerda(), aInserir);
                }
                
            } else if (aInserir.getChave().compareTo(aComparar.getChave()) > 0) {
                if (aComparar.getDireita() == null) {
                    aComparar.setDireita(aInserir);
                    aInserir.setPai(aComparar);
                    verificarBalanceamento(aComparar);
                } else {
                    inserirAVL(aComparar.getDireita(), aInserir);
                }
                
            } else {
                // O nó já existe
            }
        }
    }

    public void verificarBalanceamento(NoAVL<T> atual) {
        setBalanceamento(atual);
        int balanceamento = atual.getBalanceamento();

        if (balanceamento == -2) {
            if (altura(atual.getEsquerda().getEsquerda()) >= altura(atual.getEsquerda().getDireita())) {
                atual = rotacaoDireita(atual);
            } else {
                atual = duplaRotacaoEsquerdaDireita(atual);
            }
        } else if (balanceamento == 2) {
            if (altura(atual.getDireita().getDireita()) >= altura(atual.getDireita().getEsquerda())) {
                atual = rotacaoEsquerda(atual);
            } else {
                atual = duplaRotacaoDireitaEsquerda(atual);
            }
        }

        if (atual.getPai() != null) {
            verificarBalanceamento(atual.getPai());
        } else {
            this.raiz = atual;
        }
    }

    public void remover(T chave) {
        removerAVL(this.raiz, chave);
    }

    private void removerAVL(NoAVL<T> atual, T chave) {
        if (atual == null) {
            return;
        } else {
            if (atual.getChave().compareTo(chave) > 0) {
                removerAVL(atual.getEsquerda(), chave);
            } else if (atual.getChave().compareTo(chave) < 0) {
                removerAVL(atual.getDireita(), chave);
            } else if (atual.getChave().compareTo(chave) == 0) {
                removerNoEncontrado(atual);
            }
        }
    }

    public void removerNoEncontrado(NoAVL<T> aRemover) {
    	NoAVL<T> r;
        if (aRemover.getEsquerda() == null || aRemover.getDireita() == null) {
            if (aRemover.getPai() == null) {
                this.raiz = null;
                aRemover = null;
                return;
            }
            r = aRemover;
        } else {
            r = sucessor(aRemover);
            aRemover.setChave(r.getChave());
        }

        NoAVL<T> p;
        if (r.getEsquerda() != null) {
            p = r.getEsquerda();
        } else {
            p = r.getDireita();
        }

        if (p != null) {
            p.setPai(r.getPai());
        }

        if (r.getPai() == null) {
            this.raiz = p;
        } else {
            if (r == r.getPai().getEsquerda()) {
                r.getPai().setEsquerda(p);
            } else {
                r.getPai().setDireita(p);
            }
            verificarBalanceamento(r.getPai());
        }
        r = null;
    }

    private NoAVL<T> rotacaoEsquerda(NoAVL<T> inicial) {
    	NoAVL<T> direita = inicial.getDireita();
        direita.setPai(inicial.getPai());

        inicial.setDireita(direita.getEsquerda());
        if (inicial.getDireita() != null) {
            inicial.getDireita().setPai(inicial);
        }

        direita.setEsquerda(inicial);
        inicial.setPai(direita);

        if (direita.getPai() != null) {
            if (direita.getPai().getDireita() == inicial) {
                direita.getPai().setDireita(direita);
            } else if (direita.getPai().getEsquerda() == inicial) {
                direita.getPai().setEsquerda(direita);
            }
        }

        setBalanceamento(inicial);
        setBalanceamento(direita);

        return direita;
    }

    private NoAVL<T> rotacaoDireita(NoAVL<T> inicial) {
    	NoAVL<T> esquerda = inicial.getEsquerda();
        esquerda.setPai(inicial.getPai());

        inicial.setEsquerda(esquerda.getDireita());
        if (inicial.getEsquerda() != null) {
            inicial.getEsquerda().setPai(inicial);
        }

        esquerda.setDireita(inicial);
        inicial.setPai(esquerda);

        if (esquerda.getPai() != null) {
            if (esquerda.getPai().getDireita() == inicial) {
                esquerda.getPai().setDireita(esquerda);
            } else if (esquerda.getPai().getEsquerda() == inicial) {
                esquerda.getPai().setEsquerda(esquerda);
            }
        }

        setBalanceamento(inicial);
        setBalanceamento(esquerda);

        return esquerda;
    }

    private NoAVL<T> duplaRotacaoEsquerdaDireita(NoAVL<T> inicial) {
        inicial.setEsquerda(rotacaoEsquerda(inicial.getEsquerda()));
        return rotacaoDireita(inicial);
    }

    private NoAVL<T> duplaRotacaoDireitaEsquerda(NoAVL<T> inicial) {
        inicial.setDireita(rotacaoDireita(inicial.getDireita()));
        return rotacaoEsquerda(inicial);
    }

    public NoAVL<T> sucessor(NoAVL<T> q) {
        if (q.getDireita() != null) {
        	NoAVL<T> r = q.getDireita();
            while (r.getEsquerda() != null) {
                r = r.getEsquerda();
            }
            return r;
        } else {
        	NoAVL<T> p = q.getPai();
            while (p != null && q == p.getDireita()) {
                q = p;
                p = q.getPai();
            }
            return p;
        }
    }

    private int altura(NoAVL<T> atual) {
        if (atual == null) {
            return -1;
        }

        if (atual.getEsquerda() == null && atual.getDireita() == null) {
            return 0;
        } else if (atual.getEsquerda() == null) {
            return 1 + altura(atual.getDireita());
        } else if (atual.getDireita() == null) {
            return 1 + altura(atual.getEsquerda());
        } else {
            return 1 + Math.max(altura(atual.getEsquerda()), altura(atual.getDireita()));
        }
    }

    private void setBalanceamento(NoAVL<T> no) {
        no.setBalanceamento(altura(no.getDireita()) - altura(no.getEsquerda()));
    }

    public final ArrayList<NoAVL<T>> inorder() {
        ArrayList<NoAVL<T>> ret = new ArrayList<NoAVL<T>>();
        inorder(raiz, ret);
        return ret;
    }

    final protected void inorder(NoAVL<T> no, ArrayList<NoAVL<T>> lista) {
        if (no == null) {
            return;
        }
        inorder(no.getEsquerda(), lista);
        lista.add(no);
        inorder(no.getDireita(), lista);
    }
}
