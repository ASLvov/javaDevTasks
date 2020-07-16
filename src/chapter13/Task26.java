package chapter13;

public class Task26 {
    public static void main(String[] args) {
        int i, n, low = -30, up = 30, temp = 0;
        for (i=1;i<=15;i++)
        {
            n = low + (int)((up-low+1)*Math.random());
            if (i==1)
                System.out.print(n + " ");
            else
                if ((n<0&&temp<0)||(n>=0&&temp>=0))
                    System.out.print(n + " ");
            temp = n;
        }
    }
}
