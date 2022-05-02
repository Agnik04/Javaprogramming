import java.util.*;

public class swap {
    public static void main(String args[])
    {
        int a , b , c ;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers to swap");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("Before swaping \n%d %d",a,b);

        c = a ;
        a = b ;
        b = c ;

        System.out.printf("\nAfter swaping \n%d %d",a,b);

        sc.close();
    }
    
}
