package chapter11;

import java.util.Scanner;

public class Task54 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m,n,i;
        System.out.print("Введите через пробел два целых положительных двузначных числа: ");
        m = in.nextInt();
        n = in.nextInt();
        if (m<n)
            for (i=m;i<=n;i++)
                System.out.print(i + " ");
        else
            for (i=n;i<=m;i++)
                System.out.print(i + " ");
    }
}
