package Esercizio_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> weekList = new LinkedHashSet<>();
        weekList.add("A - Monday");
        weekList.add("F - Saturday");
        weekList.add("E - Friday");
        weekList.add("C - Weednesday");
        weekList.add("B - Tuesday");
        weekList.add("D - Thursday");
        weekList.add("G - Sunday");

          for (String week : weekList) {
            System.out.println(week);
        }

        System.out.println(" ");

        Set<String> weekList2 = new TreeSet<>();
        weekList2.add("A - Monday");
        weekList2.add("F - Saturday");
        weekList2.add("E - Friday");
        weekList2.add("C - Weednesday");
        weekList2.add("B - Tuesday");
        weekList2.add("D - Thursday");
        weekList2.add("G - Sunday");
        for (String weeek2 : weekList2) {
            System.out.println(weeek2);
        }

        System.out.println(" ");

        System.out.println("Un TreeSet è un insieme in cui gli elementi sono ordinati. " +
        "Un HashSet è un insieme in cui gli elementi non sono ordinati");

    }
}
