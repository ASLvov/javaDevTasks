package chapter4;

import java.util.Scanner;

public class Task22 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите трехзначное число: ");
        int a = in.nextInt();
        int b = a%10*100 + a/100*10 + a%100/10;
        System.out.print("Сдвиг вправо по кругу для введенного числа - " + b);
    }
}

