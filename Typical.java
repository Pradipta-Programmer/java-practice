import java.util.*;
class Typical
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the word");
        String s= in.nextLine();
        s= s.toUpperCase();
        s= s.trim();
        int l= s.length();
        int i, j, k, p=0, q=0;
        String g= " ";
        String h= " ";
        for(i=0; i<l; i++)
        {
            char ch= s.charAt(i);
            if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
            {
                g= g+ ch;
                p= p+1;
            }
            else
            {
                h= h+ ch;
                q= q+1;
            }
        }
        String v= "";
        String c= " ";
        String x= "AEIOU";
        int f=0;
        for(i=0; i<5; i++)
        {
            for(j=0; j<p+1; j++)
            {
                char vh= g.charAt(j);
                if(vh== x.charAt(i))
                {
                    v= v+ vh;
                }
            }
        }
        char last= h.charAt(q);
        int m= q;
        for (i = 0; i < q; i++) 
        {
            char mc = h.charAt(0);
            int mi = 0;
            for (j = 1; j < h.length(); j++)
            {
                char ch = h.charAt(j);
                if (ch < mc) 
                {
                    mc = ch;
                    mi = j;
                }
            }
            c = c + mc;
            if (mi > 0) 
            {
                x = h.substring(0, mi);
                x= x+ h.substring(mi + 1, m);
            } 
            else 
            {
                x = h.substring(1, m);
            }
            h = x;
            m= x.length();
            x = "";
        }
        c= c.trim();
        if(c.length()-1!= 0)
        {
            for(i=0; i<c.length()-1; i++)
            {
                char ch= c.charAt(i);
                if((ch< last)&&(last< c.charAt(i+1)))
                {
                    c= c.substring(0, i+1)+ last+ c.substring(i+1, c.length());
                    break;
                }
                if(last>= c.charAt(c.length()-1))
                {
                    c= c+ last;
                    break;
                }
            }
        }
        else
        {
            c= c+ last;
        }
        f=0;
        m=0;
        x= "";
        for(i=0; i<l; i++)
        {
            if(i%2==0)
            {
                if(i> p+1)
                {
                    continue;
                }
                char ch= v.charAt(f);
                System.out.print(ch);
                f= f+1;  
            }
            else
            {
                if(i> q+1)
                {
                    continue;
                }
                char ch= c.charAt(m);
                System.out.print(ch);
                m= m+1;
            }
        }
        if(p>q)
        {
            for(i= f; i<v.length(); i++)
            {
                System.out.print(v.charAt(i));
            }
        }
        else if(p<q)
        {
            for(i= m; i<c.length(); i++)
            {
                System.out.print(c.charAt(i));
            }
        }
    }
}