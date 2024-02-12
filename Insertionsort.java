import java.util.*;
public class Main{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Insertionsort(n,a);
    }
    public static int[] Insertionsort(int k,int arr[])
    {
        for(int i=1;i<k;i++)
        {
            int t=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>t)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=t;
        }
        print(arr);
        return arr;
        
    }
    public static void print(int t[])
    {
        for(int i=0;i<t.length;i++)
        {
            System.out.print(t[i]+" ");
        }
        System.out.println();
    }
}