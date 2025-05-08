class Assignment12
{
    public static void main()
    {
        int i, j, k, l, p=1, q=1, r=4;
        for(i=1; i<=5; i++)
        {
            for(l=1; l<=r; l++)
            {
                System.out.print(" ");
            }
            r= r-1;
            for(j=1; j<=p; j++)
            {
                System.out.print(j);
            }
            p= p+1;
            if(i>=2)
            {
                for(k=q; k>=1; k--)
                {
                    System.out.print(k);
                }
                q= q+1;
            }
            System.out.println();
        }
        p= 4; q= 3; r= 1;
        for(i=1; i<=4; i++)
        {
            for(l=1; l<=r; l++)
            {
                System.out.print(" ");
            }
            r= r+1;
            for(j=1; j<=p; j++)
            {
                System.out.print(j);
            }
            p= p-1;
            for(k=q; k>=1; k--)
            {
                System.out.print(k);
            }
            q= q-1;
            System.out.println();
        }
    }
}