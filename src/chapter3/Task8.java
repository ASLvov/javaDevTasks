package chapter3;

import java.util.Scanner;

public class Task8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите длину основания равнобедренного треугольника: ");
        double a = in.nextDouble();
        System.out.print("Введите длину высоты этого треугольника: ");
        double h = in.nextDouble();
        double b = Math.sqrt(Math.pow(0.5*a,2) + Math.pow(h,2));
        System.out.println("Площадь этого треугольника равна " + (a*h*0.5));
        System.out.println("Периметр этого треугольника равен " + (a+b+b));
    }
}
