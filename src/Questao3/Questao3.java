package Questao3;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {
    //Crie uma classe e na função main() implemente um programa que lê um número
    //inteiro do teclado e imprime todos os números primos menores que ele (divisíveis por 1
    //ou por ele mesmo).
    public static void main(String[] args){
        NumeroPrimo numeroPrimo = new NumeroPrimo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numeroPrimo.numero = scanner.nextInt();

        ArrayList<Integer> primos =  numeroPrimo.retornaPrimos();

        System.out.println("Os primos menores que " + numeroPrimo.numero + " são:\n" + primos);

    }
}
