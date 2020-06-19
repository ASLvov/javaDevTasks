package chapter6;

import java.util.Scanner;

public class Task1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int y = in.nextInt();
        if (x < y) System.out.println("x меньше y");
        if (x == y) System.out.println("x теперь равна y");
        if (x > y) System.out.println("x теперь больше y");
        //1. Если ввести 5 и 9, будет выведено "x меньше y"
        //2. Если ввести 9 и 9, будет выведено "x теперь равна y"
        //3. Если ввести 9 и 5, будет выведено "x теперь больше y"
        //4. 3 и 8
        //5. 7 и 1
        //6. такое сообщение не может быть выведено
    }
}
