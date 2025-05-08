class Overloader
{
    void print()
    {
        int i, j;
        int c=1;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(c+" ");
                c= c+1;
            }
            System.out.println();
        }
    }
    boolean print(int n)
    {
        int s=0;
        int t= n;
        while(n!=0)
        {
            s= s+ (n%10);
            n= n/10;
        }
        if(s*s*s == t)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void print(int a, char ch)
    {
        if(ch=='s'||ch=='S')
        {
            System.out.println("Here's the value= "+a*a);
        }
        else if(ch=='c'||ch=='C')
        {
            System.out.println("Here's the value= "+a*a*a);
        }
    }
}