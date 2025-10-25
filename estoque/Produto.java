package estoque;

public abstract class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private float custo;

    Produto(int codigo, String nome, int quantidade, float custo) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.custo = custo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getCusto() {
        return this.custo;
    }

    public float getValorEstoque() {
        return this.quantidade * this.custo;
    }

    public void repor(int quantidade, float custoUnitario) {
        this.quantidade += quantidade;
    }

   public boolean validarSaldo(int quantidade) {
        return this.quantidade >= quantidade;
    }

    public void baixar(int quantidade) {
        if(this.validarSaldo(quantidade)) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Erro ao baixar o estoque");
        }
    }

    public void mostrarDados() {
        System.out.println("Codigo = " + this.codigo);
        System.out.println("Nome = " + this.nome);
        System.out.println("Quantidade = " + this.quantidade);
        System.out.println("Custo = " + this.custo);
        System.out.println("Valor do estoque = " + this.getValorEstoque());
        System.out.println("------------------------------------------------");
    }
}
