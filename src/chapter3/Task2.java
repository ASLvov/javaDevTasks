package chapter3;

import java.util.Scanner;

public class Task2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите значение в сантиметрах: ");
        double sm = in.nextDouble();
        System.out.print("Введенное значение в дюймах равно " + (sm/2.54));
    }
}
