package Questao5;

import java.util.Scanner;


public class Questao5 {
    public static void main(String[] args){
        //5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o
        //dia da semana correspondente. Suponha que Segunda corresponde a 1, terça
        //corresponde a 2, e assim por diante. Utilizando Array.
        String [] dia = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número correspondente ao dia da semana:\n1- Segunda 2-Terça 3-Quarta " +
                "4-Quinta 5-Sexta 6-Sábado 7-Domingo");
        numero = scanner.nextInt();

        System.out.println(dia[numero-1]);
    }
}
