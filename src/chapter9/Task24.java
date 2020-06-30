package chapter9;

import java.util.Scanner;

public class Task24 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое трехзначное число: ");
        int a = in.nextInt();
        int a1 = a / 100, a2 = a % 100 / 10, a3 = a % 10;
        if (a2>a1 && a2>a3)
            System.out.println("Число называется 'горой'");
        else
            System.out.println("Число не является 'горой'");
    }
}