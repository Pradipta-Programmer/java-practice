import java.util.*;
class Trialed
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s= in.nextLine();
        s= s.trim();
        s= " " +s;
        int i, j, k=0, n=0;
        int l= s.length();
        for(i=0; i<l; i++)
        {
            char c= s.charAt(i);
            if(c== ' ')
            {
                n= n+1;
            }
        }
        int A[]= new int[n];
        int f=0;
        s= s+ " ";
        l= s.length();
        for(i=0; i<l-1; i++)
        {
            char c= s.charAt(i);
            if(c== ' ')
            {
                for(j=i+1; j<l; j++)
                {
                    char h= s.charAt(j);
                    if(h== ' ')
                    {
                        String p= s.substring(i, j);
                        p= p.trim();
                        A[f]= p.length();
                        f= f+1;
                        break;
                    }
                }
            }
        }
        for(i=0; i<n; i++)
        {
            for(j=0; j<n-1; j++)
            {
                if(A[j]>A[j+1])
                {
                    int t= A[j];
                    A[j]= A[j+1];
                    A[j+1]= t;
                }
            }
        }
        String m= " ";
        for(i=l-1; i>=0; i--)
        {
            char c= s.charAt(i);
            if(c== ' ')
            {
                for(j=i-1; j>=0; j--)
                {
                    char h= s.charAt(j);
                    if(h== ' ')
                    {
                        String p= s.substring(j, i);
                        p= p.trim();
                        int d= p.length();
                        if(A[k]== d)
                        {
                            m= m+ p;
                            k= k+1;
                            s= s.substring(0, j)+ s.substring(i, l);
                            f= l;
                            l= s.length();
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(m);
    }
}