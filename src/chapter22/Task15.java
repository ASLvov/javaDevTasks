package chapter22;

import java.util.Scanner;

public class Task15 {
    static Scanner in = new Scanner(System.in);

    public static void fillArray(int[][] array) {
        int low = 0, up = 9;
        int n = array.length;
        int m = array[0].length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                array[i][j] = low + (int) ((up - low + 1) * Math.random());
    }

    public static void printArray(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println();
        }
    }

    public static int[] evenElements(int[][] array, int k) {
        int count = 0;
        int m = array[0].length;
        for (int j = 0; j < m; j++)
            if (array[k][j] % 2 == 0)
                count++;
        int[] even = new int[count];
        int i = 0;
        for (int j = 0; j < m; j++)
            if (array[k][j] % 2 == 0) {
                even[i] = array[k][j];
                i++;
            }
        return even;
    }

    public static void main(String[] args) {
        System.out.print("Введите количество строк массива: ");
        int n = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int m = in.nextInt();
        int[][] array = new int[n][m];
        fillArray(array);
        printArray(array);
        System.out.print("Введите номер строки из которой нужно выбрать четные элементы: ");
        int k = in.nextInt();
        System.out.println("Четные элементы " + k + " строки: ");
        int[] even = evenElements(array, k);
        for (int i = 0; i < even.length; i++)
            System.out.print(even[i] + "  ");
    }
}
