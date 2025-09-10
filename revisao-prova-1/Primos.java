import java.util.Scanner;

public class Primos {
    public static String somaPrimos(int n1) {
        String resultado = "";
        int digito;
        int soma = 0;

        while(n1 != 0) {
            digito = n1 % 10;

            if(digito == 2 || digito == 3 || digito == 5 || digito == 7) {
                if(resultado.equals("")) {
                    resultado += digito;
                } else {
                    resultado = digito + " + " + resultado;
                }
                soma += digito;
            }

            n1 /= 10;
        }

        return resultado + " = " + soma;
    }

    public static void main(String[] args) {
        int n1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite n1: ");
        n1 = sc.nextInt();

        while(n1 != 0) {
            System.out.println(somaPrimos(n1));

            System.out.print("Digite n1: ");
            n1 = sc.nextInt();
        }

        sc.close();
    }
}
