import java.util.Scanner;

public class ConsumoCarro {
    public static void main(String[] args) {
        float km1, km2, litros, preco, capacidade, quilometragem, consumo, autonomia, custoViagem;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o km1: ");
        km1 = sc.nextFloat();

        System.out.print("Informe o km2: ");
        km2 = sc.nextFloat();

        System.out.print("Informe o número de litros gastos: ");
        litros = sc.nextFloat();

        System.out.print("Informe o preço do combustível: ");
        preco = sc.nextFloat();

        System.out.print("Informe a capacidade do tanque: ");
        capacidade = sc.nextFloat();

        quilometragem = km2 - km1;
        consumo = quilometragem / litros;
        autonomia = consumo * capacidade;
        custoViagem = litros * preco;

        System.out.println(
            "Quilometragem: " + quilometragem + "\nConsumo: " + consumo + "\nAutonomia: " + autonomia + "\nCusto da viagem: " + custoViagem
        );

        sc.close();
    }
}
