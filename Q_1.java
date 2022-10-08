import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your money ? ");
        double money=in.nextDouble();
        System.out.println("Enetr rate ? ");
        double rate=in.nextDouble();
        rate=rate/100;
        int year=1;

        for (;;)
        {
            money+=money*rate;
            if (money >= 1000000)break;
            else
                year++;
        }
        System.out.println("your money = "+money+ "\n year = "+year);

    }
}
