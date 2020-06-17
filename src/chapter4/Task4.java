package chapter4;

import java.util.Scanner;

public class Task4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное трехзначное число: ");
        int a = in.nextInt();
        System.out.print((a%10) + " " + ((a/10)%10) + " " + (a/100));
    }
}
