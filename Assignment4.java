import java.util.*;
class Assignment4
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the number");
            int n= in.nextInt();
            int p= 0;
            int d= n;
            int i;
            if(n!=1)
            {
                for(i=2; i<=n; i++)
                {
                    if(n%(i*i)==0)
                    {
                        p= 0;
                        break;
                    }
                    if(n%i==0)
                    {
                        n= n/i;
                        p= p+1;
                    }
                }
            }
            else
            {
                System.out.println("M("+d+")= 1");
            }
            if(p==0)
            {
                System.out.println("M("+d+")= "+p);
            }
            else
            {
                System.out.println("M("+d+")= "+(int)Math.pow(-1,p));
            }
        }
    }
}