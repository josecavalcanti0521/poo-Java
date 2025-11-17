package revisao_prova_2_1.quadrado_piramide;

import java.util.Scanner;

public abstract class LerPiramide {
    public static void main(String[] args) {
        Piramide p = new Piramide(5, 2);

        Scanner sc = new Scanner(System.in);

        while(p.getLado() != 0) {
            System.out.print("Digite a altura: ");
            p.setAltura(sc.nextDouble());

            p.mostrarDados();

            System.out.print("Digite o lado: ");
            p.setLado(sc.nextDouble());

            sc.close();
        }
    }
}
