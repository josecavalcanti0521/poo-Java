package estoque;

public class ProdutoCustoAtual extends Produto {
    public ProdutoCustoAtual(int codigo, String nome, int quantidade, float custo) {
        super(codigo, nome, quantidade, custo);
    }

    public void repor(int quantidade, float valorUnitario) {
        super.setCusto(valorUnitario);
        super.repor(quantidade, valorUnitario);
    }
}
