package chapter7;

import java.util.Scanner;

public class Task2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        int digit1 = a/10;
        int digit2 = a%10;
        if (digit1==digit2) System.out.println("Цифры одинаковые");
        else System.out.println("Цифры различны");
        //2. Если ввести 22 или 33 и т.п., на экран будет выведено
        // сообщение, что цифры одинаковые, если ввести 15, 29, 43
        // и т.п., то будет выведено сообщение, что цифры различны
    }
}
