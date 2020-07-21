package chapter17;

import java.util.Scanner;

public class Task21 {
    static Scanner in = new Scanner(System.in);

    public static double dist(int x, int y) {
        double distance;
        distance = Math.sqrt(x*x+y*y);
        return distance;
    }

    public static void main(String[] args) {
        System.out.print("Введите координаты точки через пробел: ");
        int x = in.nextInt(), y = in.nextInt();
        double distance = dist(x,y);
        System.out.println("Расстояние от начала координат до точки равно " + distance);
    }
}
