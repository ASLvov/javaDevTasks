package chapter9;

import java.util.Scanner;

public class Task27 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите двузначное и четырехзначное числа через пробел: ");
        int a = in.nextInt(), b = in.nextInt();
        int b1,b2,b3,count=0;
        b1 = b/100;
        b2 = b%1000/10;
        b3 = b%100;
        if (a==b1)
            count++;
        if (a==b2)
            count++;
        if (a==b3)
            count++;
        if (count>0)
            System.out.println("Число " + a + " " + count + " раза является 'внутренним' для числа " + b);
        else
            System.out.println("Не является 'внутренним'");
    }
}