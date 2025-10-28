package revisao_prova_1_2.conta;

public abstract class Conta {
    private int codigo;
    private String nome;
    private float saldo;

    Conta(int codigo, String nome, float saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    int getCodigo() {
        return this.codigo;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    float getSaldo() {
        return this.saldo;
    }

    void ajustarSaldo(float valor) {
        this.saldo += valor;
    }

    void mostrarDados() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
    }
}
