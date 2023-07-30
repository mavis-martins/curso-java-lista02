package Questao9;

import java.util.Scanner;
import java.util.Locale;

public class Questao9 {
    public static void main(String[] args){
        //Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI *
        //r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá que ser
        //arredondado.
        double raioCirculo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o raio do circulo: ");
        raioCirculo = scanner.nextDouble();

        double areaCirculo = 3.14 * (raioCirculo*raioCirculo);
        double arredondaArea = Math.round(areaCirculo);

        System.out.println("A área do circulo é: " + arredondaArea);
    }
}
