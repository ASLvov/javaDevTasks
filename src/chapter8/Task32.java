package chapter8;

import java.util.Scanner;

public class Task32 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        int a = in.nextInt();
        if (a%2 == 0)
        {
            System.out.print("Введите дробное число: ");
            float b = in.nextFloat();
            System.out.println(a*b);
        }
        else
        {
            System.out.print("Введите целое число: ");
            int c = in.nextInt();
            System.out.println(a+c);
        }
    }
}
