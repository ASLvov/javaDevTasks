package chapter9;

import java.util.Scanner;

public class Task8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите номер билета: ");
        int num = in.nextInt();
        int n1,n2,n3,n4,n5,n6;
        n1 = num/100000;
        n2 = num%100000/10000;
        n3 = num%10000/1000;
        n4 = num%1000/100;
        n5 = num%100/10;
        n6 = num%10;
        if ((n1+n2+n3)==(n4+n5+n6) && (n1+n2+n3)%2==0 && (n4+n5+n6)%2==0)
            System.out.println("Билет счастливый");
        else
            System.out.println("Билет не является счастливым");
    }
}
