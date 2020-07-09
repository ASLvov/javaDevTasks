package chapter10;

public class Task7 {
    public static void main(String[] args) {
        int num1, num2, num3, min = 10, max = 99;
        num1 = min + (int)((max - min + 1)*Math.random());
        num2 = min + (int)((max - min + 1)*Math.random());
        if (num1>num2)
        {
            min = num2;
            max = num1;
        }
        else
        {
            min = num1;
            max = num2;
        }
        System.out.print(min + ": ");
        num3 = min + (int)((max - min +1)*Math.random());
        System.out.print(num3 + ", ");
        num3 = min + (int)((max - min +1)*Math.random());
        System.out.print(num3 + ", ");
        num3 = min + (int)((max - min +1)*Math.random());
        System.out.print(num3 + ": " + max);

    }
}
