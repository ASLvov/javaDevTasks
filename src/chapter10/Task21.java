package chapter10;

public class Task21 {
    public static void main(String[] args) {
        int x,y,min=-30,max=30;
        x = min + (int)((max-min+1)*Math.random());
        y = min + (int)((max-min+1)*Math.random());
        System.out.println("Координаты точки: (" + x + ";" + y + ")");
        if (x>0&&y>0)
            System.out.println("I четверть");
        if (x<0&&y>0)
            System.out.println("II четверть");
        if (x<0&&y<0)
            System.out.println("III четверть");
        if (x>0&&y<0)
            System.out.println("IV четверть");
        if (Math.abs(x)<Math.abs(y))
            System.out.println("Точка ближе к оси OY");
        if (Math.abs(x)>Math.abs(y))
            System.out.println("Точка ближе к оси OX");
        if (Math.abs(x)==Math.abs(y))
            System.out.println("Расстояние до осей одинаковое");
        double a = Math.sqrt(x*x+y*y);
        System.out.println("Расстояние между началом координат и точкой равно " + a);
        System.out.println("Округленное расстояние равно " + (int)(a));
        double r = Math.toDegrees(Math.atan2(y,x));
        if (r>90)
            r = 180-r;
        System.out.println("Угол между линией и осью ОХ равен " + r);
    }
}
