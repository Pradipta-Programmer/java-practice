import java.util.*;
class Unique
{
    int Separate(int n)
    {
       int t, i=0;
       int A[]= new int[200];
       int m= n;
       while(n!=0)
       {
           t= n%10;
           A[i]= t;
           n= n/10;
           i= i+1;
       }
       if(Dupli(A, i)== -1)
       {
           return -1;
       }
       else
       {
           return m;
       }
    }
    int Dupli(int[] A, int l)
    {
        int i, j;
        int c= 0;
        for(i=0; i<l; i++)
        {
            for(j=0; j<l; j++)
            {
                if(i==j)
                {
                    continue;
                }
                else
                {
                    if(A[i]==A[j])
                    {
                        c= 1;
                        break;
                    }
                }
            }
            if(c== 1)
            {
                break;
            }
        }
        if(c== 1)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the upper and lower limits");
        int p= in.nextInt();
        int q= in.nextInt();
        Unique ob= new Unique();
        int B[]= new int[q-p];
        int j=0;
        for(int i=p; i<=q; i++)
        {
            if(ob.Separate(i)==-1)
            {
                continue;
            }
            else
            {
                B[j]= i;
                j= j+1;
            }
        }
        System.out.print("Unique Numbers are:- ");
        for(int i=0; i<j; i++)
        {
            System.out.print(B[i]+" ");
        }
        System.out.println();
        System.out.print("Frequency:- "+j);
    }
}