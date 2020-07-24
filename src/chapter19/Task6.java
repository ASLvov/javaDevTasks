package chapter19;

import java.util.Scanner;

public class Task6 {
    static Scanner in = new Scanner(System.in);

    public static void ArrayOutput (int[] array) {
        int n = array.length;
        for (int i=0; i<n; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int low = 10, up = 999;
        int[] array = new int[n];
        for (int i=0; i<n; i++)
            array[i] = low + (int)((up-low+1)*Math.random());
        ArrayOutput(array);
    }

}
