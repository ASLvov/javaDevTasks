package chapter9;

import java.util.Scanner;

public class Task16 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //по заданию 10 часов не включается ни в один промежуток
        System.out.println("Какой сейчас час? ");
        System.out.print("Ответ: ");
        int h = in.nextInt();
        if (h>=6 && h<10)
            System.out.println("Утро");
        if (h>10 && h<=18)
            System.out.println("День");
        if (h>18 && h<=22)
            System.out.println("Вечер");
        if ((h == 23) || (h>=0 && h<6))
            System.out.println("Ночь");
        if (h<0 || h>=24)
            System.out.println("Это не часы");
    }
}
