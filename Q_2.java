import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {

        //A_______________________________
        int sum=0;
        for (int i = 0; i <=100 ; i+=2) {sum+=i;}
        System.out.println("The sum is = " +sum +"\n---------------------");

        //B_______________________________
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number x: ");
        int x= in.nextInt();
        System.out.print("Enter number x: ");
        int y=in.nextInt();
        int oddsum=0;
        for (int i = x; i <= y ; i+=2) {
            oddsum =oddsum+i;
        }
        System.out.println("The sum of all odd numbers = " +oddsum);
    }
}
