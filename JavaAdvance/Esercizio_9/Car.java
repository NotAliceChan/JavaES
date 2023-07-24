package Esercizio_9;

public class Car extends Vehicle {

    private Integer numeroDiPorte;
    private Double prezzoAuto;


    public Car(String tipo, Integer numeroDiRuote,  Integer numeroDiPorte, Double prezzoAuto) {
        super(tipo, numeroDiRuote);
        this.numeroDiPorte = numeroDiPorte;
        this.prezzoAuto = prezzoAuto;

    }

    @Override
    void doVehicleSound(){
        System.out.println("Bruum Bruum");
    }

    @Override
    public void  showVehicleDetails(){
        System.out.println("Tipo di veicolo: " + tipo +
                "\nNumero Di Ruote: " + numeroDiRuote +
                "\nNumero Di Porte: " + numeroDiPorte +
                "\nPrezzo Auto: " + prezzoAuto);
    }





}
