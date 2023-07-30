package Questao8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Questao8 {
    public static void main(String[] args){
        //Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
        //palavra fornecida seja uma palavra que pode ser lida da esquerda para direita ou da
        //direita para esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.
        String palavra;
        ArrayList<String> esquerdaDireita = new ArrayList<>();
        ArrayList<String> direitaEsquerda = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        palavra = scanner.next();

        String [] palavraSplit = palavra.split("");

        Collections.addAll(esquerdaDireita, palavraSplit);
        Collections.addAll(direitaEsquerda, palavraSplit);
        Collections.reverse(direitaEsquerda);

        System.out.println(direitaEsquerda);
        System.out.println(esquerdaDireita);

        System.out.println((direitaEsquerda.equals(esquerdaDireita)) ? "O conteúdo é igual" : "A palavra " +
                "não pode ser lida ao contrário de forma igual");
    }

}
