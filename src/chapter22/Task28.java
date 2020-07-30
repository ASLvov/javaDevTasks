package chapter22;

import java.util.Scanner;

public class Task28 {
    static Scanner in = new Scanner(System.in);

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

    public static boolean isLocalMaximum(int[][] array, int c, int k) {
        boolean flag = true;
        for (int i = c - 1; i <= c + 1; i++)
            for (int j = k - 1; j <= k + 1; j++) {
                if (i != c || j != k) {
                    if (array[i][j] >= array[c][k]) {
                        flag = false;
                        return flag;
                    }
                }
            }
        return flag;
    }

    public static int[] findGlobalMaximum(int[][] array) {
        int[] output = new int[3];
        int max = array[0][0];
        output[2] = max;
        int n = array.length;
        int m = array[0].length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (array[i][j] > max) {
                    max = array[i][j];
                    output[0] = i;
                    output[1] = j;
                    output[2] = max;
                }
        return output;
    }

    public static void findAllLocalMaximums(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        System.out.println("Координаты всех локальных максимумов: ");
        for (int i = 1; i < n - 1; i++)
            for (int j = 1; j < m - 1; j++) {
                if (isLocalMaximum(array, i, j)) {
                    System.out.println("(" + i + ";" + j + ")");
                }
            }
    }

    public static void main(String[] args) {
        System.out.print("Введите количество строк массива: ");
        int n = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int m = in.nextInt();
        int[][] array = new int[n][m];
        fillArray(array);
        printArray(array);
        System.out.print("Введите номера строки и столбца ячейки через пробел: ");
        int c = in.nextInt();
        int k = in.nextInt();
        if (isLocalMaximum(array, c, k))
            System.out.println("Элемент является локальным максимумом");
        else
            System.out.println("Элемент не является локальным максимумом");
        findAllLocalMaximums(array);
        int[] global = findGlobalMaximum(array);
        if (global[0] > 0 && global[0] < n - 1 && global[1] > 0 && global[1] < m - 1 && isLocalMaximum(array, global[0], global[1]))
            System.out.println("Глобальный максимум одновременно является и локальным!");
        else
            System.out.println("Глобальный максимум не является локальным");
    }
}
