package Esercizio_8;

public class Animal {

    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }


    public void animalSound() {
        System.out.println("Roarr!");
    }


    public void animalSound(String Inesity){
        switch (Inesity){
            case "high" -> System.out.println("Roaaaaaaaar!");
            case "low" ->  System.out.println("Roar");
            default -> System.out.println("Cannot reproduce it properly: set (high) or (low) for intensity sound");
        }
    }
}
