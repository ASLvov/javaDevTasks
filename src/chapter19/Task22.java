package chapter19;

import java.util.Scanner;

public class Task22 {
    static Scanner in = new Scanner(System.in);

    public static int HowMany(int[] array, int x){
        int n = array.length;
        int count=0;
        for (int i=0; i<n; i++){
            if (array[i]==x)
                count++;
        }
        return count;
    }

    public static void fill(int[] array){
        int n = array.length;
        int low=50, up=99;
        for (int i=0; i<n; i++)
            array[i] = low + (int)((up-low+1)*Math.random());
    }

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] array = new int[n];
        fill(array);
        for (int i = 0; i<n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        System.out.print("Какое число искать? ");
        int x = in.nextInt();
        int output = HowMany(array, x);
        System.out.println("Число " + x + " встречается в массиве " + output + " раз");
    }
}
