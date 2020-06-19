package chapter7;

import java.util.Scanner;

public class Task8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите количество учеников в классе: ");
        int studentsCount = in.nextInt();
        System.out.print("Введите количество столов: ");
        int tablesCount = in.nextInt();
        if (studentsCount%2==0)
            if (tablesCount>=(studentsCount/2)) System.out.println("Всем ученикам есть, где сесть");
            else System.out.println("Столов не хватает");
        else
            if (tablesCount>=(studentsCount)/2+1) System.out.println("Всем ученикам есть, где сесть");
            else System.out.println("Столов не хватает");
    }
}

