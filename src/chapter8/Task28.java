package chapter8;

import java.util.Scanner;

public class Task28 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите через пробел два целых положительных числа: ");
        int a = in.nextInt(), b = in.nextInt();
        if (b!=0&&a!=0)
            if (a<b)
                System.out.println("Дробь правильная");
            else
                if (b<a)
                    System.out.println("Дробь неправильная");
                else
                    System.out.println("Дробь выражает целое число");
        else
            if (a==0)
                System.out.println("Дробь равна 0");
            else
                System.out.println("Числа не могут выражать дробь");
    }
}
