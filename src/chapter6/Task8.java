package chapter6;

import java.util.Scanner;

public class Task8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b;
        System.out.print("Введите первое число: ");
        a = in.nextInt();
        System.out.print("Введите второе число: ");
        b = in.nextInt();
        if (a>b) System.out.print("Сумма равна " + (a+b));
        if (a==b) System.out.print("Числа равны");
        if (a<b) System.out.print("Произведение равно " + (a*b));
    }
}
