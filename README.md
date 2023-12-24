# Estrutura-de-Dados
Repositório para fins didáticos contendo as Estruturas de Dados mais utilizados em Java. 
As estruturas de dados podem ser categorizadas em dois tipos principais: lineares e não-lineares. Em resumo, a diferença fundamental entre estruturas de dados lineares e não lineares está na organização dos elementos. Enquanto as estruturas lineares seguem uma ordem sequencial, as estruturas não lineares permitem relações mais complexas e flexíveis entre os elementos.

-------------------------------------------------------------------------------------------------
1. Estruturas de Dados Lineares: Os elementos são organizados em uma sequência linear, ou seja, cada elemento tem um predecessor e um sucessor, com exceção do primeiro e do último elemento. A principal característica é a ordem linear dos elementos, facilitando a manipulação e a recuperação sequencial dos dados.

➜ Exemplos que estão nesse repositório: Listas, filas e pilhas são exemplos comuns de estruturas de dados lineares.


2. Estruturas de Dados Não Lineares: Os elementos não estão organizados em uma sequência linear. Em vez disso, os elementos podem ter vários predecessores e sucessores, formando relações mais complexas. A principal característica é a presença de relações mais complexas entre os elementos, o que permite representar de forma eficiente situações onde a relação entre os dados não é estritamente sequencial.

➜ Exemplos que estão nesse repositório: Árvores e grafos são exemplos comuns de estruturas de dados não lineares. Em árvores, os elementos têm um pai e zero ou mais filhos, enquanto em grafos, os elementos podem ter conexões arbitrárias uns com os outros.

-------------------------------------------------------------------------------------------------

● Sobre TAD Lineares:

➔ Listas:
Estrutura de dados em que os elementos são dispostos de forma linear.
Como um Tipo Abstrato de Dados (TAD), uma lista baseada em vetores S tem os seguintes métodos:

>> get(i) - retorna o elemento de S com índice i;
>> set(i,e) - substitui por e e retorna o elemento com índice i;
>> add(i,e) - substitui por e e retorna o elemento com índice i;
>> remove(i) - remove de S o elemento de índice i.


➔ Pilhas:
Estrutura de dados simples, porém muioto importantes onde o útlimo elemento que entra é o primeiro a sair, "LIFO". Formalmente, uma pilha S é um tipo abstrato de dados (TAD) que suporta dois métodos:

>> push(e) - Insere o elemento e no topo da pilha;

>> pop() - Remove o elemento no topo da pilha e o retorna; Ocorre um erro se a pilha estiver vazia.

Adicionalmente, inclui os seguintes métodos:

>> size() - Retorna o número de elementos da pilha;

>> isEmpty() - Retorna um booleano indicando se a pilha está vazia;

>> top() - Retorna o elemento no topo da pilha, sem retirá-lo; Ocorre um erro se a pilha estiver vazia.


➔ Filas:
Formalmente, o tipo abstrato de dados Fila, define uma coleção de objetos em uma sequência. O 1º Elemento que entra é o 1ºElemento a sair, "FIFO", na qual o acesso aos elementos e sua remoção são restritos ao primeiro elemento da sequência, chamada de fim da fila. Possui dois métodos fundamentais:

>> enqueue(e) - insere o elemento e no fim da fila;

>> dequeue() - retira e retorna o onjeto da frente da fila. Ocorre um erro se a fila estiver vazia.

Adicionalmente, inclui os seguintes métodos:

>> size()-  Retorna o número de objetos na fila;

>> isEmpty() - Retorna um booleano indicando se a fila está vazia;

>> front() - Retorna, mas não remove, o objeto na frente da fila. Ocorre um erro se a fila estiver vazia.




● Sobre TAD Não-Lineares:

➔ Arvores:
É uma estrutura de dados de árvore especial que possui propriedades que facilitam a busca eficiente e a ordenação de elementos. A característica fundamental de uma árvore binária de busca é que, para cada nó na árvore, os valores em seus subárvores à esquerda são menores do que o valor no próprio nó, e os valores em suas subárvores à direita são maiores:

>> insert(e) - Adiciona um novo elemento à árvore mantendo a propriedade de ordenação.

>> remove(e) - Remove um elemento da árvore mantendo a propriedade de ordenação.

>> getNo(e) - Procura por um elemento específico na árvore.

>> inOrder() - Existem várias maneiras de percorrer os elementos de uma árvore binária de busca, incluindo travessias em ordem (in-order), pré-ordem (pre-order) e pós-ordem (post-order).


➔ Grafo:
É uma forma de árvore binária de busca balanceada. Ela foi projetada para manter automaticamente o equilíbrio durante as operações de inserção e remoção, garantindo que a altura da árvore permaneça logarítmica em relação ao número de elementos. 

● Fator de Balanceamento: Numa árvore AVL devemos ter como FB de cada nó entre [-1, 0, 1]
|hD -hE| <= 1  ➜  hD = Altura da subárvore à direita do nó Pai| hE = Altura da subárvore à esquerda do nó Pai.

FB = 0, significa hD == hE, ou seja, a árvore está balanceada!

FB = +1, +2 ou +(...), significa que hD > hE, ou seja, a árvore AVL está desbalanceada à direita!

FB = -1, -2 ou -(...), significa que hD < hE, ou seja, a árvore AVL está desbalanceada à esquerda!

