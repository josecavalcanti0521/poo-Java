package revisao_prova_2.controle_populacao;

import java.util.Scanner;

public class LerCidade {
    public static void main(String[] args) {
        int somaPopulacoes = 0;
        float densidadeDemograficaIdeal;
        Scanner sc = new Scanner(System.in);
        Cidade cidadeMaiorDensidadeDemografica = new Cidade();

        System.out.print("Digite a densidade demográfica ideal: ");
        densidadeDemograficaIdeal = sc.nextFloat();

        System.out.print("Digite a quantidade de cidades: ");
        Cidade cidades[] = new Cidade[sc.nextInt()];

        for(int i = 0; i < cidades.length; i++) {
            cidades[i] = new Cidade(); // INSTANCIA DENTRO DO FOR POHA

            System.out.print("Digite o codigo da cidade: ");
            cidades[i].codigo = sc.nextInt();

            System.out.print("Digite a descricao da cidade: ");
            cidades[i].descricao = sc.next();

            System.out.print("Digite a populacao da cidade: ");
            cidades[i].populacao = sc.nextInt();

            System.out.print("Digite a area da cidade: ");
            cidades[i].area = sc.nextFloat();

            somaPopulacoes += cidades[i].populacao;

            if(i == 0) {
                cidadeMaiorDensidadeDemografica = cidades[i];
            }

            if(cidadeMaiorDensidadeDemografica.densidadeDemografica() < cidades[i].densidadeDemografica()) {
                cidadeMaiorDensidadeDemografica = cidades[i];
            }
        }
        
        for(int i = 0; i < cidades.length; i++) {
            System.out.println("Codigo = " + cidades[i].codigo);
            System.out.println("Descrição = " + cidades[i].descricao);
            System.out.println("Populaçao = " + cidades[i].populacao);
            System.out.println("Area = " + cidades[i].area);
            System.out.println("Densidade = " + cidades[i].densidadeDemografica());
            System.out.println("Ideal = " + cidades[i].densidadeIdeal(densidadeDemograficaIdeal));
            
        }

        System.out.println("Soma da populaçoes = " + somaPopulacoes);
        System.out.println("Maior densidade demográfica = " + cidadeMaiorDensidadeDemografica.densidadeDemografica() + " habitantes/km² da cidade " + cidadeMaiorDensidadeDemografica.codigo + " " + " " + cidadeMaiorDensidadeDemografica.descricao);

        sc.close();
    } 
}
