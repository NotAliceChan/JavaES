package Esercizio_10;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Giulia", "Rossini", 1898, 2);
        Professor professor = new Professor("Mario", "Pollini", 1290, "Java");
        Assistant assistant = new Assistant("Lara", "Croft", 9087, true);


        System.out.println("Student Details:");
        student.goToCollege();

        System.out.println("\nProfessor Details:");
        professor.goToCollege();

        System.out.println("\nAssistant Details:");
        assistant.goToCollege();

        System.out.println("\nStudent Study:");
        student.studyAtHome();

        System.out.println("\nProfessor Teaching:");
        professor.teachToOtherPeople();

        System.out.println("\nAssistant Study:");
        assistant.studyAtHome();

        System.out.println("\nAssistant Teaching:");
        assistant.teachToOtherPeople();
    }
}