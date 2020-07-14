package chapter12;

public class Task8 {
    public static void main(String[] args) {
        int i,a1,a2,count=0;
        for (i=10;i<=99;i++)
        {
            a1 = i/10;
            a2 = i%10;
            if ((a1-a2)<=3)
            {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Всего таких чисел " + count);
    }
}
