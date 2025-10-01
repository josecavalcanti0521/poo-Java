package revisao_prova_2.candidatos;

import java.util.Scanner;

public class LerCandidato {
    public static void main(String[] args) {
        int somaVotos = 0;
        int media;
        int qtdMinimaVotos;
        Candidato candidatoMaisVotado = new Candidato();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de candidatos: ");
        Candidato candidatos[] = new Candidato[sc.nextInt()];

        System.out.print("Digite a quantidade mínima de votos: ");
        qtdMinimaVotos = sc.nextInt();

        for(int i = 0; i < candidatos.length; i++) {
            candidatos[i] = new Candidato();

            System.out.print("Digite o número do candidato: ");
            candidatos[i].numero = sc.nextInt();

            System.out.print("Digite o nome do candidato: ");
            candidatos[i].nome = sc.next();

            System.out.print("Digite a quantidade de votos do candidato: ");
            candidatos[i].votos = sc.nextInt();

            if(i == 0) {
                candidatoMaisVotado = candidatos[i];
            }

            if(candidatoMaisVotado.votos < candidatos[i].votos) {
                candidatoMaisVotado = candidatos[i];
            }

            somaVotos += candidatos[i].votos;
        }

        media = somaVotos / candidatos.length;

        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("Numero = " + candidatos[i].numero);
            System.out.println("Nome = " + candidatos[i].nome);
            System.out.println("Votos = " + candidatos[i].votos);
            System.out.println("Classificação = " + candidatos[i].classificado(qtdMinimaVotos));
            System.out.println("------------------------------");
        }

        System.out.println("A soma dos votos = " + somaVotos);
        System.out.println("Média dos votos = " + media);
        System.out.println("Mais votado " + candidatoMaisVotado.nome + " com " + candidatoMaisVotado.votos);

        sc.close();
    }
}
