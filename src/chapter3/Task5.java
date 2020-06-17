package chapter3;

import java.util.Scanner;

public class Task5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите значение катетов и гипотенузы через пробел: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        System.out.println("Периметр треугольника равен " + (a+b+c));
        System.out.println("Площадь треугольника равна " + (a*b*0.5));
    }
}
