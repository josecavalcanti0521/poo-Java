package revisao_prova_2_1.triangulo_prisma;

import java.util.Scanner;

public class LerPrismaTriangular {
    public static void main(String[] args) {
        PrismaTriangular pt = new PrismaTriangular(2, 2, 2);

        Scanner sc = new Scanner(System.in);

        while(pt.getLado() != 0) {
            pt.mostrarDados();

            System.out.println("Digite o lado: ");
            pt.setLado(sc.nextDouble());

            System.out.println("Digite a altura: ");
            pt.setAltura(sc.nextDouble());

            System.out.println("Digite o apotema: ");
            pt.setApotema(sc.nextDouble());

        }
        sc.close();
    }
}
