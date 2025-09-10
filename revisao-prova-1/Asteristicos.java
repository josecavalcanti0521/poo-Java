import java.util.Scanner;

public class Asteristicos {
    public static String asterisc(int n1, int n2) {
        int digito;
        int soma;
        String resultado = "";

        while(n1 != 0) {
            digito = n1 % 10;

            soma = digito + n2;

            if(soma < 10) {
                resultado = soma + resultado;
            } else {
                resultado += "*";
            }

            n1 /= 10;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número um: ");
        n1 = sc.nextInt();

        while(n1 != 0) {
            System.out.print("Digite o número dois: ");
            n2 = sc.nextInt();

            System.out.println(asterisc(n1, n2));


            System.out.print("Digite o número um: ");
            n1 = sc.nextInt();
        }

        sc.close();
    }
}
