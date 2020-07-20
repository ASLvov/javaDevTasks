package chapter16;

public class Task10 {
    public static void main(String[] args) {
        int i, j, sum=0;
        for (i=1;i<=100000;i++)
        {
            for (j=1;j<=i;j++)
            {
                if (i%j==0 && i!=j)
                    sum+=j;
            }
            if (i==sum)
                System.out.print(i + " ");
            sum = 0;
        }
    }
}
