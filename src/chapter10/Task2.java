package chapter10;

public class Task2 {
    public static void main(String[] args) {
        int a, b, min=-9, max=9;
        a = min + (int)((max-min+1)*Math.random());
        b = min + (int)((max-min+1)*Math.random());
        System.out.println(a + ", " + b);
        if (a>b)
            System.out.println("Наибольшее: " + a);
        else
            if (a<b)
                System.out.println("Наибольшее: " + b);
            else
                System.out.println("Равные значения");
    }
}
