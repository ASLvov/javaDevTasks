package chapter9;

import java.util.Scanner;

public class Task21 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите время в секундах: ");
        int t = in.nextInt();
        int h = t/3600, m = t%3600/60, s = t%3600%60;
        if (h<24)
            System.out.println(h + " часов " + m + " минут " + s + " секунд");
        else
            System.out.println("Расчет не производится");

    }
}
