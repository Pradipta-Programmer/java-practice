import java.util.*;
class MostConChar
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the word");
        String s= in.nextLine();
        int i=0, j;
        s= s+ " ";
        String n= " ", p= " ";
        while(i<s.length()-1)
        {
             char c= s.charAt(i);
             if(c== s.charAt(i+1))
             {
                 for(j= i; j< s.length(); j++)
                 {
                     if(c!= s.charAt(j))
                     {
                         p= s.substring(i, j);
                         i= j;
                         break;
                     }
                 }
             }
             if(n.length()< p.length())
             {
                 n= p;
             }
             i= i+1;
        }
        System.out.println(n);
    }
}