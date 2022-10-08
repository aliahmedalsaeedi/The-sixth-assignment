import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {

        char[]Vowels=new char[]{'a','e','i','o','u','y'};
        Scanner in=new Scanner(System.in);
        int counter=0;

        System.out.println("Enter text : ");
        String text= in.next();

        for (int i = 0; i <text.length() ; i++)
            for (int j = 0; j < 6; j++)
                if (text.charAt(i)==Vowels[j])
                    counter++;

                    System.out.println(" Now the number of Vowelsin text = "+counter);

    }
}
