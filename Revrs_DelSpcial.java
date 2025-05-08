import java.util.*;
class Revrs_DelSpcial
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s= in.nextLine();
        s= s.trim();
        int l= s.length();
        int i, j;
        String n= " ";
        for(i= l-1; i>=0; i--)
        {
            char c= s.charAt(i);
            if(Character.isLetterOrDigit(c)==false)
            {
                if(c!= ' ')
                {
                    int f= s.length();
                    s= s.substring(0,i)+ s.substring(i+1, f);
                }
            }
        }
        s= " "+s+" ";
        l= s.length();
        for(i= l-1; i>=0; i--)
        {
            char c= s.charAt(i);
            if(c== ' ')
            {
                for(j= i-1; j>=0; j--)
                {
                    char h= s.charAt(j);
                    if(h== ' ')
                    {
                        n= n+ s.substring(j, i);
                        break;
                    }
                }
            }
        }
        System.out.println("Final Answer- "+n+".");
    }
}