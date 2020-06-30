package chapter9;

import java.util.Scanner;

public class Task18 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите значения через пробел: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if ((a<b+c && a>b-c) && (b<a+c && b>a-c) && (c<a+b && c>a-b))
            System.out.println("Это длины сторон одного треугольника");
        else
            System.out.println("Это не длины сторон одного треугольника");
    }
}
