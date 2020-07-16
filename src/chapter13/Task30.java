package chapter13;

public class Task30 {
    public static void main(String[] args) {
        int normD = 24, devD = 2, normW = 74, devW = 3;
        int d, w, dev = 4;
        for (int i=1;i<=120;i++)
        {
            d = (normD-dev) + (int)((2*dev+1)*Math.random());
            w = (normW-dev) + (int)((2*dev+1)*Math.random());
            System.out.print(i + ") Диаметр: " + d + "; Вес: " + w + ".");
            System.out.println();
            if (((d>=normD-devD)&&(d<=normD+devD))&&((w>=normW-devW)&&(w<=normW+devW)))
                System.out.println("Указанные параметры соответствуют стандартам");
            else
                System.out.println("Указанные параметры не соответствуют стандартам");
        }
    }
}
