package chapter4;

import java.util.Scanner;

public class Task5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное двузначное число: ");
        int a = in.nextInt();
        System.out.print((a-a%10) + "+" + (a%10));
    }
}
