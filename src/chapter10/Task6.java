package chapter10;

public class Task6 {
    public static void main(String[] args) {
        int min = 10, max = 99, num;
        num = min + (int)((max-min+1)*Math.random());
        int a,b,c;
        a = num + (int)(10*Math.random());
        b = num + (int)(10*Math.random());
        c = num + (int)(10*Math.random());
        System.out.println(num + ": " + a + " " + b + " " + c);
    }
}
