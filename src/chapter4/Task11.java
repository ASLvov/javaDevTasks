package chapter4;

import java.util.Scanner;

public class Task11 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное двузначное число: ");
        int a = in.nextInt();
        int len = a/10 - a%10;
        System.out.print("Длина числа равна " + len);
    }
}
