package chapter12;

import java.util.Scanner;

public class Task6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,i,count=0;
        System.out.print("Введите целое положительное число большее 10: ");
        a = in.nextInt();
        if (a<100) {
            for (i = 10; i <= a; i++)
                if (a % i == 0)
                {
                    count++;
                    System.out.print(i + " ");
                }
        }
        else
        {
            for (i=10; i<=99; i++)
                if (a%i==0)
                {
                    count++;
                    System.out.print(i + " ");
                }
        }
        System.out.println();
        System.out.println("Число делится на " + count + " двузначных чисел");
    }
}
