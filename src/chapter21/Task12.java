package chapter21;

import java.util.Scanner;

public class Task12 {
    static Scanner in = new Scanner(System.in);

    public static int counter(String str, char s){
        int count=0;
        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i)==s)
                count++;
        }
        return count;
    }

    public static int counterContain(String[] arr){
        int count=0, c=0;
        char s;
        String str;
        for (int i=0; i<arr.length; i++){
            s = arr[i].charAt(0);
            str = arr[i].split(" ")[1];
            c = counter(str,s);
            if (c>1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.print("Введите строковое значение: ");
        String str = in.nextLine();
        System.out.print("Введите символ: ");
        String temp = in.next();
        char s = temp.charAt(0);
        int count = counter(str,s);
        System.out.println("Символ '" + s + "' встречается в строке " + count + " раз");
        String[] array = new String[n];
        for (int i=0; i<n; i++){
            System.out.print("Введите имя и фамилию: ");
            array[i] = in.nextLine();
        }
        System.out.println("У " + counterContain(array) + " человек первая буква имени встречается в фамилии более одного раза");
    }
}
