package revisao_prova_2.controle_populacao;

public class Cidade {
    int codigo;
    String descricao;
    int populacao;
    float area;

    float densidadeDemografica() {
        return (populacao / area);
    }

    float densidadeDemografica(float area) {
        return (populacao / area );
    }

    String densidadeIdeal(float densidade) {
        return (densidade == this.densidadeDemografica() ? "Sim" : "Não");
    }

    void mostrarDados() {
        System.out.println("Codigo = " + codigo);
        System.out.println("Descrição = " + descricao);
        System.out.println("Populaçao = " + populacao);
        System.out.println("Area = " + area);
        System.out.println("Densidade demográfica = " + this.densidadeDemografica());
    }
}
