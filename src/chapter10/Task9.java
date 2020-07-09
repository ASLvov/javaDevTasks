package chapter10;

public class Task9 {
    public static void main(String[] args) {
        int num = 10 + (int)(100 * Math.random());
        System.out.println("Компьютер загадал число " + num);
        int min = num-5, max = num+5;
        int a = min + (int)((max-min+1)*Math.random());
        if (a==num)
            System.out.println(a + "! Угадал!");
        if (a>num)
            System.out.println(a + "! Слишком большое!");
        if (a<num)
            System.out.println(a + "! Слишком маленькое!");
    }
}
