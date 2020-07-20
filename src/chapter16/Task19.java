package chapter16;

public class Task19 {
    public static void main(String[] args) {
        int i, j, sum;
        for (i=100; i<1000; i+=10)
        {
            sum = 0;
            for (j=1; j<=i; j+=2)
            {
                if (i%j==0)
                    sum+=j;
            }
            if (sum%10==0)
                System.out.print(i + " ");
        }
    }
}
