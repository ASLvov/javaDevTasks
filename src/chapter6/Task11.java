package chapter6;

import java.util.Scanner;

public class Task11 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        if (((a>0)&&(b>0))||((a<0)&&(b<0))) System.out.print("Один и тот же знак");
        if ((a==0)||(b==0)) System.out.print("Некорректно");
        if (((a>0)&&(b<0))||((a<0)&&(b>0))) System.out.print("Разные знаки");
    }
}
