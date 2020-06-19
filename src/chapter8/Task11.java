package chapter8;

import java.util.Scanner;

public class Task11 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество учеников:");
        int students = in.nextInt();
        System.out.println("Введите количество стульев: ");
        int chairs = in.nextInt();
        if (chairs>students) System.out.println((chairs-students) + " стула лишних");
        if (chairs==students) System.out.println("Лишних стульев нет");
        if (chairs<students) System.out.println("Не хватает " + (students-chairs) + " стульев");
    }
}
