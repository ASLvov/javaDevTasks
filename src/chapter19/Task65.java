package chapter19;

import java.util.Scanner;

public class Task65 {
    static Scanner in = new Scanner(System.in);

    public static boolean BalancePoint(int[] array){
        int n = array.length;
        int sumBefore, sumAfter, i=1;
        boolean answer=false;
        while (!answer && i<(n-1)){
            sumAfter=0;
            sumBefore=0;
            for (int j=0; j<i; j++)
                sumBefore+=array[j];
            for (int j=i+1; j<n; j++)
                sumAfter+=array[j];
            if (sumAfter==sumBefore)
                answer=true;
            i++;
        }
        return answer;
    }

    public static void FillArray(int[] array){
        int n = array.length;
        int low = -9, up = 9;
        for (int i=0; i<n; i++){
            array[i] = low + (int)((up-low+1)*Math.random());
        }
    }

    public static void PrintArray(int[] array){
        int n = array.length;
        for (int i=0; i<n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] array = new int[n];
        FillArray(array);
        PrintArray(array);
        if (BalancePoint(array))
            System.out.println("В массиве имеется хотя бы одна 'точка баланса'");
        else
            System.out.println("'Точки баланса' нет!");
    }
}
