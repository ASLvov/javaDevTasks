package chapter8;

import java.util.Scanner;

public class Task30 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите два целых числа через пробел: ");
        int a = in.nextInt(), b = in.nextInt();
        if (b!=0)
            if (a>b)
                System.out.println(a/b + " " + (a-(a/b)*b) + "/" + b);
            else
                System.out.println("Подсчет не производится");
        else
            System.out.println("Дробь не существует");
    }
}
