package chapter8;

import java.util.Scanner;

public class Task22 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        int num = in.nextInt(), ans;
        if (num%2 == 0)
        {
            ans = (num/10+1)*10;
            System.out.println("Up to " + ans);
        }
        else
        {
            ans = num/10*10;
            System.out.println("Down to " + ans);
        }
    }
}
