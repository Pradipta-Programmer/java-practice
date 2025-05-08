import java.util.*;
class Type
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        int Y[]= new int[n];
        int Z[]= new int[n];
        int i, j, k, l;
        for(i=0; i<n; i++)
        {
            Y[i]= i+1;
        }
        int c=0, t=0, p=2, g=0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                c= c+1;
                if(c==p)
                {
                    Z[t]=Y[j];
                    t= t+1;
                    c=0;
                    System.out.print(Z[t]+ " ");
                }
            }
            for(k=0; k<n-g; k++)
            {
                if(Z[g]== Y[k])
                {
                    for(l=k; l<n-1; l++)
                    {
                        Y[l]=Y[l+1];
                    }
                    g= g+1;
                }
            }
            p= p+1;
            t=0;
            c=0;
        }
        for(i=0; i<n; i++)
        {
            System.out.println(Y[i]);
        }
    }
}