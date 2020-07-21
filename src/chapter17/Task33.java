package chapter17;

import java.util.Scanner;

public class Task33 {
    static Scanner in = new Scanner(System.in);

    public static int func (int D, int X) {
        int count=0, n;
        while (X!=0)
        {
            n = X%10;
            if (n==D)
                count++;
            X = X/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int number = in.nextInt();
        System.out.print("Введите цифру: ");
        int digit = in.nextInt();
        System.out.print("Цифра " + digit + " входит в число " + number + " " + func(digit,number) + " раза");
    }
}
