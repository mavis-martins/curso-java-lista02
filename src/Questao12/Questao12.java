package Questao12;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[]args){
        //12. Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um
        //motorista monitorou vários tanques cheios de gasolina registrando a quilometragem
        //dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
        //Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os
        //litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio. O programa
        //deve calcular e exibir o consumo em quilômetros/litro para cada tanque cheio e
        //imprimir a quilometragem combinada e a soma total de litros de combustível
        //consumidos até esse ponto. Todos os cálculos de média devem produzir resultados de
        //ponto flutuante.
        Scanner scanner = new Scanner(System.in);
        Quilometragem quilometragem = new Quilometragem(scanner);

        quilometragem.totalTanques();
    }
}
