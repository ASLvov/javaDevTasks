package chapter21;

import java.util.ArrayList;
import java.util.Scanner;

public class Task20 {
    static Scanner in = new Scanner(System.in);

    public static String uniqueValues(String str) {
        int counter;
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (i != j) {
                    if (str.charAt(i) == str.charAt(j))
                        counter++;
                }
            }
            if (counter == 0)
                output += str.charAt(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Введите строковое значение: ");
        String input = in.next();
        String unique = uniqueValues(input);
        System.out.println("Уникальные символы в веденной строке: " + unique);
        ArrayList<String> array = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ") Введите строковое значение: ");
            array.add(uniqueValues(in.next()));
            if (array.get(i).length() > max)
                max = array.get(i).length();
        }
        String maximum = "";
        for (int i = 0; i < n; i++) {
            if (array.get(i).length() == max)
                if (maximum == "")
                    maximum = maximum + (i + 1) + " - " + array.get(i);
                else
                    maximum = maximum + ", " + (i + 1) + " - " + array.get(i);
        }
        System.out.println("Наибольшую длину имеют значения " + maximum);


    }
}
