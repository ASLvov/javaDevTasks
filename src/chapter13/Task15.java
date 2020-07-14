package chapter13;

import java.util.Scanner;

public class Task15 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите двузначное положительное число, составленное из разных цифр: ");
        int x = in.nextInt();
        int a1,a2,i,sum=0;
        a1 = x/10;
        a2 = x%10;
        if (a1<a2)
        {
            for (i=a1;i<=a2;i++)
                sum+=i;
        }
        if (a1>a2)
        {
            for (i=a2;i<=a1;i++)
                sum+=i;
        }
        System.out.println("Сумма чисел, заключенных между цифрами введенного числа равна " + sum);
    }
}
