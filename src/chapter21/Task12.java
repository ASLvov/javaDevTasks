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
        int count=0, c;
        char s;
        String str, element;
        for (int i=0; i<arr.length; i++){
            element = arr[i].toLowerCase();
            s = element.charAt(0);
            str = element.split(" ")[1];
            c = counter(str,s);
            if (c>1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        //часть1
        int n=3;
        System.out.print("Введите строковое значение: ");
        String str = in.nextLine();
        System.out.print("Введите символ: ");
        char s = in.next().charAt(0);
        int count = counter(str,s);
        System.out.println("Символ '" + s + "' встречается в строке " + count + " раз");


        //часть 2
        String[] array = new String[n]; //инициализация массива, содержащего имена и фамилии
        for (int i=0; i<n; i++){        //заполнение этого массива
            System.out.print((i+1) + ") Введите имя и фамилию: ");
            array[i] = in.next() + " " + in.next();
        }
        System.out.println("У " + counterContain(array) + " человек первая буква имени встречается в фамилии более одного раза");
    }
}
