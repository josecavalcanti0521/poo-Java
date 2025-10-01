package revisao_prova_2.consumo;

public class Automovel {
    int codigo;
    String descricao;
    int capacidadeTanqueLitros;
    float litrosAbastecidos;
    float kilometragemRodadaKm;

    float consumo() {
        return (kilometragemRodadaKm / litrosAbastecidos);
    }

    float consumo(float litrosAbastecidos) {
        return (this.kilometragemRodadaKm / litrosAbastecidos);
    }

    String classificacao() {
        String result;

        if(consumo() < 10) {
            result = "Ruim";
        } else if(consumo() >= 10 && consumo() <= 13) {
            result = "Normal";
        } else {
            result = "Ótimo";
        }

        return result;
    }

    void mostrarDados() {
        System.out.println("Codigo = " + codigo);
        System.out.println("Descrição = " + descricao);
        System.out.println("Capacidade do tanque = " + capacidadeTanqueLitros);
        System.out.println("Litros abastecidos = " + litrosAbastecidos);
        System.out.println("Kilometragem rodada = " + kilometragemRodadaKm);
        System.out.println("Consumo = " + this.consumo());
        System.out.println("Classificação = " + this.classificacao());
    }
}
