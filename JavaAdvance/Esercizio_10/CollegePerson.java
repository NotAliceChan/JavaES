package Esercizio_10;


public class CollegePerson {
    private String name;
    private String surnAme;
    private Integer ID;

    public CollegePerson(String name, String surnAme, Integer ID) {
        this.name = name;
        this.surnAme = surnAme;
        this.ID = ID;
    }

    public void goToCollege(){
        System.out.println("Name: " + name +
                "\n Surname: " + surnAme +
                "\n Id: " + ID);

    }
}