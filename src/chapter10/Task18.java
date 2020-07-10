package chapter10;

public class Task18 {
    public static void main(String[] args) {
        int a, b, c, min = 100, max = 999;
        a = min + (int) ((max - min + 1) * Math.random());
        System.out.println(a);
        b = min + (int) ((max - min + 1) * Math.random());
        System.out.println(b);
        c = min + (int) ((max - min + 1) * Math.random());
        System.out.println(c);
        min = a;
        if (b < a || c < a) {
            if (b < c)
                min = b;
            else
                min = c;
        }
        max = a;
        if (b > a || c > a) {
            if (b > c)
                max = b;
            else
                max = c;
        }
        System.out.println("Разница между наибольшим и наименьшим значением " + (max-min));
    }
}
