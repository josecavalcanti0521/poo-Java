package revisao_prova_2.aluno;

import java.util.Scanner;

public class LerAluno {
    public static void main(String[] args) {
        Aluno alunoMenorMedia = new Aluno();
        Aluno alunoMaiorMedia = new Aluno();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        Aluno alunos[] = new Aluno[sc.nextInt()];

        for(int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno(); // Eu já falei, instância cada aluno do vetor POH* dentro do for KRL

            System.out.print("Digite o codigo do aluno: ");
            alunos[i].codigo = sc.nextInt();

            System.out.print("Digite o nome do aluno: ");
            alunos[i].nome = sc.next();

            System.out.print("Digite a nota1 do aluno: ");
            alunos[i].nota1 = sc.nextFloat();

            System.out.print("Digite a nota2 do aluno: ");
            alunos[i].nota2 = sc.nextFloat();

            System.out.print("Digite a nota3 do aluno: ");
            alunos[i].nota3 = sc.nextFloat();

            if(i == 0) {
                alunoMenorMedia = alunos[i];
                alunoMaiorMedia = alunos[i];
            }

            if(alunoMenorMedia.media() > alunos[i].media()) {
                alunoMenorMedia = alunos[i];
            }

            if(alunoMaiorMedia.media() < alunos[i].media()) {
                alunoMaiorMedia = alunos[i];
            }
        }

        System.out.println("Codigo - Nome - Nota1 - Nota2 - Nota3 - Media");
        for(int i = 0; i < alunos.length; i++) {
            System.err.println(alunos[i].codigo + " " + alunos[i].nota1 + " " + alunos[i].nota2 + " " + alunos[i].nota3 + " " + alunos[i].media());
        }

        System.out.println("O aluno com menor media foi " + alunoMenorMedia.nome + " com " + alunoMenorMedia.media());
        System.out.println("O aluno com maior media foi " + alunoMaiorMedia.nome + " com " + alunoMaiorMedia.media());

        sc.close();
    }
}
