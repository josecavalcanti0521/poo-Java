import java.util.Scanner;

public class SomaPares {
    public static String somaPares(int n) {
        int digito;
        int soma = 0;
        String str = "";
        String result;

        while(n != 0) {
            digito = n % 10;

            if(digito % 2 == 0) {
                soma += digito;

                if(str.equals("")) {
                    str += digito;
                } else {
                    str = digito + " + " + str;
                }
            }

            n /= 10;
        }

        result = str + " = " + soma;

        return result;
    }

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Soma pares");

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        while(n != 0) {
           System.out.println(somaPares(n));

            System.out.print("Digite um número: ");
            n = sc.nextInt();
        }

        sc.close();
    }
}
