package chapter4;

import java.util.Scanner;

public class Task12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное трехзначное число: ");
        int a = in.nextInt();
        int len = (a/100 - a%10)*((a%100)/10);
        System.out.print("Длина числа равна " + len);
    }
}
