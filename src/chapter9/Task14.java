package chapter9;

import java.util.Scanner;

public class Task14 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите оценку: ");
        int a = in.nextInt();
        if (a==1 || a==2)
            System.out.println("Неудовлетворительно");
        if (a==3)
            System.out.println("Удовлетворительно");
        if (a==4)
            System.out.println("Хорошо");
        if (a==5)
            System.out.println("Отлично");
        if (a>5 || a<1)
            System.out.println("Число не является оценкой");
    }
}
