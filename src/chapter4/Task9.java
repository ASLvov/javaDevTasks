package chapter4;

import java.util.Scanner;

public class Task9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное двузначное число: ");
        int a = in.nextInt();
        int weight = a%10 + a/10;
        System.out.print("Вес числа равен " + weight);
    }
}
