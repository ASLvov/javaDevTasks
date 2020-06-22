package chapter9;

import java.util.Scanner;

public class Task5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите номер квартиры: ");
        int flat = in.nextInt();
        int floor;
        if (flat%3!=0)
            floor = flat/3 + 1;
        else
            floor = flat/3;
        if (flat%3 == 1)
            System.out.println("Квартира слева на " + floor + " этаже");
        if (flat%3 == 2)
            System.out.println("Квартира в центре на " + floor + " этаже");
        if (flat%3 == 0)
            System.out.println("Квартира справа на " + floor + " этаже");
    }
}
