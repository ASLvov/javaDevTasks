package chapter15;

import java.util.Scanner;

public class Task6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num=0, count=0, sum=0;
        while (num!=999)
        {
            System.out.print("Введите число: ");
            num = in.nextInt();
            if (num!=999) {
                count++;
                sum+=num;
            }
        }
        System.out.println("Число 999 введено после " + count + " попыток, " +
                "сумма всех введенных до этого значений равна " + sum);
    }
}
