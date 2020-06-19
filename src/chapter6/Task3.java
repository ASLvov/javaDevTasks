package chapter6;

import java.util.Scanner;

public class Task3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int age;
        System.out.print("Введи свой возраст");
        age = in.nextInt();
        if (age>=18) System.out.println("Можешь участвовать в выборах");
        //1. Если ввести 8, то программа завершится без вывода
        //2. если ввести 19, выведется фраза "Можешь участвовать в выборах"
        //3. Если ввести 18, выведется фраза "Можешь участвовать в выборах"
        //4. 100
        //5. 3
        //6. Добавить else
    }
}
