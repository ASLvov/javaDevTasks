package chapter6;

import java.util.Scanner;

public class Task12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите коэффициенты квадратного уравнения через пробел: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        double D = Math.pow(b,2) - 4*a*c;
        if (D>0) System.out.print("Уравнение имеет 2 корня");
        if (D==0) System.out.print("Уравнение имеет один корень");
        if (D<0) System.out.print("Уравнение не имеет корней");
    }
}
