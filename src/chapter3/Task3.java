package chapter3;

import java.util.Scanner;

public class Task3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите значение в дюймах: ");
        double dm = in.nextDouble();
        System.out.print("Введенное значение в сантиметрах равно " + (dm*2.54));
    }
}
