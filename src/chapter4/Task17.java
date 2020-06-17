package chapter4;

import java.util.Scanner;

public class Task17 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите четырехзначное число: ");
        int a = in.nextInt();
        int b = a%10*1000 + a%1000/10*10 + a/1000;
        System.out.print("Перестановка для введенного числа - " + b);
    }
}
