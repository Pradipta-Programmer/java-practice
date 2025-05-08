import java.util.*;
class Assignment2
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the value of m and n");
        int m= in.nextInt();
        int n=in.nextInt();
        int i, j;
        int p=0, c=0, t=0, s=0;
        if(m<n)
        {
            System.out.print("Prime Adam's Integers are:- ");
            for(i= m; i<=n; i++)
            {
                p=0;
                if(i>9)
                {
                    for(j=1; j<=i; j++)
                    {
                        if(i%j==0)
                        {
                            p= p+1;
                        }
                    }
                }
                if(p==2)
                {
                    int h= i;
                    s=0;
                    while(h!=0)
                    {
                        t= h%10;
                        s= (s*10)+t;
                        h= h/10;
                    }
                    h= s*s;
                    s=0;
                    while(h!=0)
                    {
                        t= h%10;
                        s= (s*10)+t;
                        h= h/10;
                    }
                    if(s==(i*i))
                    {
                        System.out.print(i+" ");
                        c= c+1;
                    }
                }
            }
            System.out.println();
            System.out.println("Frequency of Prime Adam's Integers is:- "+c);
        }
        else
        {
            System.out.println("Invalid Input!!! m must be less than n");
        }
    }
}