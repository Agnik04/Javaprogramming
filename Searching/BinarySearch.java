import java.util.*;
public class BinarySearch
{
    public static void main(String args[])
    {
        int n , lb = 0 , ub , mid = 0;
        int f = 0, pos = 0;
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [10];
        System.out.println("Enter the size array");
        n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int s = sc.nextInt();
        ub = n;
        
        while(lb<=ub)
        {
            mid = lb+(ub-lb)/2;
            if(arr[mid] == s)
            {
                f = 1;
                pos = mid;
                break;
            }

            else if(arr[mid] < s)
            {
                lb = mid + 1;
            }

            else
            {
                ub = mid - 1;
            }
        }

        if(f == 1)
        {
            System.out.println("Element found at position "+(pos+1));
        }
        else
        {
            System.out.println("Element not found");
        }
        sc.close();

    }
}