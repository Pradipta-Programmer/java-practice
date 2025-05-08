import java.util.*;
class Assignment8
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        int d= n;
        int a= n;
        int i, j, s=0, c=0, h=0, f=0, m=0, l=0;
        for(i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                for(j=1; j<=i; j++)
                {
                    if(i%j==0)
                    {
                        c= c+1;
                    }
                }
                if(c==2)
                {
                    h= i;
                    while(h!=0)
                    {
                        h= h/10;
                        f= f+1;
                    }
                }
                if(f>=1)
                {
                    h= i;
                    while(h!=0)
                    {
                        m= h%10;
                        l= l+m;
                        h= h/10;
                    }
                    s= s+l;
                }
                n= n/i;
                i=1;
                l=0;
                f=0;
                h=0;
                c=0;
                m=0;
            }
        }
        while(d!=0)
        {
            m= d%10;
            l= l+m;
            d= d/10;
        }
        if(l==s)
        {
            System.out.println(a+" is a SMITH NUMBER");
        }
        else
        {
            System.out.println(a+" is not a SMITH NUMBER");
        }
    }
}