package constructors.Produto;

public class Produto {
    int codigo;
    String nome;
    int quantidade;
    String unidade;
    float valorUnitario;

    Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    Produto(int codigo, String nome, int quantidade, String unidade, float valorUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
    }
}
