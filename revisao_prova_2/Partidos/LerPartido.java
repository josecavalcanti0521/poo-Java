package revisao_prova_2.Partidos;

import java.util.Scanner;

public class LerPartido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaFiliadosPartidosAprovados = 0;
        Partido maiorNumeroFiliacao = new Partido();
        Partido menorNumeroFiliacao = new Partido();

        System.out.print("Digite a quantidade de partidos: ");
        Partido partidos[] = new Partido[sc.nextInt()];

        for(int i = 0; i < partidos.length; i++) {
            partidos[i] = new Partido();

            System.out.print("Digite o codigo do partido: ");
            partidos[i].codigo = sc.nextInt();

            System.out.print("Digite o presidente do partido: ");
            partidos[i].presidente = sc.next();

            System.out.print("Digite o nome do partido: ");
            partidos[i].descricao = sc.next();

            System.out.print("Digite a quantidade filiados do partido: ");
            partidos[i].filiados = sc.nextInt();

            System.out.print("Digite a quantidade de assinaturas do partido: ");
            partidos[i].assinaturas = sc.nextInt();

            if(i == 0) {
                menorNumeroFiliacao = partidos[i];
                maiorNumeroFiliacao = partidos[i];
            }

            if(partidos[i].aprovado(500000)) {
                somaFiliadosPartidosAprovados += partidos[i].filiados;
            }

            if(partidos[i].filiados > maiorNumeroFiliacao.filiados) {
                maiorNumeroFiliacao = partidos[i];
            }

            if(partidos[i].aprovado(500000) && partidos[i].filiados < menorNumeroFiliacao.filiados) {
                menorNumeroFiliacao = partidos[i];
            }
        }

        for(int i = 0; i < partidos.length; i++) {
            System.out.println("Nome: " + partidos[i].descricao);
            System.out.println("Presidente: " + partidos[i].presidente);
            System.out.println("Filiados: " + partidos[i].filiados);
            System.out.println("Assinaturas: " + partidos[i].assinaturas);
            System.out.println("Aprovado: " + partidos[i].aprovado(500000));
            System.out.println("Classificao: " + partidos[i].classificacao(500000));
            System.out.println("-----------------------------------------------");
        }

        System.out.println("Soma dos partidos Aprovados = " + somaFiliadosPartidosAprovados);
        System.out.println("Partido com o Maior Numero de filiação " + maiorNumeroFiliacao.descricao + " com " + maiorNumeroFiliacao.filiados);
        System.out.println("Partido Aprovado com o Menor Numero de filiação " + menorNumeroFiliacao.descricao + " com " + menorNumeroFiliacao.filiados);

        sc.close();
    }
}
