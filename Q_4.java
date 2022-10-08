import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String m=input.next();

        for (int i = m.length()-1; i>=0 ; i--) {
            System.out.println(m.charAt(i));
        }

    }
}
