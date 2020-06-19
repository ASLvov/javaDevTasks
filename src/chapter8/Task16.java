package chapter8;

import java.util.Scanner;

public class Task16 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите трехзначное число: ");
        int a = in.nextInt();
        if (a/100==a%10) System.out.println("Число является симметричным");
        else System.out.println("Число не является симметричным");
    }
}
