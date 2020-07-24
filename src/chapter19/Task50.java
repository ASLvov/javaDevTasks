package chapter19;

import java.util.Scanner;

public class Task50 {
    static Scanner in = new Scanner(System.in);

    public static int ParallelCells(int[] array1, int[] array2, int n){
        int count=0;
        for (int i=0; i<n; i++){
            if (array1[i]==array2[i])
                count++;
        }
        return count;
    }

    public static void fill(int[] array, int n){
        int low=-5, up=5;
        for (int i=0; i<n; i++)
            array[i] = low + (int)((up-low+1)*Math.random());
    }

    public static void output(int[] array){
        int n= array.length;
        for (int i=0; i<n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Введите размерность массивов: ");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        fill(arr1, n);
        fill(arr2, n);
        output(arr1);
        output(arr2);
        int counter = ParallelCells(arr1, arr2, n);
        System.out.println("Массивы содержат " + counter + " параллельных ячеек с одинаковыми значениями");
    }
}
