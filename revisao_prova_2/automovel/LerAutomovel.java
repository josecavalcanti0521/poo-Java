package revisao_prova_2.automovel;

import java.util.Scanner;

public class LerAutomovel {
    public static void main(String[] args) {
        Automovel automovelMaisConsumidor = new Automovel();
        int distancia;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de automoveis: ");
        
        Automovel automoveis[] = new Automovel[sc.nextInt()];

        System.out.print("Digite a distância percorrida: ");
        distancia = sc.nextInt();

        for(int i = 0; i < automoveis.length; i++) {
            automoveis[i] = new Automovel();

            System.out.print("Digite o chassi: ");
            automoveis[i].chassi = sc.nextInt();

            System.out.print("Digite a marca: ");
            automoveis[i].marca = sc.next();

            System.out.print("Digite o modelo: ");
            automoveis[i].modelo = sc.next();

            System.out.print("Digite a capacidade do tanque: ");
            automoveis[i].capacidadeTanque = sc.nextInt();

            System.out.print("Digite a quantidade atual de litros do tanque: ");
            automoveis[i].quantidadeAtualLitrosTanque = sc.nextInt();

            System.out.print("Digite o consumo: ");
            automoveis[i].consumo = sc.nextInt();
            
            if(i == 0) {
                automovelMaisConsumidor = automoveis[i];
            }

            if(automovelMaisConsumidor.consumoFinal(distancia) < automoveis[i].consumoFinal(distancia)) {
                automovelMaisConsumidor = automoveis[i];
            }
        }

        System.out.println("Automovel mais consumidor -> ");
        System.err.println("Chassi = " + automovelMaisConsumidor.chassi);
        System.err.println("Marca = " + automovelMaisConsumidor.marca);
        System.err.println("Modelo = " + automovelMaisConsumidor.modelo);
        System.err.println("Capacidade do tanque = " + automovelMaisConsumidor.capacidadeTanque);
        System.err.println("Consumo = " + automovelMaisConsumidor.consumo);
        System.err.println("Consumo final = " + automovelMaisConsumidor.consumoFinal(distancia));

        sc.close();
    }
}
