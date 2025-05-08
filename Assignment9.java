import java.util.*;
class Assignment9
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number less than 10000");
        int n= in.nextInt();int d=n;int i, j;
        String U[]= {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        String T[]= {"ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};
        String Y[]={"TEN", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINTY"};
        int t=0, c=0, p=0;
        while(n!=0)
        {
            t= n%10;
            c= c+1;
            n= n/10;
        }
        n= d;
        if(c==1)
        {
            System.out.println(U[d-1]);
        }
        else if(c==2)
        {
            t= n/10;
            n= n%10;
            if((t==1)&&(n==0))
            {
                System.out.println(Y[t-1]);
            }
            else if(t==1)
            {
                System.out.println(T[n-1]);
            }
            else if((t!=0)&&(n!=0))
            {
                System.out.print(Y[t-1]+" ");
                System.out.println(U[n-1]);
            }
            else
            {
                System.out.println(Y[t-1]+" ");
            }
        }
        else if(c==3)
        {
            c= c-1;
            t= n/(int)Math.pow(10,c);
            n= n%(int)Math.pow(10,c);
            System.out.print(U[t-1]+" HUNDRED ");
            c= c-1;
            t= n/(int)Math.pow(10,c);
            n= n%(int)Math.pow(10,c);
            if((t==0)&&(n!=0))
            {
                System.out.println("AND "+U[n-1]);
            }
            else if((t==1)&&(n==0))
            {
                System.out.println("AND "+Y[t-1]);
            }
            else if(t==1)
            {
                System.out.println("AND "+T[n-1]);
            }
            else if((t==1)&&(n==0))
            {
                System.out.println("AND "+Y[t-1]);
            }
            else if((t!=0)&&(n==0))
            {
                System.out.println("AND "+Y[t-1]);
            }
            else if((t!=0)&&(n!=0))
            {
                System.out.println("AND "+Y[t-1]+" "+U[n-1]);
            }
        }
        else if(c==4)
        {
            c= c-1;
            t= n/(int)Math.pow(10,c);
            n= n%(int)Math.pow(10,c);
            System.out.print(U[t-1]+" THOUSAND ");
            c= c-1;
            t= n/(int)Math.pow(10,c);
            n= n%(int)Math.pow(10,c);
            if((t!=0)&&(n!=0))
            {
                System.out.print(U[t-1]+" HUNDRED ");
            }
            else if((t!=0)&&(n==0))
            {
                System.out.print(U[t-1]+" HUNDRED ");
            }
            c= c-1;
            t= n/(int)Math.pow(10,c);
            n= n%(int)Math.pow(10,c);
            if((t==0)&&(n!=0))
            {
                System.out.println("AND "+U[n-1]);
            }
            else if((t==1)&&(n==0))
            {
                System.out.println("AND "+Y[t-1]);
            }
            else if(t==1)
            {
                System.out.println("AND "+T[n-1]);
            }
            else if((t==1)&&(n==0))
            {
                System.out.println("AND "+Y[t-1]);
            }
            else if((t!=0)&&(n==0))
            {
                System.out.println("AND "+Y[t-1]);
            }
            else if((t!=0)&&(n!=0))
            {
                System.out.println("AND "+Y[t-1]+" "+U[n-1]);
            }           
        }
    }
}