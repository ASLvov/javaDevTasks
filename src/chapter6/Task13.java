package chapter6;

import java.util.Scanner;

public class Task13 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите числитель дроби: ");
        int a = in.nextInt();
        System.out.print("Введите знаменатель дроби: ");
        int b = in.nextInt();
        if (b!=0) System.out.print("Дробь существующая");
        if (b==0) System.out.print("Дробь не существующая");
    }
}
