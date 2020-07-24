package chapter18;

import java.util.Scanner;

public class Task13 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int low=1000, up=9999, n, i;
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        int[] array = new int[n];
        for (i=0;i<n;i++)
        {
            array[i] = low + (int)((up-low+1)*Math.random());
        }
        for (i=0;i<n;i++)
        {
            System.out.print(array[n-1-i] + " ");
        }
    }
}
