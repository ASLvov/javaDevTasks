package chapter8;

import java.util.Scanner;

public class Task13 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите двузначное положительное число: ");
        int num = in.nextInt();
        if (num/10==num%10) System.out.println("Число составлено из одинаковых цифр");
        else System.out.println("Число составлено из разных цифр");

    }
}
