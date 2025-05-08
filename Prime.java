import java.util.*;
class Prime
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the value of m and n");
        int m= in.nextInt();
        int n=in.nextInt();
        int i, k;
        int p=0;
        System.out.print("Prime Adam's Integers are:- ");
        for(i= m; i<=n; i++)
        {
            p=0;
            for(k=1; k<=i; k++)
            {
                if(i%k==0)
                {
                    p= p+1;
                }
            }
            if (p==2)
            {
                System.out.println(i+" is Prime");
            }
        }
    }
}