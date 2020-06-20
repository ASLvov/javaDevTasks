package chapter8;

import java.util.Scanner;

public class Task24 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное трехзначное число: ");
        int ans, a = in.nextInt();
        if (a>500)
            ans = a%10*100 + a%100/10*10 + a/100;
        else
            ans = a/100*100 + a%10*10 + a%100/10;
        System.out.println("Now number is " + ans);
    }
}
