import java.util.*;
class Assignment7
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n= in.nextInt();
        while(n<=0)
        {
            System.out.println("Not Possible!!! Give another one");
            n= in.nextInt();
        }
        System.out.println("Enter the numbers");
        int i, j, t=0;
        int N[]= new int[n];
        for(i=0; i<n; i++)
        {
            N[i]= in.nextInt();
        }
        for(i=0; i<n; i++)
        {
            for(j=0; j<=n-2; j++)
            {
                if(N[j]>=N[j+1])
                {
                    t= N[j];
                    N[j]= N[j+1];
                    N[j+1]= t;
                }
            }
        }
        if(n%2==0)
        {
            for(i=n-2; i>=0; i--)
            {
                if(i%2==0)
                {
                    System.out.print(N[i]+" ");
                }
            }
            for(i=1; i<=n-1; i++)
            {
                if(i%2==1)
                {
                    System.out.print(N[i]+" ");
                }
            }
        }
        else
        {
            for(i=n-1; i>=0; i--)
            {
                if(i%2==0)
                {
                    System.out.print(N[i]+" ");
                }
            }
            for(i=1; i<=n-2; i++)
            {
                if(i%2==1)
                {
                    System.out.print(N[i]+" ");
                }
            }
        }
        System.out.println();
    }
}