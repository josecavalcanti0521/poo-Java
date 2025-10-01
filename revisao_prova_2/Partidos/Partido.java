package revisao_prova_2.Partidos;

public class Partido {
    int codigo;
    String descricao;
    String presidente;
    int filiados;
    int assinaturas;

    boolean aprovado(int NumeroDeAssinaturasMinimas) {
        return this.assinaturas >= NumeroDeAssinaturasMinimas; 
    }

    String classificacao(int NumeroDeAssinaturasMinimas) {
        String result;
        int indice = (int) (this.assinaturas * 100.0) / NumeroDeAssinaturasMinimas;
        if(aprovado(NumeroDeAssinaturasMinimas)) {
            result = "Satisfatório";
        } else if(indice >= 75) {
            result = "Insatisfatório";
        } else if(indice >= 50) {
            result = "Ruim";
        } else if(indice >= 25) {
            result = "Muito ruim";
        } else {
            result = "Péssimo";
        }

        return result;
    }

    void mostrarDados() {
        System.out.println("Codigo = " + this.codigo);
        System.out.println("Descrição = " + this.descricao);
        System.out.println("Presidente = " + this.presidente);
        System.out.println("Filiados = " + this.filiados);
        System.out.println("Assinaturas = " + this.assinaturas);
    }
}
