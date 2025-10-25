package revisao_prova_1_2.cartao_credito;

public class CartaoEspecial extends Cartao{
    private double valorMinimo;

    CartaoEspecial(int numero, String nome, double limite, double valorMinimo) {
        super(numero, nome, limite);
        this.valorMinimo = valorMinimo;
    }

    public double getValorMinimoCompra() {
        return this.valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public void comprar(double valor) {
        if(valor >= this.valorMinimo) {
            super.comprar(valor);
        } else {
            System.out.println("O valor mínimo da compra é R$" + this.valorMinimo + " reais");
        }
    }

    public void pagarTudo() {
        pagar(super.getSaldo());
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Valor mínimo da compra: " + this.valorMinimo);
    }
}
