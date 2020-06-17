package chapter4;

import java.util.Scanner;

public class Task20 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите трехзначное число: ");
        int a = in.nextInt();
        int b = a%100/10*100 + a%10*10 + a/100;
        System.out.print("Сдвиг влево по кругу для введенного числа - " + b);
    }
}
