package revisao_prova_1_2.conta;

public class ContaPagar extends Conta {
    ContaPagar(int codigo, String nome, float saldo) {
        super(codigo, nome, saldo * (-1));
    }

    void pagar(float valor) {
        if(super.getSaldo() * (-1) > valor) {
            super.ajustarSaldo(valor);
        } else {
            System.out.println("Erro (2)");
        }
    }

    void comprar(float valor) {
        super.ajustarSaldo(valor * -1);
    }

    void mostrarDados() {
        System.out.println("Conta a Pagar");
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Nome: " + super.getNome());
        System.out.println("Saldo: " + super.getSaldo());
    }
}
