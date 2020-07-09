package chapter10;

public class Task15 {
    public static void main(String[] args) {
        int num, down=250, up=746, n1, n2, n3, min,max;
        num = down + (int)((up-down+1)*Math.random());
        n1 = num/100;
        n2 = num/10%10;
        n3 = num%10;
        System.out.println("Сгенерировано число: " + num);
        max = n1;
        if (n2>max || n3>max)
            if (n3>n2)
                max = n3;
            else
                max = n2;
        min = n1;
        if (n2<min || n3<min)
            if (n3<n2)
                min = n3;
            else
                min = n2;
        System.out.println("Наибольшая цифра: " + max);
        System.out.println("Наименьшая цифра: " + min);
        if (n1==n2 || n1==n3 || n2==n3)
            System.out.println("В числе были одинаковые цифры");
        else
            System.out.println("Все цифры разные");
    }
}
