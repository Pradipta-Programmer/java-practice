class P4
{
    public static void main()
    {
        int i, j, k, p=3, t=0, l, m, n=1, c=2;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=i; j++)
            {
                for(k=1; k<=p; k++)
                {
                    System.out.print(" ");
                }
                System.out.print(j);
                t= t+1;
                if(t>1)
                {
                    for(l=1; l<=3; l++)
                    {
                        for(m=1; m<=l; m++)
                        {
                            System.out.print(n);
                            n= n-1;
                        }
                        n= n+c;
                        c= c+1;
                    }
                }
            }
            System.out.println();
        }
        p= 1; t=2;
        for(i=3; i<=1; i--)
        {
            for(j=1; j<=i; j++)
            {
                for(k=1; k<=p; k++)
                {
                    System.out.print(" ");
                }
                System.out.print(j);
                for(l=2; l<=1; l--)
                {
                    for(m=1; m<=l; m++)
                    {
                        System.out.print(t);
                        t= t-1;
                    }
                }
            }
            System.out.println();
        }
    }
}