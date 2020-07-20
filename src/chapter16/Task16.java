package chapter16;

public class Task16 {
    public static void main(String[] args) {
        int i, j, sum=0;
        for (i=10;i<100;i+=2)
        {
            for (j=1;j<=i;j++)
            {
                if (i%j==0)
                    sum+=j;
            }
            if (sum%2==0)
                System.out.println("Сумма делителей числа " + i + " равна " + sum);
            sum = 0;
        }
    }
}
