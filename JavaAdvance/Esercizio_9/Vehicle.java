package Esercizio_9;

public abstract class Vehicle {

    protected String tipo;
    protected Integer numeroDiRuote;

    public Vehicle(String tipo, Integer numeroDiRuote) {
        this.tipo = tipo;
        this.numeroDiRuote = numeroDiRuote;
    }

    public void  showVehicleDetails(){
        System.out.println("Tipo di veicolo: " + tipo +
               "\nNumero Di Ruote: " + numeroDiRuote);
    }


    void doVehicleSound(){
    System.out.println("....");
        }
}