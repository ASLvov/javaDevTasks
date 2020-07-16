package chapter14;

import java.util.Scanner;

public class Task5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = new int[12];
        int min=0,max=0;
        System.out.println("Через пробел введите 12 целых чисел: ");
        for (int i=0;i<12;i++)
        {
            nums[i] = in.nextInt();
            if (i==0)
            {
                min = nums[i];
                max = nums[i];
            }
            else
            {
                if (nums[i]<min)
                    min = nums[i];
                if (nums[i]>max)
                    max = nums[i];
            }
        }
        System.out.println("Среднее арифметическое максимума и минимума равно " + (double)(max+min)/2);
    }
}
