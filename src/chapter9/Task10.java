package chapter9;

import java.util.Scanner;

public class Task10 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите три целых числа через пробел: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a==b)
        {
            if (a==c)
                System.out.println("Все значения одинаковы");
            if (a>c)
                System.out.println("Первое и второе равны и больше, чем третье");
            if (a<c)
                System.out.println("Первое и второе равны и меньше, чем третье");
        }
        if (a==c)
        {
            if (a>b)
                System.out.println("Первое и третье равны и больше, чем второе");
            if (a<b)
                System.out.println("Первое и третье равны и меньше, чем второе");
        }
        if (b==c)
        {
            if (b>a)
                System.out.println("Второе и третье равны и больше, чем первое");
            if (b<a)
                System.out.println("Второе и третье равны и меньше, чем первое");
        }
        if (a>b && b>c)
            System.out.println("Первое больше второго, второе больше третьего");
        if (a>c && b<c)
            System.out.println("Первое больше второго, второе меньше третьего");
        if (b>a && a>c)
            System.out.println("Второе больше первого, первое больше третьего");
        if (b>c && a<c)
            System.out.println("Второе больше третьего, третье больше первого");
        if (c>a && a>b)
            System.out.println("Третье больше первого, первое больше второго");
        if (c>b && b>a)
            System.out.println("Третье больше второго, второе больше первого");



    }
}
