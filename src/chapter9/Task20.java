package chapter9;

import java.util.Scanner;

public class Task20 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите время в секундах: ");
        int t = in.nextInt();
        int m = t/60, s = t%60;
        if (m<60)
            System.out.println(m + " минут " + s + " секунд");
        else
            System.out.println("Расчет не производится");
    }
}
