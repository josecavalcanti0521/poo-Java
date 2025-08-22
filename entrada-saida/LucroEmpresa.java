import java.util.Scanner;

public class LucroEmpresa {
    public static void main(String[] args) {
        float despesa, receita, lucro;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a receita: ");
        receita = sc.nextFloat();

        System.out.print("Informe a despesa: ");
        despesa = sc.nextFloat();

        lucro = receita - despesa;

        System.err.println("O lucro da empresa em R$ " + lucro);

        sc.close();
    }
}
