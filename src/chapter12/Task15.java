package chapter12;

import java.util.Scanner;

public class Task15 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,i,count=0;
        System.out.print("Введите целое положительное число: ");
        x = in.nextInt();
        for (i=2;i<x;i++)
        {
            if (x%i==0)
            {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Всего " + count + " делителей");
    }
}
