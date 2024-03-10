package Week2;
import java.util.Scanner;

public class Exercise2 {

    public static void main( String[] args ){
        Scanner scan= new Scanner(System.in);

        /*Second practice.
         Display the sum of natural numbers until n entered by the user. */

        int sum=0, number=scan.nextInt();

        for(int i=1; i<=number; i++)
        sum+=i;
        System.out.printf("The result is "+sum+".");
         
}

}
