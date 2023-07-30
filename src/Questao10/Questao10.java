package Questao10;

public class Questao10 {
    public static void main(String[] args) {
        //10. Escreva uma classe que conte a quantidade de vogais, espaços em brancos e
        //consoantes de uma cadeia de caracteres.
        String cadeia = "Hello, theres a new question to do";

        countTypes(cadeia);
    }

    private static void countTypes(String texto){
        int contaVogais = 0;
        int contaEspaco = 0;
        int contaConsoante = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (caractere >= 'a' && caractere <= 'z') {
                if(caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u'){
                    contaVogais ++;
                } else {
                    contaConsoante ++;
                }
            } else if (caractere == ' '){
                contaEspaco++;
            }
        }

        System.out.println("A cadeia " + texto + " possui: \n");
        System.out.println(contaVogais + " vogais.\n");
        System.out.println(contaConsoante + " consoantes.\n");
        System.out.println(contaEspaco + " espaços em branco");
    }

}
