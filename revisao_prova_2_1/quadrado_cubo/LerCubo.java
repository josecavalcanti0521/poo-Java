package revisao_prova_2_1.quadrado_cubo;

import java.util.Scanner;

public class LerCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cubo c = new Cubo(5);

        c.mostrarDados();

        while(c.getLado() != 0) {
            c.mostrarDados();

            System.out.print("Digite o lado: ");
            c.setLado(sc.nextDouble());
        }

        sc.close();
    }
}
