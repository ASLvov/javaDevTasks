package chapter13;

import java.util.Scanner;

public class Task18 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите сумму на вкладе: ");
        double cash = in.nextDouble();
        System.out.print("Введите ежемесячный процент: ");
        double percent = in.nextDouble();
        System.out.print("Введите срок вклада в месяцах: ");
        int monthsCount = in.nextInt();
        for (int i=1; i<=monthsCount; i++)
            cash = cash*(1+percent/100);
        System.out.println("По истечению срока вклада у Вас будет " + Math.round(cash) + " рублей!");
    }
}
