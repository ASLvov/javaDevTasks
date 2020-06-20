package chapter8;

import java.util.Scanner;

public class Task27 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите два целых положительных числа через пробел: ");
        int a = in.nextInt(), b = in.nextInt();
        if (a%10>b%10)
            System.out.println("Последняя цифра больше у числа " + a);
        if (b%10>a%10)
            System.out.println("Последняя цифра больше у числа " + b);
        if (a%10 == b%10)
            System.out.println("Последние цифры у этих чисел равны");
    }
}
