import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number= in.nextInt();

        for (int i = 1; i <= number; i++) {
            int counter=0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    counter++;
            }
            if (counter == 2)
                System.out.println(i);
        }
    }
}
