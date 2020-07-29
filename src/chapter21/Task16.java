package chapter21;

import java.util.Scanner;

public class Task16 {
    static Scanner in = new Scanner(System.in);

    public static boolean isPalindrom(String str) {
        int n = str.length() - 1, i = 0;
        boolean answer = true;
        if (str.length() <= 2)
            answer = false;
        while (answer && i < n) {
            if (str.charAt(i) != str.charAt(n))
                answer = false;
            i++;
            n--;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Введите серию строковых значений: ");
        int counter = 0;
        String input = "";
        while (!input.equals("Финиш") && !input.equals("финиш")) {
            input = in.next();
            if (isPalindrom(input))
                counter++;
        }
        System.out.println(counter + " значений в серии были палиндромами");
    }
}
