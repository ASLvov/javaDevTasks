package chapter15;

public class Task52 {
    public static void main(String[] args) {
        int sum1=0, sum2=0, currentVariable, min=1, max=6, count=0;
        while ((sum1<100)&&(sum2<100))
        {
            count++;
            currentVariable = min + (int)((max-min+1)*Math.random());
            sum1+=currentVariable;
            currentVariable = min + (int)((max-min+1)*Math.random());
            sum2+=currentVariable;
        }
        if (sum1>=100 && sum2<100)
            System.out.println("Игрок1 победил! Общий счет " + sum1 + ":" + sum2);
        if (sum2>=100 && sum1<100)
            System.out.println("Игрок2 победил! Общий счет " + sum1 + ":" + sum2);
        if (sum1>=100 && sum2>=100)
            System.out.println("Ничья! Общий счет " + sum1 + ":" + sum2);
        System.out.println("Сыграно " + count + " раундов");
    }
}
