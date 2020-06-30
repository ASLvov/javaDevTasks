package chapter9;

import java.util.Scanner;

public class Task29 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите положительное трехзначное число: ");
        int a = in.nextInt();
        int a1,a2,a3,count=3;
        a1 = a/100;
        a2 = a%100/10;
        a3 = a%10;
        if (a1==a2 && a1==a3)
            count=1;
        else
            if (a2==a3 || a1==a3 || a1==a2)
                count=2;
        System.out.println(count + " разных цифры");

    }
}
