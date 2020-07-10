package chapter10;

public class Task22 {
    public static void main(String[] args) {
        int x1,y1,x2,y2,min=-30,max=30;
        x1 = min + (int)((max-min+1)*Math.random());
        y1 = min + (int)((max-min+1)*Math.random());
        x2 = min + (int)((max-min+1)*Math.random());
        y2 = min + (int)((max-min+1)*Math.random());
        System.out.println("Координаты точки A: (" + x1 + ";" + y1 + ")");
        System.out.println("Координаты точки B: (" + x2 + ";" + y2 + ")");
        double a = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("Длина отрезка равна " + a);
        System.out.println("Округленная длина отрезка равна " + (int)(a));
        double k,b;
        k = (double)(y2-y1)/(double)(x2-x1);
        b = (double)(x2*y1-x1*y2)/(double)(x2-x1);
        double r = Math.toDegrees(Math.atan(k));
        if (r>90)
            r = 180-r;
        System.out.println("Угол между линией и осью ОХ равен " + r);
        if (x1>0&&x2<0 || x1<0&&x2>0)
            System.out.println("Пересекает ось ОY");
        if (y1>0&&y2<0 || y1<0&&y2>0)
            System.out.println("Пересекает ось ОX");
        if ((x1>0&&x2>0&&(y1>0&&y2>0 || y1<0&&y2<0)) || (x1<0&&x2<0&&(y1>0&&y2>0 || y1<0&&y2<0)))
            System.out.println("Не пересекает оси");

    }
}
