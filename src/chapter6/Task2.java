package chapter6;

import java.util.Scanner;

public class Task2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double num;
        System.out.println("enter number");
        num = in.nextDouble();
        if (num>0) System.out.println("Положительное число");
        System.out.println("Завершено");
        //1. Если введено 8, будет выведено "Положительное число /n Завершено"
        //2. Если введено -9, будет выведено "Завершено"
        //3. Если введено 0, будет выведено "Завершено"
        //4. 5
        //5. -73
        //6. Потому что оно находится вне зоны действия оператора if
        //7. Нужно после условия добавить фигурные скобки
    }
}
