package revisao_prova_1_2.conta;

public class ContaReceber extends Conta {
    ContaReceber(int codigo, String nome, float saldo) {
        super(codigo, nome, saldo);
    }

    void receber(float valor) {
        if(super.getSaldo() > valor) {
            super.ajustarSaldo(valor * -1);
        } else {
            System.out.println("Erro (1)");
        }
    }

    void vender(float valor) {
        super.ajustarSaldo(valor);
    }

    void mostrarDados() {
        System.out.println("Conta a Receber");
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Nome: " + super.getNome());
        System.out.println("Saldo: " + super.getSaldo());
    }
}
