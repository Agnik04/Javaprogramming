import java.util.*;
public class fibo_series 
{
    int sum, n;

    fibo_series()
    {
        sum = 0;
        n = 0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();

        sc.close();
    }

    void fibo()
    {
        int first = 1, second = 1;
        for(int i=3; i<=n; i++)
        {
            sum = first + second;
            first = second;
            second = sum;
        }
    }

    void print()
    {
        System.out.println("The sum ="+sum);
    }

    public static void main(String args[])
    {
        fibo_series obj = new fibo_series();

        obj.accept();
        obj.fibo();
        obj.print();
    }
}
