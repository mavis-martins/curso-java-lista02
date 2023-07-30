package Questao4;

import java.util.Scanner;

public class Questao4 {
    //Pretende-se escrever um programa que leia do teclado uma distância expressa em
    //milhas, converte-a para quilômetros e apresenta o resultado no console. (fórmula de
    //conversão: 1 milha = 1.609 km).
    public static void main(String[] args){
        double milha;
        double km;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a distância?");
        milha = scanner.nextInt();

        km = milha * 1.609;

        System.out.println(milha + " milhas equivalem à " + km + " quilômetros.");
    }
}
