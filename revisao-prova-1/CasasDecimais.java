import java.util.Scanner;

public class CasasDecimais {
    public static String casasDecimais(int n) {
        int unidades = 0;
        int dezenas = 0;
        int centenas = 0;
        int milhares = 0;

        while(n != 0) {
            unidades++;

            n /= 10;
        }

        if(unidades >= 1) {
            dezenas = unidades - 1;
        } 
        if(unidades >= 3) {
            centenas = unidades - 2;
        } 
        if(unidades >= 4) {
            milhares = unidades - 3;
        }


        return "Número = " + n + ". Resposta: " + unidades + " unidade(s), " + dezenas + " dezena(s), " + centenas + " centena (s), " + milhares + " milhar(es)";
    }

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Soma pares");

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        while(n != 0) {
           System.out.println(casasDecimais(n));

            System.out.print("Digite um número: ");
            n = sc.nextInt();
        }

        sc.close();
    }
}
