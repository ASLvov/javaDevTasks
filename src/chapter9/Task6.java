package chapter9;

import java.util.Scanner;

public class Task6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите три положительных числа через пробел: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if ((a+b)>c && (a+c)>b && (b+c)>a)
            System.out.println("Введенные значения могут являться сторонами треугольника");
        else
            System.out.println("Введенные значения не могут быть сторонами треугольника");
    }
}
