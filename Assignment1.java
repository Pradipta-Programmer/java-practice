import java.util.*;
class Assignment1
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the boxes");
        int n= in.nextInt();
        int sum= 0, c= 0;
        int b=0;
        int i, j, k, l;
        int s=0, t=0, u=0, v=0;
        if(n<1000)
        {
            for(i=0; i<=1000; i++)
            {
                t= 48*i;
                if(t>n)
                {
                    t= 48*(i-1);
                    i= i-1;
                    break;
                }
            }
            sum= sum+ t;
            c= n- sum;
            for(j=0; j<=1000; j++)
            {
                s= 24*j;
                if(s>c)
                {
                    s= 24*(j-1);
                    j= j-1;
                    break;
                }
            }
            sum= sum+ s;
            c= n- sum;
            for(k=0; k<=1000; k++)
            {
                u= 12*k;
                if(u>c)
                {
                    u= 12*(k-1);
                    k= k-1;
                    break;
                }
            }
            sum= sum+ u;
            c= n- sum;
            for(l=0; l<=1000; l++)
            {
                v= 6*l;
                if(v>c)
                {
                    v= 6*(l-1);
                    l= l-1;
                    break;
                }
            }
            sum= sum+ v;
            c= n- sum;
            if(c>0)
            {
                b= i+j+k+l+1;
            }
            else
            {
                b= i+j+k+l;
            }
            System.out.println("48 X "+i+"= "+t);
            System.out.println("24 X "+j+"= "+s);
            System.out.println("12 X "+k+"= "+u);
            System.out.println("6 X "+l+"= "+v);
            System.out.println("Remaining boxes= "+c);
            System.out.println("Total number of boxes= "+n);
            System.out.println("Total number of cartoons= "+b);
        }
        else
        {
            System.out.println("Invalid Input!!!");
        }
    }
}