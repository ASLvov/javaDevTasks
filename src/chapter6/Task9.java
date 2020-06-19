package chapter6;

import java.util.Scanner;

public class Task9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите трехзначное число: ");
        int a = in.nextInt();
        if (((a/100)%2 == 0)&&(((a%100)/10)%2==0)&&((a%10)%2==0)) System.out.print("Число является четно-красивым");

    }
}
