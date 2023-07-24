package Esercizio_5;

import java.time.Month;

public class Months {

    public enum Mesi {GENNAIO,
        FEBBRAIO,
        MARZO,
        APRILE,
        MAGGIO,
        GIUGNO,
        LUGLIO,
        AGOSTO,
        SETTEMBRE,
        OTTOBRE,
        NOVEMBRE,
        DICEMBRE}

    ;

    public static void main(String[] args) {

        for (Month month : Month.values()) {
            String monthName = month.toString();
            if (monthName.endsWith("Y") || monthName.endsWith("Y")) {
                System.out.println(month + " : Termina con Y");
            } else {
                System.out.println(month + ": Non Termina con Y");
            }
        }
    }
}



