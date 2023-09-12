package Esercizio_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Tester {
    public static void main(String[] args) {

        File file = new File("C:\\0- Alice\\JS ADV\\JavaAdvance\\Esercizio_12\\file.txt");

        try {
            if (file.exists()) {
                try (BufferedReader fr = new BufferedReader(new FileReader(file))) {
                    fr.lines().forEach(System.out::println);
                }
            } else { System.err.println("Il file non esiste.");
            }
        } catch (IOException e) {
            System.err.println("Errore di I/O: " + e.getMessage());
        } finally {
            System.out.println("Lettura del file terminata.");
        }
    }
}