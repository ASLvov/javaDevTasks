package chapter8;

import java.util.Scanner;

public class Task29 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первую пару целых ненулевых чисел через пробел: ");
        float a = in.nextFloat(), b = in.nextFloat();
        System.out.println("Введите вторую пару целых ненулевых чисел через пробел: ");
        float c = in.nextFloat(), d = in.nextFloat();
        if (a/b == c/d)
            System.out.println("Дроби равны");
        else
            System.out.println("Дроби не равны");
    }
}
