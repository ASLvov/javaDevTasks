package chapter7;

import java.util.Scanner;

public class Task6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        if (a==b) System.out.println("Числа равны");
        else System.out.println("Числа не равны");
    }
}
