package revisao_prova_2.discentes;

public class Discente {
    int cpf;
    String nome;
    int idInstituicao;
    int idCurso;
    String dataNasc;
    int cargaHorariaCumprida;
    int cargaHorariaTotal;

    float percentual() {
        // LEMBRA POHA, DIVISAO POR INTEIRO QUANDO QUER FAZER PORCETAGEM, TEM QUE FAZER O CASTING
        return (((float) cargaHorariaCumprida / cargaHorariaTotal) * 100);
    }

    float percentual(int cargaHorariaAluno) {
        return (((float)cargaHorariaAluno / cargaHorariaTotal) * 100);
    }

    void mostrarDados() {
        System.out.println("CPF = " + cpf);
        System.out.println("Nome = " + nome);
        System.out.println("Identificação da instituição = " + idInstituicao);
        System.out.println("Identificação do curso = " + idCurso);
        System.out.println("Data de nascimento = " + dataNasc);
        System.out.println("Carga horária cumprida = " + cargaHorariaCumprida);
        System.out.println("Carga horária total = " + cargaHorariaTotal);
    }
}
