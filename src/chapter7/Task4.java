package chapter7;

import java.util.Scanner;

public class Task4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int a = x%100;
        if (x==a) System.out.print("Ok");
        else System.out.print("No");
        //1. No, x=165, a=65 => x!=a
        //2. No, x=5555, a=55 => x!=a
        //3. 66
        //4. -99 <= x <= 99
    }
}
