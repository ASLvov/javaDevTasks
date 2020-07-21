package chapter17;

import java.util.Scanner;

public class Task23 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите коэффициенты квадратного уравнения через пробел: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        int number = func(a,b,c);
        System.out.println("Уравнение имеет " + number + " решений");
    }

    public static int func(double a, double b, double c) {
        double D = b*b - 4*a*c;
        if (D>=0)
        {
            if (D==0)
                return 1;
            else
                return 2;
        }
        else
            return 0;
    }
}
