package chapter6;

import java.util.Scanner;

public class Task7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int a = in.nextInt();
        if ((a>0)&&(a>=100)) System.out.println(a-1);
    }
}
