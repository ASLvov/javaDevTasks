package chapter8;

import java.util.Scanner;

public class Task31 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите трехзначное число: ");
        int a = in.nextInt();
        int a1 = a/100, a2 = a%100/10, a3 = a%10;
        if (a%2 == 0)
        {
            if (a1%2==0) a1++;
            else
                if (a1!=1) a1--;
            if (a2%2==0) a2++;
            else
                if (a2!=1) a2--;
            if (a3%2==0) a3++;
            else
                if (a3!=1) a3--;
        }
        else
        {
            if ((a1%2!=0)&&(a1!=9)) a1++;
            else a1--;
            if ((a2%2!=0)&&(a2!=9)) a2++;
            else a2--;
            if ((a3%2!=0)&&(a3!=9)) a3++;
            else a3--;
        }
        System.out.println(a1*100+a2*10+a3);
    }
}
