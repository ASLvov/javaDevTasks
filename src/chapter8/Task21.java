package chapter8;

import java.util.Scanner;

public class Task21 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите положительное целое число: ");
        int num = in.nextInt();
        if (num%10 < 5)
            System.out.println(num/10*10);
        else
            System.out.println((num/10+1)*10);
    }
}
