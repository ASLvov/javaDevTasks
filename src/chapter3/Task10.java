package chapter3;

import java.util.Scanner;

public class Task10 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Сколько заработал Вася? ");
        double ownCash = in.nextDouble();
        System.out.print("Сколько добавили родители? ");
        double parentsCash = in.nextDouble();
        double allCash = ownCash + parentsCash;
        System.out.print("Какой курс рубля по отношению к евро? ");
        double toEuro = in.nextDouble();
        System.out.print("У Васи " + (allCash*toEuro) + " евро");
    }
}
