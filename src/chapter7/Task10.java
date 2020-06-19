package chapter7;

import java.util.Scanner;

public class Task10 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int a = in.nextInt();
        if (a<0) a*=-1;
        else a=0;
    }
}
