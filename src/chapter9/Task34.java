package chapter9;

import java.util.Scanner;

public class Task34 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите через пробел два символьных значения: ");
        String str1 = in.next(), str2 = in.next();
        if (str1.equals(str2))
            System.out.println("Символы идентичны");
        else
            System.out.println("Символы не идентичны");
    }
}
