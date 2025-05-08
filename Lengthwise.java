import java.util.*;
class Lengthwise
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s= in.nextLine();
        s= s.trim();
        int l= s.length()-1;
        char c= s.charAt(0);
        s= " "+ Character.toLowerCase(c)+s.substring(1, l);
        l= s.length();
        int i, j, k=0, n=0, t;
        for(i=0; i<l; i++)
        {
            c= s.charAt(i);
            if(c== ' ')
            {
                t= (int)s.charAt(i+1);
                t= t- 32;
                s= s.substring(0, i+1)+ (char)t+ s.substring(i+2, l);
                n= n+1;
            }
        }
        int A[]= new int[n];
        int f=0;
        s= s+ " ";
        l= s.length();
        for(i=0; i<l-1; i++)
        {
            c= s.charAt(i);
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
                if(A[j]<A[j+1])
                {
                    t= A[j];
                    A[j]= A[j+1];
                    A[j+1]= t;
                }
            }
        }
        String m= " ";
        i = l-1;
        f=0;
        while (i>=0) 
        {
            f= i;
            c= s.charAt(i);
            if (c== ' ')
            {
                for (j=i-1; j>=0; j--) 
                {
                    char h= s.charAt(j);
                    if (h== ' ') 
                    {
                        String p= s.substring(j, i);
                        p= p.trim();
                        int d= p.length();
                        if (A[k]==d) 
                        {
                            m= m +p +" ";
                            k= k+1;
                            s= s.substring(0, j) + s.substring(i, l);
                            l= s.length();
                            i= l-1;
                            break;
                        }
                    }
                }
            } 
            if(f!=i)
            {
                continue;
            }
            else
            {
                i--;
            }
        }
        System.out.println(m+". -:Final Answer");
    }
}