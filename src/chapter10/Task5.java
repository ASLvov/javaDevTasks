package chapter10;

public class Task5 {
    public static void main(String[] args) {
        int min = 10, max = 99, num;
        num = min + (int)((max-min+1)*Math.random());
        int a,b,c;
        a = num - (int)(10*Math.random()+1);
        b = num - (int)(10*Math.random()+1);
        c = num - (int)(10*Math.random()+1);
        System.out.println(num + ": " + a + " " + b + " " + c);
    }
}
