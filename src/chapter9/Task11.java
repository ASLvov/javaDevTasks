package chapter9;

import java.util.Scanner;

public class Task11 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите трехзначное число: ");
        int a = in.nextInt();
        if (a/100 == a%100/10 && a/100 == a%10)
            System.out.println("Число является плоским");
        else
            System.out.println("Число не является плоским");
    }
}
