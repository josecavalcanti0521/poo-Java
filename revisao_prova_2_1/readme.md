***“Pacotes são grupos de classes relacionadas e é um recurso que ajuda a organizar o código.
Comandos/palavras-chave envolvidos neste recurso de pacotes são: package, import, 'java -d', jar e interface.
Informe verdadeiro ou falso e justifique.”***

✅ Resposta correta: FALSO

Justificativa:
Os comandos e palavras-chave usados para trabalhar com pacotes em Java são apenas:

package

import

As palavras jar, java -d e interface não fazem parte do mecanismo de pacotes.
Elas pertencem a outros recursos da linguagem (JAR é empacotamento, interface é OO, java -d é comando da JVM).

***
“Uma interface em Java é um recurso que no seu interior contém somente métodos abstratos.
Ela serve para que classes baseadas nessa interface implementem esses métodos para fins específicos.
Para utilizar uma interface devemos utilizar o comando implements que permite referenciar apenas uma interface.
Informe verdadeiro ou falso e justifique.”***

✅ Resposta correta para Java 6: FALSO (tem dois erros)

Justificativa:

No Java 6, uma interface realmente só contém métodos abstratos — isso é verdadeiro.

Mas a frase diz que uma classe só pode implementar uma interface — isso é falso.

***“Explique qual a função do ‘g’ no trecho de código abaixo:”***
```
public void paint(Graphics g)
{
    g.comando();
}
```

O parâmetro g é um objeto da classe Graphics, enviado pelo sistema para que o método paint possa desenhar na tela.
Ele representa o contexto gráfico onde você faz:

- desenhos, textos, formas, cores

***“O tratamento de exceção, na ciência da computação, é o mecanismo responsável pelo tratamento da ocorrência de condições que alteram o fluxo normal da execução de programas de computadores.
Cabe ao programador lançar a exceção para que ela seja tratada.
Informe verdadeiro ou falso e justifique.”***

✅ Resposta correta: FALSO
Justificativa:

O tratamento de exceções realmente é o mecanismo que lida com situações anormais na execução do programa — isso está correto.

Porém, a frase “cabe ao programador lançar a exceção para que ela seja tratada” está incorreta.

Uma exceção pode ser lançada pelo sistema, pelo Java, ou pelo programador.

O programador não é obrigado a lançar a exceção — ele é obrigado a tratar exceções verificadas (checked exceptions), usando try/catch ou propagando com throws.

Portanto, como a afirmação contém erro, o item é falso.

***“Às vezes necessita-se de executar um programa em subtarefas, executando independentemente.
Cada uma destas subtarefas independentes é chamada de thread, e são programadas como se cada thread fosse executada em um CPU diferente.
O recurso de concorrência, como as threads são independentes, não permite portanto controle destas threads para que funcionem uma em função da outras.
Informe verdadeiro ou falso e justifique.”***

✅ Resposta correta: FALSO
Justificativa:

A explicação sobre threads está parcialmente correta, porém a frase final está errada:

“o recurso de concorrência [...] não permite controle destas threads para que funcionem uma em função das outras.”

Isso é falso porque:

Em Java é totalmente possível controlar a execução das threads entre si.

Podemos usar:

join() para esperar outra thread terminar

synchronized para evitar corrida crítica

locks, semáforos e monitores

comunicação entre threads (wait/notify)

Ou seja, existe controle e coordenação entre threads.

Portanto, a afirmação é falsa.

***“Explique qual a relação entre os métodos: main(), Applet.paint() e o Thread.run()?”***

Resposta correta:

Os três métodos têm em comum o fato de serem pontos de entrada chamados pelo sistema, e não diretamente pelo programador.

✔️ main()

É o ponto de entrada de uma aplicação Java normal.

Quem chama é a JVM.

✔️ Applet.paint()

É chamado automaticamente pelo sistema gráfico sempre que a janela precisa ser redesenhada.

O programador nunca chama manualmente.

✔️ Thread.run()

Define o código que será executado pela thread.

O programador chama start(), e a JVM chama run() internamente.

Resumo da relação

Todos os três métodos são:

- executados automaticamente pelo sistema ou JVM,
- não são chamados diretamente pelo programador (exceto em casos não recomendados, como thread.run()),
- e representam pontos de início de execução em diferentes contextos (programas, applets e threads).