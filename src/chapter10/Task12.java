package chapter10;

import java.util.Scanner;

public class Task12 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n1,n2,n3,min=2,max=11,sum;
        n1 = min + (int)((max-min+1)*Math.random());
        System.out.println(n1);
        n2 = min + (int)((max-min+1)*Math.random());
        System.out.println(n2);
        n3 = min + (int)((max-min+1)*Math.random());
        System.out.println(n3);
        System.out.println("Еще? y/n");
        String ans = in.next();
        if (ans.equals("y"))
        {
            int n4 = min + (int)((max-min+1)*Math.random());
            System.out.println(n4);
            sum = n1 + n2 + n3 + n4;
            System.out.println("Сумма: " + sum);
        }
        else
        {
            sum = n1 + n2 + n3;
            System.out.println("Сумма: " + sum);
        }
        if (sum==21)
            System.out.println("Очко!");
        if (sum>21)
            System.out.println("Перебор!");
        if (sum<21)
            System.out.println("Недобор!");
    }
}
