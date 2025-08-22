import java.util.Scanner;

public class LimiteCredito {
    public static void main(String[] args) {
        String nome, conta;
        float saldoInicial, cobrancas, pagamentos, limite, saldoNovo;
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Calcula o Limite de crédito de um cliente ");

        System.out.print("Informe o nome do cliente: ");
        nome = sc.nextLine();

        System.out.print("Informe o número da conta: ");
        conta = sc.nextLine();

        System.out.print("O saldo inicial em R$: ");
        saldoInicial = sc.nextFloat();

        System.out.print("Total cobrado em R$: ");
        cobrancas = sc.nextFloat();

        System.out.print("Total de pagamentos em R$: ");
        pagamentos = sc.nextFloat();

        System.out.print("Limite autorizado de crédito em R$: ");
        limite = sc.nextFloat();

        saldoNovo = saldoInicial + cobrancas - pagamentos;

        System.err.println("Ciente: " + nome + "\nConta:" + conta + "\nNovo saldo em R$: " + saldoNovo);

        if(saldoNovo > limite) {
            System.err.println("\nLimite de crédito " + "excedido em R$" + (saldoNovo - limite));
        } else {
            System.err.println("\nAinda pode comprar: " + (limite - saldoNovo));
        }

        sc.close();
    }
}
