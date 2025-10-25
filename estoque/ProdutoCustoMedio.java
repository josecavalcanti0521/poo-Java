package estoque;

public class ProdutoCustoMedio extends Produto {
    public ProdutoCustoMedio(int codigo, String nome, int quantidade, float custo) {
        super(codigo, nome, quantidade, custo);
    }

    public void repor(int quantidade, float valorUnitario) {
        super.setCusto(
            (int) ((super.getQuantidade() * super.getCusto()) + (quantidade * valorUnitario)) / (super.getQuantidade() + quantidade)
        );
        super.repor(quantidade, valorUnitario);
    }
}
