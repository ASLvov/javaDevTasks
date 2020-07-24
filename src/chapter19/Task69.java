package chapter19;

import java.util.ArrayList;
import java.util.Scanner;

public class Task69 {
    static Scanner in = new Scanner(System.in);

    public static void FillArray(ArrayList<Integer> array, int r, int n){
        if (n%2!=0)
            n++;
        int low=-1-r, up = r+1;
        for (int i=0; i<n; i++)
            array.add(low + (int)((up-low+1)*Math.random()));
    }

    public static void PrintArray(ArrayList<Integer> array){
        int n = array.size();
        for (int i=0; i<n; i+=2) {
            System.out.print("(" + array.get(i) + "; " + array.get(i+1) + ") ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> CheckPoints(ArrayList<Integer> array, int r){
        int n = array.size();
        int x,y;
        ArrayList<Integer> out = new ArrayList<>();
        for (int i=0; i<n; i+=2){
            x = array.get(i);
            y = array.get(i+1);
            if (r*r == (x*x+y*y))
            {
                out.add(x);
                out.add(y);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.print("Введите радиус окружности: ");
        int r = in.nextInt();
        System.out.print("Введите количество точек: ");
        int n = in.nextInt();
        n=n*2;
        ArrayList<Integer> array = new ArrayList<>();
        FillArray(array,r,n);
        PrintArray(array);
        ArrayList<Integer> points = CheckPoints(array,r);
        if (points.size()!=0){
            System.out.println("Количество точек, лежащих на окружности равно " + points.size()/2 + ". Эти точки: ");
            PrintArray(points);
        }
        else
            System.out.println("В массиве нет точек, лежащих на окружности");
    }
}
