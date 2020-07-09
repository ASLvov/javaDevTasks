package chapter10;

public class Task13 {
    public static void main(String[] args) {
        int a, b, min=1, max=6;
        for (int i=1; i<=10; i++)
        {
            System.out.println("Раунд " + i);
            a = min + (int)((max-min+1)*Math.random());
            b = min + (int)((max-min+1)*Math.random());
            if (a==b)
                System.out.println("Игрок1: " + a + ". Игрок2: " + b + ". Результат: Ничья!");
            if (a>b)
                System.out.println("Игрок1: " + a + ". Игрок2: " + b + ". Результат: Выиграл игрок1!");
            if (a<b)
                System.out.println("Игрок1: " + a + ". Игрок2: " + b + ". Результат: Выиграл игрок2!");
        }
    }
}
