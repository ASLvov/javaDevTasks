package chapter3;

import java.util.Scanner;

public class Task1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите температуру по шкале Фаренгейта: ");
        double tempFaren = in.nextDouble();
        double tempCels = 5*(tempFaren-32)/9;
        System.out.print("Температура в градусах Цельсия равна " + tempCels);
    }
}
