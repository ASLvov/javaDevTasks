package chapter8;

import java.util.Scanner;

public class Task7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        if (a>b) System.out.println(a-b);
        if (b>a) System.out.println(b-a);
        if (a==b) System.out.println(a*b);
    }
}
