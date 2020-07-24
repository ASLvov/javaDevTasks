package chapter18;

import java.util.Scanner;

public class Task16 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int low=10, up=99, n, i;
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        int[] array = new int[n];
        for (i=0;i<n;i++)
        {
            array[i] = low + (int)((up-low+1)*Math.random());
        }
        for (i=0;i<n;i++)
            if (array[i]%2==0)
                System.out.print(array[i] + " ");
        System.out.println();
        for (i=0;i<n;i++)
            if (array[i]%2!=0)
                System.out.print(array[i] + " ");
    }
}
