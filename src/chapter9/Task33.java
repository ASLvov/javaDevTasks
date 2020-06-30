package chapter9;

import java.util.Scanner;

public class Task33 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите через пробел два целых положительных числа: ");
        int a = in.nextInt(), b = in.nextInt();
        if (a!=0 && b!=0)
        {
            if (a<b)
                System.out.println("Правильная дробь");
            if (a==b || a%b==0)
                System.out.println("Это целое число");
            if (a>b && a%b!=0)
                System.out.println(a/b + " " + a%b + "/" + b);
        }
        else
            System.out.println("Дробь не существует");
    }
}
