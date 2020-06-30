package chapter9;

import java.util.Scanner;

public class Task36 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое имя: ");
        String name1 = in.next();
        System.out.print("Введите второе имя: ");
        String name2 = in.next();
        if (name1.equals(name2))
            System.out.println("Эти люди тезки");
        else
            System.out.println("Эти люди не тезки");
    }
}
