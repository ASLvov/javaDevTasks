package chapter9;

import java.util.Scanner;

public class Task32 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите четырехзначное число от 1901 до 2000: ");
        int year = in.nextInt();
        if (year>=1901 && year<=2000)
            if (year%4 == 0)
                System.out.println("Високосный год");
            else
                System.out.println("Не високосный год");
        else
            System.out.println("Неверно введен год");
    }
}
