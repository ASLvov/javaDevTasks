package chapter22;

import java.util.Scanner;

public class Task10 {
    static Scanner in = new Scanner(System.in);

    public static int calculateArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                sum += array[i][j];
        return sum;
    }

    public static void fillArray(int[][] array) {
        int low = 0, up = 9;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                array[i][j] = low + (int) ((up - low + 1) * Math.random());
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        fillArray(arr);
        printArray(arr);
        int sum = calculateArray(arr);
        System.out.println("Сумма всех элементов массива равна " + sum);
    }
}
