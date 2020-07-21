package chapter17;

import java.util.Scanner;

public class Task10and11 {
    static Scanner in = new Scanner(System.in);

    public static int[] func (int num) {
        int count=0, sum=0;
        while (num!=0)
        {
            sum+=num%10;
            count++;
            num=num/10;
        }
        return new int[] {count, sum};
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int result[] = func(num);
        System.out.println("Число цифр равно " + result[0]);
        System.out.println("Сумма цифр равна " + result[1]);
    }
}
