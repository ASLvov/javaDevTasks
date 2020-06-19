package chapter7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите количество учеников в классе: ");
        int studentsCount = in.nextInt();
        System.out.print("Введите количество стульев: ");
        int chairsCount = in.nextInt();
        if (chairsCount>=studentsCount) System.out.println("Всем ученикам есть, где сесть");
        else System.out.println("Стульев не хватает");
    }
}
