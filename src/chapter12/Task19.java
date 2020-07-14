package chapter12;

import java.util.Scanner;

public class Task19 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Через пробел введите координаты центра окружности и радиус окружности: ");
        double x = in.nextDouble(), y = in.nextDouble(), r = in.nextDouble();
        double x1,y1;
        int countIn=0, countOn=0;
        System.out.println("Введите координаты 15 точек (в качестве разделителя используйте пробел):");
        for (int i = 1; i<=15; i++)
        {
            System.out.print(i+") ");
            x1 = in.nextDouble();
            y1 = in.nextDouble();
            if (((x1-x)*(x1-x) + (y1-y)*(y1-y)) < r*r)
                countIn++;
            if (((x1-x)*(x1-x) + (y1-y)*(y1-y)) == r*r)
                countOn++;
        }
        System.out.println("Внутри окружности " + countIn + " точек");
        System.out.println("На окружности " + countOn + " точек");
    }
}
