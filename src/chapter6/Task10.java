package chapter6;

import java.util.Scanner;

public class Task10 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите двузнасное число: ");
        int a = in.nextInt();
        int first = a/10, second = a%10;
        if (a>(first*second)) System.out.print("Число больше, чем произведение его цифр");
        if (a<(first*second)) System.out.print("Число меньше произведения его цифр");
    }
}
