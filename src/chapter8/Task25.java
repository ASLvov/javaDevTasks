package chapter8;

import java.util.Scanner;

public class Task25 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        int a = in.nextInt();
        if (a%2 == 0)
        {
            System.out.print("Введите дробное число: ");
            double b = in.nextDouble();
            System.out.println("Произведение чисел равно " + (a*b));
        }
        else
        {
            System.out.print("Введите целое число: ");
            int c = in.nextInt();
            System.out.println("Сумма чисел равна " + (a+c));
        }
    }
}
