package Week2;

public class Practice9 {
    public static void main( String[] args ){
        /*Display the multiplication table until 10(as 10x10 table). */

        for(int i=1; i<=10; i++)
            System.out.printf("%5d      ", i);
        System.out.println();
        for(int i=1; i<=10; i++){
            System.out.print("      "+i+"      ");
            for(int j=1; j<=10; j++)
                System.out.printf("  %2dx%2d=%3d", j, i, (j*i));
            System.out.println();
        
}}}
