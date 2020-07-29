package chapter21;

import java.util.Scanner;

public class Task19 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите строку, состоящую из букв, цифр и символов: ");
        String str = in.next();
        int sum = 0;
        String temp = "";
        char s;
        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i);
            if (Character.isDigit(s))
                temp += s;
            else {
                if (!temp.equals(""))
                    sum += Integer.parseInt(temp);
                temp = "";
            }
        }
        if (!temp.equals(""))
            sum += Integer.parseInt(temp);
        System.out.println("Сумма чисел в строке равна " + sum);
    }
}
