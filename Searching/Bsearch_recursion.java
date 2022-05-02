import java.util.*;
public class Bsearch_recursion { 
    public static void main(String args[])
    {
        int key, size, i,position;
        int a[] = new int[10];

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of a list: ");
        size = sc.nextInt();
        System.out.println("Enter elements\n");
        for(i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter key to search\n");
        key = sc.nextInt();

        position=bsearch(a, key, 0, size);
        if(position!=-1)
        {
            System.out.println("\nNumber present at " +  (position + 1));
        }
        else
        {
            System.out.println("\n The number is not present in the array");
        }
        sc.close();
    }
    static int bsearch(int a[],int key,int l,int u)
    {
        int m=0;
        if(l<=u)
        {
            m=l+(u-l)/2;
            if(a[m]==key)
                return m;
            else if(key<a[m])
                return bsearch(a,key,l,m-1);
            else if(key>a[m])
                return bsearch(a,key,m+1,u);
            else
                return -1;
        }
        else
            return -1;
    }
    
}
