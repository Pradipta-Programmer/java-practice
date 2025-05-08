import java.util.*;
class Anagram
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 2 strings");
        String s1= in.nextLine();
        String s2= in.nextLine();
        s1.trim();
        s2.trim();
        String n1= s1;
        String n2= s2;
        int i=0, j, k;
        while(i<s1.length())
        {
            char c= s1.charAt(i);
            if(c== ' ')
            {
                s1= s1.substring(0, i)+ s1.substring(i+1, s1.length());
                i=0;
                continue;
            }
            i++;
        }
        i=0;
        while(i<s2.length())
        {
            char c= s2.charAt(i);
            if(c== ' ')
            {
                s2= s2.substring(0, i)+ s2.substring(i+1, s2.length());
                i=0;
                continue;
            }
            i++;
        }
        i=0;
        j=0;
        int f= 0;
        if(s1.length() != s2.length())
        {
            System.out.println("Length not same");
            System.exit(0);
        }
        else
        {
            while(i<s1.length())
            {
                char c= s1.charAt(i);
                while(j<s2.length())
                {
                    char h= s2.charAt(j);
                    if(c==h)
                    { 
                        f= 1;
                        if((i+1 == s1.length())&&(j+1 == s2.length()))
                        {
                            s1= s1.substring(0, i);
                            s2= s2.substring(0, j);
                        }
                        else if((i+1 == s1.length()))                       
                        {
                            s1= s1.substring(0, i);
                            s2= s2.substring(0, j)+ s2.substring(j+1, s2.length());
                        }
                        else if((j+1 == s2.length()))
                        {
                            s1= s1.substring(0, i)+ s1.substring(i+1, s1.length());
                            s2= s2.substring(0, j);
                        }
                        else
                        {
                            s1= s1.substring(0, i)+ s1.substring(i+1, s1.length());
                            s2= s2.substring(0, j)+ s2.substring(j+1, s2.length());
                        }
                        break;
                    }
                    j= j+1;
                }
                if(f==1)
                {
                    f= 0;
                    i= 0;
                    j= 0;
                    continue;
                }
                else
                {
                    System.out.println("Not Anagram");
                    System.exit(0);
                }
                i= i+1;
            }
        }
        System.out.println("Anagram");
    }
}