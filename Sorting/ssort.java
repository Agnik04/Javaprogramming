import java.util.*;
public class ssort 
{
    public static void main(String args[])
    {
        int size, arr[], i, j, min, tmp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        size = sc.nextInt();

        arr = new int[size];

        System.out.println("Enter the array elements :");
        for(i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        for( i=0; i<size-1; i++)
        {
            min = i;
            for( j=i+1; j<size; j++)
            {
                if( arr[min]>arr[j] )
                    min = j;
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] =tmp;
        }

        for(i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
