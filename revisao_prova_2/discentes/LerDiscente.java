package revisao_prova_2.discentes;

import java.util.Scanner;

public class LerDiscente {
    public static void main(String[] args) {
        Discente melhorDiscente = new Discente();
        float media;
        float soma = 0;
        int cargaHoraria;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de discentes: ");
        Discente discentes[] = new Discente[sc.nextInt()];

        System.out.print("Digite a carga horaria: ");
        cargaHoraria = sc.nextInt();

        for(int i = 0; i < discentes.length; i++) {
            discentes[i] = new Discente(); // INSTANCIA DENTRO DO FOR CARALHO

            System.out.print("Digite o nome: ");
            discentes[i].nome = sc.next();

            System.out.print("Digite o CPF: ");
            discentes[i].cpf = sc.nextInt();

            System.out.print("Digite a carga horaria cumprida : ");
            discentes[i].cargaHorariaCumprida = sc.nextInt();

            System.out.print("Digite a carga horaria total: ");
            discentes[i].cargaHorariaTotal = sc.nextInt();

            System.out.print("Digite a identificação do curso: ");
            discentes[i].idCurso = sc.nextInt();

            System.out.print("Digite a identificação da instituição: ");
            discentes[i].idInstituicao = sc.nextInt();

            System.out.print("Digite a data de nascimento: ");
            discentes[i].dataNasc = sc.next();

            if(i == 0) {
                melhorDiscente = discentes[i];
            }

            if(melhorDiscente.percentual() < discentes[i].percentual()) {
                melhorDiscente = discentes[i];
            }

            soma += discentes[i].percentual();
        }

        for(int i = 0; i < discentes.length; i++) {
            System.out.println("CPF = " + discentes[i].cpf);
            System.out.println("Carga horaria aluno = " + discentes[i].cargaHorariaCumprida);
            System.out.println("Carga horaria total = " + discentes[i].cargaHorariaTotal);
            System.out.println("Percentual 1 = " + discentes[i].percentual());
            System.out.println("Percentual 2 = " + discentes[i].percentual(cargaHoraria));
            System.out.println("-------------------------------");
        }

        media = soma / discentes.length;

        System.out.println("A maior percentual cumprido foi do Alunos" + melhorDiscente.nome + " com " + melhorDiscente.percentual() + "%");
        System.out.println("Percentual médio de cumprimento " + media + "%");

        sc.close();
    }
}
