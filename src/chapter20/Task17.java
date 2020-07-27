package chapter20;

import java.util.ArrayList;

public class Task17 {
    public static void main(String[] args) {
        int students = 100;
        int[] sex = new int[students];
        int[] birthMonth = new int[students];
        int w=0, m=1;
        int minMonth=1, maxMonth=12;
        fillArray(sex, w, m);
        fillArray(birthMonth, minMonth, maxMonth);
//        for (int i=0; i<students; i++){
//            if (sex[i]==0)
//                System.out.println((i+1)+") Пол: Женский; Месяц рождения: " + birthMonth[i]);
//            else
//                System.out.println((i+1)+") Пол: Мужской; Месяц рождения: " + birthMonth[i]);
//        }
        int[] res = counterSex(sex, birthMonth);
        int month=1;
        for (int i=0; i<res.length; i+=2){
            System.out.println("В " + month + " месяце родилось " + (res[i]+res[i+1]) + " человек." +
                    " Девушек - " + res[i] + ", мужчин - " + res[i+1]);
            month++;
        }
        month=1;
        System.out.println();
        ArrayList<Integer> months = new ArrayList<>();
        for (int i=0; i<res.length; i+=2){
            if (res[i]>res[i+1])
                months.add(month);
            month++;
        }
        System.out.println("Девушек родилось больше в следующие месяца: " + months.toString());
    }

    public static void fillArray(int[] array, int low, int up){
        for (int i=0; i<array.length; i++)
            array[i] = low + (int)((up-low+1)*Math.random());
    }

    public static int[] counterSex(int[] sex, int[] birthMonth){
        int counterMan, counterWoman;
        int month=1, j=0;
        int[] result = new int[24];
        while (month<=12) {
            counterMan=0;
            counterWoman=0;
            for (int i = 0; i < birthMonth.length; i++) {
                if (birthMonth[i]==month && sex[i]==0)
                    counterWoman++;
                if (birthMonth[i]==month && sex[i]==1)
                    counterMan++;
            }
            result[j] = counterWoman;
            j++;
            result[j] = counterMan;
            j++;
            month++;
        }
        return result;
    }
}
