package chapter11;

public class Task46 {
    public static void main(String[] args) {
        int i, a, b;
        for (i=100;i<=999;i++)
        {
            a=i/100;
            b=i%100;
            if (b!=0 && b%a==0)
                System.out.print(i + " ");
        }
    }
}
