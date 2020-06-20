package chapter8;

import java.util.Scanner;

public class Task20 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите трехзначное положительное число: ");
        int num = in.nextInt();
        if ((num%100/10 == 0)||(num%10 == 0))
            System.out.println("Число содержит ноль");
        else System.out.println("Число не содержит ноль");
    }
}
