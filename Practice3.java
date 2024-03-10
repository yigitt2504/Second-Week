package Week2;
import java.util.Scanner;

public class Exercise3 {
    public static void main( String[] args ){

    Scanner scan=new Scanner(System.in);

    /*Display factorial value of n entered by the user. */

    Scanner input=new Scanner(System.in);

    System.out.printf("Enter a number:");
    int n=input.nextInt();
    int factorial=1;

    for(int i=1; i<=n; i++)
        factorial*=i;

    System.out.printf("%d\n", factorial);

    }}
