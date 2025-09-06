import java.util.Scanner;

public class SomaDivisores {
    public static String soma(int n1, int n2) {
        String resultado = "";
        String ret;
        int digito;
        int soma = 0;

        while(n1 != 0) {
            digito = n1 % 10;

            if (digito != 0) {
                if(n2 % digito == 0) {
                    soma += digito;
    
                    if(resultado.equals("")) {
                        resultado += digito;
                    } else {
                        resultado = resultado + " + " + digito;
                    }
                }
            }

            n1 /= 10;
        }

        ret = resultado + " = " + soma;

        return ret;
    }

    public static void main(String[] args) {
        int n1, n2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        while(n1 != 0) {
            System.out.print("Digite o segundo número: ");
            n2 = sc.nextInt();

            System.out.println(soma(n1, n2));

            System.out.print("Digite o primeiro número: ");
            n1 = sc.nextInt();
        } 

        sc.close();
    }
}
