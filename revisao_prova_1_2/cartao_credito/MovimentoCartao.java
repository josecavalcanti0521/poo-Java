package revisao_prova_1_2.cartao_credito;

public class MovimentoCartao {
    public static void main(String[] args) {
        CartaoEspecial c1 = new CartaoEspecial(1, "João", 500, 50);

        c1.comprar(50);
        c1.comprar(49);
        c1.comprar(450);
        c1.comprar(50);
        c1.pagar(50);
        c1.comprar(50);
        c1.pagarTudo();
        c1.mostrarDados();
    }
}
