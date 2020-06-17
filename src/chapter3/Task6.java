package chapter3;

import java.util.Scanner;

public class Task6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.print((a+2) + " " + (a+4) + " " + (a+6));
    }
}
