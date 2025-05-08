import java.util.*;
class Replace_nxtV
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s= in.nextLine();
        s= s.trim();
        s= s.toUpperCase();
        int l= s.length();
        int i;
        for(i=0; i<l-1; i++)
        {
            char c= s.charAt(i);
            if((c== 'A')||(c== 'E')||(c== 'I')||(c== 'O')||(c== 'U'))
            {
                String p= s.substring(0, i);
                String q= s.substring(i+1, l);
                if(c== 'A')
                {
                    s= p+ "E" +q;
                }
                else if(c== 'E')
                {
                    s= p+ "I" +q;
                }
                else if(c== 'I')
                {
                    s= p+ "O" +q;
                }
                else if(c== 'O')
                {
                    s= p+ "U" +q;
                }
                else if(c== 'U')
                { 
                    s= p+ "A" +q;
                }
            }
        }
        System.out.println("New Sentence:- "+s);
    }
}