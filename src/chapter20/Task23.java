package chapter20;

import java.util.Scanner;

public class Task23 {
    static Scanner in = new Scanner(System.in);

    public static void FillnPrintArray(double[][] array){
        int iMax = array.length;
        int jMax = array[0].length;
        double low=6.5, up=12.3;
        for (int i=0; i<iMax; i++) {
            System.out.print("День " + (i+1) + ") ");
            for (int j = 0; j < jMax; j++) {
                array[i][j] = Math.round((low + ((up - low) * Math.random()))*10.0)/10.0;
                if(j!=jMax-1)
                    System.out.print(array[i][j] + "; ");
                else
                    System.out.println(array[i][j]);
            }
        }
    }

    public static double[] CounterPerDay(double[][] array){
        int iMax = array.length;
        int jMax = array[0].length;
        double sum;
        double[] output = new double[iMax];
        for (int i=0; i<iMax; i++){
            sum=0;
            for (int j=0; j<jMax; j++){
                sum+=array[i][j];
            }
            output[i] = sum;
        }
        return output;
    }

    public static double[] CounterPerDriver(double[][] array){
        int iMax = array.length;
        int jMax = array[0].length;
        double sum;
        double[] output = new double[jMax];
        for (int j=0; j<jMax; j++){
            sum=0;
            for (int i=0; i<iMax; i++){
                sum+=array[i][j];
            }
            output[j] = sum;
        }
        return output;
    }

    public static void main(String[] args) {
        int taxi = 20;
        System.out.print("Сколько рабочих дней? ");
        int days = in.nextInt();
        double[][] array = new double[days][taxi];
        FillnPrintArray(array);
        System.out.println("**********************************************");
        double[] commonDayConsumption = new double[days];
        commonDayConsumption = CounterPerDay(array);
        for (int i=0; i<days; i++)
            System.out.println("Общий расход в " + (i+1) + " день равен " + commonDayConsumption[i] + " л.");
        System.out.println("**********************************************");
        double[] commonDriverConsumption = new double[days];
        commonDriverConsumption = CounterPerDriver(array);
        for (int i=0; i<taxi; i++)
            System.out.println("Общий расход водителя " + (i+1) + " за указанный период составил " + commonDriverConsumption[i] + " л.");
    }
}
