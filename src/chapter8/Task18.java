package chapter8;

import java.util.Scanner;

public class Task18 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите положительное трехзначное число: ");
        int number = in.nextInt();
        int n1=number/100, n2=number%100/10, n3=number%10;
        int degree=0;
        if (n1%2==0) degree++;
        if (n2%2==0) degree++;
        if (n3%2==0) degree++;
        System.out.println("Степень четности введенного числа равна " + degree);
    }
}
