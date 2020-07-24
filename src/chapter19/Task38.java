package chapter19;

import java.util.ArrayList;
import java.util.Scanner;

public class Task38 {
    static Scanner in = new Scanner(System.in);

    public static int Maximum(int[] array){
        int n = array.length;
        int max = array[0];
        for (int i=1; i<n; i++){
            if (array[i]>max)
                max = array[i];
        }
        return max;
    }

    public static ArrayList<Integer> AllMax(int[] array){
        int n = array.length;
        int max = Maximum(array);
        ArrayList<Integer> cells = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
            if (array[i]==max)
                cells.add(i);
        }
        return cells;
    }

    public static void fill(int[] array){
        int n = array.length;
        int low = -10, up = 10;
        for (int i=0; i<n; i++){
            array[i] = low + (int)((up-low+1)*Math.random());
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] array = new int[n];
        fill(array);
        for (int i=0; i<n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        ArrayList<Integer> output = AllMax(array);
        for (int i=0; i<output.size(); i++)
            System.out.print(output.get(i) + " ");
    }
}
