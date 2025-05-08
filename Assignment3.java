import java.util.*;
class Assignment3
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        int Y[]= new int[n];
        int T[]= new int[n];
        int i, j, k, l;
        for(i=0; i<n; i++)
        {
            Y[i]= i+1;
        }
        int h= n;
        int c=0, t=0, p=2, g=0, m=n-1;
        for(i=0; i<h; i++)
        {
            for(j=0; j<n; j++)
            {
                c= c+1;
                if(c==p)
                {
                    T[t]= Y[j];
                    t= t+1;
                    c=0;
                }
            }
            for(k=0; k<n; k= k+1)
            {
                if(T[g]== Y[k])
                {
                    for(l=k; l<m; l++)
                    {
                        Y[l]=Y[l+1];
                    }
                    g= g+1;
                    m= m-1;
                }
            }
            m= m+1;
            p= p+1;
            n=m;
            g=0;
            t=0;
            c=0;
        }
        for(j=0; j<h-1; j++)
        {
            if(Y[j]==Y[j+1])
            {
                t= j;
                break;
            }
        }
        System.out.println("Lucky numbers less than "+h+" are:-");
        for(i=0; i<t; i++)
        {
            if(Y[i]==h)
            {
                break;
            }
            System.out.print(Y[i]+" ");
        }
        System.out.println();
    }
}