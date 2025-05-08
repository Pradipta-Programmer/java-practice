import java.util.*;
class Assignment10
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        int d= n;
        int s= 0, p=0, r=0, c=0, l=0, h=0;
        while(d!=0)
        {
            p= d%2;
            s= s*10 + p;
            l= l+1;
            d= d/2;
        }
        p=0;
        while(s!=0)
        {
            p= s%10;
            r= r*10 + p;
            h= h+1;
            s= s/10;
        }
        d= r;
        p=0;
        while(d!=0)
        {
            p= d%10;
            if(p==1)
            {
                c= c+1;
            }
            d= d/10;
        }
        p= l-h;
        if(c%2==0)
        {
            System.out.print("Binary Equivalent:- "+r);
            for(s=1; s<=p; s++)
            {
                System.out.print("0");
            }
            System.out.println();
            System.out.println("Number of 1's:- "+c);
            System.out.println(n+" is not a Odidus number");
        }
        else
        {
            System.out.print("Binary Equivalent:- "+r);
            for(s=1; s<=p; s++)
            {
                System.out.print("0");
            }
            System.out.println();
            System.out.println("Number of 1's:- "+c);
            System.out.println(n+" is a Odidus number");
        }
    }
}