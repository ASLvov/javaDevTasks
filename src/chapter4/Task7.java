package chapter4;

import java.util.Scanner;

public class Task7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное двузначное число: ");
        int a = in.nextInt();
        int b = ((a%10)*10 + (a/10)) + 8;
        System.out.print(b);
    }
}
