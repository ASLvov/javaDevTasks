package chapter15;

import java.util.Scanner;

public class Task51 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int limit=0, cash=0, currentOperation=1, countIn=0, countOut=0;
        System.out.print("Величина овердрафта: ");
        limit = in.nextInt();
        System.out.print("Сумма на счете: ");
        cash = in.nextInt();
        while ((cash>limit)&&(currentOperation!=0))
        {
            System.out.print("Размер операции: ");
            currentOperation = in.nextInt();
            if ((cash+currentOperation)<limit)
                System.out.println("Операция невозможна");
            else
            {
                cash+=currentOperation;
                if (currentOperation>0)
                    countIn++;
                if (currentOperation<0)
                    countOut++;
            }
            System.out.println("Остаток на счете: " + cash + ". Операций внесения: " + countIn +
                    ". Операций снятия: " + countOut);
        }
    }
}
