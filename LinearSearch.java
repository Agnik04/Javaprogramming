import java.util.Scanner;
public class LinearSearch
{
    public static void main(String args[])
    {
        int n , flag = 0;
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20 , 30 , 40 , 50};

        System.out.println("Enter the element to be searched");
        n = sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                flag = 1;
                break;
            }
        }

        if(flag==1)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
        sc.close();
    }
}