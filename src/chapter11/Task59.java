package chapter11;

import java.util.Scanner;

public class Task59 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,i;
        System.out.print("Введите через пробел два целых положительных числа: ");
        a = in.nextInt();
        b = in.nextInt();
        if (a<b)
            for (i=0;i<=a;i++)
                System.out.print((b+i) + " ");
        else
            for (i=0;i<=b;i++)
                System.out.print((a+i) + " ");
    }
}
