package chapter10;

import java.util.Scanner;

public class Task4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        int a = in.nextInt();
        int b,c,d;
        b = a - (int)(10*Math.random()+1);
        c = a - (int)(10*Math.random()+1);
        d = a - (int)(10*Math.random()+1);
        System.out.println(b + " " + c + " " + d);
    }
}
