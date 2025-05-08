import java.util.*;
class Assignment5
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        int i, j, p=1, s=0, t=0;
        int M[]= new int[n];
        for(i=1; i<=n; i++)
        {
            s= s+i;
            M[t]= i;
            t= t+1;
            if(s==n)
            {
                for(j=0; j<t; j++)
                {
                    if(M[j]==n)
                    {
                        break;
                    }
                    System.out.print(M[j]+" ");
                }
                System.out.println();
                t= 0;
                s= 0;
                i= p;
                p= p+1;
            }
            if(s>n)
            {
                i= p;
                s= 0;
                t= 0;
                p= p+1;
            }
        }
    }
}