package chapter9;

import java.util.Scanner;

public class Task30 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите трехзначное число: ");
        int a = in.nextInt();
        int a1,a2,a3;
        a1 = a/100;
        a2 = a%100/10;
        a3 = a%10;
        if (a1 != 0 && a%a1 == 0)
            System.out.println("Введенное число делится на первую цифру без остатка");
        if (a2 != 0 && a%a2 == 0)
            System.out.println("Введенное число делится на вторую цифру без остатка");
        if (a3 != 0 && a%a3 == 0)
            System.out.println("Введенное число делится на третью цифру без остатка");
    }
}
