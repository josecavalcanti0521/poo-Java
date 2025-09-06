import java.util.Scanner;

public class ImprimirNumeros {
    public static void main(String[] args) {
        int n, cont = 1, y= 1;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor para n: ");
        n = sc.nextInt();

        while(y != 0) {

            if(cont <= n) {
                System.out.print(cont);
    
                if(cont % 5 == 0) {
                    System.out.print("\n");
    
                }
                if(!(cont % 5 == 0)) {
                    System.out.print(", ");
                }

                if(cont % 10 == 0) {
                    System.out.print("Deseja exibir o resto dos numeros sim(1) não(0): ");
                    y = sc.nextInt();
                }
                if (cont == n) {
                    y = 0;
                }
            }

            cont++;
        }

        sc.close();
    }
}
