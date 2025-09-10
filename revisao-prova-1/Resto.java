import java.util.Scanner;

public class Resto {
    public static String desmebraResto(int n1, int n2) {
        int digitoNum1;
        int digitoNum2;
        int resto;
        String resultado = "";

        while(n1 != 0 && n2 != 0) {
            digitoNum1 = n1 % 10;
            digitoNum2 = n2 % 10;

            resto = digitoNum1 % digitoNum2;
            resultado = resto + resultado;

            n1 /= 10;
            n2 /= 10;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite n1: ");
        n1 = sc.nextInt();

        while(n1 != 0) {
            System.out.print("Digite n2: ");
            n2 = sc.nextInt();

            System.out.println(desmebraResto(n1, n2));

            System.out.print("Digite n1: ");
            n1 = sc.nextInt();
        }

        sc.close();
    }
}
