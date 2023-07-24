package Esercizio_9;

public class Main {
    public static void main(String[] args) {


        Vehicle barca1 = new Boat("Dufour", 0, 15.0, 650);
        Vehicle car1 = new Car("Ferrari", 4, 2, 250000.0);

        System.out.println("\nBarche");

       barca1.doVehicleSound();
       barca1.showVehicleDetails();


        System.out.println("\nMacchina");

        car1.doVehicleSound();
        car1.showVehicleDetails();


    }
}
