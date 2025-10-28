package revisao_prova_1_2.conta;

public class MovimentoPagarReceber {
    public static void main(String[] args) {
        ContaReceber cr = new ContaReceber(1, "Supermercado", 500);
        ContaPagar cp = new ContaPagar(2, "Distribuidor Ideal", 400);

        cr.mostrarDados();
        cp.mostrarDados();

        cr.vender(600);
        cp.comprar(400);

        cr.mostrarDados();
        cp.mostrarDados();

        cr.receber(100);
        cp.pagar(300);

        cr.mostrarDados();
        cp.mostrarDados();

        cr.receber(1500);
        cp.pagar(600);

        cr.mostrarDados();
        cp.mostrarDados();
    }
    
}
