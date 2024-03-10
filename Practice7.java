package Week2;
import java.util.Scanner;

public class Practice7 {
    public static void main( String[] args ){
        /*Display the base-2 system equivalent of a number entered by the user as base-10 system in reverse order. */

        Scanner get = new Scanner(System.in);
        System.out.printf("Enter a Base-10 Number: ");
        int number = get.nextInt();
        for(int i=number; i>0; i/=2)
            System.out.print(i%2);


}}
