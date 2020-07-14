package chapter11;

import java.util.Scanner;

public class Task50 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n,i,a1,a2,a3,a4,n1,n2;
        System.out.print("Введите двузначное целое положительное число: ");
        n = in.nextInt();
        for (i=1000;i<=9999;i++)
        {
            a1 = i/1000;
            a2 = i%1000/100;
            a3 = i%100/10;
            a4 = i%10;
            n1 = n/10;
            n2 = n%10;
            if ((a1+a2==n1+n2)&&(a3+a4==n1+n2))
                System.out.print(i + " ");
        }
    }
}
