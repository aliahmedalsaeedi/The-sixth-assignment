import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number= in.nextInt();
        for (;;){
            if (number == 0)break;;
            int digit=(number%2 == 1)? 1:0;
            number/= 2;
            System.out.println(digit);
        }
    }
}
