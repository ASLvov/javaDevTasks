package chapter8;

import java.util.Scanner;

public class Task2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введи целое число: ");
        int a = in.nextInt();
        System.out.print("Введи еще одно целое число: ");
        int b = in.nextInt();
        if (a%b==0) System.out.println("Yes");
        else System.out.println("No");
        if (b%a==0)
        {
            a+=2;
            System.out.println("Good");
        }
        else
        {
            a=2;
            System.out.println("Bad");
        }
        System.out.println(a);
        //1. a) No. Good. 5
        //   b) Yes. Bad. 2
        //   c) Yes. Good. 15
        //   d) No. Bad. 2
        //2. Остаток от деления a на b равен/не равен 0
        //3. Не целые числа

    }
}
