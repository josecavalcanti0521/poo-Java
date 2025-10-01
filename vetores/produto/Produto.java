package produto;

public class Produto {
    String unidade;
    String nome;
    int codigo;
    int quantidade;
    float valorUnitario;

    public float valorTotal() {
        return this.quantidade * this.valorUnitario;
    }

    public void mostrarDados() {
        System.out.println("Codigo = " + this.codigo);
        System.out.println("Nome = " + this.nome);
        System.out.println("Quantidade = " + this.quantidade);
        System.out.println("Unidade " + this.unidade);
        System.out.println("Valor = " + this.valorUnitario);
        System.out.println("Total = " + this.valorTotal());
    }
}
