package chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task42 {
    static Scanner in = new Scanner(System.in);

    public static void Fill(ArrayList<Integer> array, int n){
        int low = 10, up = 50;
        for (int i=0; i<n; i++){
            int var = low + (int)((up-low+1)*Math.random());
            array.add(var);
        }
        Collections.sort(array);
    }

    public static void Output(ArrayList<Integer> array){
        int n = array.size();
        for (int i=0; i<n; i++)
            System.out.print(array.get(i) + " ");
        System.out.println();
    }

    public static ArrayList<Integer> union(ArrayList<Integer> array1, ArrayList<Integer> array2){
        array1.addAll(array2);
        Collections.sort(array1);
        return array1;
    }

    public static void main(String[] args) {
        System.out.print("Введите размер первого массива: ");
        int n1 = in.nextInt();
        System.out.print("Введите размер второго массива: ");
        int n2 = in.nextInt();
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        Fill(array1, n1);
        Output(array1);
        Fill(array2, n2);
        Output(array2);
        ArrayList<Integer> out = union(array1,array2);
        Output(out);
    }
}
