package chapter22;

import java.util.Scanner;

public class Task6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        int n = in.nextInt();
        int[][] array = new int[n][n];
        int min = 10, max = 99;
        for (int i = 0; i < n; i++) {
            int rand = min + (int) ((max - min + 1) * Math.random());
            for (int j = 0; j < n; j++) {
                array[i][j] = rand;
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
