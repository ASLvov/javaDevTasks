package chapter6;

import java.util.Scanner;

public class Task6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        if (a==0) System.out.print("Ноль");
        if (a>0) System.out.print("Положительное");
        if (a<0) System.out.print("Отрицательное");
    }
}
