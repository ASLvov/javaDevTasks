package chapter9;

import java.util.Scanner;

public class Task15 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите номер месяца: ");
        int n = in.nextInt();
        if (n==1 || n==2 || n==12)
            System.out.println("Зима");
        if (n>=3 && n<=5)
            System.out.println("Весна");
        if (n>=6 && n<=8)
            System.out.println("Лето");
        if (n>=9 && n<=11)
            System.out.println("Осень");
        if (n<1 || n>12)
            System.out.println("Это не номер месяца!");
    }
}
