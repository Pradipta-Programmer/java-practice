import java.util.*;
class Assignment6
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number from where the checking will start");
        int p= in.nextInt();
        System.out.println("Enter the number till the checking will continue");
        int q= in.nextInt();
        int i, d=0, k=0, t=0, n=0, l=0, r=0, g=0, m=0, f=0;
        System.out.print("Kaprekar numbers:- ");
        for(i=p; i<=q; i++)
        {
            d= i*i;
            g= d;
            k= i;
            while(k!=0)
            {
                t= k%10;
                n= n+1;
                k= k/10;
            }
            r= d% (int)Math.pow(10, n);
            while(g!=0)
            {
                t= g%10;
                m= m+1;
                g= g/10;
            }
            l= d/ ((int)Math.pow(10, n));
            if((l+r)==i)
            {
                f= f+1;
                System.out.print(i+" ");
            }
            d=0;
            g=0;
            k=0;
            n=0;
            m=0;
            r=0;
            l=0;
            t=0;
        }
        System.out.println();
        System.out.println("Frequency of Kaprekar number:- "+f);
    }
}