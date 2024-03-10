package Week2;

public class Practice6 {
    public static void main( String[] args ){
        /*Display even natural numbers from 2 to 100 as 5 numbers per line by using for statement. */

        for(int i=1; i<=91; i+=10){
            for(int j=1; j<=10; j+=2)
                System.out.printf("%5d", (i+j));
        System.out.println();


}}}
