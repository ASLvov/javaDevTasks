package chapter11;

public class Task44 {
    public static void main(String[] args) {
        int a1,a2;
        for (int i=10; i<=99; i++)
        {
            a1 = i/10;
            a2 = i%10;
            if (a1%3 == a2%3)
                System.out.print(i + " ");
        }
    }
}
