

package Esercizio_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> mesi = new LinkedHashMap<>();


        mesi.put("Gennaio", 1);
        mesi.put("Febbraio", 2);
        mesi.put("Marzo", 3);
        mesi.put("Aprile", 4);
        mesi.put("Maggio", 5);
        mesi.put("Giugno", 6);
        mesi.put("Luglio", 7);
        mesi.put("Agosto", 8);
        mesi.put("Settembre", 9);
        mesi.put("Ottobre", 10);
        mesi.put("Novembre", 11);
        mesi.put("Dicembre", 12);


        System.out.println();

        for(Map.Entry<String, Integer>entry:mesi.entrySet()){
            System.out.println(entry.getKey());
        }

        System.out.println();


        List<Integer> cardinalMounth = new ArrayList<>(mesi.values());

        for (Integer integer : cardinalMounth) {
            System.out.println(integer);
        }

        System.out.println();

        Integer []cardinalMonthArray = mesi.values().toArray(new Integer[0]);

        for (Integer integer : cardinalMonthArray) {
            System.out.println(integer);
        }
    }
}



