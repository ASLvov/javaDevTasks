package chapter10;

import java.util.Scanner;

public class Task8 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int min = num-5, max = num+5;
        int a = min + (int)((max-min+1)*Math.random());
        if (a==num)
            System.out.println(a + "! Угадал!");
        if (a>num)
            System.out.println(a + "! Слишком большое!");
        if (a<num)
            System.out.println(a + "! Слишком маленькое!");
    }
}
