package chapter21;

import java.util.Scanner;

public class Task5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        String name = in.next();
        for (int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
    }
}
