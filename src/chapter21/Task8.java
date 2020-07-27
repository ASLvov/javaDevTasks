package chapter21;

import java.util.Scanner;

public class Task8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое имя: ");
        String name1 = in.nextLine();
        System.out.print("Введите второе имя: ");
        String name2 = in.nextLine();
        if (name1.equals(name2))
            System.out.println("Эти люди тёзки");
        else
            System.out.println("Эти люди не тёзки");
    }
}
