import java.util.*;

public class multiply
{
    public static void main(String args[])
    {
        float c;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two floating point integer :");

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        c = a*b;

        System.out.printf("The result is %.3f",c);

        sc.close();


    }
}
