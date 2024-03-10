package Week2;

public class Practice4 {
    public static void main( String[] args ){
        /*Display all natural numbers from 1 to 100 as 10 numbers per line by using for statement.  */

        for(int i=0; i<=90; i+=10){
            for(int j=1; j<=10; j++)
                System.out.printf("%d\t", (i+j));
            System.out.printf("\n");}

}}
