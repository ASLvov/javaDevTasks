package chapter8;

import java.util.Scanner;

public class Task12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int mark = in.nextInt();
        if ((mark<1)||(mark>5)) System.out.println("Такой оценки не может быть");
        else System.out.println("Ошибки нет");
    }
}
