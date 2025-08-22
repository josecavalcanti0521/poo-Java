import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int x, y, resultado = 0;
        String opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora ===");
        System.out.println("Operações: +  -  *  /");

        System.out.print("Escolha uma operação: ");
        opcao = sc.nextLine();

        System.out.print("Informe x: ");
        x = sc.nextInt();

        System.out.print("Informe y: ");
        y = sc.nextInt();
        switch (opcao) {
            case "+":
                resultado = x + y;
                break;
            case "-":
                resultado = x - y;
                break;
            case "*":
                resultado = x * y;
                break;
            case "/": 
                if(y != 0) {
                    resultado = x / y;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                sc.close();
                break;
        }

        System.out.println("x " + opcao + " y = " + resultado);
        sc.close();
    }
}
