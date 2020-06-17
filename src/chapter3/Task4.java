package chapter3;

import java.util.Scanner;

public class Task4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите сумму в валюте: ");
        double cash = in.nextDouble();
        System.out.print("Введите коэффициент перевода: ");
        double k = in.nextDouble();
        System.out.print("Сумма равна " + (cash*k));
    }
}
