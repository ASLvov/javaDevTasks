package chapter9;

import java.util.Scanner;

public class Task17 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите значения углов через пробел: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a+b+c == 180)
            System.out.println("Это углы одного треугольника");
        else
            System.out.println("Это не углы одного треугольника");
    }
}
