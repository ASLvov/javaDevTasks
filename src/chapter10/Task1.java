package chapter10;

public class Task1 {
    public static void main(String[] args) {
        int min = 10, max = 99;
        double num = Math.random();
        int output = min + (int)((max-min+1)*num);
        System.out.println(output);
    }
}
