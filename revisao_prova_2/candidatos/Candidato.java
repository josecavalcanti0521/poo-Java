package revisao_prova_2.candidatos;

public class Candidato {
    int numero;
    String nome;
    int votos;

    String classificado(int votosMinimos) {
        String result;

        if(votos >= votosMinimos) {
            result = "Sim, excedeu " + (votos - votosMinimos) + " voto(s)";
        } else {
            result = "Não, faltou " + (votos - votosMinimos) + " voto(s)";
        }

        return result;
    }

    String classificado() {
        String result;

        if(votos >= 10) {
            result = "Sim, excedeu " + (votos - 10) + " voto(s)";
        } else {
            result = "Não, faltou " + (10 - votos) + " voto(s)";
        }

        return result;
    }

    void mostrarDados() {
        System.out.println("Numero " + numero);
        System.out.println("Nome " + nome);
        System.out.println("Quantidade de votos " + votos);
    }
}
