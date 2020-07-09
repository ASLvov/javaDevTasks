package chapter10;

public class Task14 {
    public static void main(String[] args) {
        int a1,a2,a3,a4,a5,min=1,max=9;
        a1 = (min + (int)((max-min+1)*Math.random())) * 10;
        a2 = (min + (int)((max-min+1)*Math.random())) * 10;
        a3 = (min + (int)((max-min+1)*Math.random())) * 10;
        a4 = (min + (int)((max-min+1)*Math.random())) * 10;
        a5 = (min + (int)((max-min+1)*Math.random())) * 10;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
    }
}
