package chapter14;

public class Task10 {
    public static void main(String[] args) {
        int i, low=100, up=999, sum=0, n, n1, n2, n3, temp=0, count=0;
        for (i=1;i<=25;i++)
        {
            n = low + (int)((up-low+1)*Math.random());
            System.out.print(n + " ");
            n1 = n/100;
            n2 = n%100/10;
            n3 = n%10;
            if ((n1+n2+n3)>sum) {
                sum = n1 + n2 + n3;
                temp = n;
                count = i;
            }
        }
        System.out.println();
        System.out.println("Максимальная сумма цифр у числа " + temp + ", сумма его цифр равна " + sum +
                ", порядковый номер этого числа " + count);
    }
}
