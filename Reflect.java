import java.util.*;
class Reflect
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s= in.nextLine();
        s= s.trim();
        s= " "+s+" ";
        int l= s.length();
        String r= " ";
        String n= " ";
        int i, t=l-1;
        for(i=l-1; i>-1; i--)
        {
            char p= s.charAt(i);
            r= r+ p;
        }
        r= " "+ (r.trim())+" ";
        for(i=l-1; i>=0; i--)
        {
            if((r.charAt(t)==' ') && (r.charAt(i)==' '))
            {
                String h= r.substring(i, t);
                System.out.print(h);
                t=i;
            }
        }
    }
}