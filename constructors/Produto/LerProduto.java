package constructors.Produto;

public class LerProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Feijão");
        Produto p2 = new Produto(2, "Arroz", 30);
        Produto p3 = new Produto(3, "Feijão", 30, "Kilograma", 2);

        System.out.println(p1.codigo + ", " + p1.nome);
        System.out.println(p2.codigo + ", " + p2.nome + ", " + p2.quantidade);
        System.out.println(p3.codigo + ", " + p3.nome + ", " + p3.quantidade + ", " + p3.unidade + ", R$" + p3.valorUnitario);
    }
}
