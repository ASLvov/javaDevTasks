package chapter9;

import java.util.Scanner;

public class Task7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите значения углов треугольника через пробел: ");
        int a = in.nextInt(), b = in.nextInt();
        int c = 180 - (a+b);
        if (a>0 && a<180 && b>0 && b<180 && c>0 && c<180) {
            if (a == 90 || b == 90 || c == 90)
                System.out.println("Прямоугольный");
            if (a > 90 || b > 90 || c > 90)
                System.out.println("Тупоугольный");
            if (a < 90 && b < 90 && c < 90)
                System.out.println("Остроугольный");
            if (a == 60 && b == 60 && c == 60)
                System.out.println("Равносторонний");
            if ((a == b && a != c) || (a == c && a != b) || (b == c && a != b))
                System.out.println("Равнобедренный");
        }
        else
            System.out.println("Ошибочные данные");
    }
}
