import java.util.Scanner;;

public class Salario {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float salarioB, salarioL, desconto;

        System.out.println("Calcula Salario");
        System.out.print("Digite seu nome -> ");
        nome = sc.nextLine();

        System.out.print("Salario bruto: ");
        salarioB = sc.nextFloat();

        System.out.print("Desconto: ");
        desconto = sc.nextFloat();

        salarioL = salarioB * (1 - desconto/100f);

        System.out.println("Olá, " + nome + " seu salário líquido é " + salarioL);

        sc.close();
    }
}
