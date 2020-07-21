package chapter17;

import java.util.Scanner;

public class Task38 {
    static Scanner in = new Scanner(System.in);

    public static int func (int x, int y) {
        if (x>0 && y>0)
            return 1;
        if (x>0 && y<0)
            return 4;
        if (x<0 && y>0)
            return 2;
        if (x<0 && y<0)
            return 3;
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Введите координаты точки А через пробел: ");
        int x=in.nextInt(), y=in.nextInt();
        int c=func(x,y);
        if (c==-1)
            System.out.print("Точка находится на оси");
        else
            System.out.print("Точка с такими координатами находится в " + c + " четверти");
    }
}
