package estoque;

public class MovimentoEstoque {
    
    public static void main(String[] args) {
        ProdutoCustoAtual p1= new ProdutoCustoAtual(1, "Feijão", 60, (float) 1.50);
        ProdutoCustoMedio p2 = new ProdutoCustoMedio(2, "Tomate", 120, (float) 2.50);

        p1.mostrarDados();
        p2.mostrarDados();

        p1.repor(100, (float) 1.60);
        p2.repor(100, (float) 2.60);

        p1.mostrarDados();
        p2.mostrarDados();

        p1.baixar(30);
        p2.baixar(50);

        p1.mostrarDados();
        p2.mostrarDados();

        p2.baixar(300);

        p1.mostrarDados();
        p2.mostrarDados();
    } 
}
