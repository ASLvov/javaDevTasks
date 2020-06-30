package chapter9;

import java.util.Scanner;

public class Task35 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите символ: ");
        char symbol = in.next().charAt(0);
        if (symbol>='A' && symbol<='z')
            System.out.println("Это буква латинского алфавита");
        else
            System.out.println("Это не буква латинского алфавита");
    }
}
