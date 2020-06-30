package chapter9;

import java.util.Scanner;

public class Task37 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите имя и фамилию первого человека: ");
        String fname1 = in.nextLine();
        System.out.print("Введите имя и фамилию второго человека: ");
        String fname2 = in.nextLine();
        String name1 = fname1.split(" ", 2)[0];
        String secondName1 = fname1.split(" ", 2)[1];
        String name2 = fname2.split(" ", 2)[0];
        String secondName2 = fname2.split(" ", 2)[1];
        if (name1.equals(name2) && !(secondName1.equals(secondName2)))
            System.out.println("Тезки, но не однофамильцы");
        if (!(name1.equals(name2)) && secondName1.equals(secondName2))
            System.out.println("Однофамильцы, но не тезки");
        if (name1.equals(name2) && secondName1.equals(secondName2))
            System.out.println("Тезки и однофамильцы");
        if (!(name1.equals(name2)) && !(secondName1.equals(secondName2)))
            System.out.println("Не тезки и не однофамильцы");
    }
}
