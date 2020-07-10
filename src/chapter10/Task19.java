package chapter10;

public class Task19 {
    public static void main(String[] args) {
        int a1,a2,a3,a4,a5,min=-50,max=50;
        a1 = min + (int)((max-min+1)*Math.random());
        a2 = min + (int)((max-min+1)*Math.random());
        a3 = min + (int)((max-min+1)*Math.random());
        a4 = min + (int)((max-min+1)*Math.random());
        a5 = min + (int)((max-min+1)*Math.random());
        System.out.println(a1+", "+a2+", "+a3+", "+a4+", "+a5);
        int i=0;
        if ((a1<0&&a2>0)||(a1>0&&a2<0))
            i++;
        if ((a2<0&&a3>0)||(a2>0&&a3<0))
            i++;
        if ((a3<0&&a4>0)||(a3>0&&a4<0))
            i++;
        if ((a4<0&&a5>0)||(a4>0&&a5<0))
            i++;
        System.out.println("Знак менялся " + i + " раза");
    }
}
