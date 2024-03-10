package Week2;
import java.util.Scanner;

public class Practice8 {
    public static void main( String[] args ){
        /*Display the base-2 system equivalent of a number entered by the user as base-10 system in real order. */

        Scanner get = new Scanner(System.in);
        System.out.printf("Enter a Base-10 Number: ");
        int number = get.nextInt(), temp=number, counter=0;
        for(int i=number; i>0; i/=2){
            counter++;}
        for(int i=counter; i>=1; i--){
            for(int j=i; j>1; j--)
                temp/=2;

            System.out.print(temp%2);
            temp=number;

}}}
