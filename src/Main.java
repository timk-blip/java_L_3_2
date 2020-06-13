import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float score = 100;
        System.out.print ("На счету \n");
        System.out.print (score);
        System.out.print ("\t1100На какое количество хотите пополнить счет \n");
        float total;
        float gap = 0;
        int money = in.nextInt();
        if (money <= 1000)
        {
            total = money + score;
        }
        else
            {
            gap = money / 100;
            total = score + gap + money;
            }
        System.out.print ("Вам начислено дополнительных бонусов \n");
        System.out.print (gap + "\n");
        System.out.print ("На счету \t" + total + "\tрублей");

    }
}