import java.util.*;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Calcula Hipotenusa");
        System.out.print("Digite um cateto -> ");
        x = sc.nextInt();
        System.out.print("Digite outro cateto -> ");
        y = sc.nextInt();

        System.out.println("A hipotenusa de um triangulo é igual " +
        Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));

        sc.close();
    }
}
