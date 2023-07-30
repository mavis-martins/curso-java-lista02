package Questao3;
import java.util.ArrayList;
public class NumeroPrimo {
    int numero;
    ArrayList<Integer> primosMenores = new ArrayList<>();


    ArrayList<Integer> retornaPrimos() {
        for (int i = this.numero -1; i >= 1; i--) {
            int contDivisores = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    contDivisores++;
                }
            }
            if (contDivisores == 2) {
                this.primosMenores.add(i);
            }
        }
        return this.primosMenores;
    }
}
