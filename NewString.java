import java.util.*;
class NewString
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 1st word");
        String s1= in.nextLine();
        System.out.println("Enter the 2nd word");
        String s2= in.nextLine();
        int l1= s1.length();
        int l2= s2.length();
        int i, j;
        String s= " ";
        if(l1==l2)
        {
            for(i=0; i<l1; i++)
            {
                s= s+ s1.charAt(i)+ s2.charAt(i);
            }
        }
        else if(l1>l2)
        {
            for(i=0; i<l2; i++)
            {
                s= s+ s1.charAt(i)+ s2.charAt(i);
            }
            for(j=i; j<l1; j++)
            {
                s= s+ s1.charAt(j);
            }
        }
        else if(l2>l1)
        {
            for(i=0; i<l1; i++)
            {
                s= s+ s1.charAt(i)+ s2.charAt(i);
            }
            for(j=i; j<l2; j++)
            {
                s= s+ s2.charAt(j);
            }
        }
        System.out.println(s);
    }
}