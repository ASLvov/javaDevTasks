package chapter10;

public class Task20 {
    public static void main(String[] args) {
        int a, min=1, max=9;
        a = min + (int)((max-min+1)*Math.random());
        System.out.println("Сгенерирована цифра " + a);
        min = 100;
        max = 999;
        int b = min + (int)((max-min+1)*Math.random());
        System.out.println("Сгенерировано число " + b);
        int b1,b2,b3;
        b1 = b/100;
        b2 = b%100/10;
        b3 = b%10;
        if (b2>b1 || b3>b1)
        {
            if (b3>b2)
                System.out.println("Разница между сгенерированной цифрой и самой большой цифрой сгенерированного числа: " + Math.abs(a-b3));
            else
                System.out.println("Разница между сгенерированной цифрой и самой большой цифрой сгенерированного числа: " + Math.abs(a-b2));
        }
        else
            System.out.println("Разница между сгенерированной цифрой и самой большой цифрой сгенерированного числа: " + Math.abs(a-b1));
    }
}
