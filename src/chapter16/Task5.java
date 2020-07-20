package chapter16;

public class Task5 {
    public static void main(String[] args) {
        int i, j;
        for (i=1;i<=8;i++)
        {
            System.out.print(i + ") ");
            for (j=10;j<=99;j++)
            {
                if (j%(i+1)==0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
