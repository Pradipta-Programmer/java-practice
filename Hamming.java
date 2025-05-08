import java.util.*;
class Hamming
{
    public static void Hamming()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i=2, j, f=0;
        int g= n;
        System.out.print(n+"= ");
        while(i<=n)
        {
            if(n%i==0)
            {
                if(n/i != 1)
                {
                    System.out.print(i+" X ");
                }
                else
                {
                    System.out.print(i);
                }
                if((i != 2)&&(i != 3)&&(i != 5))
                {
                    f= 1;
                }
                n= n/i;
                continue;
            }
            i= i+1;
        }
        if(f==1)
        {
            System.out.println();
            System.out.println(g+" is not a Hamming Number");
        }
        else
        {
            System.out.println();
            System.out.println(g+" is a Hamming Number");
        }
    }
}