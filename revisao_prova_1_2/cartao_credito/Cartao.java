package revisao_prova_1_2.cartao_credito;

public abstract class Cartao {
    private int numero;
    private String nome;
    private double limite;
    private double saldo;

    Cartao(int numero, String nome, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.limite = limite;
        this.saldo = 0;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean autorizar(double valorCompra) {
        return this.saldo + valorCompra <= this.limite;
    }

    public void comprar(double valor) {
        if(autorizar(valor)) {
            this.saldo += valor;
        } else {
            System.out.println("Erro ao processar a compra!");
        }
    }

    public void pagar(double pagamento) {
        this.saldo -= pagamento;
    }

    public void mostrarDados() {
        System.out.println("Número do cartão: " + this.numero);
        System.out.println("Nome do titular: " + this.nome);
        System.out.println("Limite de crédito: " + this.limite);
        System.out.println("Saldo: " + this.saldo);
    }
}
