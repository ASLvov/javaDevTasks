package chapter13;

import java.util.Scanner;

public class Task32 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число слагаемых: ");
        int n = in.nextInt();
        double sum=0, temp, pi;
        for (int i=1;i<=n;i++)
        {
            temp = 1/(double)(i*i);
            sum+=temp;
        }
        pi = Math.sqrt(sum*6);
        System.out.println("Число Пи для последовательности с " + n + " слагаемыми равно " + pi);
    }
}
