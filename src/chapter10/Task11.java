package chapter10;

public class Task11 {
    public static void main(String[] args) {
        int n1, n2, n3, min = 2, max = 11, sum;
        n1 = min + (int)((max-min+1)*Math.random());
        n2 = min + (int)((max-min+1)*Math.random());
        n3 = min + (int)((max-min+1)*Math.random());
        sum = n1 + n2 + n3;
        System.out.println(n1 + ", " + n2 + ", " + n3 + ": " + sum);
        if (sum==21)
            System.out.println("Очко!");
        if (sum>21)
            System.out.println("Перебор!");
        if (sum<21)
            System.out.println("Недобор!");
    }
}
