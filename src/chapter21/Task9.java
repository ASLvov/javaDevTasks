package chapter21;

import java.util.Scanner;

public class Task9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите имя и фамилию: ");
        String name = in.next(), surname = in.next();
        if (name.length()>surname.length())
            System.out.println("В имени больше букв");
        else
            if (name.length()<surname.length())
                System.out.println("В фамилии больше букв");
            else
                System.out.println("Одинаковое количество букв");
    }
}
