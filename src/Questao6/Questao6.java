package Questao6;

public class Questao6 {
    public static void main(String[] args){
        //Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e
        //float.
        int contaImpares = 1;
        float contaImparesF = 1;

        for(int i = 15; i <= 30; i++){
            if(i % 2 != 0){
                contaImpares *= i;
                contaImparesF *= i;
                System.out.println("Inteiro: " + contaImpares);
                System.out.println("Float: " + contaImparesF + "\n");
            }
        }
    }
}
