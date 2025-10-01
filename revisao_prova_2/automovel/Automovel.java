package revisao_prova_2.automovel;

public class Automovel {
    int chassi;
    String marca;
    String modelo;
    int capacidadeTanque;
    int quantidadeAtualLitrosTanque;
    int consumo;

    int consumoFinal(int distancia) {
        return (this.capacidadeTanque - distancia / this.consumo);
    }
}
