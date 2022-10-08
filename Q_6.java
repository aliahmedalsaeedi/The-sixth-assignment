public class Q_6 {
    public static void main(String[] args) {

        int i=0;
        //The varible i is defined outside the rotor untile the sum ourside the rotor is printer
        int sum=1;
        for (; i < 20; i++)
        {
            System.out.println("the sum power "+ i +"= "+sum);
            sum=sum*2;
        }
        System.out.println("the sum power "+ i +"= "+sum);
    }
}
