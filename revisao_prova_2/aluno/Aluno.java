package revisao_prova_2.aluno;

public class Aluno {
    int codigo;
    String nome;
    float nota1;
    float nota2;
    float nota3;

    float media() {
        return ((nota1 + nota2 + nota3) / 3);
    }

    float media(int peso1,int peso2,int peso3) {
        return ((nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3));
    }
}
