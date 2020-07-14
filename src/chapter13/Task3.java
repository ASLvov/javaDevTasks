package chapter13;

public class Task3 {
    public static void main(String[] args) {
        int min=10, max=99, num, sum=0, i;
        for (i=1;i<=20;i++)
        {
            num = min + (int)((max-min+1)*Math.random());
            System.out.print(num + " ");
            if (num%2==0)
                sum+=num;
        }
        System.out.println();
        System.out.println("Сумма всех четных чисел равна " + sum);
    }
}
