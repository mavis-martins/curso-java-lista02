package Questao11;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[]args){
        //11. Escreva um programa que tenha duas palavras como entrada, e a saída imprima as
        //palavras em ordem alfabética (utilize o método compareTo da classe String),. Informe
        //também, qual das palavras tem o maior número de caracteres.
        String palavra1;
        String palavra2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra: ");
        palavra2 = scanner.nextLine();

        scanner.close();

        System.out.println((palavra1.compareTo(palavra2) < 0?
                "Palavras em ordem alfabética: \n" + palavra1 + "\n" + palavra2
                : "Palavras em ordem alfabética: \n" + palavra2 + "\n" + palavra1));

        System.out.println((palavra1.length() > palavra2.length() ?
                "A maior palavra é " + palavra1
                : palavra2.length() > palavra1.length() ?
                "A maior palavra é " + palavra2
                : "\n" + palavra1 + " e " + palavra2 + " possuem o mesmo tamanho."));
    }
}
