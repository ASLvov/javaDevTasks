package chapter4;

import java.util.Scanner;

public class Task23 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите четырехзначное число: ");
        int a = in.nextInt();
        int b = a%10*1000 + a/1000*100 + a/100%10*10 + a/10%10;
        System.out.print("Сдвиг вправо по кругу для введенного числа - " + b);
    }
}
