import java.util.Scanner;

public class Investimento {
    
    public static void main(String[] args) {
        int tempo, taxa;
        float capital;
        double a;
        System.out.println("Calcula o Montante a cada ano");

        Scanner sc = new Scanner(System.in);

        System.out.print("Capital: ");
        capital = sc.nextFloat();

        System.out.print("Texa anual (em %): ");
        taxa = sc.nextInt();

        System.out.print("Tempos (anos): ");
        tempo = sc.nextInt();

        for (int i = 1; i <= tempo; i++) {
            float aux = 1 + taxa / 100f;
            a = capital * Math.pow(aux, i);
            System.out.println("Montante no ano " + i + " = " + a);
        }

        sc.close();
    }

}
