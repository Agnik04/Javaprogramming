import java.util.*;

public class Sum_between 
{
    int m, n, sum;

    Sum_between() 
    {
        m = 0;
        n = 0;
        sum = 0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the range of numbers : ");
        m = sc.nextInt();
        n = sc.nextInt();

        sc.close();
    }
    void sum() 
    {
        for (int i = m; i < n; i++) 
        {
            sum = sum + i;
        }
    }

    void print() 
    {
        System.out.println((" Sum : " + sum));
    }

    public static void main(String args[]) 
    {
        Sum_between ob = new Sum_between();
        
        ob.accept();
        ob.sum();
        ob.print();

    }
}