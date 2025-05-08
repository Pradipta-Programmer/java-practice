import java.util.*;
class DoublyMarkov
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter n");
        int n= in.nextInt();
        if((n<3)||(n>9))
        {
            System.out.println("size out of range");
            System.exit(0);
        }
        double A[][]=new double[n][n];
        int f=0;
        System.out.println("Enter elements for matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j]=in.nextDouble();
                if(A[i][j]<0)
                {
                    f= f+1;
                }
            }
        }
        if(f>0)
        {
            System.out.println("Negative numbers not allowed");
            System.exit(0);
        }
        double s1=0;
        double s2=0;
        int c=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                s1= s1+ A[i][j];
                s2= s2+ A[j][i];
            }
            if((s1== 1.0) && (s2== 1.0))
            {
                c= c+1;
            }
            s1= 0.0;
            s2= 0.0;
        }
        if(c==n)
        {
            System.out.println("It is a doubly markov matrix");
        }
        else
        {
            System.out.println("It is not a doubly markov matrix");
        }
    }
}