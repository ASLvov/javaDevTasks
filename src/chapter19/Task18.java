package chapter19;

import java.util.Scanner;

public class Task18 {
    static Scanner in = new Scanner(System.in);

    public static void func(int[] array){
        int n = array.length;
        int low = 10, up = 99, temp;
        for (int i=0; i<n; i++){
            temp = low + (int)((up-low+1)*Math.random());
            array[i] = temp;
            low = temp;
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        int n = in.nextInt();
        int[] array = new int[n];
        func(array);
        for (int i=0; i<n; i++)
            System.out.print(array[i] + " ");
    }
}
