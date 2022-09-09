//Fa�a um algoritmo que receba "N"n�meros e mostre positivo,
//negativo ou zero para cada n�mero.

package ExercicioEstruturaRepeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Digite um n�mero");
            int numero = leitorScanner.nextInt();

            if (numero == 0) {
                System.out.println("O n�mero � zero");
            } else {
                if (numero > 0) {
                    System.out.println("O n�mero � maior que zero");
                } else {
                    System.out.println("O n�mero � menor que zero");
                }
            }
            System.out.println("Deseja continuar? S -Sim / N - N�o");
            desejaContinuar = leitorScanner.next().charAt(0);

        }
    }

}
