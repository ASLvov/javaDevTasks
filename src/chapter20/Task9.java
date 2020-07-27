package chapter20;

import java.util.Scanner;

public class Task9 {
    public static int[] counter(int[] array){
        int n1, n2;
        int[] digits = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i=0; i<array.length; i++)
        {
            n1 = array[i]/10;
            n2 = array[i]%10;
            for (int j=0; j<digits.length; j++)
            {
                if (j==n1)
                    digits[j]++;
                if (j==n2)
                    digits[j]++;
            }
        }
        return digits;
    }

    public static int[] MostPopularDigit(int[] digits){
        int max = digits[0];
        int count=0;
        int j=0;
        for (int i=0; i<digits.length; i++)
            if (digits[i]>=max)
                max = digits[i];
        for (int i=0; i<digits.length; i++)
            if (digits[i]==max)
                count++;
        int[] output = new int[count+1];
        for (int i=0; i<digits.length; i++)
        {
            if (digits[i]==max){
                output[j] = i;
                j++;
            }
        }
        output[count] = max;
        return output;
    }

    public static void main(String[] args){
        int n=200, low=10, up=99;
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = low + (int) ((up - low + 1) * Math.random());
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] dig = counter(array);
        for (int i=0; i<dig.length; i++)
            System.out.println(i + ": " + dig[i]);
        int[] mostPopular = MostPopularDigit(dig);
        for (int i=0; i<mostPopular.length-1; i++)
            System.out.println("Самая популярная цифра - " + mostPopular[i] + ". Она встретилась " + mostPopular[mostPopular.length-1] + " раз");
    }
}
