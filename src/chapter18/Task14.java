package chapter18;

import java.util.Scanner;

public class Task14 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int low=100, up=999, n, i;
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        int[] array = new int[n];
        for (i=0;i<n;i++)
        {
            array[i] = low + (int)((up-low+1)*Math.random());
        }
        if (n%2==0)
        {
            for (i=0;i<n/2;i++)
                System.out.print(array[i] + " ");
            System.out.println();
            for (i=n/2;i<n;i++)
                System.out.print(array[i] + " ");
        }
        else
        {
            for (i=0;i<=n/2;i++)
                System.out.print(array[i] + " ");
            System.out.println();
            for (i=n/2+1;i<n;i++)
                System.out.print(array[i] + " ");
        }
    }
}
