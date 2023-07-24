package Esercizio_2;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> numberList = new HashMap<>();

        numberList.put("Five", 5);
        numberList.put("Two", 2);
        numberList.put("Four", 4);
        numberList.put("One", 1);
        numberList.put("Three", 3);


        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(numberList.entrySet());

        sortedEntries.sort(Comparator.comparing(Map.Entry::getValue));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            String number = entry.getKey();
            int value = entry.getValue();
            System.out.println(number + ": " + value);

        }

        HashMap<String, Integer> numberOdd = new HashMap<>();

        numberOdd.put("Uno", 1);
        numberOdd.put("tre", 3);
        numberOdd.put("Cinque", 5);
        numberOdd.put("Sette", 7);
        numberOdd.put("Nove", 9);



        numberList.putAll(numberOdd);


        System.out.println(numberList);

        System.out.println(numberList.get("Cinque"));
        System.out.println(numberList.get("Sei"));
        System.out.println(numberList.get("Sette"));
        System.out.println(numberList.get("Otto"));
        System.out.println(numberList.get("Nove"));

        for (int i = 5; i <= 9; i++ ) {
            if(numberList.containsKey(i)) {
                System.out.println(numberList.get(i));
            } else {
                System.out.println(i + "Not Found");
            }
        }

    }
}
