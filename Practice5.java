package Week2;

public class Practice5 {
    public static void main( String[] args ){
        /*Display odd natural numbers from 1 to 99 as 5 numbers per line by using for statement. */

        for(int i=0; i<=90; i+=10){
            for(int j=1; j<=10; j+=2){
                System.out.printf("%5d", (i+j));
            }
            System.out.println();
        }

}}
