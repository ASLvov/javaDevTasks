package chapter4;

import java.util.Scanner;

public class Task26 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое трехзначное число: ");
        int a = in.nextInt();
        System.out.print("Введите второе трехзначное число: ");
        int b = in.nextInt();
        int firstA = a/100, firstB = b/100;
        int newA = firstB*100 + a%100, newB = firstA*100 + b%100;
        System.out.println("В результате большого обмена получились числа " + newA + " и " + newB);
        System.out.print("Операцию большого обмена возможно совершить, если числа разной длины, " +
                "для этого необходимо дополнительно вычислить длину введенных чисел");
    }
}
