package produto;

import java.util.Scanner;

public class LerProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos?: ");

        Produto produtos[] = new Produto[sc.nextInt()];
        Produto produtoMaisValioso = new Produto();
        float total = 0;

        // System.out.println("Produto 1 ->");
        // System.out.print("Qual o nome?: ");
        // produtoMaisValioso.nome = sc.next();

        // System.out.print("Qual o codigo?: ");
        // produtoMaisValioso.codigo = sc.nextInt();

        // System.out.print("Qual a quantidade?: ");
        // produtoMaisValioso.quantidade = sc.nextInt();

        // System.out.print("Qual a unidade?: ");
        // produtoMaisValioso.unidade = sc.next();

        // System.out.print("Qual o valor unitário?: ");
        // produtoMaisValioso.valorUnitario = sc.nextFloat();

        // total += produtoMaisValioso.valorTotal();

        // System.out.println("----------------------------------------------");

        for(int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + (i + 1) + " ->");
            produtos[i] = new Produto();

            System.out.print("Qual o nome?: ");
            produtos[i].nome = sc.next();

            System.out.print("Qual o codigo?: ");
            produtos[i].codigo = sc.nextInt();

            System.out.print("Qual a quantidade?: ");
            produtos[i].quantidade = sc.nextInt();

            System.out.print("Qual a unidade?: ");
            produtos[i].unidade = sc.next();

            System.out.print("Qual o valor unitário?: ");
            produtos[i].valorUnitario = sc.nextFloat();
            
            if(i == 0) {
                produtoMaisValioso = produtos[i];
            }

            if(produtoMaisValioso.valorTotal() < produtos[i].valorTotal()) {
                produtoMaisValioso = produtos[i];
            }

            total += produtos[i].valorTotal();
            System.out.println("----------------------------------------------");
        }

        System.out.println("O produto mais valioso é o " + produtoMaisValioso.nome + " com " + " R$ " + produtoMaisValioso.valorTotal());
        System.out.println("Total = " + total);
        sc.close();
    }
}
