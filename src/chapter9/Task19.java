package chapter9;

import java.util.Scanner;

public class Task19 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите два положительных числа: ");
        int a = in.nextInt(), b = in.nextInt();
        if (a==b)
            System.out.println("Это стороны квадрата");
        else
            System.out.println("Это стороны прямоугольника");
    }
}
