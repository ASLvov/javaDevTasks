package chapter22;

import java.util.Scanner;

public class Task17 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите количество строк массива: ");
        int n = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int m = in.nextInt();
        int[][] array = new int[n][m];
        fillArray(array);
        printArray(array);
        int[][] maxAndMin = getMaximumAndMinimum(array);
        System.out.println("Максимальное значение массива равно " + maxAndMin[0][0] + ", оно встречается " +
                maxAndMin[1][0] + " раз");
        System.out.println("Минимальное значение массива равно " + maxAndMin[0][1] + ", оно встречается " +
                maxAndMin[1][1] + " раз");
    }

    public static void fillArray(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        int low = 10, up = 99;
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

    public static int[][] getMaximumAndMinimum(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        int[][] output = new int[2][2];
        int max = array[0][0], min = array[0][0];
        int counterMax=0, counterMin=0;
        for (int i=0; i<n; i++)
            for (int j = 0; j<m; j++) {
                if (array[i][j]>max) max = array[i][j];
                if (array[i][j]<min) min = array[i][j];
            }
        output[0][0] = max;
        output[0][1] = min;
        for (int i = 0; i<n; i++)
            for (int j=0; j<m; j++) {
                if (array[i][j] == max) counterMax++;
                if (array[i][j] == min) counterMin++;
            }
        output[1][0] = counterMax;
        output[1][1] = counterMin;
        return output;
    }
}
