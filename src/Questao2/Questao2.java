package Questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        //2. Faça um programa que receba 2 valores e retorne o maior entre eles.
    int valor1;
    int valor2;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro valor:");
    valor1 = scanner.nextInt();

    System.out.println("Digite o segundo valor:");
    valor2 = scanner.nextInt();

    System.out.println("O maior valor é " + (valor1 > valor2 ? valor1 : valor2));
    }
}
