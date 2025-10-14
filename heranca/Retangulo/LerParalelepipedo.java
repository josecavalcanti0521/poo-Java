package heranca.Retangulo;

import java.util.Scanner;

public class LerParalelepipedo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Paralelepipedo p1 = new Paralelepipedo();
        Paralelepipedo p2 = new Paralelepipedo(5, 8, 12);

        p2.mostrarDados();

        System.out.print("Informe a base -> ");
        p1.setLadoA(sc.nextFloat());

        while(p1.getLadoA() != 0) {
            System.out.print("Informe a largura -> ");
            p1.setLadoB(sc.nextFloat());

            System.out.print("Informe a altura -> ");
            p1.setLadoC(sc.nextFloat());

            p1.mostrarDados();

            System.out.print("Informe a base -> ");
            p1.setLadoA(sc.nextFloat());
        }

        sc.close();
    }
}
