import java.util.Scanner;

public class MesesAno {
    public static String converter(int n) {
        String result;
        int anos;
        int meses;

        anos = n / 12;
        meses = n % 12;

        result = "Meses = " + n + " Equivale a " + anos + " ano(s) e " + meses + " mês(es)";

        return result;
    }

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Meses do ano");

        System.out.print("Digite um número de meses: ");
        n = sc.nextInt();

        while(n != 0) {
            System.out.println(converter(n));

            System.out.print("Digite um número de meses: ");
            n = sc.nextInt();
        }

        sc.close();
    }  
}
