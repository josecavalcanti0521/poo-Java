package cubo;
import java.util.Scanner;

public class LerCubo {
    public static void main(String[] args) {
        Cubo cubo = new Cubo();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a aresta do cubo: ");
        cubo.a = sc.nextInt();

        while(cubo.a != 0) {
            cubo.mostrarDados();

            System.out.print("Digite a aresta do cubo: ");
            cubo.a = sc.nextInt();
        }

        sc.close();
    }
}
