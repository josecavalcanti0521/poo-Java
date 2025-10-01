package revisao_prova_2.retangulo;

import java.util.Scanner;

public class LerRetangulo {
    public static void main(String[] args) {
        Retangulo retanguloMaiorArea = new Retangulo();
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de retangulos: ");

        Retangulo retangulos[] = new Retangulo[sc.nextInt()];

        for(int i = 0; i < retangulos.length; i++) {
            retangulos[i] = new Retangulo();

            System.out.print("Digite o codigo do retangulo: ");
            retangulos[i].codigo = sc.nextInt();

            System.out.print("Digite a base do retangulo: ");
            retangulos[i].base = sc.nextInt();

            System.out.print("Digite a altura do retangulo: ");
            retangulos[i].altura = sc.nextInt();

            if(i == 0) {
                retanguloMaiorArea = retangulos[i];
            }

            if(retanguloMaiorArea.area() < retangulos[i].area()) {
                retanguloMaiorArea = retangulos[i];
            }
        }

        for(int i = 0; i < retangulos.length; i++) {
            System.out.println("Codigo = " + retangulos[i].codigo);
            System.out.println("Base = " + retangulos[i].base);
            System.out.println("Altura = " + retangulos[i].altura);
            System.out.println("Area = " + retangulos[i].area());
            System.out.println("Perimetro = " + retangulos[i].perimetro());
        }

        System.out.println("A maior aréa é " + retanguloMaiorArea.area() + " do retangulo " + retanguloMaiorArea.codigo);

        sc.close();
    }
}
