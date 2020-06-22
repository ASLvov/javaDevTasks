package chapter9;

import java.util.Scanner;

public class Task9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите коэффициенты линейного уравнения через пробел: ");
        int a = in.nextInt(), b = in.nextInt();
        if (a==0 && b==0)
            System.out.println("Уравнение имеет бесконечное множество решений");
        else
            if (a==0 && b!=0)
                System.out.println("Уравнение не имеет решений");
            else
                System.out.println("x = " + (-b/a));
    }
}
