package chapter22;

import java.util.Scanner;

public class Task13 {
    static Scanner in = new Scanner(System.in);

    public static int calculateBorder(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == (n - 1) || j == 0 || j == (m - 1))
                    sum += array[i][j];
            }
        }
        return sum;
    }

    public static int calculateInsight(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i != 0 && i != (n - 1) && j != 0 && j != (m - 1))
                    sum += array[i][j];
            }
        }
        return sum;
    }

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

    public static void main(String[] args) {
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int m = in.nextInt();
        int[][] array = new int[n][m];
        fillArray(array);
        printArray(array);
        System.out.println("Сумма всех элементов на границах массива равна " + calculateBorder(array));
        System.out.println("Сумма всех внутренних элементов массива равна " + calculateInsight(array));
        System.out.println();
        while (calculateInsight(array) != calculateBorder(array)) {
            fillArray(array);
        }
        printArray(array);
        System.out.println("Сумма всех элементов на границах массива равна сумме всех внутренних " +
                "элементов и равна " + calculateBorder(array));
    }
}
