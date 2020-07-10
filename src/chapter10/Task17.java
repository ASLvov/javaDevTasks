package chapter10;

public class Task17 {
    public static void main(String[] args) {
        double a,b,c,min=0.1,max=10.5,p,s;
        a = Math.round((min + (max-min+1)*Math.random())*10)/10.0;
        b = Math.round((min + (max-min+1)*Math.random())*10)/10.0;
        System.out.println("Величина катетов: " + a + " и " + b);
        c = Math.pow(Math.pow(a,2)+Math.pow(b,2),0.5);
        c = Math.round(c*10)/10.0;
        p = a+b+c;
        p = Math.round(p*10)/10.0;
        s = a*b*0.5;
        s = Math.round(s*10)/10.0;
        System.out.println("Гипотенуза равна: " + c);
        System.out.println("Периметр равен: " + p);
        System.out.println("Площадь равна: " + s);
    }
}
