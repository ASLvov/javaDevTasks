package chapter9;

import java.util.Scanner;

public class Task22 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Сколько нужно выплатить? ");
        int a = in.nextInt();
        int hundred = a/100;
        int fifty = a%100/50;
        int ten = (a - hundred*100 - fifty*50)/10;
        if (a == hundred*100+fifty*50+ten*10)
            System.out.println(hundred + " сторублевых, " + fifty + " пятидесятирублевых и " + ten + " десятирублевых купюр");
        else
            System.out.println("Невозможно выплатить указанную сумму");

    }
}
