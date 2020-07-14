package chapter11;

import java.util.Scanner;

public class Task57 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,i;
        System.out.print("Введите число: ");
        a = in.nextInt();
        for (i=0; i<=15; i++)
            System.out.print((1+i*a) + "#");
    }
}
