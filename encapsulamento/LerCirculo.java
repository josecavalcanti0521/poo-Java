package encapsulamento;

import java.util.Scanner;

public class LerCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        c1.setRaio(sc.nextInt());

        System.out.println("Raio: " + c1.getRaio());
        System.out.println("Area: " + c1.area());
        sc.close();
    }
}
