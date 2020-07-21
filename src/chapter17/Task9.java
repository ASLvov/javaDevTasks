package chapter17;

import java.util.Scanner;

public class Task9 {
    static Scanner in = new Scanner(System.in);

    public static String output (int a, int b) {
        String out="";
        for (int i=a; i<=b; i++)
        {
            if (i%2==0)
                out+=i + " ";
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.println(output(a,b));
    }
}
