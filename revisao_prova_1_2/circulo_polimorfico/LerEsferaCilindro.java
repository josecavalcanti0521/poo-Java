package revisao_prova_1_2.circulo_polimorfico;

import java.util.Scanner;

public class LerEsferaCilindro {
    public static char lerTipo(Scanner sc) {
        char tipo;
        do {
            System.out.print("Digite ->\n'C' para Cilindro\n'E' para Esfera\n'F' para encerrar o programa\n");
            tipo = sc.next().charAt(0);
        } while(tipo != 'C' && tipo != 'E' && tipo != 'F');

        return tipo;
    }

    public static void main(String[] args) {
        char tipo;
        Scanner sc = new Scanner(System.in);
        
        tipo = lerTipo(sc);
        
        while(tipo != 'F') {
            Circulo c1 = null;
        
            switch (tipo) {
                case 'C':
                    c1 = new Cilindro(0, 0);
                    break;
                case 'E':
                    c1 = new Esfera(0);
                    break;
                default:
                    break;
            }

            System.out.print("Digite o raio: ");
            c1.setRaio(sc.nextFloat());

            if (c1 instanceof Cilindro) {
                System.out.print("Digite a altura do cilindro: ");
                ((Cilindro)c1).setAltura(sc.nextFloat());
            }

            c1.mostrarDados(); // Polimorfismo na prática

            tipo = lerTipo(sc);
        }

        sc.close();
    }
}
