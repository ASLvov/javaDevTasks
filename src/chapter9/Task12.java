package chapter9;

import java.util.Scanner;

public class Task12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int a = in.nextInt(), a1, a2, a3;
        a1 = a/100;
        a2 = a%100/10;
        a3 = a%10;
        if (a3>a2 && a2>a1)
            System.out.println("Число является поднимающимся");
        else
            System.out.println("Число не является поднимающимся");
    }
}
