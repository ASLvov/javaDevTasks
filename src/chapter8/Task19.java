package chapter8;

import java.util.Scanner;

public class Task19 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Введите четырехзначное число: ");
        int num = in.nextInt();
        if (num/100 == num%100) System.out.print("Число является парно-симметричным");
        else System.out.println("Число не является парно-симметричным");
    }
}
