package chapter13;

public class Task24 {
    public static void main(String[] args) {
        int min=30, max=49, i, low=0, n;
        for (i=1;i<=20;i++)
        {
            n = min + (int)((max-min+1)*Math.random());
            if (i==1) {
                low = n;
                System.out.print(n + " ");
            }
            if (n<low)
                System.out.print("-" + n + " ");
            else
                System.out.print("+" + n + " ");
        }
    }
}
