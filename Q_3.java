import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String m=input.next();
        for (int i = 0; i < m.length(); i++) {
            System.out.println(m.charAt(i));
        }

    }
}
