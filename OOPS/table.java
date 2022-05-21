import java.util.*;
public class table
{
    int mul;
    table()
    {
        mul = 1;
    }
    void multiply(int n)
    {
        for(int i = 1; i<=10; i++)
        {
            mul = n*i;
            System.out.println(n+" * "+i+" = "+mul);
        }
    }

    public static void main(String arg[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print the table :");
        n = sc.nextInt();
        table ob = new table();
        ob.multiply(n);
        sc.close();
    }
}