package chapter17;

import java.util.Scanner;

public class Task16and17 {
    static Scanner in = new Scanner(System.in);

    public static int[] func (int num) {
        int n, n1, n2, count=0;
        n=num;
        while (num!=0)
        {
            num=num/10;
            count++;
        }
        n1 = n/(int)(Math.pow(10,count-1));
        n2 = n%(int)(Math.pow(10,count-1));
        return new int[] {n1, n2};
    }

    public static void main(String[] args) {
        System.out.print("Введите целое положительное число большее 10: ");
        int num = in.nextInt();
        int result[] = func(num);
        System.out.println("Первая цифра: " + result[0]);
        System.out.println("Число без первой цифры: " + result[1]);
    }
}
