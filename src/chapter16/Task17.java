package chapter16;

public class Task17 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=10; i<=Math.sqrt(999); i++)
        {
            for (int j=2; j<i; j++)
            {
                if (i%j==0)
                    sum+=j;
            }
            if (sum==0)
                System.out.print(i + " ");
            sum = 0;
        }
    }
}
