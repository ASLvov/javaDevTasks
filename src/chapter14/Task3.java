package chapter14;

public class Task3 {
    public static void main(String[] args) {
        int n,low=-40,up=40,min=0,max=0;
        for (int i=0;i<50;i++)
        {
            n = low + (int)((up-low+1)*Math.random());
            System.out.print(n + " ");
            if (i==0)
            {
                min = n;
                max = n;
            }
            else
            {
                if (n<min)
                    min = n;
                if (n>max)
                    max = n;
            }
        }
        System.out.println();
        System.out.println("Наибольшее значение в сгенерированной серии - " + max + ", наименьшее - " + min);

    }
}
