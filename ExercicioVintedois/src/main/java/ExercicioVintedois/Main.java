/*Faça um algoritmo que receba o preço de custo e o preço de venda
de 40 produtos.Mostre como resultado se houve lucro, prejuizo ou 
empate para cada produto. Informe o valor de custo de cada produto,
o valor de venda de cada produto, a media de preço de custo e do 
preço de venda
 */
package ExercicioVintedois;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nomeProduto;
        float precoCusto;
        float precoVenda;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner leitor = new Scanner(System.in);

        int i = 0;
        for (; i < 40; i++) {
            System.out.println("Digite o nome do produto");
            nomeProduto = leitor.nextLine();

            System.out.println("Digite o preço de custo do produto");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de venda do produto");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Houve um empate entre preço de custo e venda");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Prejuizo");
                } else {
                    System.out.println("Lucro");
                }
            }

            System.out.println(nomeProduto + ", preço de custo = " + precoCusto
                    + ", preço de venda= " + precoVenda);
        }

        System.out.println("a média do preço de custo é de: " + (totalCusto / i));
        System.out.println("a média do preço de venda é de: " + (totalVenda / i));

    }
}
