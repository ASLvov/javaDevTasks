package chapter16;

public class Task20 {
    public static void main(String[] args) {
        int quantity=35, lessons=8, mark, lowMark=3, upMark=5, sum, count=0;
        double maxMark=0;
        for (int i=1; i<=quantity; i++)
        {
            System.out.print(i + ") ");
            sum = 0;
            for (int j=1; j<=lessons; j++)
            {
                mark = lowMark + (int)((upMark-lowMark+1)*Math.random());
                System.out.print(mark + " ");
                sum+=mark;
            }
            double mediumMark = (double)sum/(double)lessons;
            if (mediumMark>maxMark)
                maxMark=mediumMark;
            System.out.println("Средняя оценка равна: " + mediumMark);
            if (mediumMark>=4.5)
                count++;
        }
        System.out.println("У " + count + " учеников средняя оценка выше 4.5, наивысший средний бал равен " + maxMark);
    }
}
