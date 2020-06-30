package chapter9;

import java.util.Scanner;

public class Task31 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите четырехзначное число в промежутке от 1501 до 2000: ");
        int year = in.nextInt();
        if (year>=1501 && year<=2000)
            if (year%100 == 0)
                System.out.println(year/100 + " век");
            else
                System.out.println(year/100+1 + " век");
        else
            System.out.println("Неправильно введен год");
    }
}
