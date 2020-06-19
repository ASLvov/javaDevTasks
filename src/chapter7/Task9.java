package chapter7;

import java.util.Scanner;

public class Task9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите значение длины первого катета: ");
        int a = in.nextInt();
        System.out.print("Введите значение длины второго катета: ");
        int b = in.nextInt();
        System.out.print("Введите значение длины гипотенузы: ");
        int c = in.nextInt();
        if (c*c == a*a + b*b) System.out.println("Введенные значения соответствуют требованиям");
        else System.out.println("Введенные значения не соответствуют требованиям");
    }
}
