import java.util.Scanner;

public class EstacaoAno {
    public static void main(String[] args) {
        short mes;
        String estacao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Estação do ano");

        System.out.print("Digite o número do mês: ");
        mes = sc.nextShort();

        switch (mes) {
            case 1:
                case 2:
                    estacao = "Verão";
            break;
            case 3:
                case 4:
                    case 5:
                        estacao = "Outono";
            break;
            case 9:
                case 10:
                    case 11:
                        estacao = "Primavera";
            break;
            default:
                estacao = "Verão";
            break;
        }

        System.out.println("A estacão do mês " + mes + " é " + estacao);

        sc.close();
    }
}
