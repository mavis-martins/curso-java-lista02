package Questao7;

public class Questao7 {
    public static void main(String[]args){
        //Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100,
        //usando os tipos de dados int e double.

        int divisaoInt = 2;
        float divisaoFloat = 2;

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println("Inteiro: " + i + " / " + divisaoInt + " = " + i/divisaoInt);
                System.out.println("Float: " + i + " / " + divisaoFloat + " = " + i/divisaoFloat + "\n");
            }
        }
    }
}
