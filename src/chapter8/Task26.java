package chapter8;

import java.util.Scanner;

public class Task26 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        String a = in.next();
        StringBuffer b = new StringBuffer(a);
        if (a.equals(b.reverse().toString()))
            System.out.println("Это палиндром");
        else
            System.out.println("Это не палиндром");

    }
}
