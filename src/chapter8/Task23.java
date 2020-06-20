package chapter8;

import java.util.Scanner;

public class Task23 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое целое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = in.nextInt();
        if (a>b)
        {
            a-=1;
            b+=1;
        }
        if (b>a)
        {
            b-=1;
            a+=1;
        }
        if (a == b)
        {
            a++;
            b++;
        }
        System.out.println("Now value 'a' is " + a + ", value 'b' is " + b);
    }
}
