import java.util.*;
class First_Letter
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s= in.nextLine();
        s= s.toUpperCase();
        s= " "+ s.trim();
        int l= s.length();
        int C[]= new int[l];
        int i, j, f=0;
        String p= " ";
        for(i=0; i<=l-2; i++)
        {
            char ch= s.charAt(i);
            if(ch==' ')
            {
                char t= s.charAt(i+1);
                p= p+ t;
                C[f]= (int)t;
                f= f+1;
            }
        }
        System.out.println("The new word:- "+p);
        for(i=0; i<l; i++)
        {
            for(j=0; j<l-1; j++)
            {
                if(C[j]>C[j+1])
                {
                    int t= C[j];
                    C[j]= C[j+1];
                    C[j+1]= t;
                }
            }
        }
        System.out.print("Arranged in alphabetical order:- ");
        for(i=0; i<l; i++)
        {
            System.out.print((char)C[i]);
        }
    }
}