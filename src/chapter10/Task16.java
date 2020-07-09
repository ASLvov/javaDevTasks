package chapter10;

public class Task16 {
    public static void main(String[] args) {
        int a,b,down=17,up=94,a1,a2,b1,b2,min;
        a = down + (int)((up-down+1)*Math.random());
        b = down + (int)((up-down+1)*Math.random());
        a1 = a/10;
        a2 = a%10;
        b1 = b/10;
        b2 = b%10;
        min = a1;
        if (a2<min || b1<min || b2<min)
            if (b1<a2 || b2<a2)
                if (b2<b1)
                    min = b2;
                else
                    min = b1;
            else
                min = a2;
        System.out.println("Сгенерированы числа: " + a + " и " + b);
        if (a>b)
            System.out.println("Большее из этих чисел: " + a);
        else
        {
            if (a<b)
                System.out.println("Большее из этих чисел: " + b);
            else
                System.out.println("Эти числа равны");
        }
        System.out.println("Наименьшая цифра - это " + min);

    }
}
