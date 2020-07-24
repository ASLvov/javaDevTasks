package chapter19;

import java.util.Scanner;

public class Task31 {
    static Scanner in = new Scanner(System.in);

    public static void fill(int[] array){
        int n = array.length;
        int low = 10, up = 99;
        for (int i=0; i<n; i++)
            array[i] = low + (int)((up-low+1)*Math.random());
    }

    public static boolean func(int[] array, int k){
        boolean output=true;
        for (int i=1; i<=k; i++){
            if (array[i]>=array[i-1])
                output = false;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.print("Введите номер ячейки: ");
        int k = in.nextInt();
        fill(array);
        for (int i=0; i<n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        if (func(array,k))
            System.out.println("Все элементы массива до ячейки номер " + k + " упорядочены по убыванию");
        else
            System.out.println("Элементы массива до ячейки номер " + k + " не упорядочены по убыванию");
    }
}
