package chapter4;

import java.util.Scanner;

public class Task13 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное двузначное число: ");
        int a = in.nextInt();
        int st = 0;
        if ((a/10)%2 == 0)
            st+=1;
        if ((a%10)%2 == 0)
            st+=1;
        System.out.print("Степень четности равна " + st);
    }
}
