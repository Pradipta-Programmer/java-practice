import java.util.*;
class Snowball
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s= in.nextLine();
        int l= s.length();
        int i, j, f= 0, d= 0;
        int q= 0;
        String p= "";
        if((s.charAt(l-1)== '?')||(s.charAt(l-1)== '.'))
        {
            s= s.substring(0, l-1);
            s= s.trim();
            s= " "+ s+ " ";
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
                            p= s.substring(i, j);
                            if(f== 0)
                            {
                                q= p.length();
                                f= 1;
                                break;
                            }
                            if(q+1 == p.length())
                            {
                                q= p.length();
                                break;
                            }
                            else
                            {
                                d= d+1;
                                break;
                            }
                        }
                    }
                }
            }
            if(d>0)
            {
                System.out.println("Not a Snowball String");
            }
            else
            {
                System.out.println("A Snowball String");
            }
        }
        else
        {
            System.out.println("Sentence is not terminated by ? or .");
        }
    }
}