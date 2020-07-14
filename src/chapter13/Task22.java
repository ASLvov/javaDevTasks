package chapter13;

public class Task22 {
    public static void main(String[] args) {
        int i, min=100, max=999, count=0, sumNumber, commonSum=0, a1, a2, a3;
        for (i=min; i<=max; i++)
        {
            a1 = i/100;
            a2 = i%100/10;
            a3 = i%10;
            sumNumber = a1+a2+a3;
            if (Math.pow(sumNumber, 3)==i)
            {
                System.out.print(i + " ");
                count++;
                commonSum+=i;
            }
        }
        System.out.println();
        System.out.println("Всего таких чисел " + count + ", их сумма равна " + commonSum);
    }
}
