package chapter3;

import java.util.Scanner;

public class Task9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите количество крышек с номиналом 10: ");
        int a = in.nextInt();
        System.out.print("Введите количество крышек с номиналом 100: ");
        int b = in.nextInt();
        System.out.print("Введите количество крышек с номиналом 1000: ");
        int c = in.nextInt();
        System.out.print("У Вас " + (a*10+b*100+c*1000) + " баллов!");
    }
}
