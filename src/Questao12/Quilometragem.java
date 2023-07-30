package Questao12;

import java.util.Scanner;

public class Quilometragem {
    int kmDirigido;
    int litrosConsumido;
    float consumo;
    int totalLitros = 0;
    int totalKm = 0;
    String proximoTanque;

    private Scanner scanner;

    public Quilometragem(){

    }

    public Quilometragem(Scanner scanner){
        this.scanner = scanner;
    }

    public int getKmDirigido(){
        return  kmDirigido;
    }

    public void setKmDirigido(int pKmDirigido){
        this.kmDirigido = pKmDirigido;
    }

    public int getLitrosConsumido(){
        return litrosConsumido;
    }

    public void setLitrosConsumido(int pLitrosConsumido){
        this.litrosConsumido = pLitrosConsumido;
    }

    public String getProximoTanque(){
        return proximoTanque;
    }

    public void setProximoTanque(String pProximoTanque){
        this.proximoTanque = pProximoTanque;
    }

    public float getConsumo(){
       return  this.consumo = this.kmDirigido/this.litrosConsumido;
    }

    public void totalTanques(){
        int contTanque = 1;
        do {

            System.out.println("Quilômetros dirigidos: ");
            kmDirigido = scanner.nextInt();
            setKmDirigido(kmDirigido);

            System.out.println("Litros consumidos: ");
            litrosConsumido = scanner.nextInt();

            getConsumo();

            System.out.println("Consumo do taque " + contTanque + " é " + this.consumo + " km/l");

            totalLitros += this.litrosConsumido;
            totalKm += this.kmDirigido;
            contTanque++;

            System.out.println("Se deseja analisar o próximo tanque, digite: S");
            proximoTanque = scanner.next();
        } while (proximoTanque.equalsIgnoreCase("s"));

        float consumoTotal = (float) totalKm/totalLitros;
        System.out.println("Consumo total combinado: " + consumoTotal + " km/l");
    }
}
