package chapter9;

import java.util.Scanner;

public class Task26 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите двузначное и четырехзначное числа через пробел: ");
        int a = in.nextInt(), b = in.nextInt();
        int b1,b2,b3;
        b1 = b/100;
        b2 = b%1000/10;
        b3 = b%100;
        if (a==b1 || a==b2 || a==b3)
            System.out.println("Двузначное является 'внутренним' по отношению к четырехзначному");
        else
            System.out.println("Двузначное не является 'внутренним' по отношению к четырехзначному");

    }
}
