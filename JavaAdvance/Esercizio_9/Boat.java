package Esercizio_9;

public class Boat extends Vehicle {

    private Double velocitaMassimaNodi;
    private Integer pesoBarcaKilos;

    public Boat(String tipo, Integer numeroDiRuote, Double velocitaMassimaNodi, Integer pesoBarcaKilos) {
        super(tipo, numeroDiRuote);
        this.velocitaMassimaNodi = velocitaMassimaNodi;
        this.pesoBarcaKilos = pesoBarcaKilos;
    }

    @Override
    void doVehicleSound(){
        System.out.println("sh--sh--sh");
    }


    public void getBoatWeightAndSpeed(){
        System.out.println("Peso Chili: " + pesoBarcaKilos +
                "\nVelocità Massima: " + velocitaMassimaNodi);
    }

}
