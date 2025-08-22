import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        float x;
        int y;
        float media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        x = sc.nextFloat();

        System.out.print("Digite outro número: ");
        y = sc.nextInt();

        media = x / y;

        System.err.println("A média aritmética é " + media);

        sc.close();
    }
}
