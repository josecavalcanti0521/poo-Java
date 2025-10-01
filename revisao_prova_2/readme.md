# Perguntas e Respostas Provas Antigas

"Na programação orientada a objetos, a sobrecarga de métodos significa ter vários métodos com nomes iguais mais assinaturas diferentes. A assinatura de um método é dada pela junção do seu nome e seus parâmetros de entrada. A ordem na passagem de parâmetros, não interfere na sobrecarga. Da mesma forma, o tipo de retorno não interfere na sobrecarga." Informe verdadeiro ou falso e justifique.

**R: A afirmação é Falsa porque a ORDEM dos tipos de parâmetros na lista MANTÉM a sobrecarga, pois gera assinaturas distintas.**

Considere o uso de vetor na Programação Orientada a Objeto na Linguagem Java. Quais são as diferenças para o uso de vetor numa linguagem imperativa clássica?

**R: As diferenças são que em POO, o vetor precisa ser instaciado em Java por exemplo com a palavra reservada new, e um vetor é um objeto portanto ele tem propriedades como por exemplo length que diz a respeito a quantidade de elementos em um vetor, ademais não precisa desalocar o vetor como por exemplo em C que utiliza o free() em Java a desalocação é feita pelo Garbage Collector.**

"Em programação orientada a objetos, chama-se instância de uma classe, um objeto cujo comportamento e estado são definidos pela classe. As instâncias de uma classe tem o mesmo conjunto de atributos, embora sejam diferentes quanto ao conteúdo desses atributos. Os métodos são definidos na classe e cada objeto recebe uma cópia destes." Informe verdadeiro ou falso e justifique.

**R: Falso, já que qada objeto não recebe um cópia dos métodos e sim uma referência, ou melhor um ponteiro, supondo que cada objeto recebe-se uma copia dos métodos da classe, uma classe tivesse 1000 métodos, toda vez que um novo objeto fosse instanciado teria que copiar os 1000 métodos em cada instância**

"Sobrecargar métodos significa ter vários atributos e métodos com nomes iguais mais assinaturas diferentes. O tipo de retorno não interfere na validação sintática da sobrecarga." Informe verdadeiro ou falso e justifique.

**R: Falso, O conceito de sobrecarga (Overloading) se aplica APENAS a métodos. Não existe sobrecarga para atributos (variáveis de classe). A inclusão de "atributos" torna a definição incorreta.**

Explique quais as vantagens em usar o recurso de sobrecarga de métodos na criação de classes.

**R: Existem diversas vantagens ao utilizar sobrecarga, por exemplo, quando temos um método que faz um cálculo com atributos da classe, mas queremos o mesmo cálculo só que recebendo os valores por parâmetros ao invés de utilizar os atributos, e tendo o mesmo resultado. Ademais, é de fácil entedimento quando observa-se a assinatura dos métodos, ou seja, de fácil compreensão**

"Podemos criar objetos a partir de classes. Esse processo é chamado instância. Quando um objeto é criado é feita uma cópia de toda a sua estrutura (a classe), tanto atributos, quanto métodos. O mesmo acontece com outros objetos criados a partir desta classe." Informe verdadeiro ou falso e justifique.

**R: Falso, visto que quando é feita uma instância, não é feita a cópia dos atributos e métodos da classe, já que a instância referencia os atributos e métodos da classe. Por exemplo, se a classe tivesse 1000 atributos e 1000 métodos, toda vez que houvesse uma instância séria copiado os 1000 atributos e 1000 métodos, tendo um desperdício de memória**