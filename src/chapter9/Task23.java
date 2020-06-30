package chapter9;

import java.util.Scanner;

public class Task23 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое трехзначное число: ");
        int a = in.nextInt();
        int a1 = a/100, a2 = a%100/10, a3 = a%10;
        int summ = a1+a2+a3, pr = a1*a2*a3;
        if (summ%2==0 && pr%2==0)
            System.out.println("Является дважды четным");
        else
            System.out.println("Не является дважды четным");
    }
}
