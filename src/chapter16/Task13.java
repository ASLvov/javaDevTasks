package chapter16;

import java.util.Scanner;

public class Task13 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите положительное трехзначное число: ");
        int a = in.nextInt();
        int sumA=0, i, sumB=0;
        for (i=1; i<a; i++)
        {
            if (a%i==0)
                sumA+=i;
        }
        int b = sumA;
        if (b>a)
        {
            for (i=1; i<b; i++)
            {
                if (b%i==0)
                    sumB+=i;
            }
        }
        if (sumB==a)
            System.out.println(b);
        else
            System.out.println("Такого числа нет!");

    }
}
