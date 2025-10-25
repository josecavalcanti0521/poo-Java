package polimorfismo;

import java.util.Scanner;

public class LerFiguraPlana {
    public static char lerTipo(Scanner sc) {
        char tipo;

        do {
            System.out.print("\nInforme 'R' para Retangulo,'C' para Circulo ou 'F' para Fim-> ");
            tipo = sc.next().charAt(0);
        } while((tipo != 'R') && (tipo != 'C') && (tipo != 'F'));

        return tipo;
    }

    public static void main(String[] args) {
        FiguraPlana fp = new FiguraPlana();
        Scanner sc = new Scanner(System.in);

        char tipo;

        System.out.println("Dados da Figura Plana");
        tipo = lerTipo(sc);

        while(tipo != 'F') {
            switch (tipo) {
                case 'R':
                    fp = new Retangulo(0,0);
                    System.out.print("\nInforme a base -> ");
                    ((Retangulo)fp).setLadoa(sc.nextFloat());
                    System.out.print("\nInforme a largura -> ");
                    ((Retangulo)fp).setLadob(sc.nextFloat());
                    break;
                case 'C':
                    fp = new Circulo(0);
                    System.out.print("\nInforme o raio -> ");
                    ((Circulo)fp).setRaio(sc.nextFloat());
                    break;
                default:
                    break;
            }

            fp.mostrarDados();

            if(fp instanceof Circulo) {
                System.out.println("Area em PI do circulo com comprimento 20 PI" + ((Circulo)fp).area(20));
            }

            tipo = lerTipo(sc);
        }

        sc.close();
    }
}
