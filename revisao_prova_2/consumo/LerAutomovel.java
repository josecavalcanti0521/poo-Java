package revisao_prova_2.consumo;

import java.util.Scanner;

public class LerAutomovel {
    public static void main(String[] args) {
        float totalLitrosAbastecidos = 0;
        Automovel autoMelhorConsumo = new Automovel();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de automoveis: ");
        Automovel automoveis[] = new Automovel[sc.nextInt()];

        for(int i = 0; i < automoveis.length; i++) {
            automoveis[i] = new Automovel();

            System.out.print("Digite o codigo do automovel: ");
            automoveis[i].codigo = sc.nextInt();

            System.out.print("Digite a descrição do automovel: ");
            automoveis[i].descricao = sc.next();

            System.out.print("Digite a capacida do tanque em litros do automovel: ");
            automoveis[i].capacidadeTanqueLitros = sc.nextInt();

            System.out.print("Digite a quantidade de litros abastecidos: ");
            automoveis[i].litrosAbastecidos = sc.nextFloat();

            System.out.print("Digite a kilometragem rodada do em KMs automovel: ");
            automoveis[i].kilometragemRodadaKm = sc.nextFloat();

            if(i == 0) {
                autoMelhorConsumo = automoveis[i];
            }

            if(automoveis[i].consumo() > autoMelhorConsumo.consumo()) {
                autoMelhorConsumo = automoveis[i];
            }

            totalLitrosAbastecidos += automoveis[i].litrosAbastecidos;
        }

        System.out.println("Total de litros abastecidos = " + totalLitrosAbastecidos);
        System.out.println("O melhor consumo foi " + autoMelhorConsumo.consumo(autoMelhorConsumo.litrosAbastecidos) + " do automovel " + autoMelhorConsumo.codigo + " - " + autoMelhorConsumo.descricao);

        sc.close();
    }
}
