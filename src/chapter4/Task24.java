package chapter4;

import java.util.Scanner;

public class Task24 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое трехзначное число: ");
        int a = in.nextInt();
        System.out.print("Введите второе трехзначное число: ");
        int b = in.nextInt();
        int lastA = a%10, lastB = b%10;
        int newA = a - lastA + lastB, newB = b - lastB + lastA;
        System.out.print("В результате обмена получились числа " + newA + " и " + newB);
    }
}
