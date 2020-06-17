package chapter4;

import java.util.Scanner;

public class Task15 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите целое положительное четырехзначное число: ");
        int a = in.nextInt();
        int st = 0;
        if ((a/1000)%2 == 0)
            st+=1;
        if (((a%1000)/100)%2 == 0)
            st+=1;
        if (((a%100)/10)%2 == 0)
            st+=1;
        if ((a%10)%2 == 0)
            st+=1;
        System.out.print("Степень четности равна " + st);
    }
}
