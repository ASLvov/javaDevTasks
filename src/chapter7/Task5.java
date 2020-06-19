package chapter7;

import java.util.Scanner;

public class Task5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        int a = in.nextInt();
        if (a>0) System.out.println("Положительное число");
        else System.out.println("Не положительное число");
    }
}
