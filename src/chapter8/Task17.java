package chapter8;

import java.util.Scanner;

public class Task17 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите трехзначное число: ");
        int a = in.nextInt();
        int a1=a/100, a2=a%100/10, a3=a%10;
        int sum=a1+a2+a3;
        if ((a%2==0) && (sum%2==0)) System.out.println("Число является дважды четным");
        else System.out.println("Число не является дважды четным");
    }
}
