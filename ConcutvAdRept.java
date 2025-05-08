import java.util.*;
class ConcutvAdRept
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s= in.nextLine();
        s= s.trim();
        s= s.toLowerCase();
        int i, j, k;
        int l= s.length();
        System.out.println("Consecutive Characters:-");
        for(i=0; i<l-1; i++)
        {
            char c= s.charAt(i);
            char h= s.charAt(i+1);
            if((Character.isLetterOrDigit(c) || Character.isLetterOrDigit(h))==true)
            {
                if(h==c+1)
                {
                    System.out.print(c+", "+h+", ");
                }
            }
        }
        System.out.println();
        System.out.println("Repeated Characters:-");
        String n= " ";
        int m=0, u=0;
        for(i=0; i<l; i++)
        {
            char c= s.charAt(i);
            for(j=0; j<l; j++)
            {
                if(j==i)
                {
                    continue;
                }
                char h= s.charAt(j);
                if(c==h)
                {
                    u= n.length();
                    for(k=0; k<u; k++)
                    {
                        char y= n.charAt(k);
                        if(c==y)
                        {
                            m= m+1;
                            break;
                        }
                    }
                    if(m==1)
                    {
                        m=0;
                        break;
                    }
                    n= n+c;
                }
            }
        }
        n= n.trim();
        for(i=0; i<u-1; i++)
        {
            System.out.print(n.charAt(i)+", ");
        }
    }
}