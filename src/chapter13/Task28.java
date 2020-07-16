package chapter13;

import java.util.Scanner;

public class Task28 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a1,a2,b1,b2,d,temp=0;
        System.out.print("Введите первую пару чисел: ");
        a1 = in.nextInt();
        b1 = in.nextInt();
        System.out.print("Введите вторую пару чисел: ");
        a2 = in.nextInt();
        b2 = in.nextInt();
        if ((b1+1) == b2)
            System.out.println("Это соседние члены арифметической прогрессии");
        else
            if (b1<b2)
            {
                d = (a2-a1)/(b2-b1);
                for (int i=b1;i<=b2;i+=1)
                {
                    System.out.print((a1+temp)+" ");
                    temp+=d;
                }
            }
    }
}
