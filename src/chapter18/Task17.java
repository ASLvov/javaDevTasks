package chapter18;

import java.util.Scanner;

public class Task17 {
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
            for (i=0; i<n/2; i++)
            {
                System.out.println(array[i] + " и " + array[n-1-i]);
            }
        }
        else
        {
            for (i=0; i<n/2; i++)
            {
                System.out.println(array[i] + " и " + array[n-1-i]);
            }
            System.out.println(array[n/2]);
        }
    }
}
