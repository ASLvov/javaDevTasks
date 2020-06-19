package chapter7;

import java.util.Scanner;

public class Task11 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите числа через пробел: ");
        int a = in.nextInt(), b = in.nextInt();
        if (a<b)
        {
            System.out.println(a + " " + b);
            System.out.println(b + " " + a);
        }
        if (a>b)
        {
            System.out.println(b + " " + a);
            System.out.println(a + " " + b);
        }
    }
}
