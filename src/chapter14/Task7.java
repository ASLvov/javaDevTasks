package chapter14;

public class Task7 {
    public static void main(String[] args) {
        int i, low=10, up=99, sum=0, n, n1, n2, temp=0;
        for (i=1;i<=20;i++)
        {
            n = low + (int)((up-low+1)*Math.random());
            System.out.print(n + " ");
            n1 = n/10;
            n2 = n%10;
            if ((n1+n2)>sum) {
                sum = n1 + n2;
                temp = n;
            }
        }
        System.out.println();
        System.out.println("Максимальная сумма цифр у числа " + temp + ", сумма его цифр равна " + sum);
    }
}
