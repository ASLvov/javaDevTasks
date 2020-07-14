package chapter11;

import java.util.Scanner;

public class Task48 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, a1, a2;
        System.out.print("Введите двузначное целое положительное число: ");
        n = in.nextInt();
        for (i=100;i<=999;i++)
        {
            a1 = i/10;
            a2 = i%100;
            if (a1==n || a2==n)
                System.out.print(i + " ");
        }
    }
}
