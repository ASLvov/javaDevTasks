package chapter17;

import java.util.Scanner;

public class Task39 {
    static Scanner in = new Scanner(System.in);

    public static boolean func (int x1, int y1, int x2, int y2) {
        if ((x1>=0 && x2<=0) || (x1<=0 && x2>=0))
            return true;
        if ((y1>=0 && y2<=0) || (y1<=0 && y2>=0))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Введите координаты точки А через пробел: ");
        int x1=in.nextInt(), y1=in.nextInt();
        System.out.print("Введите координаты точки B через пробел: ");
        int x2=in.nextInt(), y2=in.nextInt();
        boolean c=func(x1,y1,x2,y2);
        if (c)
            System.out.print("Отрезок АВ пересекает ось");
        else
            System.out.print("Отрезок АВ не пересекает ось");
    }
}
