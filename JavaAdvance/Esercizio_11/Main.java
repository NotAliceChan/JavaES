package Esercizio_11;

public class Main {
    public static void main(String[] args) {

        try {

            SmartphonePrice prod1 = new SmartphonePrice("Producer", 500);
            SmartphonePrice prod2 = new SmartphonePrice("Producer", 450);

            SmartphonePrice retail1 = new SmartphonePrice("Retail", 1500);
            SmartphonePrice retail2 = new SmartphonePrice("retail", 1100);

            Smartphone phone1 = new Smartphone("Iphone", "14 Pro Max", 2000, prod1, retail1);
            Smartphone phone2 = new Smartphone("Samsung", "Note 10 Pro", 3500, prod2, retail2);

            System.out.println("\nDettagli Smartphone\n" + phone1);
            System.out.println("\nDettagli Smartphone\n" + phone2);

            System.out.println("I cellulari sono uguali?: " + phone1.equals(phone2));

            Smartphone clonephone = (Smartphone) phone2.clone();
            System.out.println("\nDettagli del cellulare clonato 2: \n" + clonephone);
            System.out.println("\nil cellulare 2 e la copia d el cellulare 2 sono uguali ? :\n" + phone2.equals(clonephone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("\nError occurred during cloning.\n");
        }
    }
}
