package chapter22;

import java.util.Scanner;

public class Task9 {
    static Scanner in = new Scanner(System.in);

    public static void fill_array(int[][] array, int low, int up) {
        int n = array.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                array[i][j] = low + (int) ((up - low + 1) * Math.random());
    }

    public static void print_array(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println();
        }
    }

    public static int counter(int[][] array, int x) {
        int count = 0;
        int n = array.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (array[i][j] == x) count++;
        return count;
    }

    public static void main(String[] args) {
        int low = 0, up = 9;
        System.out.print("Введите размерность массива: ");
        int n = in.nextInt();
        int[][] array = new int[n][n];
        fill_array(array, low, up);
        print_array(array);
        System.out.print("Введите значение, которое будем считать: ");
        int x = in.nextInt();
        int answer = counter(array, x);
        System.out.println("Значение " + x + " содержится в массиве " + answer + " раз");
    }
}
