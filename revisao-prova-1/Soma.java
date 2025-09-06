import java.util.Scanner;

public class Soma {

    public static String soma(int n) {
        String str = "";
        String result;
        int soma = 0;
        int digito;

        while(n != 0) {
            digito = n % 10;

            soma += digito;

            str =  digito + " + " + str;
            
            n /= 10;
        }

        result = str + " = " + soma;

        return result;
    }

    public static void main(String[] args) {
        int n1;

        System.out.println("Soma números");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n1 = sc.nextInt();

        while (n1 != 0) {
            System.out.println(soma(n1));

            System.out.print("Digite um número: ");
            n1 = sc.nextInt();
        }

        sc.close();
    }
}
